/*
 * ��ǻ�� -> 1~100 ������ ������ ���� ����
 * UP/DOWN ����..
*/
import java.util.Scanner;
public class ���ٿ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ǻ�� ���� �߻� 
		int com=(int)(Math.random()*100)+1; //0.0~0.99
		
		//���� ������ �޴´� 
		Scanner scan=new Scanner (System.in);
		
		System.out.println("1~100 ������ ���� �Է�:");
				
		while(true) {
			
			int user=scan.nextInt();
			//����ó��-������ �̻��� �� �Է� ��
			if(user<1 || user>100) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue; //continue : while���� ���ǽ����� �̵� �ڡ�
			}

			if(com>user) {
				System.out.println("UP!");
			}
			else if(com<user) {
				System.out.println("DOWN!");
			}
			else {
				System.out.println("Correct! Game Over!");
				//���� : break; �Ǵ� System.exit(0);�� �ش�.
				break; //break : �� ��ġ���� while���� �����Ų��.�ڡ�
				//System.exit(0);
				//break�� continue �Ʒ����� �ƹ� ���嵵 �Է��ϸ� �� �ȴ�.
			}
		}

	}

}
