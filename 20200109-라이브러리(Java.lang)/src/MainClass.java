/*
 * �ڹٿ��� �����ϴ� ���̺귯��
 * => �ڹ� 
 * 	  1) ����� ���� 
 *    2) ���̺귯��
 *    ============= 1) + 2) ==> ����
 *    �ڹ� ����
 *    =======
 *    1. java.lang : import�� ���� �ʰ� ���
 *     1) String : ���ڿ��� ���õ� Ŭ����
 *     		(1) equals : ���ڿ� �� 
 *     		(2) trim() : �¿��� ���� ����	
 *     		(3) indexOf(), lastIndexOf();:
 *     		(4) length()
 *     		(5) startsWith,endsWith
 *     		(6) subString()
 *     		(7) split()
 *      	(8) vlaueOf()
 *     2) System : ����, �Է����, GC(Garbage Collector) �θ� ��
 *     		(1) gc : �������ݷ��� ȣ�� 
 *     		(2) exit  
 *     3) Object : ��� Ŭ������ ���� Ŭ����
 *     		(1) clone() : ����
 *     		(2) finalize9); :�Ҹ��� 
 *     4) Math : ���� 
 *     		(1) random()
 *     		(2) ceil()
 *     5) StringBuffer: Buffer ��� �ӵ� �� ������. ���ڿ� ���� �� ���. (https://wikidocs.net/276 ����)    
 *     		(1) toSpring()
 *     		(2) append() : ���ڿ� ���� 
 *     6) Thread   
 *    2. java.util : �����ϰ� ����� �� �ִ� Ŭ������ ����
 *     - Scanner : �ֿܼ��� ������ ������, �����δ� ����ڿ��� �Է¹��� �� Scanner���� �ٸ��� �� �Ŵ�.  
 *     - StringTokenizer : 
 *     - Collection(�迭) : �迭�� �޸� �������̶� ���� ���ϴ� ������ ������ �� �ִ�! 
 *     - ArrayList��, Vector, LinkedList, Map��, ... : �ڷᱸ�� 
 *     	  �ڷᱸ�� : �޸� ���� ����  
 *         �� ArrayList : Ŭ������ ���� 
 *    3. java.io
 *     - Reader, Writer (2byte) - �ѱ��� ������ �ݵ�� �̰� ���. InputStream���� �ѱ� �� ����. 
 *     - InputStream, OutputStream (1byte)
 *     - File
 *     - OjbectInputStream, ObjectOutputStream
 *    4. java.net
 *     - Socket
 *     - URL
 *     
*/		
class My
{
	public My(){
		System.out.println("My ������ �Լ� ȣ�� (��ü ����)");
	}
	
	public void display(){
		System.out.println("My:display() (��ü ����)");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		My m=new My();
		
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My m=new My(); //����
		// Ȱ��
		m.display();
		//�Ҹ�
		m=null;
		m=null;
		System.gc(); // �޷θ� �Ҹ� 

	}

}
