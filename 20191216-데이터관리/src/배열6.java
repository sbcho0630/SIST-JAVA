// 5���� �̸��� �Է¹޾Ƽ� �����ϰ� => ����ϴ� ���α׷�
import java.util.Scanner;
public class �迭6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[]=new String[5];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<names.length;i++) {
			System.out.println((i+1)+"��° �̸� �Է�:");
			names[i]=scan.next();
			
		}
		
		// ���
		// �ڡ� for-each �ڡ� => �迭, ����ü(collection) 
		/* 
		 * int[] data={1,2,3,4,5}
		 * for(int i=0;i<data.length;i++){
		 * 		System.out.println(data[i])
		 * }
		 * 
		 * for(int i:data){
		 * 		System.out.println(i)
		 * }
		 * 
		*/
		for(String i:names) {
			System.out.println(i);
		}
		
		

	}

}
