import java.util.Scanner;
public class �迭12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex) ����ڰ� 0X �Է��ؼ� �� ���� ������� ��������
		
		//��ǻ�� �� ���� 
		char[] dap=new char[10];
		for(int i=0;i<dap.length;i++) {
			int k=(int)(Math.random()*2); //0,1
			if(k==0) {
				dap[i]='O';
			}
			else {
				dap[i]='X';
			}
		}
		
		//����ڿ��� �Է¹���
		char[] user=new char[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<user.length;i++) {
			System.out.print((i+1)+"��° �� �Է�(O,X):");
			String s=scan.next();
			user[i]=s.charAt(0);
		}
		
		//��������
		int score=0;
		for(int i=0;i<user.length;i++) {
			if(user[i]==dap[i]) {
				score+=1;
			}
		}
		
		//���
		System.out.println("����:");
		for(char c:dap) {
			System.out.print(c+" ");
		}
		System.out.println("\n����� �Է°�");
		for(char c:user) {
			System.out.print(c+" ");
		}
		System.out.println("\n����: "+score*10+"��");
		

	}

}
