/*
 * while --> while(true) : ���ѷ��� --> ���ѷ��� ���� ���� while�� �� ���� ����. 
 * for --> for(;;) : ���ѷ���
 * 
 * �ݺ����� ���� 
 * =========
 * 	continue --> Ư�������� ����.�� ��: continue������ ���� for/while �������� ���ư��ϱ�..
 * 		ex) 1~10���� ���µ� 7,9�� �����ϰ�ʹ�.
 * 			for (int i=1;i<=10;i++){
 * 				if(i==7||i==9)
 * 					continue;
 * 				if(i==9)          <--- �� if���� ������� ����. �ֳĸ� i==9�� �� ���� if������ continue�ż� for���� �������� ���ư��� i=10�� �Ǳ� ����.
 * 					break;
 * 			}
 * 	break --> �ݺ����� ������ �� ���.�ڡ�
 * 
*/
import java.util.Scanner;
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while --> 1~(������Է°�)������ ¦���� ��, Ȧ���� ��, �� ���� ���ؼ� ����϶�.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		int num=scan.nextInt();
		int sum_even=0;
		int sum_odd=0;
		int sum=0;
		int i=1;
		
		while(i<=num) {
			sum+=i;
			if(i%2==0) {
				sum_even+=i;
			}
			if(i%2!=0) {
				sum_odd+=i;
			}
			i++;
		}
		System.out.println("1~"+num+"������ ¦�� ����"+sum_even+"�Դϴ�.");
		System.out.println("1~"+num+"������ Ȧ�� ����"+sum_odd+"�Դϴ�.");
		System.out.println("1~"+num+"������ ��� ���� ����"+sum+"�Դϴ�.");		
		

	}

}
