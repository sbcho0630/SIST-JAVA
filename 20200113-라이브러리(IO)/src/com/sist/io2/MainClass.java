package com.sist.io2;
/*
 *  Thread�� ����ϴ� ���
 *  ====== �� ���� �ϸ� ����ϰ� ����� 
 *  =================
 *  	1. Runnable(interface) �̿��ϴ� ���
 *  	   => Ŭ���̾�Ʈ (������)
 *  	   => run() �޼ҵ� ���� => ������ ����
 *  	   class A implements Runnable 
 *  	2. Thread�� ��ӹ޾Ƽ� ó�� 
 *  	   => Thread�� ������ Ȯ��
 *  	   class A extends Thread
 *  	===> �����ϴ� ��� 
 *  	INIT (���� :created) ===> Runnable (���) ===> Running (����) ===> �Ͻ�����
 *  	==================
 *  	Thread t1=new Thread()		t1.start()			run()			sleep(),wait()
 *  	Thread t2=new Thread()		t2.start()			run()			sleep(), wait()
 *   	// run�� ȣ���ϸ� �� �ǰ� start�� ȣ���ϸ� �°� run�� ȣ���Ѵ�. 
 *   
 *    	�Ǵ�.... INIT (���� :created) ===> Runnable (���) ===> Running (����) ===> ������ ����. 
 *     	==================
 *  	Thread t1=new Thread()		t1.start()			run()			interrupt(), join()
 *  	Thread t2=new Thread()		t2.start()			run()			interrupt(), join()
 *  
 *  	=> JVM
 *  		1. �̸��� �ο� ex) thread-0, thread-1, ....
 *  		2. ������ �ο� : 1~10 	
 *  			�� 1 : MIN_PRIORITY ===> gc
 *  			�� 10 : MAX_PRIORITY ===> ���� �޼ҵ�. 
 *  			�� 5 : NORM_PRIORITY ===> �츮�� ���� ������ 
 *  
 *  	�� �������... CPU�� �ð��� ������ ������ �� �ְ� ���ִ� ���α׷�... �̶�� �����ϸ� ��...
 *  	�� �����带 ������ ���� ���� �������̽� ��ӹ��� �� ����. ===> �����带 ���ε��� ������ ==> runnable�� ���� �� �� ���� ��ɸ� ���� ��.  
 *  
*/
class MyThread extends Thread
{
	public void run() 
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println(getName()+":"+i); //1~10 ����ϴ� ����..
			try 
			{
				Thread.sleep(50);
			}catch(Exception ex) {}
		}
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		// ����
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		t1.setName("ȫ�浿");
		t2.setName("��û��");
		t3.setName("�ڹ���");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		// �ʿ��� ������ ������ ����
		t1.start();
		t2.start();
		t3.start();
		
		// 1~10 ��� ���� 
		// ������ ��ŸƮ �ɾ����ϱ� �ڵ����� t1.run(), t2.run(), t3.run()�� ȣ��ɰ���. 
		
		
	}

}


