/*
 * 	ex1) for���� while���� ����Ͽ� �������� ����϶�. 
 * 
*/
import java.util.Scanner;
class A{
	static int aa=10;
}

public class ���߹ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		A a=new A();
		a.aa=100;
		A b=new A();
		System.out.println("b="+b.aa); //b=10 //new�� ���� ������ ���� �����. 
		
		
		for(int i=1;i<=9;i++) {
			int j=2;		//while�������� �ʱⰪ�� �̸� �����س���. //�̷��� �ϸ� i�� �ٲ𶧸��� ���� j�� ���� ����Ƿ� i�� �ٲ𶧸��� �޸𸮰� ���� �����ȴ�. ==> �� �� ������ for�� �ȿ� int�� �� ���°� ����.  
			while(j<=9) {
				System.out.printf("%d*%d=%d\t",j,i,j*i);
				j++;
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
