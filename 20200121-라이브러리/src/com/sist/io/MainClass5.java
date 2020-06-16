// [���� �а� ����] Ư�� ������ �о �ٸ� ���Ͽ� ���� 
package com.sist.io;
/*
 * File �Ӽ� ==> File ����� 
 * ======================
 * 1.FileInputStream (�б�), FileOutputStream (����)
 *  - 1byte : byte ������ �а� ���� �����. 
 * 2. FileReader (�б�), FileWriter (����)
 *  - 2byte : ���ڿ�(String) ������ �а� ���� ����. 
 * 3. ��Ÿ 
 *  - �ѱ��� ��� ���ڰ� 2byte ==> 1byte�� ������ ������!! ��  ==> FileReader, FileWriter ���  
 *  - zip����, �׸� ���� ���� 1byte ==> InputStream���� �д´�.  
 * 
*/
import java.io.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File file = new File("C:\\javaDev\\javaStudy\\20200120-�ڹ���������\\src\\com\\sist\\java\\MainClass.java");
			// FileInputStream fis=new FileInputStream(file); // FileInputStream ���� �� ������ �ѱ� �� ����
			FileReader fis=new FileReader(file);
			// ������ => �������� �����ڸ� ������ ���� �� �ִ�. (�����ε�)
			int i=0; // ���� �б� ==> int read() => ASC�� �о� �´�. 
			// int i�� "���ڹ�ȣ(�ƽ�Ű�ڵ尪)"�� �ǹ���  �� : �� ���ھ� ���� �� �� 
			// ex) a�� ������ 60���� �޾ƿ�..
			String data="";
			while((i=fis.read())!=-1)  
			{	// -1�� EOF(End Of File)�� �ǹ���. 
				// ��, i=fis.rea()!=-1�̶� '������ ���������� ���� �ʾҴٸ�'�� �ǹ� 
				// System.out.println((char)i);
				data+=String.valueOf((char)i);
			}
			System.out.println(data);
			fis.close();
			// r: �б� / w: ���� / a: �߰�
			File file2=new File("c:\\image\\data.txt");
			if(!file2.exists())
			{
				file2.createNewFile();
			}
			// textarea ==> setText(): ���� �ؽ�Ʈ ����, append() : ���� �ؽ�Ʈ ���ΰ� �ű⿡ �߰�.
			FileWriter fos=new FileWriter(file2, true); //true�� ���̸� ==> append ���  ==> �߰� 
			// read�ؿ� MainClass.java ������ data.txt�� write�Ѵ�.  
			fos.write(data);
			fos.close();
			System.out.println("���� ���� �Ϸ�"); 
			
		} catch(Exception ex) {}
	}

}

/*
 * Ŭ����
 * ====
 * 	1. �������
 * 	 1) ������� : (������뺯��(�ν��Ͻ�), ���뺯��(��������)) 
 * 				  private int a; ==> ��������� ���� �Ŀ� ���� 
 * 									 ===========
 * 										new 
 * 				  private static int b; ==> Ŭ���� �δ��� ���� �� ó���� 
 * 
 * 				   �⺻��, Ŭ����, �迭 ===> ��������    ===> Ŭ������ �迭�� ������ �� �� �ִ�!!!�� 
 * 						==========
 * 						��������� ��������   
 * 					==> �޼ҵ� �ȿ��� ����ϴ� ���� : ��������  
 * 		=========================================================
 * 			������� : �ڵ� �ʱ�ȭ
 * 			�������� : �ݵ�� �ʱ�ȭ�� �ؼ� ����Ѵ�. 
 * 	 2) �޼ҵ� : 
 * 		 - ���� �� �޼ҵ� (�߻�޼ҵ�) => �̿ϼ��� Ŭ���� 
 * 		   =========== �ϼ��� �ؼ� ��� (�߻�Ŭ����, �������̽�)
 * 		   public void display(); 
 * 		 - ����+���� �޼ҵ� 
 * 		   public void display()
 * 		   {
 * 				// ������ 
 * 		   }
 * 			=> ������� ��û���� �޾Ƽ� ó�� ����� �����ش�. 
 * 			   ===========       =======
 * 				�Ű�����			    ������
 * 				======			  =====
 * 				 ������ ��� ����	  1���� ��� ���� 
 * 									= ����� ���� ���� ��� : int, String ���� ��� 
 * 									= �����Ͱ� ���� ��� : �迭, Ŭ����, �÷���   
 * 				=> �Ű����� : 3�� �̻��̸� => Ŭ������ ��� ����
 * 				=> �޼ҵ�� ����ȭ : �ϳ��� �޼ҵ尡 ������ ���� �޼ҵ尡 ȣ��� ��
 * 					�� ������� �񵿱�ȭ : ���ÿ� ������ ȣ�� ����  
 * 				=> �޼ҵ尡 �ַ� �ϴ� ���� : ��� (Ŭ������ Ŭ���������� ��� ==> �޽���) 
 * 					===============
 * 					
 * 	 3) ������  : ��������� �ʱ�ȭ : ��������� ���� ���� 
 * 							  ================
 * 								1) File�� �о ���� ����
 * 								2) ����� ��� 
 * 								*** Class�� ����� ������ �� �� ����. (���� ����)
 * 								class A
 * 								{
 * 									int a;
 * 									a=10;  // <== (X) ����!! �ȵ�!!!
 * 									int b=10; // <== (O) ����!! ����!! ����� ���ÿ� ���� �����ϴ� ���� �����ϴ�!
 * 								}
 * 		
 * 	
*/

