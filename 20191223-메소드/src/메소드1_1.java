
public class �޼ҵ�1_1 {
	static String name; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		�޼ҵ�1_1 a=new �޼ҵ�1_1();
			a.name="ȫ�浿1";
		�޼ҵ�1_1 b=new �޼ҵ�1_1();
			b.name="ȫ�浿2";
		�޼ҵ�1_1 c=new �޼ҵ�1_1();
			c.name="ȫ�浿3";
		�޼ҵ�1_1 d=new �޼ҵ�1_1();
			d.name="ȫ�浿4";
		�޼ҵ�1_1 e=new �޼ҵ�1_1();
			e.name="ȫ�浿5";
		System.out.println(a.name);	//<==����� : ȫ�浿5. �ֳĸ� line2���� 'static' String name�̶�� �߱� ����!! ��������� �Ȱ��Ƽ� �׷�. 
		//line2���� 'static' ����� ������� ȫ�浿1�� �ȴ�. 

	}

}
