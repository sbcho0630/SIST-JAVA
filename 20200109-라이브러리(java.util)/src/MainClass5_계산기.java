import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainClass5_���� extends JFrame implements MouseListener{
	// Action�� ��ư���ٰ�!
	// Mouse�� ��ư �ƴ� �� ! ==> '='�� 'JLabel'�̹Ƿ� ActionListener�� �ƴ϶� MouseListener 

	JTextField tf1,tf2; // HTML������ <input type=text>
	JLabel la; // HTML������ <label>
	JComboBox box; // HTML������ <select>
	JTextField tf3;
	
	public MainClass5_����() 
	{
		tf1=new JTextField(9);
		tf2=new JTextField(9);
		la=new JLabel("=");
		box=new JComboBox();
		box.addItem("+");
		box.addItem("*");
		box.addItem("-");
		box.addItem("/");
		tf3=new JTextField(9);
		
		setLayout(new FlowLayout()); //����Ʈ�� BorderLayout�� ����� ����...
		
		add(tf1);add(box);add(tf2);add(la);add(tf3);
		setSize(450, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		la.addMouseListener(this); //this : �� �ȿ� �긦 ó���ϴ� �޼ҵ尡 �����Ѵ�
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass5_����();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la) 
		{
			String num1=tf1.getText();
			String num2=tf2.getText();
						
			String op=box.getSelectedItem().toString();
			
			// num1,num2 ���� String�̴ϱ� ���ڷ� �ٲ����
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			int n3=0;
			
			switch(op) {
			case "+":
				n3=n1+n2;
				break;
			case "-":
				n3=n1-n2;
				break;
			case "*":
				n3=n1*n2;
				break;
			case "/":
				n3=n1/n2;
				break;
			}
			
			// tf3.setText(n3); //Error. n3�� ������ int�̱� ������... �Ұ�.
			tf3.setText(String.valueOf(n3));
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
