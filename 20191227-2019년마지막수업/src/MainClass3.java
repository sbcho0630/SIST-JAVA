/* ���� �켱���� : �������� > ��������  
 * 1. �������� (��������,�Ű�����) : {}�� ����Ǹ� �����
 * 		==> ���������� ������� ������ ��� ���� ������ retrun �����.. 
 * 2. �������� (instance����, static ����) 
*/
class Sawon{
	int sabun;
	String name;
	String dept;
	String loc;
	long pay; 
	static String company; // ���� ȸ����, ȸ��� �ٲ� �� �� ���� �ٲ�°� �����ϱ� static����.
	
	Sawon(){
		int sabun=10;
		sabun=sabun;
		//���������� instance����/static ������ ���� �̸��� �� �� �ִ�. 
		//instance ���� sabun�� �������� �ұ��ϰ� �������� sabun�� ȣ��Ǿ���. 
		// ===> �޼ҵ� �ȿ����� ���������� �켱������ ����.
		this.sabun=sabun;
		//�ν��Ͻ� ���� : �Ķ��� 
		//static ���� : �Ķ��� �ʱ�ü 
		//�������� : ���� 		
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		s1.sabun=1;
		s1.name="ȫ�浿";
		s1.dept="������";
		s1.loc="����";
		s1.pay=3500;
		s1.company="SIST";
		
		Sawon s2=new Sawon();
		s2.sabun=2;
		s2.company="SIST2";
		
		Sawon.company="SIST3"; // �ٸ� Ŭ�������� ��� 
		//Ŭ�����̸�.static���� �� ȣ������
		//static ������ �䷸�� ȣ�� ���� 
		
		System.out.println("s1:"+s1.sabun);
		System.out.println("s2"+s2.sabun);
		System.out.println(s1.company);
		System.out.println(s2.company);
		System.out.println(Sawon.company);
		//company�� static�̴ϱ� �ѹ� �ٲٸ� ��ü�� �ٲ�
		
		
		
	}

}








