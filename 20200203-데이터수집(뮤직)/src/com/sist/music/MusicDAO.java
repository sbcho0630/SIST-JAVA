package com.sist.music;
// ����Ŭ ���� 
import java.util.*;
import java.sql.*;
public class MusicDAO {
	private Connection conn; // ����Ŭ ���� 
	private PreparedStatement ps; // SQL ���� ���� 
	// SELECT, INSERT, UPDATE, DELETE => ����Ŭ���� �ڵ� vs �ڹٿ��� SQL �ڵ�
	// SELECT * FROM emp WHERE ename LIKE '%A%' <=========== (X) : Java���� Error��.
	// SELECT * FROM emp WHERE ename LIKE '%'||A||'%' <===== (O) : Java���� ��� ����
	// �����ϱ� ���� �ּҰ� �ʿ� 
	private final String URL="jdbc:oracle:thin:@localhost:1521:orcl";
	
	// ����̹� ���
	public MusicDAO()
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ���÷��� => Ŭ������ �̸��� �о� �ͼ� �޸� �Ҵ�. 
			// new, Class.forName => �޸��Ҵ� ==> Spring���� ���� ����ϴ� ���
			// ==> ���� : �̸��� �����ָ� �� ���� ����. (�޼ҵ� ȣ�� ����.)  
		} catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	
	//����
	public void getConnection() {
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch (Exception ex) {}

	}

	// ����
	public void disConnection() {
		try {
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		} catch (Exception ex) {}
	}
	
	// ��� => ���� ==> AutoCommit()
	// ����Ʈ : AutoCommit(true). ��, Java�� �ڵ��ϸ� �ٷ� Ŀ�� ���ư���.
	// �ϰ�ó���Ϸ��� AutoCommit(false)�� �����.
	public void musicInsert(MusicVO vo)
	{
		try 
		{
			getConnection();
			String sql="INSERT INTO music_genie VALUES("
					+"(SELECT NVL(MAX(mno)+1,1) FROM music_genie),?,?,?,?,?,?,?,?)"; // Oracle�� ���� 
			// ���� ���� �ֵ��� '��������'��� �Ѵ�. 
			// mno : ��ȣ�� 1�� �ڵ����� ����. 
			// NVL : null�� �� 1�� ��ü. 
			ps=conn.prepareStatement(sql); //prepared : �̸� ������ ����� ���� ���߿� ?�� ���� ���� ä��� ���� ��û��.
			/*
			    mno NUMBER,
			    rank NUMBER,
			    title VARCHAR2(500),
			    singer VARCHAR2(200),
			    album VARCHAR2(300),
			    poster VARCHAR2(260),
			    idcrement NUMBER,
			    state CHAR(4),
			    key VARCHAR2(100)
			*/			
			ps.setInt(1, vo.getRank());  // ������: Oracle�� ��ȣ 1������ ����!! (0������ ����X)
			ps.setString(2, vo.getTitle()); // ��������ǥ'' �����ϴ� �ָ� setString ���. setString���� ''�� �־��ش�. 
			ps.setString(3, vo.getSinger());
			ps.setString(4, vo.getAlbum());
			ps.setString(5, vo.getPoster());
			ps.setInt(6, vo.getIdcrement());
			ps.setString(7, vo.getState());
			ps.setString(8, vo.getKey());
			
			// ����
			ps.executeUpdate(); //commit
			
		} catch (Exception ex) 
		{
			ex.printStackTrace();
		}
		finally 
		{
			disConnection();
		}
	}
	
}






