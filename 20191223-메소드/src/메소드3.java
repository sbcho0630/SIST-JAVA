/* 	{3, "aaa", 10.5, 'A', 9.5F, 10L} <== �迭(���� ���������� ����)�ε�, �ٸ� ���������� �迭�� ���� �� �ֳ�..? 
 * 										   ����. Object ����ϸ� �����ϴ�.  
 * 	ex) Object[] arr={3, "aaa", 10.5, 'A', 9.5F, 10L}; <== Object ���߿� ��� ����. 
*/
public class �޼ҵ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Object[] arr={3, "aaa", 10.5, 'A', 9.5F, 10L}; //int a=arr[0]; <=== �̷��Դ� �Ұ���
		  int a=(int)arr[0]; //<=== �̷��Դ� ����. //Object�� ���� ū ��������. 
		  for(int i=0;i<arr.length;i++) { 
			  System.out.println(arr[i]); 
		  }
		 
	}

}
