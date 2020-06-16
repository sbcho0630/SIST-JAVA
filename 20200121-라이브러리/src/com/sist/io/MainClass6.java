// [���Ϻ���] �� C:\oracle ������ C:\image�� �ִ� �̹��� �� �ϳ��� �Űܺ���. 
/*
 * �б� : int read(), read(byte[], off, len)
 * 		===			=====
 * 		���ڹ�ȣ 		���� ����Ʈ�� ex) MainClass6�� int i
 * 		ex) MainClass5�� int i
 * ���� : write(byte[]), write(String)
 * �ݱ� : close()
*/
package com.sist.io;
import java.io.*;
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis = new FileInputStream("C:\\image\\movie5.jpg");
			FileOutputStream fos = new FileOutputStream("C:\\oracle\\\\movie5.jpg");
			
			int i=0; // int i�� "���� ����Ʈ ��"�� �ǹ���.�� : �������ڸ� �� ���� ���� �� ��
			byte[] buffer = new byte[1024]; 
			// Q. �� 1024 byte ����ϳ���? 
			// A. �� 1024 byte �� �ᵵ �ȴ�. 
			//    ������ �ַ� 512(UDP), 1024(TCP) byte ���� ��� ==> �ַ� 2�� ����� ���� ����Ѵ�. 
			while((i=fis.read(buffer, 0, 1024))!=-1) // 
			{
				fos.write(buffer, 0, i); 
				// out.write()
			}
			fis.close();
			fos.close();
			System.out.println("���� ���� �Ϸ�");
			
		}catch (Exception ex) {}
	}

}
