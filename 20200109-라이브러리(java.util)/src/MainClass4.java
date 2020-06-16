import java.util.Scanner;

/*
 * <Wrapper Ŭ����>
 *  - �⺻�� (int, long...) �����͸� ���� ��� �����ϵ��� ���ִ� Ŭ����.
 *  - java.lang�� �ִ� �ֵ��̹Ƿ� ������ import �� �ص� �ȴ�. 
 * 	- int ==> Integer  
 * 	  double ==> Double
 * 	  byte ==> Byte
 *	  boolean ==> Boolean
 *  - Integer.pareInt() Ȥ�� Double.pareDouble() �ƴϸ� Boolean.parseBoolean() �̷� �ֵ��� ���� �� ����. 
 *  - BOXING, AUTOBOXING
 *  	ex) Integer ii=new Integer(10);
 * 			//�������� �Ʒ��� ���� �ؾ߸� �߾�����... (Boxing)
 *  	    int i=ii.valueOf();
 *		    //������ �Ʒ��� �ΰ��� ����, ��ġ �⺻��ó�� ��� ����������  (AutoBoxing) 
 *  	    int i=ii; 
 *		    Integer ii=10;
 *	
*/
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="100";
		int i=Integer.parseInt(s);
		System.out.println(i+300);
		
		String d="300";
		double j=Double.parseDouble(d);
		System.out.println(d+3.0d);
		
		Integer ii=new Integer(100);
		int i1=ii;
		int k=1000;
		Integer kk=100;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�:");
		String no1=scan.next();
		
		System.out.println("���� �Է�:");
		String no2=scan.next();
		
		System.out.println(no1+no2); //�ƹ� ��ġ �� �ϸ� String�ΰ��� �̾��� ���� ��µ�
		System.out.println(Integer.parseInt(no1)+Integer.parseInt(no2)); //int�� ��ȯ�ؾ� �� ���� ������ 
		//���� �Է� �� �� ���� �Է¹����� NumberFormatException �Ͼ ==> ��������� �Է¹��� ���� trim�����...
		
		String s1="true";
		if(Boolean.parseBoolean(s1)==true) {  
			// if(s1==true)�ϸ� �� ��!! String�̶� boolean ���������� �ٸ��ϱ� �Ұ�!!
			// Ȥ�� if(s.equals("true"))�� �ؼ� String�̶� String�̶� ���ϴ°� ����!
			// Ȥ�� if(Boolean.parseBolean(s1)) ���� �ص� �� 
			// Boolean boolean = new Boolean(); �� �����ϱ� ��״� static�̴�!! �Ϳ� 
			// ��, Boolean.parseBoolean�̳� Integer.parseInteger�� ��static �޼ҵ����
			// ��� �󵵰� ���Ƽ� ������ �޸� �Ҵ� �� �ص� �ǰԲ� static �޼ҵ�� ����������...
			// ���������� �޸��Ҵ� �� �ϰ� �׳� ���� Math.Random() �̷� ģ���鵵 static �޼ҵ忴������! 
			// Ŭ�����̸�.�޼����̸� ==> static �޼ҵ�
			// new �Ἥ �޸� �Ҵ� ==> �ν��Ͻ� �޼ҵ�
			System.out.println("���");
		}
		
		String score="4.5";
		System.out.println(Double.parseDouble(score)+1);
		 
		boolean b=true;
		System.out.println(String.valueOf(b));
		// �Ϲݵ��������� ���ڷ� �ٲ� �� : String.valueOf()!! toString() �ƴϴ�!
		
	}

}


