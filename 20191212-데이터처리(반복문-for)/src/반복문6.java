/*
 * ex) 3���� ���� �Է¹ް�, �� ������ 3�� �� ���ڸ� ����϶�. (������ ��ȣȭ) 
 * ���ĺ��� �빮�ڷ�.
 * ex) DDD ===> AAA, ZZZ ===> WWW. 
*/
import java.util.Scanner;
public class �ݺ���6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� Ǭ ��� 
		Scanner scan = new Scanner(System.in);
		System.out.println("����빮�� 3���ڸ� �Է����ּ���.");
		String input=scan.next();
		
		char c0=input.charAt(0);
		char c1=input.charAt(1);
		char c2=input.charAt(2);
		
		c0-=3;
		c1-=3;
		c2-=3;
		
		System.out.printf("%c%c%c\n\n",c0,c1,c2);
		
		//�������� Ǭ ��� 
		System.out.println("����빮�� 3���ڸ� �Է����ּ���.");
		String data=scan.next();
		for(int i=0;i<data.length();i++){
			char c=data.charAt(i);
			System.out.print((char)(c-3));
		}
		
		
	}

}
