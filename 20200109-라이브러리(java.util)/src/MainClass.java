/*
 * <StringTokenizer>
 *  - ���ڿ��� ������ �� ����ϴ� Ŭ���� 
 * 1. ��ü������ ���� 
 * 2. ���ڿ�(0) 
 * 	   id|pwd|avatar 
 *  	- id,pwd,avatar �ϳ��ϳ��� token�̶�� ��.
 *  	- split ���� ���Խĺ��� �߶���ؼ� ����
 *  	- StringTokenizer�� �� ����  
 * 	1) hasMoreTokens() : 
 * 	2) nextToken() : �ܾ �ϳ��� ������ �� 
*/
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="admin|ȫ�浿|1234|����|����|1111-1111";
		StringTokenizer st=new StringTokenizer(data,"|"); //�� : �ڸ� ���ڿ� 
		
		/*String id=st.nextToken();
		String name=st.nextToken();
		String pwd=st.nextToken();
		String sex=st.nextToken();
		String addr=st.nextToken();
		String tel=st.nextToken();
		
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Password:"+pwd);
		System.out.println("Address:"+addr);
		System.out.println("Tel:"+tel);*/
		
		while(st.hasMoreTokens()) { //hasMoreTokens : �߷��ִ� �ֵ� ������. 
			System.out.println(st.nextToken());
		}
	}

}
