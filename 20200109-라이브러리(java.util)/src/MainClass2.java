import java.util.StringTokenizer;
// ������ �� => ������ �м� 
/*
 *  ê��(AI) 
*/
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Java Oracle HTML CSS JavaScript JSP Spring Kotlin";
		StringTokenizer st=new StringTokenizer(data); //data �ڿ� �ƹ��͵� �� �ָ� ����Ʈ��""(����)���� �ڸ���.
		while(st.hasMoreTokens()) { //hasMoreTokens : �����Ͱ� �� �� ���Դ��� �� �� ���. 
			System.out.println(st.nextToken());
		}

	}

}
