// ���� 1���� �Է¹޾Ƽ� 2���� ��� ==> 1. �׳� 2. �޼ҵ� ���� 
// 10 ==> 16bit
// ���) 0000 0000 0000 1010
import java.util.Scanner;
public class �޼ҵ�2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.�Է�
		Scanner scan=new Scanner(System.in);
		// ���� 
		int input=0; //����ڰ� �Է��� ���� �޴� ���� 
		System.out.println("���� �Է�:");
		input=scan.nextInt();
		//���̺귯�� Ȱ���ϸ� �ѹ濡 ������ �� ����. 
		//System.out.println(Integer.toBinaryString(input));
		//2. ó�� 
		int[] binary=new int[16]; 
		// ������� �ڿ������� ���� ä��� �տ��� �� 0���� ä��Ƿ�, �迭�� ��ġ�� ��� ���� ��ġ ��� ������ ������. 
		int index=15; 
		// �迭 => ���� ���� ==> ��ġ (��(length-1), ��(0))
		// �ں��� (binary[15] ����) �����ؾ��ϹǷ�, �� ó���� ������ �� ������ index=15, �׸��� index�� �ϳ��� �����鼭 ��������.
		/* 10%2==0
		 * 5%2==1
		 * 2%2==0
		 * 1%2==1
		 * ==> 1010 
		*/
		while(true) {
			binary[index]=input%2;
			input=input/2; // input/=2;�� �ص� ��.
			if(input==0) //
					break;
			index--;
		}
		//3. ��� ==> ��¸� �����ϱ� void 
		for(int i=0;i<16;i++) {
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		
		
		
	}

}






