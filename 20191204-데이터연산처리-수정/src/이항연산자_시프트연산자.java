/*
 * ����Ʈ������ (��Ʈ �̵� ������)
 * 	<< (���� �̵�)    >> (������ �̵�)
 * 
 *   10<<2
 *   1010 --> 101000 (�� ĭ 0���� ä����) --> X(2^2) --> 10*4=40
 *   
 *   10>>2
 *   1010 --> 10 (�� �ڸ� ����) --> /(2^2) --> 10/4=2
 *   
 *   X<<Y --> X * 2^Y
 *   X>>Y --> X / 2^Y
 *   
 *   ex) 14<<3 : 14*8 =112 
 *   ex) 14>>3 : 14/8=1 
 *   
*/
public class ���׿�����_����Ʈ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=14<<3;
		int b=14>>3;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
