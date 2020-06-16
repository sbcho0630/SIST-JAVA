/*
 * String : ���ڿ� ����
 * ======
 * 	��� �ڡڡڡڡ� �Ʒ��� �͵��� �� �ܿ��� �ڡڡڡڡ�
 * 	1) ���ڿ��� �и� substring()
 * 	2) ���� ã�� indexOf(), lastIndexOf() 
 * 			 (indexOF: �տ������� ã�� // lastIndexOf: �ڿ������� ã��) 
 * 			 c:\javaDev\javaStudy
 * 	3) ���� �� equals() : ��ҹ��� ���� O
 * 			 equalsIgnoreCase : ��ҹ��� ���� X
 * 	4) ���鹮�� ���� trim()
 * 	5) ��ҹ��� ���� toUpperCase, toLowerCase
 * 	6) ��� ���������� ���ڿ��� ���� valueOf()
 * 	7) ������ ���� length()
 * 	8) ���� -> replace, replaceAll 
 * 
 * <��Ÿ>
 *  - ����ȭ�� ������, ������ȭ ������, ...
 *  - String�� �Ϲ� ���������� �ƴϰ�  class�� 1) ����� ���� �ִ�!�� 2) �� ��ȯ�� �� �ȴ�.
 *  - String�� 4byte��. �ֳĸ� ��� class�� �ּҸ� �����ϸ�, �̴� 4byte�̱� ����. ��
 *  - ���������� ��� �޼ҵ嵵 4byte�̴�.
 *  
 * 
*/
public class ���ڿ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello Java!!"; //���鵵 ���ڴ�! ���� 12����.	
				//012345    H�� 0, o��4, ������ 5����. 
		System.out.println("���ڼ�:"+s.length()); //���ڼ�:12
		System.out.println(s.substring(0,5)); //Hello
		//(0,5)�� �ָ� 0~4������ ������ �´�. --> �׻� �ϳ��� �� ���� ������ �;�.
		System.out.println(s.replace("l", "k")); //Hekko Java!!
		System.out.println(s.toUpperCase()); //HELLO JAVA!!
		System.out.println(s.toLowerCase()); //hello java!!
		System.out.println(s); //���� s.~~���� ������ s�� �� ��ü�� �����Ű���� �ʴ´�. ���� s�� ���� �������Ѽ� �ѹ��� ��½����ٻ�.
		
		s=" Hello Java!! ";  
		System.out.println("���ڼ�:"+s.length()); //���ڼ�:14
		System.out.println(s.substring(0,5)); // Hell
		System.out.println(s.trim()); //trim�� �¿��� ���鸸 ������ �� �ִ�. �߰� ������ ���� �� ����.
		
		System.out.println(s.indexOf("l")); //3
		System.out.println(s.lastIndexOf("l")); //4 
		//lastIndexOf�� !!avaJ olleH ������ ��ȣ�� 01234.. �ű�°� �ƴ�. ��ȣ �ű�� ������ �Ȱ��� Hello 01234.. �̷��� �ű�. 
		// indexOfó�� 01234 ���� ã�µ� �� �ڿ� �ִ� �ָ� ã�°�.
		System.out.println(s.indexOf("a")); //8
		System.out.println(s.lastIndexOf("a")); //10
		
		String s1="Hello";
		String s2="Hello";
		String s3="hello";
		
		String com12=s1.equals(s2)?"����":"�ٸ���";
		System.out.println(com12); //����
		String com13=s1.equals(s3)?"����":"�ٸ���";
		System.out.println(com13); //�ٸ���
		String com13_ig=s1.equalsIgnoreCase(s3)?"����":"�ٸ���"; //equalsIgnoreCase : ��ҹ��� �����ϰ� ��
		System.out.println(com13_ig); //����
	}

}







