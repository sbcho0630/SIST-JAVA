// ==> ���� ==> charAt(0) : ���ڸ� �ϳ��� 
// String s="abacsjsfjkfhadadakdah"
// a�� �� �� ���� ����ض�. 
public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="qkljhqaalwelg,asdigq";
		int num=0;
		int i=0;
		
		//���� § �� 
		while(i<=s.length()-1) {  
			// ���ڴ� 0,1,2,... �̷������� ���۵Ǵµ� length�� 1,2,3,.. �̷��� ���� ������, i�� length�� ���ڰ� �� ����. 
			// ���� ��� ���ڰ� 5�ڸ� ������ ������ 0,1,2,3,4 �̷��� ���ڼ�(length)�� �������� 5�� ��. 
			System.out.println((i+1)+"��° ����:"+s.charAt(i));
			if(s.charAt(i)=='a'||s.charAt(i)=='A')
				num++;
			i++;
		}
		System.out.println("a�� ������: "+num+"\n\n");

		
		int count=0;
		int j=0;
		//�������� § �� - char c=s.charAt(i); �� ���� �μ���
		while(j<s.length()) {  
			// ���ڴ� 0,1,2,... �̷������� ���۵Ǵµ� length�� 1,2,3,.. �̷��� ���� ������, i�� length�� ���ڰ� �� ����. 
			// �׷��� <=�� �ƴ϶� <�� ������. 
			// �ƴϸ� �����ϱ� ���� i<=s.length()-1�� �ص� ��.
			System.out.println((j+1)+"��° ����:"+s.charAt(j));
			char c=s.charAt(j);
			if(c=='a'||c=='A')
				count++;
			j++;
		}
		System.out.println("a�� ������: "+num);
				

	}

}
