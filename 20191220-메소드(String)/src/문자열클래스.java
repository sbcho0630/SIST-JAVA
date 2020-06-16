// String: ���ڿ��� ���� 
/*
 * java.lang => import�� ������ �� �ִ�. 
 * 
 * <���ڿ��� �����ϴ� ���> 
 * 	1) String ������="Hello Java"; 
 * 	2) String ������=new String("Hello Java"); // ���� ���ڿ� => ���� ���� 
 * 				   ====
 * 				      ���ο� �޸𸮿� ����
 * <String���� �����ϴ� ���>
 * 	1) equals: ����� ���ڿ��� ������ ���� Ȯ�� (true/false)
 * 		ID/PW ��, �α��� �� ���� ���. (��ҹ��� ����) 
 * 		���ڿ��� (==)�� ����ϸ� �� ��.
 * 		ex) String s="Hello";
 * 			String s1="Hello";
 * 			String s2=new String("Hello");
 * 			if(s==s1) <== true. ���ڿ��� ���ڿ�. �ּҰ� ���� ����. ���� ������ ����Ǿ� �־ true����. 
 * 			if(s==s2) <== false. ������ ���Ƶ� 'new'�� �ڻ��ο� �����ڿ� ����Ʊ� ����.
 * 			if(s.equals(s2)) <==true. ������ ���� �Ȱ��� ����. 		
 * 		=> ����
 * 		   boolean (�������� �Ҹ�. ������� true/false) equals(String data)  
 * 	2) substring: ���ڿ��� �ڸ� �� �ں����
 * 		����)
 * 		substring(int start)
 * 		substring(int start, int end)
 * 		ex) String s="0123456789";
 * 			substring(3) => "3456789";
 * 		ex) String s="112��,15���̻������";
 * 			substring(0,3) => "112"
 * 						==
 * 						end-1 ==> 012���� ������. <== 'end-1'�� ���ڱ��� �����ȿ� ����!!
 * 	3) length: ���ڿ� ���� 
 * 		String s="Hello ȫ�浿"; // s�� length�� 9��. �����̴� �ѱ��̴� �� char�ϳ��� 2byte, �ѱ�����. 
 * 		ex) �������� �� ���� ��. ���� ��� Ÿ��Ʋ ������ 20���� ������ �ڸ��� '...' ���̰�.  
 * 	4) trim: �¿��� ���鹮�ڸ� ����
 * 		ex) String s="Hello Java"; ==> s.length : 10��, s.trim().length : 10�� (��� ������ ����X)
 * 		ex) String s="   Hello Java    "; (�°���3,�����4) ==> s.length : 17��, s.trim().length : 10��  
 * 	5) startsWith, endsWith : �����ϴ�/������ ���� ã�� �� 
 * 		startsWith("�ڹ�"): '�ڹ�'�� �����ϴ� �� ã�ƶ�
 *  	endsWith("�Դϴ�"): '�Դϴ�'�� ������ �� ã�ƶ�  
 * 	6) indexOf, lastIndexOf: ���ڰ� �� ��°�� �ִ��� ã��.  
 * 		indexOf: �տ������� ���� ��ġ ã��.
 * 		lastIndexOf: �ڿ������� ã��. �ǵڰ� 0���̶��� �ƴ�. �׳� �ڿ������� ã�´� ��. Ȯ���� ������ �� ����ϱ⵵. 
 * 		ex) String s="Hello Java";
 * 					  0123456789
 * 			s.indexOf('a') ==> 7
 * 			s.lastindexOf('a') ==> 9  
 * 	7) split: ���ڿ� �ڸ���. ������ ����� ���� �߶��ش�.  
 * 		ex) String s="�̺���, ������, ������, ������, ����";
 * 			String[] names=s.split(","); ==> �迭 names�� {�̺���, ������, ������, ������, ����}�� ��
 * 			���Խ� ���� split�� �� Ȱ�뵵�� ����!
 * 			====
 * 				���Խ��� ���߿� �ٷ�ϴ�. 
 * 				ex) IP �ּ� 
 * 					211.238.142.181
 * 					2111.238.142.180
 * 					211.238.142.1
 * 					211.238.142.23
 * 					211.238.142.0
 * 					211.238.1.1
 * 					IP�ּ� ���Խ� : [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3} 
 * 					// 1)0���� 9���� �ִ� ����, 2)1�ڸ����� 3�ڸ����� �ִ� 3).�� �ִ�(\\.) : ���� 
 * 				ex) �̸��� �ּ� ���Խ� : ^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
 * 	8) toUpperCase, toLowerCase
 * 		toUpperCase: �빮�ڷ� ��ȯ
 * 		toLowerCase: �ҹ��ڷ� ��ȯ
 * 		ex) String s="Hello";
 * 			s.toUpperCase() ==> HELLO
 * 			s.toLowerCase() ==> hello 
 * 	9) replace, replaceAll 
 * 		replace: ���� 
 * 		ex) String s="Hello Java";  
 * 			s.replace('a','b'); ==> Hello Jbvb 
 * 		relaceAll�� ���Խ��� �ٴ´�.
 * 		ex) String s="113��"; 
 * 			s.replaceAll("[^0-9]","") ==> ���ڸ� �����ϰ�(���ڰ� �ƴ� ����) ���ֵ��� ���°ɷ� �ٲ��(���� ���� �� ������) ==> ���: 113
 * 			s.replaceAll("[^0-9$]","") ==> ���ڷ� �����ؼ� ���ڷ� ������ �� ����� �� ������.
 * 			s.replaceAll("[^��-�R]","") ==> �ѱ� ����  �� ������ 
 * 			s.replaceAll("[^A-Za-z]","") ==> ���� ����  �� ������
 * 	10) contains(): ���Ե� ���ڸ� ã�� ���
 * 	
*/

import java.util.Scanner;
public class ���ڿ�Ŭ���� {
	
	static String[] autoComplete(String data) {
		String[] ss= {
				"�ڹٿ� JSP","�ڹ� ���α׷���","������ 5","Ajax�� JSP","Redux�� ",
				"�ڹ� ����Ŭ","MVC ����","��Ʋ���� �ȵ���̵�","��Ʋ�� ���α׷�","������ ������",
				"ȥ�� ���� �ڹ�","�������� ���α׷�","�� ���α׷�","�ڹ� �����α׷�","����Ŭ�ڹ�"};
		String[] findData=new String[10];
		int j=0;
		for(int i=0;i<ss.length;i++) {
			//if(ss[i].startsWith(data)) 
			if(ss[i].contains(data)) 
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�˻��� �Է�:");
		String data=scan.next();

		String[] fd=autoComplete(data);
		for(int i=0;i<fd.length;i++) {
			if(fd[i]!=null) {
				System.out.println(fd[i]);
			}
		}
	}

}

