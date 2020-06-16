import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 * interface ==> implements �������̽��� 
 * =========
 * 	���� ����� ����
 * 
 * 	interface A
 * 	interface B
 * 	class C implements A,B,... //���߻�� 	
*/

public class MyTextField extends JFrame implements ActionListener{
	JTextField tf=new JTextField();
	JTextArea ta=new JTextArea();
	
	public MyTextField() {
		
		ta.setEditable(true);
		JScrollPane js = new JScrollPane(ta); //ScrollPane : ����/���� ��ũ�ѹ� �� ��, �ȿ�  Textfield������ ����. 
		add("Center", js); //JFrame�� �⺻�� BorderLayout�̴ϱ�
		add("South", tf);
		setSize(350,450);
		setVisible(true);
		
		// �̺�Ʈ ���
		tf.addActionListener(this); // 1. ���� �ÿ� �̺�Ʈ �߻�
		// actionPerformed�� MyTextField �ȿ� �ֱ� ������ (this)��� ���� 
		// ���࿡ actionPerformed�� MyTextField Ŭ���� �ۿ� �־��ٸ� (ex. �ٸ� Ŭ����) �� Ŭ�������� �����..???
		
		// ������â ���� �� ���α׷� ����ǵ���. 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ 
		new MyTextField();
	}

	@Override
	public void actionPerformed(ActionEvent e) { // actionperfo
		// TODO Auto-generated method stub
		if(e.getSource()==tf) // 2. ���͸� ģ textField�� ����? 
		{
			ta.append(tf.getText()+"\n"); 
			// append: ���ڿ� ����: ������ �ִ� ���ڿ��� ���ڸ� �ٿ���.
			// ta.setText(tf.getText()+"\n"); 
			// setText: ���ο� ���ڸ� ���: ������ �ִ� ���ڿ��� ����� ���ο� ���ڿ��� �־��.
			// tf.getText() : �Էµ� ���ڸ� �о�´�. 
		}
		
	}

}
