/*
 * <����ȯ>
 * 	1. �ڵ� ����ȯ 
 * 		: ���� �� ���� ����
 * 		ex) int + double = double
 * 			===
 * 			double�� �����Ͽ� ����
 * 		ex) char + int = int
 * 			====
 * 			int�� �����Ͽ� ����
 * 		ex) char c='A'; c>='A' && c<='Z'
 * 							==		 ===
 * 							65        90	--> �ڡ�char�� ��� ���� �� int�� ����ʡڡ�
 * 		ex) �ڡڡ�int ���ϴ� ��� �� ��� int�� ����� �ڡڡ�
 * 			byte+byte=int
 * 			short+short=int
 * 			char+char=int
 * 	2. ���� ����ȯ : cast ������
 * 		: down�� �� ���� ���. 
 * 		ex) int �� char �� �ٲ� ��.
 * 			char c=65; (O) char�� int ������, ������ ũ�� �� ������ ���������� ���� �� ��. 
 * 			float f=10.7; (X) error. �ֳĸ� float�� double �����͸� ������ ũ�Ⱑ �� �¾Ƽ� ������. (double�� �� ũ�ϱ�)
 * 			int a=10.7 (X) error. int���ٰ� double �����͸� ������ ũ�Ⱑ �� �¾Ƽ� ������.(double�� �� ũ�ϱ�)
 * 
 * 		ex) double �� int �� �ٲ� ��.
 * 
 * 
 * 
*/		
public class ����ȯ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c=65;
		float f=10;
		double d='A';
		System.out.println("c="+c); //c=A
		System.out.println("f="+f); //f=10.0
		System.out.println("d="+d); //d=65.0
		

	}

}
