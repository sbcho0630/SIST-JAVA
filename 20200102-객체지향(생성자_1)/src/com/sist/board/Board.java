package com.sist.board; 
//��Ű�� : �׳� '����'��� �����ض�.
//��Ű�� ���� ���� 'com' �Ǵ� 'org'�� �����Ѵ�. ex) com.ȸ���.�з� 

public class Board {
	int no;
	String name;
	String regdate; //default ==> ���� ���������� ���� ����. 
	
	//������ : ������� �ʱ�ȭ 
	public Board(int no, String name, String regdate)
	{
		this.no=no; //�� Ŭ������ ����������ٰ� �������� ���� ���� 
		this.name=name;
		this.regdate=regdate;
	}
	
	public void boardList() 
	{
		System.out.println("��ȣ:"+no);
		System.out.println("�̸�:"+name);
		System.out.println("�����"+regdate);
	}

}
