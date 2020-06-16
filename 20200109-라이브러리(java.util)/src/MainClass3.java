import java.util.*;
import java.text.*;
public class MainClass3 {

	public static void main(String[] args) {
		
		// �ý����� �ð� �б� : Date
		Date date=new Date();
		System.out.println(date); //���� toString �� �ᵵ �� ��µ�  // Thu Jan 09 15:10:44 KST 2020
		//System.out.println(date.toString()); 
		
		// SimpleDateFormat: ��¥�� ���� ���ϴ� ���·� ǥ������ 
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //2020-01-09 03:10:44
		SimpleDateFormat sdf2=new SimpleDateFormat("yy-M-d h:m:s"); //20-1-9 3:10:44
		//MM�� �빮�ڷ� ����! mm�� minute�� �׷���. 
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		
		StringTokenizer st=new StringTokenizer(sdf1.format(date),"-");
		while(st.hasMoreTokens()) { //hasMoreTokens : �����Ͱ� �� �� ���Դ��� �� �� ���. 
			System.out.println(st.nextToken());
		}
		
		String year=st.nextToken();
		String month=st.nextToken();
		String day=st.nextToken();
		
		System.out.println("�⵵:"+year);
		System.out.println("��:"+month);
		System.out.println("��:"+day);
		
		
	}

}
