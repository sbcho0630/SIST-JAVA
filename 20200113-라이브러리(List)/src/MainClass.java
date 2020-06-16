import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<String> list = new ArrayList<String>();
		// interface        // ������ Ŭ���� 
		// String[] list �� ��� ==> String�� �����ؾ���. <String> �̰� ���׸������ ��.
		// ArrayList ==> index�� �ٲ��! (������!) 
		// �迭 ��� �������̸鼭 �迭 ����� �ϴ� ArrayList�� �����!! ��
		// ���׸����� ArrayList�� ���������� ������ �� �ְ� ����!! ��
		
		//List<String> list = new ArrayList<String>();
		//List<String> list = new Vector<String>();
		List<String> list = new LinkedList<String>();
		// ArrayList�� Vector�� LinkedList�� ����� ���� �Ȱ���! 
		
		// ���� ������� : add()
		list.add("ȫ�浿"); //0
		list.add("��û��"); //1 ==> 2 (������ ���� �� ĭ �з���) ===> "�̼���"���� �ٲ� 
		list.add("�ڹ���"); //2 ==> 3 (������ ���� �� ĭ �з���)
		
		int i=0;
		
		// �߰��� ���� 
		list.add(1,"������"); // 
		i=0;
		for(String name:list) { // ��for-each ��� : �迭, �÷��ǿ� ��� ���ɡ� 
			System.out.println(name+":"+i);
			i++;
		}
		
		// ����
		list.set(2, "�̼���");
		System.out.println("=========");
		i=0;
		for(String name:list) { 
			System.out.println(name+":"+i);
			i++;
		}
		
		// ���� 
		list.remove(1);
		System.out.println("=========");
		i=0;
		for(String name:list) { 
			System.out.println(name+":"+i);
			i++;
		}
		
		// �����Ͱ� ����� ���� : .size()
		System.out.println("����� ����:"+list.size());
		
		
		
	}

}


