/*
 * ���ù� : �Ѱ��� ���� �޾Ƽ� ó�� (�ѹ��� �����ϰ� �Ϸ��� break ����.)
 * 		   ����, ��Ʈ��ũ �о߿��� ���� ����. 
 * ����) 
 * 	switch(��){ <-- ���� �� �� �ִ� ������: ����,����,���ڿ�
 * 		case1:
 * 			ó��(1)
 * 			break; <-- break �ִ� �������� ������
 * 		case2:
 * 			ó��(2)
 * 		case3:
 * 			ó��(3)
 * 			break; <-- break �ִ� �������� ������ // ���� 2�� ��쿡�� ó��2,ó��3 �� �� ������. 
 * 		case4:
 *		case5:
 * 			ó��(4) <-- ���� 4,5�� ��쿡�� ó��(4)�� ������ 
 * 			break;
 * 		=========
 * 		default: <-- ���� 1,2,3,4,5�� �ƴ� ��� ����Ʈ ó��. 
 * 			ó��
 * 		========= default �� ���� ����. 
 * 	}
*/
import java.util.Scanner;
public class ���ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ��¥ ���ϴ� ���α׷��� switch �������� ¥�� 
		// if <===> switch
		// ���� if���� switch ���� ���� �ٲ㼭 �� �� �ִ�. 
		// Servlet <===> JSP ===> MVC ===> Spring 
		// 				  �� JSP : Java�� HTML�� ����... MVC�� ���� ����. 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ù��° ����:");
		int num1=scan.nextInt();
		
		System.out.println("�ι�° ����:");
		int num2=scan.nextInt();
		
		System.out.println("������(+,-,*,/):");
		String op=scan.next();
		
		switch(op) {
			case "+":
				System.out.printf("%d+%d=%d",num1,num2,num1+num2);
				break;
			case "-":
				System.out.printf("%d-%d=%d",num1,num2,num1-num2);
				break;
			case "*":
				System.out.printf("%d*%d=%d",num1,num2,num1*num2);
				break;
			case "/":
				if(num2==0)
					System.out.println("0���� ���� �� �����ϴ�.");
				else
					System.out.printf("%d/%d=%.1f",num1,num2,num1/(double)num2);
				break;
		}
		

	}

}










