package com.sist.io;
/*
 *  <java.io> 
 *  - (�� => ����) : �ٿ�ε�/���ε� 
 *  - ����� 
 *  1. �޸�
 *   - Input : BufferedReader(new InputStreamReader(System.in))
 *  	 		==> Ű���� �Է°��� �޴� ���
 * 	 - Output : Sstem.out.println()
 *  2. ����
 *   - Input : BufferedReader 
 *   - Output : FileOutputStream, FileWriter
 *  3. ��Ʈ��ũ
 *   - Input : BufferedReader(new InputStreamReader(s.OutputStream())
 *  												===
 *  												s=Socket
 *  	Output : s.getOutputStream()
 *  ==================================================================
 *  <IO> 
 *  - (Stream => ������ �̵� ���) = �ܹ������ 
 *  1. 
 *   - Input :  1byte => InputStream, 2byte => Reader (�ѱ�) 
 *   - Output : 1byte => OutputStream, 2byte => Writer 
 *  	===> .txt, .xml, .json (javascript������ �ַ� ��� ����������) 
 *  				========== web���� �ַ� ��� (������ ���� => �Ľ�) 
 *  				.json => React, Vue => Ajax, RestController
 *  2. File Ŭ����
 *   1) ���� : �Ϲ� ���� ���� ���� ex) new File("c:\\javaDev\\a.jpg")
 *   	- ������ �������� ���� 
 *      - . : �������� / .. : �������� �� 
 *        ex) Ŀ�ǵ� â���� cd .. ==> ���� ������ ��ġ �̵� 
 *   2) ���丮(����) ex) new File("c:\\javaDev")
 *  
*/
// Application ���α׷��� => Ž���� ������ �˾ƾ�. 
import java.io.*;
/* 
 * io, sql ==> ������ ����ó�� => �ݵ�� ����ó�� ���
*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\javaDev");
			File[] files=dir.listFiles();
			for(File f:files) // ���� �Ǵ� ���� 
			{
				if(f.isDirectory()) // ���� 
				{
					System.out.println("["+f.getName()+"]"); // �̸��� ������ �� ����. ������ [] �����. 
				}
				else //����
				{
					 System.out.println(f.getName());
				}
			}
		}catch(Exception ex) {}
	}

}
