package com.sist.io;
import java.io.File;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\oracle");
			if(dir.exists())
			{
				File[] files=dir.listFiles();
				//System.out.println(files.length);
				if(files.length>0) // ������ �����ϴ� ��� ==> ���� ������� �ش� ������ ���ϵ� ���� �� �����ؾ��� 
				{
					for(File f:files)
					{
						f.delete();
					}
					dir.delete();
				}
				else // ������ ���� ��� ==> ������ ����� �� 
				{
					dir.delete();
				}
			}
			System.out.println("oracle ���� ���� �Ϸ�");
		}catch(Exception ex) {
			System.out.println(ex.getMessage()); // �������� �����޽��� ����ض� 
		}

	}

}
