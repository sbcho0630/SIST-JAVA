import java.util.Scanner;

public class ������_����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����4
				String name;
				int kor, eng, mat;
				
				Scanner scan=new Scanner(System.in);
				
				System.out.print("�̸��� �Է��ϼ���.");
				name=scan.next();
				System.out.print("kor�� �Է��ϼ���.");
				kor=scan.nextInt();
				System.out.print("eng�� �Է��ϼ���.");
				eng=scan.nextInt();
				System.out.print("mat�� �Է��ϼ���.");
				mat=scan.nextInt();
				
				int sum=kor+eng+mat;
				double avg=sum/3.0;
				
				System.out.println("�̸�:"+name);
				System.out.println("�հ�����:"+sum);
				System.out.printf("�������:%.1f",avg); //%.3f �̷��� �ϸ� �Ҽ��� ��°�ڸ����� ����. 

	}

}
