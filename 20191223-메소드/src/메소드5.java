import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class �޼ҵ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="�������� ���� ���� ���� ���! �����̹���������ͱ��� �����";
		//���� ���� Ȯ�� ==> ���鵵 �����Ѵ�. 
		System.out.println("���� ����:"+data.length());

		/*
		 * System.out.println("'����'�̶�� �ܾ��� ����:"); int count=0; Pattern
		 * p=Pattern.compile("����"); Matcher m=p.matcher(data); while(m.find()) {
		 * count++; } System.out.println(count);
		 */
		// substring(int start), substring(int start, int end)
		// ��'end-1'�� ���ڱ��� �����ȿ� ����!! ��
		String fData=data.substring(0,data.indexOf("!"));
		System.out.println(fData);
		String lData=data.substring(data.indexOf("!")+1);
		System.out.println(lData.trim());
		
		int a=10;
		int b=20;
		double d=10.5;
		// 102010.5 �� ���� ����ϰ� �ʹٸ� ex) 2019122301, 2019122302 <== ����(19.12.22) �����Ͻ� �մ� ��� 
		String sss=a+""+b+""+d;
		System.out.println(sss);
		// �̷� �Լ��� static �Լ���� �Ѵ�. static �޼ҵ�. 
		// �տ� Ŭ���� ���� ���� ���� ==> static ex) System.out, Math.random();
		sss=String.valueOf(a)+String.valueOf(b)+String.valueOf(d);
		System.out.println(sss);
		// valueOf : ��� ���������� ���ڷ� �ٲ��ִ� �Լ�. 
		
				
	}

}









