/*
 * �ΰ��� ������ �Է¹޾Ƽ�
 * �ִ밪, �ּҰ��� ����ض�
 * do while�� �̿�
 * ex) 10 30 ==> �ִ밪:30, �ּҰ�:10 
*/
import java.util.Scanner;
public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);		
		int num1=0,num2=0;
		int i=1;
		do {
			System.out.println("���� �Է�:");
			if(i==1) {
				num1=scan.nextInt();
			}
			else {
				num2=scan.nextInt();
			}			
			i++;
		}while(i<=2);
		
		//��¹��1
		if(num1>num2) {
			System.out.println("�ִ밪:"+num1+" �ּҰ�:"+num2);
		}
		else {
			System.out.println("�ִ밪:"+num2+" �ּҰ�:"+num1);
		}
		
		//��¹��2 - ���� if else�� �� �ٷ� ����
		System.out.println("�ִ밪:"+(num1>num2?num1:num2)+" �ּҰ�:"+(num1<num2?num1:num2));
		
		//��¹��3
		System.out.println("�ִ밪:"+(Math.max(num1, num2))+" �ּҰ�:"+(Math.min(num1, num2)));

	}

}


