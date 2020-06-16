import java.util.ArrayList;

/*
 * <�÷���>
 *  - �����͸� �޸𸮿� ������ ��, ���� �����ϰ� ���� ����� �� �ְ� ���ִ� ��. 
 *  - ǥ��ȭ�� �Ǵ� ����. 
 *    ==== �������̽�
 *  - �������� �����͸� ���� ���� ����
 *  - ���� �迭 ==> ������ ������ Ŭ������ ���� 
 *  - ����) ���� �ٸ� ������Ÿ���� ���� ���� => ���� ���� => ������Ÿ�� ������ ���Ͽ� ���׸��� ���
			�� ������Ÿ���� �⺻�� �� ��! Ŭ�������̾��. 
			�� ex) ArrayList<int> (X)  ex) ArrayList<Integer> (O) 
 *  	�� ������ ���� ��, ���� ���������� �����ϴ� ���� �����ϱ� ���ϴ�. 
 *  - ����) 
 * 					Collection
 * 					==========
 * 						�� ====================> Queue, Stack
 * 			===================================
 * 			List			Set				Map		(interface) 	
 * 			��				��				��
 * 		===========		===========  	============	==>  (interface�� ������ Ŭ����)
 * 		ArrayList�ڡ�		HashSet			Hashtable
 * 		Vector			TreeSet			HashMap�ڡ�: Hashtable�� ���� 
 * 		LinkedList						=> key, value => ����X. key:�ߺ����X. value:�ߺ����O.
 * 		* ������ ������ �ִ�  * ������ ����
 * 		* �ߺ� ������ ���     * �ߺ������͸� ������� �ʴ´�. 
 * 		================================================================
 * 		�ڷᱸ�� => �޸𸮿� ����� ������ ���� 
 * 							 ========
 * 							 �б�, ����, �˻�, ����, ���� 
 * 							 ======================
 * 							 �޼ҵ� => 1) ����  
 * 										- add(������) <= ���� �� 
 * 										- add(index, ������)
 *									 2) �б�  
 *										- get(index) 
 *									 3) ����
 *									    - set(index, �ٲ� �����Ͱ�) 
 *									 4) ���� 
 *										- remove(index)
 *									 	- �ߺ��� ����� ���� �ʴ� Ű : PK (Private Key) 
 *										  ex) PK�� ���� : KTX �� 								 
 * 
*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		// �߰�
		list.add("ȫ�浿");
		list.add(30);
		list.add("����");
		list.add("111-1111");
		list.add(180.5);
		list.add("A");
		// �䷸�� �����ϸ� ���������� �ٸ��� ������ for�� ���� �� ���� => ���ϼ� �ְ� �� ���� �� �ض�  �� => ���׸��� 
		
		// ������ �б�
		//String name=list.get(0); //<==�̷��� �ϸ� get(0)�� Object�� �º��� String���� ū �ڷ����̹Ƿ� ��������
		String name=(String)list.get(0);
		int age=(int)list.get(1);
		String addr=(String)list.get(2);
		String tel=(String)list.get(3);
		double ki=(double)list.get(4);
		String aa=(String)list.get(5);
		// �̷��� �ϸ� �ʹ� �������� �Ф� �̿� ���� �ذ�å���� ���׸����� ���� ����. 
		
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		System.out.println("�ּ�:"+addr);
		System.out.println("��ȭ:"+tel);
		System.out.println("Ű:"+ki);
		System.out.println("������:"+aa);
	
	}

}









