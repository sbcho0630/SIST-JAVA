/*
 * ���� 
 * 	= instance ���� : ���� ���� : new�� �̿��ؼ� �޸𸮸� ���� ��. 
 * 	= static ���� : ���� ���� : ������ �� �� 
 * 		�� static ������ �޼ҵ忡���� ����� �Ұ���. Ŭ�������������� ��� ����. 
 * 	===================> �ڵ� �ʱ�ȭ �Ǵ� ���̵� 
 *  
 * 	= �������� : ���� ���� : �޼ҵ带 ȣ���� �� 
 * 	===================> �ݵ�� �ʱ�ȭ ���Ѿ� �ϴ� ���� 
*/
class Data{
	//Ŭ���� ���������� ���� ����..
	//�޼ҵ峪 ��� ���� ���������� ����(����ó��, ���, �޼ҵ�ȣ��) ����
	//��������� �ʱⰪ�� �ڵ����� ����. 
	int a; //0
	float f; //0.0f
	double d; //0.0
	boolean boo; //false
	long l; //0L
	char c; //'\0'
	String s="Hello"; //null <== �ʱⰪ�� null�̶� �� ���� �����ָ� nullPointException �� �� ����. 
	String ss=""; //<== �̷��� �ϸ� ���� ����... null �ƴ� ��
	//���������� �޼ҵ� ȣ���� �� ������...
	static int aa; //0 
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Data.aa); //static �� �̹� ������ �Ǿ� �����Ƿ� ���� �� ��
		//System.out.println(Data.a); //��� �޸𸮿� ���� ������ �ȵ� ���� �̹Ƿ� ����� ��X
		/*
		 * Data dd=new Data(); //dd�� ��ü System.out.println(dd.a);
		 * System.out.println(dd.f); System.out.println(dd.d);
		 * System.out.println(dd.boo); System.out.println(dd.l);
		 * System.out.println(dd.c); System.out.println(dd.s);
		 * System.out.println(dd.ss);
		 */
	}

}
