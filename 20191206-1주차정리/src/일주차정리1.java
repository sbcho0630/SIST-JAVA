/*
 * ���� : �� ���� �����͸� ����
 * 
 * 1. ��������
 * 2. ����� ���ÿ� ���� �Է�
 * 
 * ======
 * ������ �������� ��
 * int kor;
 * int eng;
 * int math;
 * Ȥ�� int kor,eng,math; �̷��� �� �ٷ� �� �濡 �� ���� ����.
 * 
 * ======
 * �ʱⰪ 
 * int kor=100;
 * int eng=100;
 * int math=100;
 * Ȥ�� int kor=100,eng=100,math=100; �̷��� �� �ٷ� �� �濡 �� ���� ����. 
 * 
 * ======
 * int kor,eng,math;
 * kor=eng=math=100; �̷��Ե� �� �� ���� 
 *  
 * 
*/
//������ --> �ǹ̸� �ο��ؼ� ������! ex) int a=90; <--a�� ����? -_-: BAD vs int kor=90; <-- ��..��� 90���̱���. : GOOD

public class ����������1 {
	//��������(member����) �� ���⿡ ����!

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������� ���⿡ ����! - �޼ҵ� �ȿ� ���ϴ�!!
		
		int kor,eng,math;
		kor=eng=math=100;
		
		System.out.println("kor="+kor);
		System.out.println("eng="+eng);
		System.out.println("math="+math);
		
		String first_name="ȫ"; 
		String last_name="�浿";
		
		System.out.println("�̸�:"+first_name+last_name);
		// ������ f,l������ ġ�� Ctrl+space �ϸ� �ڵ��ϼ��ȴ�. �ڡ� 
		/*
		 * <������ ���̱�>
		 * 1. Ŭ������ : �ڴ빮�ڡڷ� ����!!
		 * 2. �޼ҵ��, ������ : �ҹ��ڷ� ���� 
		 *    ex) firstName : �밡���Ƚ�
		 * 3. ��� : ��ü �빮�� 
		 * 4. �鿩����  
		 * 
		*/

	}

}










