import java.util.Scanner;

/*
 * for:�ݺ��� (�ݺ�Ƚ���� ����)
 * ====
 * �Ϲ� for��
 * 	����) 
 * 		for(�ʱⰪ;���ǽ�;������)
 * 			���๮��
 * 					===================== ��
 * 					��false : ���� 
 * 		=> �ʱⰪ => ���ǽ� => ���๮�� => ������
 * 
 *  	= �ʱⰪ
 *  	= 
 *  	= ���๮���� ����
 *  	  =============> �ѹ���{}(O,X), ��������{}(O)
 *  	= ������ ==> 1����
 *  	= ������ �Ѱ��̻�
 *  	  for(int i=0,j=1;i<=1 && j>=1;... ) <=== ������ ������ �� �� �ִ�. 
 *  	= for(int i=0; ...) => i�� ���������̹Ƿ� i�� for�� �ȿ����� ��� ����. 
 *  	��������
 *  	{
 *  		��������
 *  	}
 *  
 *  
 * ���� for�� (JDK1.5�̻�) : �迭, �÷���(�����ͺ��̽�)
 * 	
 * ====
 * ***�޼ҵ�(�Ϲݸ޼ҵ�, ���ٽ�(�Լ�������):JDK1.8)
 * 
*/
public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// public�� static�� ��ġ �ٲ㵵 ������. 
		// args ��� ������ �ٲ㵵 �ȴ�.
//		Scanner scan=new Scanner(System.in);
//		scan.nextInt();
//		scan.nextDouble(); 
//		scan.nextBoolean();
//		scan.hasNext();
//		System.out.println("Hello Java!!");
		//11.01 (��) ī�� �߱� --> 8���� --> 7������.
		int i=1;
		for(i=1;i<10;i++) {
			System.out.println("i="+i);
		}
		System.out.println("i="+i);

	}

}






