//�����Է� --> 1,2,3,4
import java.util.Scanner; 
public class ���_���ǹ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int UP=1;
		final int DOWN=2;
		final int LEFT=3;
		final int RIGHT=4;
		
		int x=0,y =800; //���̴� �� ���� 0, �� �Ʒ��� 800�� 
		Scanner scan=new Scanner(System.in);
		System.out.println("Ű���� �Է�(��:1, �Ʒ�:2, ����:3, ������:4) :");
		int input=scan.nextInt();
		
		if(input==UP) {
			System.out.println("�������� �ö󰣴�!!");
			y-=5; //y�� -5�ϸ� 5��ŭ �ö󰣴�.
		}

	}

}
