package com.sist.main;
import com.sist.board.Board;
/* 
 * 	public protected default private
 * 	==================================  
 * 	public : ��� Ŭ�������� ���� ���� 
 * 	protected, default : ���� ����(��Ű��)������ ���� ����. 
 * 						  ��, protected�� ��� ���� ��� �ٸ� ��Ű���� ���� ����.  
 * 	private : �ڽ��� Ŭ���������� ���� ����. ���θ� �� �� �ִ�.  
*/
public class MainClass {
	// ��� Ŭ������ ������ ���� public���� ������. 
	// ��, �����ʹ� private���� ������. (���� �� �ϰ�) 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MainClass���� ������!!
		
		Board b= new Board(1,"�Խ���","2020-01-02"); 
		// �ٸ� �������, com.sist.board �������� ������ Board�� 'public' �� �پ� ������ ������ �ȵǹǷ� ȣ�� �Ұ����ϴ�. 
		// ==> ������ ���� �� �ݵ�� 'public' �ٿ���. 
		// ���� ������� 'public' �� �پ� �־ ������ ȣ�� �����ϴ�. 
		
		
	}

}
