/*
 * 	���� �ʱ�ȭ
 * 	========
 * 	����� ���ÿ� �ʱ�ȭ
 * 
 * 	ex1) int a=10;
 * 
 * 	ex2) �ʱ�ȭ ��� : ��������� �ʱ�ȭ. (static�� ��� ��� �տ� static�� ���δ�) 
 * 
 * 	��	{
 * 			a=100;
 * 		}
 * 
 * 	��	static
 * 		{
 * 			�ڵ� 
 * 		}
 * 
 * 	ex3) Ŭ������()
 * 		 {
 * 			a=200;
 * 		 }
 * 		 
*/
class MyData{
	static int[] arr=new int[6];
	//arr[0]=10; // Error. �� ������!!! ���� �ٲ۰Ŵϱ�!! Ŭ���� ���� �ȿ� �������� �ȵ�!!!!��
	
	//�ʱ�ȭ ��� 
	public MyData()
	{
		for(int i=0; i<6;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MyData m1=new MyData(); for(int i=0;i<6;i++) {
		 * System.out.print(MyData.arr[i]+""); }
		 */
		
		MyData m1=new MyData(); 
		for(int i=0;i<6;i++) {
			System.out.print(MyData.arr[i]+" "); 
		}
		System.out.println("\n=================");
		
		MyData m2=new MyData(); 
		for(int i=0;i<6;i++) {
			System.out.print(MyData.arr[i]+" "); 
		}
		System.out.println("\n=================");
		
		MyData m3=new MyData(); 
		for(int i=0;i<6;i++) {
			System.out.print(MyData.arr[i]+" "); 
		}
		System.out.println("\n=================");
		for(int i=0;i<6;i++) {
			System.out.print(MyData.arr[i]+" "); 
		}
		System.out.println("\n=================");
		for(int i=0;i<6;i++) {
			System.out.print(MyData.arr[i]+" "); 
		}
		System.out.println("\n=================");
		
	}
}
