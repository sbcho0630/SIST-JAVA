package com.sist.io;
import java.io.*;
import java.net.*;
/*
 * 	MVC, Spring, Kotlin
 * 	===================
 * 	���� : 
 * 		��⼭�� => 1�� ===> ������(Socket) => ��ȭ��
 * 				ServerSocket => ���� �� ó�� 
 * 		��ż��� => ������ ����ŭ ���� (Thread)
 * 				Socket => ���� ��� 
 * 
 * 	���� => �������� ����ϴ� ���α׷��� �ʿ� 
 * 		   ========= �����ؾ�. 
 * 
 * ���ε� : ������� 
 * 
*/
public class Server implements Runnable{
	private ServerSocket ss;
	public Server()
	{
		try 
		{
			ss=new ServerSocket(3355);
			// bind => ���� (����� ����) 
			// bind => 1.IP, 2. Port
			// ������ Port ==> ���� ��Ʈ, Ŭ���̾�Ʈ => �ӽ� ��Ʈ
			// listen => ������ 
			// �� ������ �� �濡 ����! �ſ� ����!
			System.out.println("Server start.....");
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start(); // ������ ������ �ִ� run�Լ��� ȣ���ض�
		
	}
	// ������ �۵� : ������� ��¸� ���!!!
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) 
		{
			try
			{
				Socket s=ss.accept();// ������ Ŭ���̾�Ʈ�� ������ �޴´�. (Socket)
				System.out.println("������ Ŭ���̾�Ʈ�� IP+"+s.getInetAddress().getHostAddress());
				System.out.println("�ӽ���Ʈ"+s.getPort());
				System.out.println("=================================");
			}catch(Exception ex) {} 
			
		}
	}

}


