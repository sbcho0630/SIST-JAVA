// ������� �Է°��� �޾Ƽ� (¦��, Ȧ��) 
import java.util.Scanner;
public class ���׿�����_�񱳿�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�����Է�:");
		int num=scan.nextInt();
		
		String result=num%2==0?"¦��":"Ȧ��";
		System.out.println(num+"��(��) "+result+"�Դϴ�");

	}

}
