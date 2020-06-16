/*
 * <�ݺ���>
 * 1. while
 * 	����)
 * 		�ʱⰪ 		===> 1
 * 		while(���ǹ�){===> 2 : ������ : ������ ó������ ������ ��� ������ �� �� ����.
 * 			�ݺ����๮�� ===> 3
 * 			������ 	===> 4 ===> 2������ �ǵ��ư��� (���ϰ��) 3,4 �� ����. (�����ϰ��) while���� ��������. 
 * 		}
 * 	ex) 1~10
 * 		int i=11;
 * 		while(i<=10){ 				==> ������ : ó������ ������ ��� ������ �� �� ���� �ִ�. 
 * 			System.out.println(i);
 * 			i++;	 <-- �� �� �� ���� (i++) 
 * 		}
 * 2. do~while
 * 	����)
 * 		�ʱⰪ		===> 1
 * 		do{
 * 			���๮��	===> 2
 * 			������	===> 3
 * 		}while(���ǹ�); ===> 4 : ������ : ������ ó������ �����̴��� do�� ������ �� ���� ����ȴ�. 
 * 	ex) int i=1;
 * 		do{
 * 			System.out.println(i); //��� // 10���� ����Ѵ�.
 * 			i++; 
 * 		}while(i<=10);	<-- �� ���� �� (i++) �� 
 * 
 * 3. for
 * 	����)      1    2    4
 * 		for(�ʱⰪ;���ǽ�;������){
 * 			���๮�� ===> 3
 * 		}
 * 	ex) for(int i=1;i<=10;i++){
 * 			System.out.println(i);
 * 		}
 * =====================================
 * 4. ��Ÿ
 *  - ��� �ÿ��� ���׻� ���η� ��¡ڵȴ�. ���η� ��� �� ��. 
 * 
 * 
*/
public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// [for��] 1���� 10���� ����ϴµ� �� �ٿ� ���� ������ ����Ͻÿ�. 
		System.out.println("For Loop");
		for(int i=1;i<=10;i++) {
			System.out.printf("%d\t",i);
			if(i%3==0) {
				System.out.println();
			}
		}
		System.out.printf("\n\n");
		
		// [while��] �Ȱ����� while������ �����
		System.out.println("While Loop");
		int i=1;
		while(i<=10) {
			System.out.printf("%d\t",i);
			if(i%3==0) {
				System.out.println();
			}
			i++; //while�� �� while�� �ȿ��� i++ �������.. for���� ���������� ���ٺ��� �ڲ� while������ i++�� ��Գ�...
		}
		System.out.printf("\n\n");
		
		// [do~while��] �Ȱ����� do while������ �����
		System.out.println("Do/while Loop");
		int j=1;
		do {
			System.out.printf("%d\t",j);
			if(j%3==0) {
				System.out.println();
			}
			j++;
		}while(j<=10);

	}

}



