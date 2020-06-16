import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class MyTable extends JFrame implements ActionListener,MouseListener{
	JTable table; // �׵θ� �����ϴ� ��. (���̺� ���)
	DefaultTableModel model; // ������ �����ϴ� �� 
	JLabel la1,la2,la3;
	JTextField tf1,tf2,tf3;
	JButton b;
	TableColumn column;
	
	public MyTable() {
		la1=new JLabel("�̸�");
		la2=new JLabel("�ּ�");
		la3=new JLabel("��ȭ");
		
		tf1=new JTextField(7);
		tf2=new JTextField(7);
		tf3=new JTextField(7);
		b=new JButton("���");
		
		JPanel p=new JPanel();
		p.add(la1); p.add(tf1);
		p.add(la2); p.add(tf2);
		p.add(la3); p.add(tf3);
		p.add(b);
		
		// ���̺� ����
		String[] col= {"�̸�","�ּ�","��ȭ"};
		String[][] row=new String[0][3]; // �� �ٿ� ������. ������ ������
		model=new DefaultTableModel(row,col) {
			// �͸��� Ŭ����
			// �θ��� �� : ���{} �ȿ��� ��Ŭ�� > Source > Override/Implement Methods > isCellEditable ����
			// ����Ʈ ���������� ����Ŭ������ �� ���̺� �� ���� ������ ���������ѵ�, �̰��� ������.  
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false; 
			}
		};
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		// ���̺� �߰����� �ɼǵ� ����
		table.getTableHeader().setReorderingAllowed(false); //���̺� ����� �巡���ؼ� ������ �ٲ��� ���ϵ��� ����.
		table.setRowHeight(38); 
		table.setShowHorizontalLines(false); 
		table.setShowVerticalLines(false);
		table.getTableHeader().setBackground(Color.pink);
		js.getViewport().setBackground(Color.white);
		
		add("Center",js);
		
		add("North",p);
		setSize(600,480);
		setVisible(true); // ������ �����ִ� ��
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		// �̺�Ʈ ��� - Ŭ�� ���� �Լ� ȣ�� 
		b.addActionListener(this);
		// �̺�Ʈ ��� - ���콺 ���� �Լ� ȣ��
		table.addMouseListener(this);
		
		// ���̺� �� width ���� 
		for(int i=0;i<3;i++) {
			column=table.getColumnModel().getColumn(i);
			TableCellRenderer rend=column.getCellRenderer();
			if(i==0) {
				column.setPreferredWidth(150);
			}
			else if(i==1) {
				column.setPreferredWidth(450);
			}
			else if(i==2) {
				column.setPreferredWidth(250);
			}
			column.setCellRenderer(rend);
			
		}
	} 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTable();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			//�̸�,�ּ�,��ȭ��ȣ���� �޾ƿ�
			String name=tf1.getText();
			if(name.length()<1) { //�̸����� �Էµ� �� ���� ��
				JOptionPane.showMessageDialog(this, "�̸��� �Է��ϼ���");
				return; // actionPerformed�� ����� ==> �� �Ʒ��δ� �������� ����.  
			}
			String addr=tf2.getText();
			String tel=tf3.getText();
			
			//�޾ƿ� �̸�,�ּ�,��ȭ��ȣ���� ���̺� �߰� 
			String[] data= {name,addr,tel};
			model.addRow(data);
			
			//�Է��� �� ������ 
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) { // Ŭ������ ��
		// TODO Auto-generated method stub
		if(e.getSource()==table) {
			if(e.getClickCount()==2) { //����Ŭ������ �� 
				int row=table.getSelectedRow();
				String name=model.getValueAt(row, 0).toString();
				String addr=model.getValueAt(row, 0).toString();
				String tel=model.getValueAt(row, 0).toString();
				
				String data="�̸�:"+name+"\n"
						+"�ּ�"+addr+"\n"
						+"��ȭ"+tel;
				
				JOptionPane.showMessageDialog(this, data);
			}
		}
	}


	@Override
	public void mousePressed(MouseEvent e) { // ���콺 �� ������ �� (ex. �巡���ϴ� ��)
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) { //
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) { // hover���� �� 
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) { //hover�ߴٰ� ����� �� 
		// TODO Auto-generated method stub
		
	}

}
