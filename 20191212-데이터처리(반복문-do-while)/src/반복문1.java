/*
 * do while : �� �� �̻� �����ϴ� �ݺ���. (��� �󵵴� ������ ����) 
 * 	����)
 * 		������ ���̽� : �� 
 * 		��Ʈ��ũ : ����Ʈ��
 * 		=============
 * 
 * 		�ʱⰪ
 * 		do{
 * 			���๮�� ==> ���� ������ ����� �� �ִ�. 
 * 			������  ==> ex) i++;, i--;, i+=2;, i-=2;
 * 		}while(���ǹ�); <=== while ������ �����ݷ�(;) ����� �� ��!!!
 * 	
 * 	��Ÿ) C, C++, C#, Java ==> 0���� ������. (ex. ���ڿ�, �ڷᱸ��(List, Set, Map), �迭)  
 * 
*/		
public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~10 ��� 
		int i=1; // ��������
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		System.out.println();
		
		//10~1 ��� : �������� § ��
		do {
			System.out.println("i="+(i-1));
			i--;
		}while(i>1);
		
		//10~1 ��� : ���� § �� 
		i=10;
		do {
			System.out.println(i);
			i--;
		}while(i>=1);

	}

}
