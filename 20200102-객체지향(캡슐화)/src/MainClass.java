class Data{
	String title;
	
	//�ʱ�ȭ ��� 
	static String poster;
	{
		title="aaa";
	}
	static {
		poster="1.png";
	}
	
	//������ 
	/*
	 * public Data() { title="ȫ�浿��"; poster="hong.png"; }
	 */
	 
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data();
		System.out.println(d1.title);
		System.out.println(d1.poster);

		Data d2 = new Data();
		System.out.println(d2.title);
		System.out.println(d2.poster);
		// �������� ����...
		// ��� ���� new�������....
		// ��������... d1, d2  �� ���� �ʱ�ȭ ��ų �� ������? ==> �ʱ�ȭ��� ���� �� 
		
		// �ʱ�ȭ��ϵ� ���� �����ڵ� ���� ���ÿ� ����? 
		// �����ڰ� ���������� �����. 
	}

}
