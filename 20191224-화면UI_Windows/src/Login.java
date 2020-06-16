import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * <Java GUI>
 * 	1. JFrame
 * 	2. JPanel 
 * 		ex) ��Ŭ������ tab.  
 * 	3. JWindow 
 * 		: Ÿ��Ʋ �� (X) ����ݴ� �� (X) ex) ��Ŭ���� ��� �� ������ â. 
 * 	4. JDialog 
 * 		: �ݱ��ư(O) �ִ�ȭ/�ּ�ȭ ��ư(X)
 * 		1) Modal : �� â�� ����Ǳ� ������ �ٸ� �۾� �Ұ�. 
 * 			ex) ��Ŭ�������� Java Project ���� ���� �� �ߴ� â 
 * 			ex) ���ӿ��� '�游���' â. 
 * 		2) Modeless : â�� �������� �ٸ� �۾� ����.  
 * 			ex) ��Ŭ���� Ctrl+F �ϸ� ������ Find/Replace â
 * 
 *  extends : ��� 
*/
import java.awt.*; // window�� ���õ� Ŭ����
public class Login extends JPanel {
	
	// Ŭ���� ���� �ȿ����� ��� �� �� X!! Ŭ���� ���� �ȿ����� ���� �� ��! ��
	// (��� ���� ������ �޼ҵ带 ����� �� ���� �޼ҵ� �������ٰ� �ؾ�....) 
	// �׷��� Ŭ���� �������� �̹��� ���������� �Ʒ��� ���� �̹��� ���� �� �ʱ�ȭ ����� �������. 
	Image back;
	JLabel la1,la2; // Ctrl+space�ϸ� import �ȴ�. 
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	
	//������ �Լ�. ������ �Լ����� ȭ���� �������� �Ѵ�. 
	Login()	{ // �տ��ٰ� ����Ÿ�� ���̸� �޼ҵ尡 �Ǿ����. �� �ȴ�. 	
		setLayout(null);
		back=Toolkit.getDefaultToolkit().getImage("c:\\image\\background.jpg");
		//�ʱ�ȭ ��� : �̹����� ���� ���� �;��. �ʱ�ȭ �ϰ� �;��.
		la1=new JLabel("ID",JLabel.RIGHT);
		la1.setForeground(Color.blue);
		la2=new JLabel("Password",JLabel.RIGHT);
		la2.setForeground(Color.blue);
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("�α���");
		b2=new JButton("���");
		
		// ��ġ
		la1.setBounds(390,330,80,30);
		tf.setBounds(475,330,150,30);
		
		la2.setBounds(390,365,80,30);
		pf.setBounds(475,365,150,30);
		
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(390,405,235,35);
		p.setOpaque(false);

		add(la1);
		add(tf);
		
		add(la2);
		add(pf);
		
		add(p);
		
	}
	

	@Override
	protected void paintComponent(Graphics g) { // <== �׸� �׸��� �޼ҵ�   // ��Ų�� PainComponent�� �����. 
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this); //this : �� �ڽ�. 
	}

}





