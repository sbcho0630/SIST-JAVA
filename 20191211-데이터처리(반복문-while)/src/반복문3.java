// ���������� ==> 5�� �Ѵٰ� ġ�� ==> 1��3��1��
import java.util.Scanner;
public class �ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ex1) [while] while������ ���������� ����� - �� 5�� �ϰ�, �������� ��¸��и���� �˷��ִ�. 
		int i=1;
		int win=0,lose=0,same=0;		
		while(i<=5) {
			// ��ǻ�� --> ����������
			int com=(int)(Math.random()*3);//0.0~0.99*2//int(0.0~2.99)//0,1,2
			//�����  --> �Է�
			Scanner scan = new Scanner(System.in);
			System.out.println("����������! (����:0,����:1,��:2):");
			int user=scan.nextInt();
			//��
			int result=com-user;
			if(result==0) {
				System.out.println("�����!");
				same++;
			}
			else if(result==-1||result==2) {
				System.out.println("����� win!");
				win++;
			}
			else {
				//result==1 ||result==-2 �� ��.
				System.out.println("��ǻ�� win");
				lose++;
			}
			i++;
		}
		//�¹��� ī��Ʈ 
		System.out.println("����� ����: �� 5�� �� "+win+"�� "+lose+"�� "+same+"��");
		System.out.println("End of the game\n\n");
		
		
		// ex2) [switch case] ex1���� switch case�� �ٽ� ¥��
		i=1;
		win=0;
		lose=0;
		same=0;		
		while(i<=5) {
			// ��ǻ�� --> ����������
			int com=(int)(Math.random()*3);//0.0~0.99*2//int(0.0~2.99)//0,1,2
			//�����  --> �Է�
			Scanner scan = new Scanner(System.in);
			System.out.println("����������! (����:0,����:1,��:2):");
			int user=scan.nextInt();
			//��
			int result=com-user;
			switch(result) {
				case -1:
				case 2:
					System.out.println("����� win!");
					win++;
					break;
				case 1:
				case -2:
					System.out.println("��ǻ�� win!");
					lose++;
					break;
				case 0:
					System.out.println("�����!");
					same++;
					break;
			}
			i++;			
		}
		//�¹��� ī��Ʈ 
		System.out.println("����� ����: �� 5�� �� "+win+"�� "+lose+"�� "+same+"��");		
		
		

	}

}
