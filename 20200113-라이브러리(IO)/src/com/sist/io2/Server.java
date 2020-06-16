package com.sist.io2;
import java.util.*;
import java.io.*;
import java.net.*;
/*
 *  Ŭ������ ����
 *  	= �Ϲ� Ŭ����
 *  	= �߻� Ŭ����(�������̽�)
 *  	= ���� Ŭ����
 *  	  1) Ŭ�������� �����͸� ���� => static ==> ���Ŭ���� 
 *  		 class A
 *  		 {
 *  			class B
 *  			{
 *  			}
 *  		 }
 *  	     Server�� ������ �ִ� ��� ������ ���� 
 *  	  2) ��� ���� �������̵��� ��� => �͸��� Ŭ����  
 *  
*/
public class Server implements Runnable {
	private ServerSocket ss;
	private final int PORT=8888;
	private Vector<Client> waitVc=new Vector<Client>(); // ������ ������ ���� (ip, port)
	// WiatVc�� �ִ� ����� �ް�.... �� ����� ã�����...
	// �� �ȿ� �����带 ��°�� ��������
	// ������ ������ �ϰ� ����� Ŭ���̾�Ʈ��..!
	// ������ �� �� ���� ������...!
	// �ϳ��� �������� ������ �ϳ����� �۵��ϰ� ������..!
	
	// ���� ���� => Server => �޸� �Ҵ��� �� ���� ��� 
	public Server() {
		try 
		{
			ss=new ServerSocket(PORT); // ����Ʈ ==> 50�� ���� ��� ���� 
			// ���� ==> bind, ������ ==> listen 
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// ���� �ÿ� ó�� 
		while(true) 
		{
			try
			{
				// ���ӽÿ� Ŭ���̾�Ʈ�� ������ �޾Ƽ� �����ϰ� => ������� ���� 
				// ���� �ÿ� ���� ==> Socket (ip, port) : ������ ip�� port ��ȣ...
				Socket s=ss.accept(); // ������ �Ǹ� ȣ��Ǵ� �Լ� // ������ �� ���� ȣ��Ǵ� �Լ� 
				// Socket ==> Ŭ���̾�Ʈ (����)
				System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�!! =>"+s.getInetAddress().getHostAddress());
				Client client = new Client(s);
				client.start();
				waitVc.add(client);
				// ������ ���� 
			}catch(Exception ex) {}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();

	}
	// inner Ŭ���� => Thread, ������ => ������
	class Client extends Thread
	{
		// Server�� ������ �ִ� ��� �����͸� ����� �� �ִ�.
		Socket s; //Ŭ���̾�Ʈ�� ���� ��ȭ��(������=>����Ʈ����)
		OutputStream out; // Ŭ���̾�Ʈ�� ����� ���� 
		BufferedReader in; // Ŭ���̾�Ʈ�κ��� ��û���� �޴´�. 
		public Client(Socket s)  
		{
			try 
			{
				this.s=s;
				out=s.getOutputStream(); // Ŭ���̾�Ʈ�� ���� ������ ��������
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// inputStream : 1����Ʈ ,, Reader : 2����Ʈ
				// s.getInputStream : Ŭ���̾�Ʈ�� ����� ��ġ�κ��� 
				// ������ ��� �����͸� ���� �� 1����Ʈ�� �޾Ƽ� 2����Ʈ�� ��ȯ�����.
				// �ֳ��ϸ� �ѱ��� 2����Ʈ�ε� C�� § �°� ���α׷����� �� 1����Ʈ�� �����̱� ������ ��ġ �� ���ָ� ���� ������ ���´�.
			}catch(Exception ex) {}
			
		}
		// ��� 
		// ���� ��� �� �κ� ������ �� �Ȱ���... ���(run)�κи� �����ϸ� ��.

		public void run() 
		{
			while(true) 
			{
				try 
				{	
					// Ŭ���̾�Ʈ�� ������ �޽��� �б� 
					String msg=in.readLine();
					System.out.println("Client=>"+msg);
					// ������ ��ü Ŭ���̾�Ʈ�� ���� ����
					// �̷��� �ڵ��ϴ°� JSP ��� ��... Java Server Page(������ : ���� ����� ��)  
					for(Client c:waitVc) // ������ ������  
					{
						c.out.write((msg+"\n").getBytes());
					}
				}catch(Exception ex) {}
			}
			
		}
	}

}
