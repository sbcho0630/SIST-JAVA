/*
 * 	1~100������ �� 
 * 	¦��/Ȧ�� �� ��� 
 * 
 * 	���	
 * 	1~100������ �� : 5050
 *  1~100������ ¦���� �� : 
 *  1~500������ Ȧ���� �� : 
*/
public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum1=0,sum2=0,sum3=0;
		for(int i=1;i<=100;i++) {
			sum1+=i;
			if(i%2==0)
				sum2+=i;
			else
				sum3+=i;
		}
		System.out.println("1~100������ �� :"+sum1);
		System.out.println("1~100������ ¦���� �� :"+sum2);
		System.out.println("1~100������ Ȧ���� �� :"+sum3);

	}

}
