// 1,2 -> ���� �߻� -> Ȧ¦���߱� ����. 

import java.util.Scanner;
public class ���׿�����_�񱳿�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.random();�� 0.0~0.99 �ȿ��� ���� �� ������.*2�ϸ� 0.0~1.98 �ɰŰ� int�� ����� 0,1 �ɰ���. ���� +1�ؾ� 1 or 2.   
		int com=(int)(Math.random()*2)+1;
		Scanner scan=new Scanner(System.in);
		System.out.println("�Է�(Ȧ,¦):");
		String input=scan.next();
		
		String result=com%2==0?"¦":"Ȧ";
		String dap=input.equals(result)?"����":"����"; //���ڿ� �� �ÿ��� '=='�� �ƴ϶� '.equals()'�� ���ؾ� �Ѵ�.�ڡڡڡ� �ϱ�!!
		
		System.out.println("����="+com);
		System.out.println(dap+"�Դϴ�");
		
		
		
		

	}

}
