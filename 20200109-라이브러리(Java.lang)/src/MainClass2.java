class Box implements Cloneable{ 
	// implements�����ϱ� �������̽���, �׷��� �޼ҵ� �־�� �ϴµ� �� ���� �޼ҵ尡 ����? 
	// �̰� �׳� 'Ŭ������ ��Ƽ� ������ ����'�̱� ����.
	int a=10;
	int b=20;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// NotSupportedException : 
		return super.clone();
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box();
		Box b2=b1;
		
		b2.a=100; // 
		b2.b=200; // �ּҰ� ���� ������...
		
		System.out.println("b1.a="+b1.a);
		System.out.println("b1.b="+b2.a);
		try {
			//Box b3=b1.clone(); //Object�� �����ϴϱ� Object�� �� ����Ŭ�����ϱ� ũ�Ⱑ �� �¾Ƽ� �� ���� ==> ����ȯ ���Ѿ�
			Box b3=(Box)b1.clone(); //����ȯ ����� ����� ����.  //[����] ���̺귯���� ���� �� Object��
			System.out.println("b3.a="+b3.a);
			System.out.println("b3.b="+b3.b);
			
			b3.a=1000;
			b3.b=2000;
			System.out.println("b3.a="+b3.a);
			System.out.println("b3.b="+b3.b);
			
			System.out.println("b1.a="+b1.a);
			System.out.println("b1.b="+b2.a);
		}catch(Exception ex) {} //Exception�� �� ����Ŭ�����ϱ� Exception �ᵵ �� 
		
	
	}

}





