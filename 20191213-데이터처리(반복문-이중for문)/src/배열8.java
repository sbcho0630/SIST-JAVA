/*
 * 3���� �л� ==> ����,����,���� ������ �Է� �޾Ƽ� ��� (1���� �迭�� Ǯ ��.) 
 * ==================
 * 80 80 80 240 B 2 80.0
 * 90 90 90 270 A 1 90.0 
 * 70 70 70 210 C 3 70.0 
*/
import java.util.Scanner;
public class �迭8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] sum=new int[3];
		char[] grade=new char[3];
		int[] rank=new int[3];
		double[] avg=new double[3];
		
		for(int i=0;i<kor.length;i++) {
			System.out.println((i+1)+"��° �л� ��������: ");
			kor[i]=scan.nextInt();
			System.out.println((i+1)+"��° �л� ��������: ");
			eng[i]=scan.nextInt();
			System.out.println((i+1)+"��° �л� ��������: ");
			math[i]=scan.nextInt();
			sum[i]=kor[i]+eng[i]+math[i];
			avg[i]=sum[i]/kor.length;
			//����
			switch((int)avg[i]/10) { //switch() �ȿ��� �Ǽ� �� �� �����Ƿ� int�� ����ȯ���Ѿ���. //switch �ȿ��� ����, ����, ���ڿ��� ����. 
			case 10: case 9:
				grade[i]='A';
				break;
			case 8:
				grade[i]='B';
				break;
			case 7:
				grade[i]='C';
				break;
			case 6:
				grade[i]='D';
				break;
			default:
				grade[i]='F';	
			}			
		}		
		//��� 
		//avg[i]���� ��. 1���� �ٸ� avg���� ŭ. ==> 2�� ũ��. ==? 1��. ��ü����3-�̱�Ƚ��2=1 ��ŷ 
		//2���� �ٸ� avg���� 1�� ŭ ==> ��ü����3-�̱�Ƚ��1=2 ��ŷ 
		for(int i=0;i<kor.length;i++) {
			rank[i]=kor.length;
			for(int j=0;j<kor.length;j++) {
				if(avg[i]>avg[j]) {
					rank[i]--;
				}
			}
			
		}
		
		
		for (int i=0;i<kor.length;i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%c\t%d\t%.1f\n",kor[i],eng[i],math[i],sum[i],grade[i],rank[i],avg[i]);
		}
		
	}

}
