/*
 * <�ڹٿ��� �����ϴ� Ư������> 
 * 1) \n : new line : �� �� ���. 
 * 		ex) System.out.println("�ȳ�\n�ϼ���"); 
 * 2) \t : tab : �������� ���.
 * 		ex) System.out.println("������ \t LovePoem \t 2019�� 12�� �߸�"); 
 * 3) \" : " : �ֵ���ǥ ���
 *	 	ex) System.out.println("\"Hello Java\""); //"Helo Java"
 * 
 * <��� ����> �ڡڡڡ�
 * 1) println: ��� �� �� �� ���
 * 2) print : ��� �� �� ����� X �� �ٷ� �� ���. 
 * 3) ������ �ִ� ��� --> JDK 1.5 (printf������ ����. println������ �Ұ�.)
 * 	(1) %d : ����
 * 		ex) System.out.printf("��������:%d",10); %d�ȿ� 10�� ����ִ´�.
 * 		ex) System.out.printf("%d%d%d",100,90,60); //������ �� �� �Է��ϰڴٴ� ��. 1009060 : �� ���� �پ ����
 * 		ex) System.out.printf("%5d%5d%5d",100,90,60); 
 * 			//--100/---90/---60  �̷��� ����. d�տ� ���ڴ� ���̸� �ǹ���. 5ĭ �ְڴٴ� ��. ����Ʈ�� �����ʺ��� ĭ�� ä��. 
 * 			//���� : -�� ��ĭ�� �̷��� ǥ������./�� ���ڱ����� �׳� �̷��� ǥ������. 
 * 		ex) System.out.printf("%-5d%-5d%-5d",100,90,60);  //-�ָ� ���ʺ��� ĭ�� ä��ڴٴ� ��. 
 * 			//100--/90---/60--- �̷��� ����.  *  
 * 	(2) %f : �Ǽ�
 * 		ex) System.out.printf("%-5f%-5f%-5f",100,90,60); //error. �Ǽ����� ���� �����͸� �־��� ����.
 *  	ex) System.out.printf("%-5f%-5f%-5f",99.9999,80.88,60.6666666); //5ĭ�� ��µ� ĭ�� �� �°� �����͸� ����. 
 *  	ex) System.out.printf("%-10.2f%-10.2f%-10.2f",99.9999,80.88,60.6666666); 
 *  		//10ĭ�� �ְ� �Ҽ����� ���ڸ������� ������. --> ���� ������ ��ĭ���� ����. 
 * 	(3) %c : ����
 * 		ex) System.out.printf("%c",'A');
 * 	(4) %s : ���ڿ�
 * 		ex) System.out.printf("%s","String�Դϴپƾ�"); 
 * 	 
 * 
*/
public class ����������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ȳ�\n�ϼ���");
		System.out.println("\"Hello Java\"");
		System.out.println("������ \t LovePoem \t 2019�� 12�� �߸�"); 
		System.out.println();
		System.out.printf("%d%d%d",100,90,60);  
		System.out.println();
		System.out.printf("%5d%5d%5d",100,90,60);
		System.out.println();
		System.out.printf("%-5d%-5d%-5d",100,90,60);
		System.out.println();
		System.out.printf("%-5f%-5f%-5f",99.9999,80.88,60.6666666);
		System.out.println();
		System.out.printf("%-10.2f%-10.2f%-10.2f",99.9999,80.88,60.6666666);
		System.out.println();
		System.out.printf("%2c%2c%2c\n",'A','B','C');		
		System.out.printf("%10s%10s%10s\n","Hello","Java","!!");
		
		System.out.printf("%7s%5d%5d%5d%7.2f%c\n","String",1,2,3,93.123456,'a');
		
		
	}

}





