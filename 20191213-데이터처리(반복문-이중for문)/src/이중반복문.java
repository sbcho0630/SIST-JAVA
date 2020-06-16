/*
 * <2�� for��> 
 * ���� �� ����)
 *        1   2 ��: ���ǽ��� false�� ��� ���� 
 * 	for(�ʱⰪ;���ǽ�;������){ ==> 1�� for�� ===> �� �� 
 * 			  ��: ���ǽ��� true�� ��� 2���� �� 
 * 
 * 			  1    2 ��: ���ǽ��� false�� ��� ���� ==> 1�� for���� ���������� �ö�   
 * 		for(�ʱⰪ;���ǽ�;������){ ==> 2�� for�� ====> ���� ��� 
 * 		 	  ��: ���ǽ��� true�� ��� 2�� for�� ���� ���� ���� 
 *               3
 * 			���๮�� (2�� for) ==> ���� �� 2�� for���� ���������� �ö�  
 * 		}
 * 		���๮�� (1�� for)
 * 	}
 * 
 * ex1) 1####
 *      #2###
 *      ##3##
 *      ###4#
 *      ####5
 *      
 * ex2) *
 * 		**
 * 		***
 * 		****
 * 		***** 
 * 
 * ex3) *****
 * 		****
 * 		***
 * 		**
 * 		*
 * 
 * ex4)    *
 *        **
 *       ***
 *      ****
 *     *****
 *     
 * ex5) ***** i=1, �� j=1~5 		����0   
 *       **** i=2, �� j=2~5=i~5	����1 = 1~(i-1)
 *        *** i=3, �� j=3~5=i~5 	����1~2 = 1~(i-1)
 *         ** 
 *          *
 *     i	j	k   ==> i+k=6 ==> k=6-i
 *    �ټ�     ����    ��ǥ
 *     1	0	5
 *     2	1	4
 *     3	2	3
 *     4	3	2
 *     5	4	1
 *     		j=i-1
 *     
 *     ==> �̷��� ���踦 ���� ¥���� ����.
 *     
 * ex6) �𷡽ð���
 * 		*****
 * 		 ***
 * 		  *
 * 		 ***
 * 		*****
 * 
 * ex7) ������
 * 
 * 		*   *
 * 		** **
 * 		*****
 * 		** **
 * 		*   *
 * 
 * ex8) ������
 * 			*
 * 		   ***
 * 		  *****
 * 		   ***
 * 			*
 * 		
 * ===================
 * ex9) ������ 
 * 		2*2=1 3*1=3 4*1=4 ----- 9*1=9
 * 		...
 * 		...
 * 		2*9=18 3*9=27 ....      9*9=81
 * 
 * 
 * 
*/
import java.util.Scanner;
public class ���߹ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ex1) ���μ��� 5�� ��� 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==i) {
					System.out.print(i);
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//ex1-1) �ټ��Է¹޾Ƽ� ���
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("�� �� ���? (9�� �̳�)");
		 * int rows=scan.nextInt();
		 * 
		 * for(int i=1;i<=rows;i++) { for(int j=1;j<=rows;j++) { if(j==i) {
		 * System.out.print(i); } else { System.out.print("#"); } }
		 * System.out.println(); } System.out.println();
		 */

		//ex2) �� ���� �Ʒ��ٷ� ���鼭 1-5���� ����
		//i�� j�� ���踦 �����غ��鼭 ¥�� ����. 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//ex3) �� ���� �Ʒ��ٷ� ���鼭 5-1���� ����
		//i�� j�� ���踦 �����غ��鼭 ¥�� ����. 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		System.out.println();
		
		//ex4) 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//ex5) 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=6-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//ex9) ������  
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}
			System.out.println();
		}
	
		
		
		
	}

}








