import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass6_������� extends JFrame implements ActionListener{
	JButton b1,b2;
	JButton[][] bu=new JButton[3][3]; //bu�� ��ư 
	int[][] panCount=new int[3][3]; 
	int brow,bcol;
	public MainClass6_�������()
	{
		b1=new JButton("Start");
		b2=new JButton("Exit");
		int k=1;
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(3,3,5,5));
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				bu[i][j]=new JButton(String.valueOf(k)); //k�� String���� ��ȯ���Ѽ� �����!
				bu[i][j].setFont(new Font("����ü",Font.BOLD,20));
				p1.add(bu[i][j]);
				bu[i][j].addActionListener(this);
				k++;				
			}
		}
		
		JPanel p2=new JPanel();
		p2.add(b1); p2.add(b2);
		
		add("Center",p1);
		add("South",p2);
		
		setSize(350, 370);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		getRand();
		display();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void getRand() 
	{
		int[] com=new int[9];
		int su=0;
		boolean bCheck=false;
		for(int i=0;i<9;i++) {
			bCheck=true;
			while(bCheck) 
			{
				su=(int)(Math.random()*9); //0~8���� �߻�
				//���� �ߺ����� �ʰ� �߻��ϵ��� �����
				bCheck=false;
				for(int j=0;j<i;j++) 
				{
					if(com[j]==su) {
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
			panCount[i/3][i%3]=su;
			if(su==8) {
				brow=i/3; 
				bcol=i%3;
			}
		}
	}
	
	public void display() 
	{
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==brow && j==bcol) 
				{
					bu[i][j].setText("");
					bu[i][j].setEnabled(false);
				}
				else 
				{
					bu[i][j].setText(String.valueOf(panCount[i][j]+1));
					//panCount���� 0~8�ε� ������ ���� ���̴� UI���� 1~9 ���̰� �س���.  
					bu[i][j].setEnabled(true);
				}
			}
		}
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass6_�������();
	}
	
	public boolean isEnd() 
	{
		int k=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(panCount[i][j]!=k) {
					return false;
				}
				else{
					k++; //(3,3)�� 8��°�� �� �� ...
				}
			}
		}
		return true; //for�� ������ isEnd�� true�� ������. ==> ���� �� 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			getRand();
			display();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(e.getSource()==bu[i][j]) //i��° j��° ��ư��Ŭ������ ��  
				{
					if(!(i==brow && Math.abs(bcol-j)==1 || j==bcol && Math.abs(brow-i)==1))
						return;
						//��ĭ �ٷ� �� ������ �ƴϸ� �������� ���ϰ��ض�
						//��ĭ �ٷ� ���̴� : 1) ���� �ٿ� �ְ� ����ȣ ���̰� 1 OR 2) ���� ���� �ְ� ���ȣ ���̰� 1 
					panCount[brow][bcol]=panCount[i][j]; //������� Ŭ���� �׸��� ��ȣ�� ����. 
					panCount[i][j]=8;
					brow=i; 
					bcol=j; //
					display();
					if(isEnd()) {
						JOptionPane.showMessageDialog(this, "Game Over");
						
					}
					
				}
			}
		}
	}

}
