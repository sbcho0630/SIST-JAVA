//���� �Է� --> ������ ��¥�� ��ĥ���� Ȯ���ϴ� ���α׷�
import java.util.Scanner;
public class �������ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1,3,5,7,8,10,12 : 31��
		// 2 : 28��(���), 29��(����)
		// 4,6,9,11 : 30��
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�⵵:");
		int year=scan.nextInt();
		System.out.println("��:");
		int month=scan.nextInt();
		
		int lastday=0;
		if(month==2) {
			if(year%4==0 && year%100==0||year%400!=0) {
				lastday=29;
			}
			else {
				lastday=28;
			}
		}
		else if(month==4||month==6||month==9||month==11) {
			lastday=30;
		}
		else {
			lastday=31;
		}
		System.out.println(year+"�� "+month+"���� "+lastday+"�ϱ��� �ֽ��ϴ�.");
		
		
		

	}

}
