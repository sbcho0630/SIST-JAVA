/*
 * <Java���� �ڵ����� ���ִ� ��>
 * 1) extends Object �� �ᵵ �ڵ����� �־�������
 * 2) ������ ���� ��� => ����Ʈ �����ڸ� �ڵ����� ä����
 * 3) �޼ҵ忡 void �϶� => return�� ���� ��� return�� �ڵ����� ä����
 * 4) import java.lang Ÿ���� ���� �� �ص� �ڵ����� �־����
 * 5) interface : �������̽��� public �� �ٿ��� ����Ʈ�� �ۺ�.  
 * 		void disp(); ==> public abstract void display();
 * 		int a=10;    ==> public static final int a=1-;
*/
/*
 * JLabel : ������
 * JPanel : ����
 * ==> setOpaque �̿��ؼ� ���� �����ϸ� ��
 * 
 * ���ڸ� �����ϰ� ����� �ʹٸ� ���İ� �̿��ϸ��
 * setBackground(new Color(0,0,0,1)) �� �ڿ� �ִ�, 4��° ���� ���İ�. 
*/
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainClass3 extends JFrame implements ItemListener{ //�޺��ڽ��� ActionListener�� �ƴ϶� ItemListener!
	JLabel la1,la2;
	JComboBox box = new JComboBox();
	
	public MainClass3() {
		la1=new JLabel("����");
		box.addItem("ȫ�浿");
		box.addItem("��û��");
		box.addItem("�ڹ���");
		la2=new JLabel("");
		la2.setFont(new Font("����ü", Font.BOLD, 35));
		
		JPanel p=new JPanel();
		p.add(la1);
		p.add(box);
		
		add("North", p);
		add("Center", la2);
		setSize(450, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass3();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box) 
		{
			String name=box.getSelectedItem().toString(); 
			// Object�� String���� ��ȯ �����ϴ�!!
			// toString : Object�� �Լ������� ����
			la2.setText(name);
		}
	}

}



