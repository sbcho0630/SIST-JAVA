import java.awt.*;
import javax.swing.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadioButton extends JFrame implements ActionListener{
	JLabel la1,la2,la3;
	JRadioButton rb1,rb2;
	JLabel la4;
	public MyRadioButton() {
		la1=new JLabel(new ImageIcon("c:\\image\\_11.jpg"));
		la2=new JLabel(new ImageIcon("c:\\image\\_22.jpg"));
		la3=new JLabel(new ImageIcon("c:\\image\\_33.jpg"));
		
		la4=new JLabel("����");
		rb1=new JRadioButton("����");
		rb2=new JRadioButton("����");
		// �Ѱ��� ���� => �׷����� ��� ó�� 
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		// ����Ʈ ���� 
		rb1.setSelected(true); // rb1�� ���õǾ��� 
		
		JPanel p1=new JPanel();
		p1.add(la4); p1.add(rb1); p1.add(rb2);
		
		JPanel p2=new JPanel();
		p2.add(la1); p2.add(la2); p2.add(la3);
		
		add("North", p1);
		add("Center", p2);
		
		setSize(750, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// �̺�Ʈ ���
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyRadioButton();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// �̺�Ʈ ���� ���� 
		if(e.getSource()==rb1) 
		{
			la1.setIcon(new ImageIcon("c:\\image\\_11.jpg"));
			la2.setIcon(new ImageIcon("c:\\image\\_22.jpg"));
			la3.setIcon(new ImageIcon("c:\\image\\_33.jpg"));
		}
		else if(e.getSource()==rb2) 
		{
			la1.setIcon(new ImageIcon("c:\\image\\_44.jpg"));
			la2.setIcon(new ImageIcon("c:\\image\\_55.jpg"));
			la3.setIcon(new ImageIcon("c:\\image\\_66.jpg"));
		}
	}

}
