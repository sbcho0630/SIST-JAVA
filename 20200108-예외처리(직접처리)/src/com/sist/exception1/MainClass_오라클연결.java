package com.sist.exception1;
import java.sql.*; //����Ŭ ���� => CheckException

public class MainClass_����Ŭ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null; // ����Ŭ ���� (Socket)
		PreparedStatement ps=null; // SQL ���� ���� => ���� 
		try
		{
			// 1. ����Ŭ ����̹� ���� : thin, oci 
			//  - �츮�� thin ����̺� �����(����^_^!!)
			//  - thin����̺� : �ٸ� �ֶ� ���Ḹ ���� (ex. Oracle�� ����)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. ����
			String url="jdbc:oracle:thin:@localhost:1521:XE"; // XE: ������ ����� ��ġ�� �̸�.
			conn=DriverManager.getConnection(url,"hr","PASSWORD");  //XML 
		
			// 3. SQL ����
			String sql="SELECT ename,job,sal FROM emp"; // "" �ȿ� ; ���� ����. ����Ŭ Ŀ�ǵ� â���� ; �� ���⿣ ����X...
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery(); //rs�� ���� ����� SQL �������� ������� ���� �ִ�.
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)); 
				// SQL Ŀ�ǵ忡�� Ȯ���ϸ� ename�� String, job�� String, sal�� int�ϱ�
			}
			rs.close();
			
		}catch(Exception ex) {
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
			// getMessage : �����޽��� ��� (��X) 
			// printStackTrace : ���° �ٿ��� ���������� ���		
			}
		finally
		{
			try
			{
				// finally���� �����Ŵ 
				// finally���� ����ó��������� 
				// ���� : ps ���� �ݰ� conn �ݾƾ�...
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			}catch(Exception ex) {}
		}
		
	}

}
