/*
 * 	<Ŭ������ �������>
 * 	==============================================================
 * 	�� ���� (��������, �������) 
 * 		=> �ٸ� Ŭ�������� ����� ���� 
 * 		=> �޸𸮿��� �����Ǵ� ������ ���α׷� ���� �� 
 * 			(�� �� ����ϴ� �޸𸮴� heap) 
 * 	==============================================================
 * 	�� ������ : ��'�������'�� ���� �ʱ�ȭ ���� 
 * 	Ư¡) 1. Ŭ������� ���� 
 * 		 2. �������� ���� (void�� �� ��!!) 
 * 		 3. �����ڴ� �������� ���� �� �ְ� ������� ���� ���� �ִ� 
 * 			- ������� ���� ���� JVM�� �ڵ����� �����ڸ� �������ش�.
 * 		 4. �����ε��� �����Ѵ�.
 * 			[�����ε��� Ư¡]  
 * 			1) �� ���� Ŭ���� �ȿ��� ���� �̸��� �޼ҵ带 ������ ��� 
 * 			2) �Ű������� �ٸ��� (�Ű������� �������� �Ǵ� ������ �ٸ��� �ٸ� �޼ҵ�� ������) 
 * 			3) �������� �����ε����� ����� ����. 
 * 			 ex) �Ʒ��� �� �޼ҵ�� ���� �޼ҵ��̴�. �����ε� �ƴ�!! 
 * 				 void display()
 * 				 int display()
 * 			4) ����� ���� ex) println(boolean a), println(int a)
 * 		 5. ��� ���� ����(������, static)�� �ش��Ѵ�. (��� �Ұ�)  
 * 		 6. �����ڵ� �޼ҵ��� �����̹Ƿ�, ������ �������� ������ ����. 
 * 	==============================================================
 * 	�� �޼ҵ� : ��������� Ȱ�� => "��ɡ�"
 * 		 - ����ó�� = ��� ó��
 * 		 - ��ɹ��� ���� ==> ���õ� ����� ��Ƽ� ó�� (������ ���α׷�)   
 *  	 - ������� ��û�� ó�� 
 * 	==============================================================
 * 
 *  ex) CGV ����Ʈ ( http://www.cgv.co.kr/movies/)
 *  - �ָ޴�(GNB) : Ŭ����
 *  - �θ޴�(SNB) : Ŭ���ϸ� ��ȭ�� ��µ� ==> �޼ҵ�
 *
 * 
*/
public class MainClass {
	String name;
	String sex;
	int age;
	// �� ������ : ��������� �ʱ�ȭ ��Ŵ  
	public MainClass() 
	{
		// ex) 10���� �����͸� �����ؾ���... ==> ������ �̿��ؼ�...
		// ������, ��Ʈ��ũ, �����ͺ��̽��� �����ڰ� ���� �̿��. 
		name = "��û��";
		sex = "����";
		age = 25;
	}
	// �� �Ű������� ���� ������ 
	public MainClass(String name, String sex, int age) 
	{
		// �켱���� : ��������(����) > �������(�Ķ���) (���������� �켱!)
		name = name;
		// ==> if ���������� = ��������� ==> this ���  
		System.out.println("this="+this);
		this.name = name;
		this.sex = sex;
		this.age = age;
		// �ڸ�� Ŭ������ this�� ������ �ִ�. ��(�ڽ��� ������ �ڽ��� �Լ��� ȣ��)
		// ==> this�� static�� 
		// �ڽ��� ��ü �ּ� => this => �ݵ�� �޼ҵ� �ȿ����� ����� ����. 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc = new MainClass(); 
		
		MainClass mc1 = new MainClass("�̼���", "����", 30); // new�ϸ� �޸� �ּҰ� �Ҵ�ǰ�, ���� this���� �ּҰ� �Ҵ�ȴ�. 
		System.out.println("mc1="+mc1);
		System.out.println(mc1.name);
		System.out.println(mc1.sex);
		System.out.println(mc1.age);
		
		MainClass mc2 = new MainClass("��û��", "����", 20); 
		System.out.println("mc2="+mc2);
		System.out.println(mc2.name);
		System.out.println(mc2.sex);
		System.out.println(mc2.age);
		
		MainClass mc3 = new MainClass("������", "����", 35);
		System.out.println("mc3="+mc3);
		System.out.println(mc3.name);
		System.out.println(mc3.sex);
		System.out.println(mc3.age);
		
		// new�� �־�� ��������� ���ε��� �������.
		// static�� �ƴ� ������ ������� ������ ���ؼ� 'new'�� ����ؾ�. ��
		// 'new'�� �޸𸮰����� �ֱ� ������, �ʱⰪ�� �������ִ� �����ڰ� �־��. 
		// ��� : �����ڴ� ȣ�� �ÿ� �ݵ�� 'new'�� �����Ѵ�. 
		//MainClass(); // Error. �����ڸ� �ܵ����� ȣ�� �Ұ�.  
		new MainClass(); // ����. �����ڴ� ȣ�� �ÿ� �ݵ�� new�� �����ؾ�.
		System.out.println(mc.name);
		System.out.println(mc.sex);
		System.out.println(mc.age);
		
		// �Ʒ��� �� ���� �ٸ� ��ü��. (�ּҰ� �ٸ�) 
		// ȣ���ϰ� �ؿ��� Ȱ������ ���� ���� �Ʒ��� ���� �ᵵ �ȴ�. 
		System.out.println(new MainClass("�ڹ���", "����", 10).name);
		System.out.println(new MainClass("�ڹ���", "����", 10).sex);
		System.out.println(new MainClass("�ڹ���", "����", 10).age);
		
	}

}





