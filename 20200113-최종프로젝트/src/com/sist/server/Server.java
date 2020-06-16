package com.sist.server;
import java.io.*;
import java.net.*;
import java.util.*;
import com.sist.common.*;

public class Server implements Runnable{
	
	// 1. 서버 가동 
	// 연결 => 접속처리 => ServerSocket  
	// 각 클라이언트마다 통신담당 (Thread) => Socket <=> Socket 
	private ServerSocket ss;
	private final int PORT=3355;
	
	// 접속자 저장 공간 
	private Vector<Client> waitVc=new Vector<Client>();
	// 방 정보 저장 공간 
	private Vector<Room> roomVc=new Vector<Room>();
	
	public Server() 
	{
		try 
		{
			ss=new ServerSocket(PORT); //bind, listen 
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	// 접속 시 처리 
	public void run() 
	{
		try 
		{
			while(true) 
			{
				//접속을 했다면 => 클라이언트의 정보를 수집해야 => IP, PORT (Socket)
				Socket s=ss.accept(); // 이 소켓과 클라이언트가 넘겨준 소켓이 합쳐지면 통신이 가능하다.
				
				// (클라이언트의 정보(ip,port))를 Thread로 전송 ==> 각자마다 통신을 할 수 있다. 
				Client client = new Client(s);
				client.start();
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();

	}
	// 통신을 담당하는 부분 (각 클라이언트마다 따로 작업을 한다) 
	class Client extends Thread 
	{
		String id,name,sex,pos; // 아래의 case문들에서 다 쓸 수 있게 id,name,sex,pos를 위에다가 선언해놨음 
		int avatar;
		// pos : 방 위치 (어느 방에 들어가있는지 확인. 디폴트는 대기실) 
		// 통신을 하기 위해 socket필요
		Socket s; // 통신장비. 소프트웨어로 만든 통신 기계. 주고받고 할 때 쓰는 것. 
		// 보내기
		OutputStream out; // 1바이트 짜리. 보낼 때는 바이트 단위로 보냄. 받을 때는 한글로 다시 써야함..,
		// 받기 
		BufferedReader in;
		
		public Client (Socket s) {
			try
			{
				this.s=s;
				out=s.getOutputStream(); //클라이언트의 저장 위치 => 읽어갈 수 있게 만든다. 
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// InputStreamReader(필터스트림) => 1byte를 받아서 2byte로 변환  
			}catch(Exception ex) {}
		}
		
		//클라이언트와 통신
		public void run()
		{
			// 100|hong|홍길동|남자\n 이 넘어옴
			try
			{
				while(true)
				{
					String msg=in.readLine(); // 클라이언트가 전송한 값 (요청)
					// msg에 클라이언트가 보내준 값을 넣는다. 
					System.out.println("Client=>"+msg); // 패킷 갯수를 맞춰야. 
					StringTokenizer st=new StringTokenizer(msg,"|"); 
					int protocol = Integer.parseInt(st.nextToken());
					switch(protocol)
					{
						case Function.LOGIN: //로그인됐다면 위의 String id,name,sex,pos;에 정보 저장해야 
						{
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							avatar=Integer.parseInt(st.nextToken()); 
							// nextToken은 덜 써도 되는데, 초과하면 오류가 남. Array번호라서 범위를 벗어나면 안 됨.(arrayindexoutofboundsexception 일어남)
							// 예를 들어, 4개를 보냈는데 존재하지 않는 5번째꺼를 호출하면 오류난다는 것.   
							pos="대기실";
							// 이 네 개의 정보를 모든 사람에게 보내야 
							
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos);
							waitVc.add(this);
							messageTo(Function.MYLOG+"|"+id); // MYLOG ==> 창이 바뀜. MYLOG에게 id를 보냈다.  
							for(Client user:waitVc)
							{
								messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex+"|"+user.pos); //user:상대방꺼. 
							}
							
							// 이미 개설되어 있는 방 정보 전송 
							for(Room room:roomVc)
							{
								messageTo(Function.MAKEROOM+"|" //messageTo : 로그인한 사람에게만 전송 
										+room.roomName+"|"
										+room.roomState+"|"
										+room.current+"/"+room.maxcount);
							}
							
							break;
						}
						case Function.WAITCHAT:
						{
							messageAll(Function.WAITCHAT+"|["+name+"]"+st.nextToken()); 
							//name :보낸 사람 이름. this.name에서 this 생략된 것. 아무것도 안 쓰고 name이런거면 보낸사람꺼, user.xxx면 상대방꺼. 
							break;
						}
						case Function.EXIT:
						{
							String mid=id;
							// this.id에서 this 생략된 것. out.write를 보낸 애 각각은 this를 갖고 있음.
							// id를 갖고 와서 저장한 담에, 본인은 지우고 남아있는 사람한테 얘가 나갔단거 알려줌.
							for(int i=0;i<waitVc.size();i++) // index번호가 필요 없으면 for-each 구문으로. index 번호 필요하면 그냥 일반적인 for문으로 작성할 것. 
							{
								Client user=waitVc.get(i);
								if(mid.equals(user.id))
								{
									// 윈도우 종료
									messageTo(Function.MYEXIT+"|"); 
									// 뒤에 값이 없어도 "|" 줘야함 - 왜냐면 구분문자 "|"를 주지 않으면 값을 갖고 올 수 없음...
									// 여기서 msg 만들고 있는데, 밑에 가서 messageTo 보면 msg 뒤에 \n 붙임
									// 그러므로 이 부분에서는 \n 안 줘도 됨. 나중에 messageTo 메소드에서 \n 붙을거임. 
									waitVc.remove(i);
									// 닫기 (통신 종료)
									in.close();
									out.close();
									break;
								}
							}	
							// 전체 메시지 => 나가는 유저를 테이블에서 삭제 
							messageAll(Function.EXIT+"|"+mid);
							break;
						}
						case Function.MAKEROOM:
						{
							Room room = new Room(st.nextToken(),st.nextToken(),st.nextToken(),Integer.parseInt(st.nextToken()));
							// MainForm에서 서버한테 아래와 같은 형식으로 보냈었음 . 보내준 형식에 잘 맞춰서 room에 넣어준다. 
							// out.write((Function.MAKEROOM+"|"+rn+"|"+rs+"|"+rp+"|"+inwon+"\n").getBytes());
							room.userVc.add(this);
							
							roomVc.add(room);
							pos=room.roomName; //pos가 방 이름으로 바뀐다.
							room.bang=id;
							messageAll(Function.MAKEROOM+"|"
									+room.roomName+"|"
									+room.roomState+"|"
									+room.current+"/"+room.maxcount); // 인원수 '1/6' 이렇게 나오게끔 
							
							// 방에 들어가게 만든다
							messageTo(Function.ROOMIN+"|"+room.roomName+"|"
									+id+"|"+sex+"|"+avatar+"|"+room.bang);
							// 대기실 > 유저 리스트 > 방 만든 유저의 상태를 '대기실'에서 '방이름'으로 변경 
							messageAll(Function.POSCHANGE+"|"+id+"|"+pos);
							break;
						}
						case Function.ROOMIN:
						{
							// Function.ROOMIN+"|"+rn 로 들어옴 
							String rn=st.nextToken();
							/*
							 * 	1. 방 이름을 받는다
							 * 	2. 방을 찾는다 (roomVc)
							 *	3. pos, current를 변경 
							 * 	====================
							 * 	 1) 이미 방에 있는 사람들에 대한 처리 (ROOMAD) 
							 * 		┗ ① 방에 입장하는 사람의 정보를 전송 (id, avatar, ...) 
							 * 		┗ ② 입장메시지 전송 
							 * 	 2) 방에 들어가는 사람 처리
							 * 		┗ ① 방에 들어가라 => ROOMIN
							 * 		┗ ② 방에 있는 사람들의 정보를 보내준다  
							 * 	 3) 대기실 변경 
							 * 		┗ 인원 수가 변경 => 메시지 변경  
							 * 
							 */
							for(Room room:roomVc)
							{
								if(rn.equals(room.roomName)) // 방 찾기 
								{
									pos=room.roomName;
									room.current++;
									// 1) 방에 있는 사람 처리
									// 이미 들어간 사람(나 제외)에게 뿌린다. ★★★
									for(Client user:room.userVc)
									{
										user.messageTo(Function.ROOMADD+"|"
												+id+"|"+sex+"|"+avatar+"|"+room.bang);
										user.messageTo(Function.ROOMCHAT
												+"|[알림☞] "+id+"님이 입장하셨습니다.");
									}
									
									// 2) 본인 처리
									// 위에서 먼저 뿌려놓고, 위에서 뿌린 정보에다가 내걸 더해서 그걸 받는다. ★★★
									room.userVc.add(this);
									messageTo(Function.ROOMIN+"|"+room.roomName+"|"
											   +id+"|"+sex+"|"+avatar+"|"+room.bang);
									
									for(Client user:room.userVc)
									{
										if(!id.equals(user.id))
										{
											messageTo(Function.ROOMADD+"|"
													+user.id+"|"+user.sex+"|"+user.avatar+"|"+room.bang);
											// messageTo 앞에 this 생략. 
											// 나에게 상대방의 정보를 보낸다.  
										}
									}
									// 3) 대기실 갱신 
									messageAll(Function.WAITUPDATE+"|"+room.roomName+"|"
											+room.current+"|"+room.maxcount+"|"+id+"|"+pos);
								}
							}
							
							
							
							// 전체적으로 전송
							/*
							 *	대기실 => messageAll
							 *	방,개인 -> messageTo
							 *	
							 *	==> 행위자 처리
							 *	==> 남아있는 사람 처리 
							 *	==> 대기실 처리 
							*/
							break;
						}
						case Function.ROOMCHAT:
						{
							String rn=st.nextToken();
							String strMsg=st.nextToken();  
							// msg가 while문 안에 이미 선언되어 있으므로 msg 쓰면 안 됨
							for(Room room:roomVc)
							{
								if(rn.equals(room.roomName))
								{
									for(Client user:room.userVc)
									{
										user.messageTo(Function.ROOMCHAT+"|["+name+"]"+strMsg);
									}
								}
							}
							
							break;
						}
						case Function.ROOMOUT:
						{
							// 방 찾기
							String rn=st.nextToken();
							for(int i=0;i<roomVc.size();i++)
							{
								Room room=roomVc.get(i);
								if(rn.equals(room.roomName)) 
								{
									pos="대기실"; // 위치변경 
									room.current--; // 현재인원 감소 
									
									// 1) 방에 남아있는 사람들에게 전송
									for(Client user:room.userVc)
									{
										if(!user.id.equals(id)) // 내가 나가는 사람이 아니라면
										{
											user.messageTo(Function.ROOMOUT+"|"+id); // 나가는사람(id)을 빼라 
											user.messageTo(Function.ROOMCHAT+"|[알림☞] "+name+"님이 퇴장하셨습니다."); // 채팅창에 퇴장 메시지 노출  
										}
									}									
									// 2) 본인처리 - 실제 나가는 사람에게 전송
									for(int j=0;j<room.userVc.size();j++)
									{
										Client user=room.userVc.get(j);
										if(id.equals(user.id)) // 내가 나가는 사람이라면
										{
											// userVc에서 제거 
											 room.userVc.remove(j);
											 messageTo(Function.MYROOMOUT+"|");
											 break;
										}
									}									
									// 3) 대기실 처리 
									// 대기실 갱신 
									messageAll(Function.WAITUPDATE+"|"+room.roomName+"|"
											+room.current+"|"+room.maxcount+"|"+id+"|"+pos);
									if(room.current==0)
									{
										roomVc.remove(i);
										break;
									}
								}
							}
							break;
						}
						case Function.KANG:
						{
							String rn=st.nextToken();
							String yid=st.nextToken();
							for(Client user:waitVc)
							{
								if(yid.equals(user.id))
								{
									user.messageTo(Function.KANG+"|"+rn);
									break;
								}
							}
							break;
						}
					}
					
				}
			}catch(Exception ex) {}
		}
		
		// 반복을 제거하기 위해서 메소드 사용
		// 서버에서 전송 - 아래의 둘 중 하나에서 선택해야.  
		//1) 개인적으로 전송 
		public synchronized void messageTo(String msg)
		{	//synchronized : 보내면서 동기시키는 것 도와주는 것. ==> 동기화 프로그램.
				
			try {
				out.write((msg+"\n").getBytes());
				// readLine() => 끝나는 시점 =(\n)
				// 전송단위 : 패킷 ==> 반드시 \ 찍어야 함 (끝나는 시점이 \n임) 
			}catch(Exception ex) {}
		}
		//2) 전체적으로 전송 
		public synchronized void messageAll(String msg)
		{
			try 
			{
				for(Client user:waitVc) 
				{
					user.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
	}
}
