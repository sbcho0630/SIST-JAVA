import java.util.Calendar;
import java.util.Scanner;

public class �迭3_���ó�¥���ϻ����ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] strWeek= {'��','��','ȭ','��','��','��','��'};
		
		// MONTH => 0������ ������
		// DAYS_OF_WEEK ==> 1������ ����
		Calendar cal=Calendar.getInstance();
		int y=cal.get(cal.YEAR);
		int m=cal.get(cal.MONTH);
		int d=cal.get(cal.DATE);
		int w=cal.get(cal.DAY_OF_WEEK);
		System.out.println("====== "+y+"�⵵ "+m+"�� "+d+"�� "+strWeek[w-1]+"���� ======");
			

	}

}
