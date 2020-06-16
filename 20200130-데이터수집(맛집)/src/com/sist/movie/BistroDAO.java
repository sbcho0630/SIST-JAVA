package com.sist.movie;
import java.util.*;
import java.sql.*;

/*
 * private int mno;
 * private String title;
 * private double score;  
*/

public class BistroDAO {
	private Connection conn; //Socket
	private PreparedStatement ps; // OutputStream, BufferedReader. �ְ�ް� �ϴ� �Լ��� ������� �ִ�. 
	private final String URL="jdbc:oracle:thin:@localhost:1521:orcl";

	// 1. ����̹� ��� => �ѹ��� ����
	public BistroDAO() 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	// 2. ����Ŭ ����
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	// 3. ����Ŭ ���� 
	public void disConection()
	{
		try 
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		} catch (Exception ex) {}
	}
	// ============================= ��������� ��κ��� ���α׷��� �� �Ȱ��� =============================
	
	
	// 4. ���ó�� => �߰�  ==> CRUD
	public void bistroInsert(BistroVO vo)
	{
		try 
		{
			getConnection();
			String sql="INSERT INTO bistro VALUES("
					+"(SELECT NVL(MAX(mno)+1,1) FROM bistro),?,?)";
			// 1 : �����(Movie ���̺� 1-37��) / 2 : ��������(38-92��) 
			// 3 : �ڽ����ǽ� �ְ�(93-102��) / 4 : �ڽ����ǽ� ���� (103-122��) / 5 : �ڽ����ǽ� ���� (123-167��)
			// �ڵ����� mno ��ȣ �����ϰ�.
			// �� ó���� null�̴ϱ� NVL ����ؼ� null�� �� 1 �־���.
			// �� �������ʹ� 1�� �����ϹǷ� 1,2,3,.... �� ���� ��ȣ�� ��� ������ 
			/*
			 * private String title;
			 * private double score;
			 * private String genre;
			 * private String regdate;
			 * private String time;
			 * private String grade;
			 * private String director;
			 * private String actor;
			 * private String story;
			*/
			ps=conn.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setDouble(2, vo.getScore());
		} catch (Exception ex) 
		{
			 ex.printStackTrace();
		}
		finally
		{
			disConection();
		}
	}
}





