
public class ���׿�����_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���������(+,-,*,/,%) : ���� �ٸ� ���������� ������ ��� ����!
		 * 	1) int ���� �������� (byte, short, char)�� ����Ǹ� int�� ����� �ڡڡ�
		 * 		byte + byte = int
		 * 		char + byte = int
		 * 		short + byte + char = int 
		 * 		
		 * 		byte+int = int
		 * 		short+char+int = int
		 * 
		 * 		short+char+int+double = double
		 * 		--> ���� (ǥ��������) ū ������������ �޾ƾ�!!�ڡڡ�
		 * 
		 * 		� ���������̵� ���ڿ��̶� ������ ������� �������� �ȴ�.
		 * 		""+77 --> "77" (���ڿ�)
		 * 		""+7.5 --> "7.5" (���ڿ�)
		 * 		""+true --> "true" (���ڿ�)
		 */
		
		/*
		 * byte b=10; byte c=20; int d=b+c; //byte d ��� �ϸ� �� ��!! byte+byte=int�ϱ�! �� 
		 * �� d�� byte�� �ٲٰ� �ʹٸ� byte d=(byte)(b+c); �� ���� �ؾ��Ѵ�.
		 */
		
		byte ccc=(byte)300;
		System.out.println("ccc="+ccc); //b=44 
		System.out.println(Integer.toBinaryString(300));
		/*
		 * 300 = 100101100 (2) 
		 * 300�� byte�� �ִ� ��������� 127�� ������Ƿ�, byte�� ������ �� �ִ� ������ �ڿ������� 8��Ʈ(8ĭ)�� �߶� �����Ѵ�.
		 *  --> 00101100(2)�� ������ --> 2^5+2^3+2^2 =32+8+4=44 �׷��� 44�� ��. 
		 *  --> �Ժη� byte�� �����ϰų� ����ȯ�ϸ� �� �ȴ�.
		*/
		
		int a=10+20*3; //a=70
		System.out.println("a="+a);
		int b=(10+20)*3; //b=90
		System.out.println("b="+b);
		

	}

}
