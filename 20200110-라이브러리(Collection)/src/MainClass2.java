import java.util.ArrayList;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread();
		t.stop(); // ��Ҽ� �׾��� �� : ���� ����� ��. ==> ��ü�ϴ� �Լ��� ã�ƾ�. ex) stop �� interrupt
		ArrayList list=new ArrayList(); // �����: ���׸��� ���� �ʾƼ� ��� ���� �� 
		// �̸� ���
		list.add("ȫ�浿"); //0
		list.add("��û��"); //1
		//���⿡�ٰ� ���ο� �� ���� ==> �� ���Ϸδ� index ��ȣ�� 1�� ���� 
		list.add("�ڹ���"); //2
		list.add("������"); //3
		list.add("�̼���"); //4
		
		// ����� ���� Ȯ�� 
		System.out.println("����� �ο�:"+list.size());
		
		// ��� 
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		System.out.println("============================");
		// �߰� 
		list.add("������"); // add���� �� �������� �߰��ȴ�. 
		// ���
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		System.out.println("============================");
		
		list.add(2,"������"); //2��°�� �߰�
		// ���
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		System.out.println("============================");
		
		// ����
		list.remove(3);
		// ���
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		System.out.println("============================");
		
		// ����
		list.set(4, "�̼��� ����");
		// ���
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		System.out.println("============================");
		
		// ���� �߻�
		list.add(100); //int���� ����־ ����ȯ �ȵż� ������ 
		// ���
		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);
			System.out.println(name);
		}
		
		// �ǹ� ���� jdk ���� �������� ¥�� �ڵ� ������ �� ���� ����...
	}

}



