import java.util.Scanner;
public class ��������1_������� {
	//���� 5���� �Է¹ްų� �������� 5���� �������Ѽ� ������ ����� ���϶�. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//�����Է� 
		int[] num=new int[5];
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"���� ���� �Է�:");
			num[i]=scan.nextInt();
		}
		
		//�������
		int[] rank=new int[5];
		//�� ���(1) = 5(�� ���Ƚ��) - 4 (�̱�Ƚ��)
		//(���1) ���� Ǭ ��� - ó���� �õ����� ����. �̱涧���� ���-1. (����� �ö�) 
		/*
		 * for(int i=0;i<5;i++) { rank[i]=5; for(int j=0;j<5;j++) { if(num[i]>num[j]) {
		 * rank[i]--; } } System.out.println(num[i]+"("+rank[i]+")"); }
		 */
		
		//(���2) �������� Ǭ ��� - ó���� 1������ ����. �������� ��� +1. (����� ������)
		 for(int i=0;i<5;i++) { 
			  rank[i]=1; 
			  for(int j=0;j<5;j++) { 
				if(num[i]<num[j]) {
					  rank[i]++; 
				} 
		} 
		System.out.println(num[i]+"("+rank[i]+")"); }
		 		
	}
}
