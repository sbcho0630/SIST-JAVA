/*
 * ���� : �ǿ�����(������) 1���� ��� 
 * 	���������� : ! 
 * 	======
 * 	����� �� �ݵ�� boolean ���.  
 * 	true��false, false��true �� ����. : ����Ŭ������ ����.  * 
*/
public class ���׿�����_���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=false;
		System.out.println("bCheck ���� ��: "+bCheck);
		bCheck=!bCheck;
		System.out.println("bCheck ���� ��: "+bCheck);

		
		// ����..
		int x=10;
		int y=9;
		if((x<y) && (++y==x)) {
		}
		System.out.println("x="+x);
		System.out.println("y="+y); //y=9. �ֳĸ� && ���꿡�� ������ false�� �������� ���X. 
				
		int aaa=10;
		int bbb=9;
		if((aaa<bbb) || (++bbb==aaa)) {
		}
		System.out.println("aaa="+aaa);
		System.out.println("bbb="+bbb); //y=9. �ֳĸ� || ���꿡���� ������ false�� �����ʵ� �����. 
		
		

	}
}












