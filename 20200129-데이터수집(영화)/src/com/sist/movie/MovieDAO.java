// DAO : ������ ���̽� �����ϴ� ���α׷� 
// DAO (Data Access Object) : DB�� ����ؼ� �����͸� ��ȸ/����
package com.sist.movie;
import java.util.*;
import java.sql.*;
/*
 * 1. ����̹� ��� => Class.forName("oracle.jdbc.driver.OracleDriver"); ==> ����Ŭ���� �ٿ�ε� (ojdbc6.jar)
 * 2. ����Ŭ ���� => Connection
 * 				=> getConnection(URL, username, password)
 * 				=> conn hr/happy 
 * 3. ���ó�� => SQL
 * 			 => Statement : SQL ������ ����Ŭ�� ����
 * 				1) executeQuery() : �˻� �� ��� (SELECT). �����͸� ������ �� �� ���. 
 * 									==> �������� ResultSet (����� �޾Ƽ� �޸𸮿� ����)    
 * 				2) executeUpdate() : �����Ͱ� ����� �� ���. ������ ���� (INSERT, UPDATE, DELETE) 
 * 									 ==> commit() ����. �������� void. (������ �޾ƿ��� �����ϱ�)     
 * 4. ����Ŭ ���� => close()
 * 
*/
/*
 * private int mno;
 * private String title;
 * private double score;
 * private String genre;
 * private String regdate;
 * private String time;
 * private String grade;
 * private String director;
 * private String actor;
 * private String story;
 * private int type;
 * 
 * <�� �ִ� ��� 2����>
 * 1. Statement 
 *  : �����ϰ� ���...��_��
 *  ex) String sql = "INSERT INTO movie VALUES("+mno+",'"+title+"',
 *  	"+score+",'"+genre+"','"+regdate+"','"+time+"','"+grade+"',
 * 		'"+director+"','"+actor+"','"+story+"',"+type+")";
 * 2. PreparedStatement 
 *  : - ? �ְ� ���߿� �� ä��. Prepared : SQL������ ?�� ����ؼ� '�̸� �������´�'�� ��.
 *  ex) String sql="INSERT INTO movie VALUES(?,?,?,?,?,?,?,?,?,?)"
 *  
*/

public class MovieDAO {
	private Connection conn; //Socket
	private PreparedStatement ps; // OutputStream, BufferedReader. �ְ�ް� �ϴ� �Լ��� ������� �ִ�. 
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";

	// 1. ����̹� ��� => �ѹ��� ����
	public MovieDAO() 
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
	public void movieInsert(MovieVO vo)
	{
		try 
		{
			getConnection();
			String sql="INSERT INTO movie VALUES("
					+"(SELECT NVL(MAX(mno)+1,1) FROM movie),?,?,?,?,?,?,?,?,?,5)" ;
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
			ps.setString(3, vo.getGenre());
			ps.setString(4, vo.getRegdate());
			ps.setString(5, vo.getTime());
			ps.setString(6, vo.getGrade());
			ps.setString(7, vo.getDirector());
			ps.setString(8, vo.getActor());
			ps.setString(9, vo.getStory());
			ps.executeUpdate();
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





