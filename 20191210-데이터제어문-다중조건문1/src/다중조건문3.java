// ���� 2���� �Է� �޾Ƽ� --> ������ 1�� --> ��Ģ����
// �ڹ� --> �Է� �޴� ��쿡 --> char (X), String (O)
// String�� ���� ��쿡�� '=='�� ���� �ʰ�, 'equals'�� ����Ѵ�. 

import java.util.Scanner;
public class �������ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String �� �ÿ��� '=='�� �ƴ϶� 'equals' ���!!
		String s1=new String("Hello");
		String s2=new String("Hello");
		if(s1==s2) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���"); //�̰� ��µ�. 
			//�ֳĸ� ==�� ����ϸ�, s1�� s2�� �� '��'�� Hello�� ���ϴ°� �ƴ϶�, 
			//s1�� s2�� �ּҸ� ���ϱ� ����.
			//String�� class. class�� '�ּ�'�� ������ �ִ�. �ڡ�
			//���� s1�� s2�� ���� ���ϰ� �ʹٸ�, ==�� �ƴ϶� equals ������ ���ؾ���. �ڡڡ�
			
			//int a=(int)"10" <-- �� ��. String�� �̷��� �ؼ��� �ٲ� �� ����.  
			Integer.parseInt("10"); //<--�̷� ������ �ؾ�. 
		}
		
		// equals ����
		Scanner scan=new Scanner(System.in);
		System.out.println("ù��° ����:");
		int num1=scan.nextInt();
		
		System.out.println("�ι�° ����:");
		
		int num2=scan.nextInt();
		System.out.println("������(+,-,*,/):");
		String op=scan.next();
		
		if(op.equals("+")) {
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(op.equals("-")) {
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}
		else if(op.equals("*")) {
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		else if(op.equals("/")) {
			if(num2==0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else
				System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
				//����° ���� �¿� �� �������. �ڵ� �� ��ȯ �� �Ǵϱ� ���� ������ ��ġ�ǰ� �Ű�Ἥ ���������. 
		}
		else {
			System.out.println("�߸��� �������Դϴ�.");
		}
		//���� �ַ��� printf�� ���� 
	}	

}







