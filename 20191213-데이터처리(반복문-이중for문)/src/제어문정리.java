/*
 * 
*/
public class ������� {
	//int abc=100; //�������� 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc=12345678; // �������� : ��� stack�� ����ȴ�. //���������� �Ȱ��� �̸��� �������� ���� �� ����. 
	
		int i=1;
		do {
			System.out.print(i);
			i++;
		}
		while(i<=10);
		
		int a=10;
		if(a==10) {
			int b=20;
			if(b==20) {
				int c=30;{
					int k=100;
				}//����� ������Ƿ� �������� k�� �������.
			}// if���� ������Ƿ� �������� c�� �������. 
		}//if���� ������Ƿ� �������� b�� �������. 
		//���� a�� ������� �ʴ´�. 
		
		System.out.println();
		aaa();
		aaa();
		aaa();

	}
	
	public static void aaa() {
		int a=10;
		System.out.println("a="+a); 
		++a;
	}

}
