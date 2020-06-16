/*
 * <�������̵�>
 *  - �߻�Ŭ����, �������̽����� ���� ���.
 *    (�߻�Ŭ����, �������̽� : ������ �� �ϰ� ���� ��. ==> ����Ѱ� ���پ��� �������̵��ؼ� ���� ��.) 
 *  - ����� ����
 *  - �޼ҵ���� ����
 *  - �Ű����� ����
 *  - ������ ���� 
 *  - ������������ Ȯ���� ����. 
 *    (�� ���������� : private < default < protected < public)
 *
 * ex) 
 * 	interface ��
 * 	{
 * 		int a=10; ==> ���� ===> ���⿡ �� int a=10;�� ��� 'public static final int a=10;'��. �տ����� �����Ǿ� �ִ� ��. 
 * 												   ===================
 * 		void display(); ===> �굵 ��������. ���  public abstract void display(); ��. 
 * 							 			   ====================
 * 	}
 * 	public A implements
 * 	{
 * 		void display(){ ===> ����. pubilc�� ������ ����. public void display(){} �̷��� �������. 
 * 		}
 * 	}
 * 
*/
/*
 * ����� �� �Ǵ� Ŭ���� : ����Ŭ���� 
 *  - 'public final class' �̷��� �����.  
 *  - ex) String, System : ���/Ȯ�� �Ұ�. ���콺�����ϸ� �ʷϻ�C ������ܿ� F �پ�����. 
 * ��� ���� : static, ������ 
*/
class Super
{
	public void display() {
		System.out.println("Super:display() Call");
	}
}
// Super�κ��� ��� �ޱ� : super���� �����ؼ� ��� : ���Ŭ���� 
class Sub extends Super
{
	
}
// Super�� ����: �״�� ��� : ����Ŭ���� 
class Sub2{ // 
	Super su=new Super();
}
// ��� ���� �������̵� �ϴ� ��� : �͸��� Ŭ���� 
class Sub3{ // 
	Super su=new Super() {
		public void display() {
			System.out.println("Sub3:display() Call");
		}
	};
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		sub.display();
		
		Sub3 s=new Sub3(); //�͸�Ŭ���� ��� 
		 
	}

}
