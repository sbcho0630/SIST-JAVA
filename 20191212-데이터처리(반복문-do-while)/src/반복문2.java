/*
 * ex1) [do while] 3���� �л��� �Է��� �޾Ƽ� => ����, ����, ���� ���� => ���, ����, ������ ��� (�迭 ���� ���� Ǯ���.) 
 * 		����	����	����	����	���	����
 * 		80	80	80	240	80	'B'
 * 		70	70	70	210	70	'C'
 * 		90	90	90	270	90	'A'
*/
import java.util.Scanner;
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor,eng,math,total,avg;
		String result="";
		int i=1;
		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("��������:");
			kor=scan.nextInt();
			
			System.out.println("��������:");
			eng=scan.nextInt();
			
			System.out.println("��������:");
			math=scan.nextInt();
			
			total=kor+eng+math;
			avg=total/3;
			
			char c='A';
			switch(avg/10) {
				case 10:
				case 9:
					c='A';
					break;
				case 8:
					c='B';
					break;
				case 7:
					c='C';
					break;
				case 6:
					c='D';
					break;
				default:
					c='F';			
			}
			
			result+=kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+c+"\n"; //�� ���� ���� result �ʱⰪ ������� 
			i++;
			
		}while(i<=3);
		System.out.println("����\t����\t����\t����\t���\t����");
		System.out.println(result);
		//result�� ��û ��� �ٿ��� ����� ��...  result�� 3��¥�� String���� �������ȴ�. 

	}

}
