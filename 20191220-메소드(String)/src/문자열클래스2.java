// equals => return : boolean 
// ����� ���ڿ��� ������ Ȯ��  
// ex) ���� �� ���̸� ����/���� ����, �ƴϸ� �Ұ��� (ID ��ġ���η� �Ǵ�) 
import java.util.Scanner;
public class ���ڿ�Ŭ����2 {
	static boolean isLogin(String id, String pwd) { //boolean�̸� ���� is�� �̸����� ��� ����. 
		boolean bCheck=false;
		final String ID="admin";
		final String PWD="1234";
		//static�̳� final�� ������ Ŭ���� ���� �ȿ� ������ ���� ����.
		//���������� �����ϰ� ���õȰ� final �ϳ� ��. 
		/*
		 * 	�ڡ�equals�ڡ�: ��ҹ��� ����
		 * 	equalsIgnoreCase: ��ҹ��� ���� ���� ��
		 * 	startsWith: ���� ���ڿ��� ���� ��� true, �ٸ��� false 
		 * 	endsWith: ������ ���ڿ��� ���� ��� true, �ٸ��� false
		 * 	��contains��: ���忡 ���ڿ��� ���Ե� ��� true, �ƴϸ� false
		*/
		//if(id.equals(ID) && pwd.equals(PWD))  //��ҹ��� ����
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD)) //��ҹ��� ����X
		{
			bCheck=true;
		}
		return bCheck;
	}
	static void process() {
		Scanner scan=new Scanner(System.in);
		while(true) {
			 System.out.println("ID �Է�:");
			 String id=scan.next();
			 System.out.println("��й�ȣ �Է�");
			 String pwd=scan.next();
			 
			 boolean bCheck=isLogin(id,pwd);
			 
			 if(bCheck==true) {
				 System.out.println(id+"�� �α��� �Ǿ����ϴ�!!");
				 break;
			 }
			 else{
				 System.out.println("ID�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			 }
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
