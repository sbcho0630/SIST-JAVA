import java.util.Scanner;

// ���� �ϳ��� �Է¹޾Ƽ� ���
// �޼ҵ� 2�� (�Է�, ���) + ����  
// ��� �ް� ��� �ѱ����� �� �����ؾ�.... �޼ҵ尡 Java�� 70%��!!��
public class �޼ҵ�11 {
	//1. �Է�
	static int input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�:");
		int no=scan.nextInt();
		return no;
	}
	
	//2. ���
	static void print(int no) {
		System.out.println("�Է��� ���� "+no+"�Դϴ�");
	}
	
	//3. ���� 
	static void process() {
		int no=input();
		print(no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
