package com.sist.io;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

/*
 * ���� ���� : ���� ��Ŭ���ؼ� '�Ӽ�'���� �� �� �ִ� �ֵ�...
 * =======
 * 1. ���ϸ� : getName()
 * 2. ���~���ϸ� : getPath()
 * 3. ��θ� : getParent()
 * 4. ������ : lastModified() 
 * 	  => �������� long������ �Ǿ� �ִ�. => new Date()���ٰ� long�� ������ ��¥�� �ٲ��. 
 * 5. ���ϻ��� : createFile() 
 * 6. ����ũ�� : length 
 * 7. �Ӽ�(�б�/����/����) : canRead, canWrite, isHidden(), isFile()
 * 	  ================ 
 * 		boolean ����
*/
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File file=new File("c:\\javaDev\\��ü.pptx");
			if(file.exists())
			{
				// �Ʒ��� ��ǥģ �� �ݵ�� �ϱ��� ��!
				System.out.println("***���ϸ�: "+file.getName());
				System.out.println("��θ�: "+file.getParent());
				System.out.println("***��ü���: "+file.getPath());
				System.out.println("***ũ��: "+file.length()+" Byte");
				System.out.println("�б�����: "+file.canRead());
				System.out.println("��������: "+file.canWrite());
				System.out.println("��������: "+file.isHidden());
				System.out.println("***���Ͽ���: "+file.isFile());
				System.out.println("***������: "+file.lastModified()); // �⺻������ long������ �Ǿ����� 
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd��"); 
				String day=sdf.format(new Date(file.lastModified()));
				System.out.println("������: "+day);
				System.out.println("***������: "+new Date(file.lastModified()));
			}
		}catch(Exception ex) {}

	}

}
