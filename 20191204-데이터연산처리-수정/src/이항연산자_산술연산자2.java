import java.util.Scanner; //Scanner (class��) 

/* Java vs C
 * Java�� �⺻������ class, C�� �Լ�.
*/
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� --> ���� ���� --> ���� �Է�. 
		/*
		 * <���� �� �� �Է�>
		 * int a;
		 * a=10;
		 * 
		 * <����� ���ÿ� �� ����>
		 * int a=10;
		 * 
		 * <�� ����>
		 * �Է��� ���� �޾Ƽ� ����
		 * ����(����) -> ������ ���� ����.
		*/
		int a=(int)(Math.random()*100)+1;
		// Math.random()�� 0.0~0.99 ���� �������� ���� --> *100�ϸ� 0.0 ~ 99.0 --> int ����ȯ�ϸ� ������ 0~99+1
		// 1~100 ������ ���� ���� ����. 
		System.out.println("a="+a);
		
		/*
		 * Scanner scan=new Scanner(System.in); // System.in --> Ű���� �Է°��� �޴´�.
		 * System.out.print("���� �Է�:"); int b=scan.nextInt(); System.out.println("b="+b);
		 */
		
		// ��������� --> +,/
		// ����, ����, ���� ������ �޾Ƽ� ������ ����� ����. ��, ����� �Ҽ��� �� �ڸ����� ���. 
		int kor,eng,math,total;
		double avg;
		
		// �Է��� �� �ִ� ����� Ŭ������ ������ �´� 
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ����:");
		kor=scan.nextInt();
		
		System.out.print("���� ����:");
		eng=scan.nextInt();		
		
		System.out.print("���� ����:");
		math=scan.nextInt();
		
		//����
		total=kor+eng+math;
		
		//���
		avg=total/3.0;
		
		//������
		System.out.println("���� ����:"+kor);
		System.out.println("���� ����:"+eng);
		System.out.println("���� ����:"+math);
		System.out.println("����:"+total);
		System.out.printf("���:%.2f",avg);
		
	}

}








