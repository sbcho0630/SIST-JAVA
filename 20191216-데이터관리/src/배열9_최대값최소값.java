/*
 * 5���� �������� 
 * �ִ밪, �ּҰ�....
*/
import java.util.Scanner;
public class �迭9_�ִ밪�ּҰ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] num=new int[5];
		
		for(int i=0;i<5;i++) {
			num[i]=(int)(Math.random()*100)+1;
		}
		
		//(���1) ���� ������� Ǯ�� ����� �� �ǳ�? --> ��. 
		int max=num[0];
		int min=num[0];
		for(int i:num) {
			System.out.printf("%d\t",i);
		}
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("�ִ밪:"+max+" �ּҰ�:"+min);
		
		//(���2) �������� Ǫ�� ���.
		max=num[0];
		min=num[0];		
		//ó�� => �ִ밪, �ּҰ�
		for(int i:num) {
			if(max<i)
				max=i;
			if(min>i)
				min=i;
			System.out.printf("%d\t",i);
		}		
		System.out.println("�ִ밪:"+max+" �ּҰ�:"+min);
		
	}

}
