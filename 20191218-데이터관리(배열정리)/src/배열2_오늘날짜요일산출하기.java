import java.util.Scanner;
import java.util.*;
import java.*;
public class �迭2_���ó�¥���ϻ����ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ʋ���� ���ľ���. ��� �߸��Ѱ���? 
		Scanner scan=new Scanner(System.in);
		System.out.println("�⵵ �Է�:");
		int year=scan.nextInt();
		
		System.out.println("�� �Է�:");
		int month=scan.nextInt();
		
		System.out.println("�� �Է�:");
		int day=scan.nextInt();
		
		System.out.println("\n");
		
		char[] strWeek= {'��','��','ȭ','��','��','��','��'};

		//���� �⵵���� ��¥�� ����
		int total=(year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400; //����  ������4,100,400 : ���⿡ ���� ���ں��� ��� 

		//���� �ޱ����� ��¥�� ����
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		//�����϶� 29������ ����ó�� 
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		//��¥ ������ 
		for(int i=0; i<month-1;i++) {
			total=lastday[i]+day;
		}
		
		//+1 ===> %7 ===> ������ ���Ѵ�. 
		int week=total%7;
		
		System.out.println(year+"�⵵ "+month+"��"+day+"���� "+strWeek[week]+"���� �Դϴ�.");
		
		
	}

}









