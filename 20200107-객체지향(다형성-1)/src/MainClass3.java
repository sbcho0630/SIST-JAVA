/*
 * 	Ŭ������ ����
 * 	=========
 * 	1. �߻� Ŭ���� : ���� = ���� ���� ���� �޼ҵ带 �����ϰ� �ִ�. 
 * 				 �������� ��Ƶΰ� => �ش� ���α׷����� ����
 * 				1) ���� �ٸ� Ŭ������ ����
 * 				2) ������ Ŭ������ ��Ƽ� ����
 * 				3) ǥ��ȭ (������ ���) 
 * 		public abstract class ClassName
 * 		{
 * 			�Ϲݺ���
 * 			int a=10;
 * 			������ �޼ҵ�	
 * 			public void display(){
 * 			}
 * 			������ �� �� �޼ҵ�
 * 			public abstract int disp();
 * 		}
 * 		===> �̿ϼ��� Ŭ���� => �ڽ��� �޸� �Ҵ��� �� �� ����. 
 * 						  (new�� ����� �� ���� �����ÿ��� �ݵ�� ������ ����Ŭ������ ���ؼ� ������ ����) 
 * 		��) public abstract class A
 * 			{
 * 				������ �� �� �޼ҵ�
 * 			}
 * 			public class B extends A
 * 			{
 * 				������ �� �� �޼ҵ�� ��� �ÿ� �ݵ�� �����ؼ� ����ؾ�. 
 * 			}
 * 			B b=new B(); <== (O)
 * 			A a=new A(); <== (X)
 * 			A a=new B(); <== (O). ǥ��!
 * 
 * 			==> Ŭ���� ��ü�� �����ϴµ� new�� ���ų� ���� �����ڸ� �������X ==> �߻�Ŭ���� OR �������̽�.
 * 				ex) List list=new ArrayList();
 *   
 * 	2. �������̽� : �߻�Ŭ������ ���� 
 * 				���� �ٸ� Ŭ���� ����
 * 				ǥ��ȭ �۾� (������ Ʋ������ �ִ�)
 * 				�������� ���õ� Ŭ������ ��� ����
 * 		public interface Interface�� {
 * 			����
 * 			int a=10; <==> public static final int a=10;
 * 			===			   ====================
 * 			 ��			       ���� ����!
 * 			 �� �տ� public static final�� �����Ǿ� �ִ°���! ����! 
 * 			
 * 			�޼ҵ�(������ �� �� �޼ҵ�!)
 * 			void display(); <==> public abstract void display();
 * 			====				 ===============
 * 			 ��					  ���� ����!
 * 			 �� �տ� public abstract�� �����Ǿ� �ִ°���! ����!
 * 			public void disp(); <==> public (abstract) void disp();
 * 			 ��	
 * 			 �� �տ� public (abstract)�� �����Ǿ� �ִ°���! ����! 
 * 		} 
 * 		===> ���̺귯�� (�������̽��� ������� ���̺귯��)
 * 			 Swing => �̺�Ʈ ó��
 * 					  =======
 * 						1) �ڵ� ȣ��
 * 						2) ������ �޼ҵ�
 * 				1. ������Ʈ
 * 					1) JButton
 * 						(1) JButton => JButton, JMenu
 * 						(2) ToggleButton => JRadioButton, JCheckBox
 * 					===============================================
 * 						=> �̵��� ó�����ִ� interface : ActionListener.
 * 						=> actionPerformed();
 * 				2. �Է�â
 * 					1) �� �� �Է�
 * 						JTextField =����=> JPasswordField
 * 					2) ������ �Է� 
 * 						JTextArea =����=> JTextPane 
* 					=> �̵��� ó�����ִ� interface : ActionListener.
 * 					=> actionPerformed();
 * 				3. ������ 
 * 					JTrable : Mouselistener�̿� 
 * 					JTree : '��'
 * 					JList : ItemListener ���. 
 * 					JComboBox : '��'
 * 			  �����ͺ��̽� => DB
 * 
 * 			 Collection : List, Set, Map
 * 				- List : index ��ȣ �ְ�, ����. �ߺ����. 
 * 				- Set : �ߺ����X. index��ȣ�� key �ƿ� ����. 
 * 				- Map�� : key�ְ�, ����...
 * 
 * 	3. ����Ŭ����
 * 	 1) ���Ŭ���� : ������ ��� ��, ��Ʈ�� ��� ��  
 * 		- Ŭ���� �ȿ� Ŭ����! 
 * 		public class A
 * 		{
 * 			class B
 * 			{
 * 			}
 * 		}
 * 	 2) �͸��� Ŭ����
 * 		- ��� ���� �������̵�, �޼ҵ� �߰��� ����.
 * 		public class A
 * 		{
 * 			B b = new B(){	
 * 				public void display(){}
 * 				public int plus(){}
 * 			};
 * 		}
 * 		public class A
 * 		{
 * 			public void display(){}
 * 		}
 * 	 3) ���� Ŭ����
 * 		- 
 * 		public class A
 * 		{
 * 			public void display(){
 * 				classB
 * 				{
 * 				}
 * 			}
 * 		}
 * 
 * 	4. ����Ŭ���� : Ȯ���� ���� Ŭ����! 
 * 	 - public final class A
 * 		{
 * 		}
 * 
*/
// �޸𸮿� ����(�Ҵ�) ���� => ��� �޼ҵ尡 ������ �Ǿ� �־�߸� �޸� �Ҵ��� ����. 
abstract class Ani{
	public abstract void walking(); // ���� �ؾ�! abstract�ϱ� ����X! ����!
	public abstract void eating();
	// ��� ���� �� �� �ְ� �� �� �ֱ� ������ �޸� �Ҵ��� �Ұ�.
	// ==> ������ ������ �����. 
	public void setName() {
		System.out.println("");
	}
	// ��� �̹� ���� �� ��. 
	// ==> �ʿ��ϴٸ� ������(�������̵�)�ؾ�. �ʿ� ������ �� �ص� ��. 
}
class Human extends Ani{
	// ó���� ���ٸ� ������ ������. 'Add unimplemented methods'��� ����. �ش� ���� Ŭ���ϸ� �Ʒ��� ���� �������̵���. 
	// walking�� eating�� �������̵��ǰ� setName�� �������̵�X.
	// setName�� �ʿ��ϸ� �ڱⰡ �˾Ƽ� �������̵��ϸ� �ȴ�. 
	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("����� �ȴ´�.");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("����� �Դ´�.");
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		System.out.println("ȫ�浿�̴�.");
	}
	
}
class Dog extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("���� �ȴ´�.");
	}
	
	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("���� �Դ´�.");
	}
	
	
}
class Pig extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("������ �ȴ´�.");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("������ �Դ´�.");
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ani ani=new Human();
		ani.walking();
		ani.eating();
		ani.setName();
		
		ani=new Dog(); // �ּҸ� �ٲ�...
		ani.walking();
		ani.eating();
		ani.setName(); // �� ��� ��ĭ���� ���� 
		
		ani=new Pig(); // �ּҸ� �ٲ�...
		ani.walking();
		ani.eating();
		ani.setName(); // �� ��� ��ĭ���� ���� 
	}

}
