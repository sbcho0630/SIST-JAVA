/*

yte --> ���� (int) 
 * 		
 * 		byte < char,short < int < long < float < double
 * 		
 * 		&& || ! --> �� (true, false) : ���ǹ��� ���� ���... 
 * 
 *  
 *  
*/

public class ���׿�����_��������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� --> boolean
		boolean b1=(6<7) && (7==7); //true
		System.out.println("b1="+b1);
		
		b1=(6>7) && (7==7); //false
		System.out.println("b1="+b1);
		
		b1=(6>7) || (7==7); //true
		System.out.println("b1="+b1); 
		
		b1=(6<7) || (7==7); //true
		System.out.println("b1="+b1); 
		
		b1=(6>7) && (7==7); //false
		System.out.println("b1="+b1);
		
	}

}
