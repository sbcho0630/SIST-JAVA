/*
 * �� ǥ��
 * char --> '' 
 * int --> 10(10����), 010(8����), 0x12(16����), 0b1010101(2����) : 4���� �������� ǥ�� ����.
 * long --> 10L, 10l 
 * float --> 10.5F, 10.5f
 * boolean --> true, false
 * String --> ""
 * 
 * �񱳿����� --> ����� (boolean) : true, false 
 * =======
 * 	1) == (����) ex) 6==7 (false), 6==6 (true)
 *	2) != (���� �ʴ�) ex) 6!=7 (true), 6!=6 (false)
 *	3) < (�۴�) ex) 6<5 (false) 6<7 (true)
 *	4) > (ũ��) ex) 6>5 (true) 6>7 (false)
 *	5) <= (�۰ų� ����) ex) 6<=6 (true) 
 *						====
 *						6<6 || 6==6 : �� ���� true�� true. 
 *	6) >= (ũ�ų� ����) ex) 6>=6 (true)
 *	=========================================== if, while, for������ �ַ� ���.
 *		** if : ���ǹ� / while,for : �ݺ���
 *  
 *  
*/
import java.util.Scanner; // Scanner�� �ҷ���. �ӵ��� ����. 
//import java.util.*; <-- ��� Ŭ������ �ҷ���. �ӵ��� ������. 
public class ���׿�����_�񱳿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1=10==1;
		System.out.println("b1="+b1);
		
		b1=10!=11;
		System.out.println("b1="+b1);
		
		b1=10<11;
		System.out.println("b1="+b1);
		
		b1=10>11;
		System.out.println("b1="+b1);
		
		// char ==> ��� ���꿡�� ����(����)�� �����. 
		b1=65<='A'; //A=65�ϱ� b1=65<=65;
		System.out.println("b1="+b1); 
		
		b1=65>='B'; //B=66
		System.out.println("b1="+b1);
		
		//char --> ��ȣ �� �� ����س���. : �ƽ�Ű�ڵ� 
		System.out.println((int)'A'); //'A'=65 ��
		System.out.println((int)'0'); //'0'=48 ��
		System.out.println((int)'a'); //'a'=97 ��
		
		// �� ���� ������ �޾Ƽ� ū ���� ��� 
		
		Scanner scan=new Scanner(System.in);
		// new --> �޸𸮿� ����. 
		// System.in : ������ --> �ʱⰪ �ο�.
		/*
		 * 	scan.nextInt() : int ����
		 * 	scan.nextDouble() : double ����
		 * 	scan.next() : String ����
		 * 	scan.nextBoolean() : boolean ���� 
		 * 	--> char(X) char�� ����. 
		*/
		// 1. �޾Ƽ� ������ ����
		int num1,num2;
		System.out.print("ù��° ���� �Է�:");
		num1=scan.nextInt();
		// �Է� �� ���� ġ�� num1�� �Է��� ���ڰ� ����ȴ�. 
		
		System.out.println("�ι��� ���� �Է�:");
		num2=scan.nextInt();
		
		// ���ǽ�?:��1:��2 <-- ���ǽ��� true�� ��1, false�� ��2.
		int result=num1<num2?num2:num1; //true�� num2���, false�� num1 ���
		System.out.println(num1+"�� "+num2+" �� �� ū ���� "+result+"�Դϴ�.");
		
		
		
		 

	}

}
















