// Call by Reference(�ּ�) => �迭, Ŭ���� 
// �ӵ��� �� ���� ������ �̰� �� ��ȣ�Ѵ�. 
/*
 * 	class A{
 * 		int a=10;
 * 	}
 * 	swap (A aa){
 * 		aa.a=1000; //a���� 1000���� �������� 
 * 	}
 * 	A aa=new A();
 * 	swap(aa) 
 *  aa.a //1000
*/
public class �޼ҵ�2_CallByReference {
	static void swap(int[] arr) {
		System.out.println("���� ��=> swap:arr[0]="+arr[0]+", arr[1]="+arr[1]); //arr[0]=100, arr[1]=200
		// ����
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("���� ��=> swap:arr[0]="+arr[0]+", arr[1]="+arr[1]); //arr[0]=200, arr[1]=100 <= ���� 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭
		�޼ҵ�2_CallByReference a=new �޼ҵ�2_CallByReference(); //�ڡ�new�� ���� ���ο� �޸𸮰� �����ȴ١ڡ�
		�޼ҵ�2_CallByReference b=new �޼ҵ�2_CallByReference(); 
		�޼ҵ�2_CallByReference c=new �޼ҵ�2_CallByReference();
		System.out.println(a); //a�� �ּҰ�  
 		System.out.println(b); //b�� �ּҰ�
		System.out.println(c); //c�� �ּҰ��� �� �ٸ� 
		int[] arr= {100,200};
		swap(arr); // �ּ� ���� (����)
		System.out.println("main=> swap:arr[0]="+arr[0]+", arr[1]="+arr[1]); //arr[0]=200, arr[1]=100 <= �굵 ����Ǿ���!!
		// ex) Call by Reference ����: �Խ��ǿ��� Ư�� �Խù� Ŭ�� => �ش� �Խù��� ��ȸ�� +1 ������Ŵ

	}

}
