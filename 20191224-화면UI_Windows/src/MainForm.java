import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainForm extends JFrame implements ActionListener { // <== extends Activity�� �ٲٸ� �ȵ���̵���! ���� 
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	CardLayout card=new CardLayout(); // ������ â�� �״�� ���ΰ� tab �����ϱ� ���ؼ�. 
	MainForm(){
		//���� �������� â�� ���� ��� ==> �α���â>WR(WatingRoom)â 
		setLayout(card);
		add("LOGIN",login);
		add("WR",wr);
		//add("Center",login);
		
		setSize(1024,768);
		setVisible(true); // ������ ������
		login.b1.addActionListener(this);
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
		}
		catch(Exception e) {}
		MainForm mf=new MainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// �α��ι�ư ������ â ��ȯ 
		if(e.getSource()==login.b1) {
			card.show(getContentPane(), "WR");
		}
		else if(e.getSource()==login.b2) {
			
		}
	}

	
}
