import java.util.Scanner;

public class ������_����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����3
		String name,department,position;
		int sal;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���.");
		name=scan.next();
		System.out.print("�μ��� �Է��ϼ���.");
		department=scan.next();
		System.out.print("������ �Է��ϼ���.");
		position=scan.next();
		System.out.print("�޿��� �Է��ϼ���.");
		sal=scan.nextInt();
		
		System.out.println("�̸�:"+name);
		System.out.printf("�μ�:"+department);
		System.out.print("\n����:"+position+"\r�޿�:"+sal+"��\r");
		

	}

}
