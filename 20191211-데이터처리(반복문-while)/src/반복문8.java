/*
 * ���α׷�
 * ======
 * 	����� ���� + java ���̺귯�� + �ܺο��¼ҽ� (mvn repository���� ������ ���� �� - mvnrepository.com)
 * 	=================================
 * 				����!
 * 
*/
import java.util.Scanner;

import javax.swing.JOptionPane;
public class �ݺ���8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Ŭ������ �ҷ���. F11�ϸ� Ŭ���� �ҷ��� ��� ��µ� 
		//�ݺ���7_1_Ŭ���������.music();
		
		
		//ex1) [for] �� �Է¹޾Ƽ� ������ 
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���(2~9):");
		int dan=scan.nextInt();
		//�Է�â ���
		//JOptionPane.showInputDialog("");
		//�ٵ� �̷��� �ϸ� string���� �޾Ƽ� �� int�� �����������. ������ ���� ����. refer class ��� �ڿ� ����. 
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		System.out.print("\n");
		
		//ex1-1) [while] �� �Է¹޾Ƽ� ������
		int a=1;
		while(a<=9) {
			System.out.printf("%2d * %2d = %2d\n",dan,a,dan*a);
			a++;
		}
		System.out.print("\n");
		
		//ex2) 2�ܿ��� 9�ܱ��� ���
		System.out.println("2�ܿ��� 9�� ���");
		for(int i=1;i<=9;i++) {
			for (int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		

	}

}
