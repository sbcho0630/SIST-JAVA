import java.util.Scanner;
public class 메소드6_숫자야구게임메소드 {
	// 난수 발생
	static int[] getRand(int no) {
		int[] com=new int[no];
		int su=0;
		boolean bCheck=false;
		for(int i=0;i<no;i++) {
			bCheck=true;
			while(bCheck){
				//난수발생
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				for(int j=0;j<i;j++) {
					if(com[j]==su) {
						bCheck=true; //while문으로 이동
						break;
					}
				}
			}
			//중복된 수가 없다 
			com[i]=su;
		}
		return com;
	}
	
	// 사용자 입력
	static int[] userInput() {
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("3자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 || input>999) {
				System.out.println("잘못된 입력입니다!!");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("중복된 수는 사용할 수 없습니다.");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0은 사용할 수 없습니다!!");
				continue;
			}
			break;
		}
		return user;
	}
	
	// 비교 
	// 리턴형은 한 개 밖에 못 넘겨주는데 S,B 둘 다 넘기려면 어떻게 해야하지?
	static int compare(int[] com,int[] user) {
		int s=0, b=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				//배열 안에 같은 수 존재여부 확인 
				if(com[i]==user[j]) {
					//같은 자리일 경우
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		hint(user,s,b); //여기서 힌트를 줌... 어렵군... 호출위치...
		return s;
	}
	
	// 힌트 
	static void hint(int[] user,int s,int b) {
		System.out.printf("Input Number:%d%d%d, Result:%dS-%dB\n",user[0],user[1],user[2],s,b);		
	}
	
	// 종료여부
	static boolean isEnd(int s) {
		boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	
	//조립
	static void process() {
		int[] com=getRand(3);
		Scanner scan=new Scanner(System.in);
		while(true) {
			int[] user=userInput();			
			int s=compare(com,user);
			if(isEnd(s)) { //"isEnd(s)가 true면" 이란 뜻 
				System.out.print("종료할까요(y|n)?");
				String data=scan.next();
				if(data.equals("y")) {
					System.out.println("Game Over!!");
					System.exit(0);
				}
				else {
					System.out.println("새 게임이 시작되었습니다!!");
					process();
				}
			}
		}
		
	}
	
	static String start() {
		return "게임을 시작합니다!!";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//방법1-시작합니다 문구 
		//System.out.println(start());
		//방법2-시작합니다 문구 
		String s=start();
		System.out.println(s);
		//게임 프로세스 실행 
		process();

	}

}
