
public class MainClass2 {
	String name;
	String sex;
	int age;
	
	public MainClass2(String n, String s, int a) 
	{
		name = n;
		sex = s;
		age = a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc = new MainClass2(); //Error.
		// ���� �̹� �����ڰ� �ϳ� ���ǵǾ��� ������ MainClass2(); �����ڴ� �ڵ����� ��������� �ʴ´�.
		// �̷��� ���� ������ 1) MainClass2(); �����ڸ� ����ų� 2) �� ���� �ȿ� �Ű����� 3���� �ְų�. 
	}

}
