// year �Է� �޾Ƽ� ���⿩�� Ȯ��
public class �޼ҵ�3 {
	//���1
	static void isLeapYear(int year) {
		if((year%4==0 && year%100!=0)||year%400==0)
			System.out.println(year+"�⵵�� �����Դϴ�.");
		else 
			System.out.println(year+"�⵵�� ������ �ƴմϴ�.");
	}
	//���2 - boolean ��� 
	static boolean isLeapYear2(int year) {
		if((year%4==0 && year%100!=0)||year%400==0)
			return true; // return�� �̷��� �߰��� ���� ���� �ִ�. 
		else 
			return false; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=2019;  //������ �� �Ȱ��� year�� �� �ʿ� ����. �ٸ�, �޼ҵ��� ������� ��ġ��Ű�°� ���ϹǷ� �Ȱ��� �� ���̴�. 
		isLeapYear(y);
		boolean bCheck=isLeapYear2(y);
		if(bCheck)
			System.out.println("�����Դϴ�.");
		else
			System.out.println("������ �ƴմϴ�.");
	}

}
