// ��Ģ���� 
// + - * / 
public class �޼ҵ�12 {
	
	// ����ڰ� ���� ���� �־��ְ�... �Ű������� ����...
	// ex) ���⸦ �ڵ�... �� ������.. ������... ����ڰ� ���� �Է� �� �� �ְ�...
	// �ٸ� ���α׷��� ���� : 1) �Ű����� 2) ������ 
	
	
	static void calc() {
		int a=10; int b=20;
		char op='-';
		if(op=='+') {
			System.out.println(a+b);
		}
		else if(op=='-') {
			System.out.println(a-b);
		}
		else if(op=='*') {
			System.out.println(a*b);
		}
		else if(op=='/') {
			if(b==0) 
				System.out.println("0���� ���� �� �����ϴ�.");
			else
				System.out.println(a/b);
		}
		else {
			System.out.println("�����ڰ� �߸��Ǿ����ϴ�.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc();
	}

}
