/*
 * �⵵ ���� �Է¹޾Ƽ� ==> ���� ������ ���� ����?
 * 1,3,5,7,8,10,12�� : 31��
 * 2�� : 28��(���), 29��(����)
 * 4,6,9,11�� : 30�� 
 * 
*/
import java.util.Scanner;
public class �迭4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month; //int[] data=new int[2]
		Scanner scan=new Scanner(System.in);
		System.out.println("�⵵ �Է�:");
		year=scan.nextInt();
		
		System.out.println("�� �Է�:");
		month=scan.nextInt();
		
		int lastDay=0;
		/*
		 * if(month==4||month==6||month==9||month==11) { lastDay=30; } else if(month==2)
		 * { //���� if((year%4==0 && year%100!=0)||(year%400==0)) { lastDay=29; } else {
		 * lastDay=28; } } else { lastDay=31; }
		 */
		switch(month) {
		case 4: case 6: case 9: case 11:
			lastDay=30;
			break;
		case 2:
			if((year%4==0 && year%100!=0)||(year%400==0)) {
				lastDay=29; 
			} 
			else {
			lastDay=28; 
			}
			break;
		default:
			lastDay=31;
		}
		System.out.println(month+"���� ������ ���� "+lastDay);
		
	}

}
