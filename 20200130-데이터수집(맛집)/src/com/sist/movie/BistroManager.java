package com.sist.movie;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BistroManager {
	public ArrayList<BistroVO> movieListData()
	{
		ArrayList<BistroVO> list = new ArrayList<BistroVO>();
		try {
			BistroDAO dao=new BistroDAO();
			for(int i=1;i<=12;i++) // ������ ��. 1�������� �ִ� �ּ�ó��. 
			{
				Document doc=Jsoup.connect("https://www.menupan.com/restaurant/bestrest/bestrest.asp?page="+i+"&trec=294&areacode=ss218&pt=rt").get();
				// movieId �������� a�±� ��������. 
				Elements link=doc.select("span.restName a"); // �� �Ȱ��� a�±״ϱ� Elements ��밡��  
				// 
				for(int j=0;j<link.size();j++)
				{
					try {
						Element elem=link.get(j);
						//System.out.println((i)+"-"+elem.attr("href")); // a �±��� �Ӽ�(ex.href)�� �������� ������  'attr'�� ����ؾ���.
						//System.out.println((i)+"-"+elem.text()); // �̷��� �ϸ� a �±��� ���� ������ ==> ��ȭ����			
						String mLink="https://www.menupan.com/"+elem.attr("href"); // mLink�� ��ȭ �������� ��ũ ����  
						Document doc2 = Jsoup.connect(mLink).get(); //doc2�� URL(mLink)�� ������ Document(HTML)�� �����´�. 
						//System.out.println(doc2); //doc2�� mLink�� Document �������� �� Ȯ�� 
						
						/*
						 * private int mno;
						 * private String title;
						 * private double score;  
						*/						
						Element title=doc2.selectFirst("div.areaBasic dl.restName dd.name"); 
						System.out.println(title.text());
						Element score= doc2.selectFirst("div.areaBasic dl.restGrade p.score span.total");
						System.out.println(score.text());
												
						BistroVO vo = new BistroVO();
						vo.setTitle(title.text());
						vo.setScore(Double.parseDouble(score.text()));
						
						dao.bistroInsert(vo);
						
					} catch (Exception ex) {}				
					
				}
			}
			System.out.println("DataBase Insert End....");
		} catch (Exception ex) {}
		return list;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BistroManager m = new BistroManager();
		m.movieListData();
	}

}



/* <Jsoup���� �� ����>
 * �������.text(); : ������� ���� ��ȯ(�±״� �������� ����)
 * �������.attr("�Ӽ��̸�"); : ������� "�Ӽ��̸�"�� ���� ���� ��ȯ
 * �������.html(); : ������� ���� ��ȯ(�±׵� ����)
 * �������.outerHtml(); : ������Ҹ� ��ȯ(�±׿� �� ���)
 * 
 * ex) 
 * <div class="a">
 * 		<p>aaaa</p>
 * 		<a href="https://www.daum.net/">bbb</a>
 * </div>
 * 
 * ���� ������ �����غ���...
 * div.a p 	=> text() 		==> aaaa
 * div.a a 	=> attr("href") ==> https://www.daum.net/
 * div.a 	=> text() 		==> aaaa bbb
 * 			   html()		==> <p>aaaa</p>
 * 								<a href="https://www.daum.net/">bbb</a>
 */