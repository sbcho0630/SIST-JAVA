// 5���� ������ �Է¹޾Ƽ� => 5�� ������ ����ϰ� ==> ��, ��� ��� (for each ���� ���) 
import java.util.Scanner;
public class �迭7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int number[]=new int[5];
		int sum=0; double avg=0.0;
		
		for(int i=0;i<number.length;i++) {
			System.out.println((i+1)+"��° ���� �Է�:");
			number[i]=scan.nextInt();
			sum+=number[i];
		}
		
		//for each ���� 
		for (int i:number) {
			System.out.println(i);
		}
		
		avg=sum/(double)number.length;
		System.out.println("�հ�: "+sum);
		System.out.printf("���: %.2f\n",avg);
		
		

	}

}
