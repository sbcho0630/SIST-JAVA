// ��ǻ�� ����, ����� �Է� --> ����,����,�� ���� 
import java.util.Scanner;
public class �������ǹ�_����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�迭�� Ǯ��
		
		// 0,1,2
		int com=(int)(Math.random()*3);
				
		Scanner scan=new Scanner(System.in);
		System.out.print("����(0),����(1),��(2):");
		int user=scan.nextInt();
				
		String[] value= {"����","����","��"};
				
		System.out.println("��ǻ��:"+value[com]+",�÷��̾�:"+value[user]);
		
		
		
		/*
		//������ ���� �޴´� 
		Scanner scan=new Scanner(System.in);
		System.out.println("����(0),����(1),��(2):");
		int user=scan.nextInt();
		
		//������ ���� �����ش�.
		if(user==0)
			System.out.println("user:����");
		if(user==1)
			System.out.println("user:����");
		if(user==2)
			System.out.println("user:��");

		//������ ���� �ް� ���� ���� �����ش�.
		int com=(int)(Math.random()*3); //0.0~0.99 --> 0.0~2.99... --> 0,1,2	
		//�Ҽ��� int�� ���� ����ȯ ��Ű�� �Ҽ����� �� �������� ���� �κи� �����. 
		if(com==0)
			System.out.println("��ǻ��:����");
		if(com==1)
			System.out.println("��ǻ��:����");
		if(com==2)
			System.out.println("��ǻ��:��");
		
		//������
		int result=com-user;
		if(result==0)
			System.out.println("�����");
		if(result==1 || result==(-2))
			System.out.println("��ǻ�� Win!");
		if(result==(-1) || result==2)
			System.out.println("user Win!");
		*/
		
	}

}
