package com.sist.movie;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MovieManager {
	public ArrayList<MovieVO> movieListData()
	{
		ArrayList<MovieVO> list = new ArrayList<MovieVO>();
		// �� ���� ������ �𸣴ϱ� ArrayList ���
		try {
			// 1���������� ������ ������(3p)���� �ܾ��
			MovieDAO dao=new MovieDAO();
			//for(int i=1;i<=6;i++) // ������ ��. 1�������� �ִ� �ּ�ó��. 
			{
				Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get();
				// movieId �������� a�±� ��������. 
				Elements link=doc.select("div.info_tit a"); // �� �Ȱ��� a�±״ϱ� Elements ��밡��  
				// <a href="/moviedb/main?movieId=122091" class="name_movie #title">������ �����</a>
				// Elements : HTML�� element(tag)���� ����.   
				for(int j=0;j<link.size();j++)
				{
					try {
						Element elem=link.get(j);
						//System.out.println((i)+"-"+elem.attr("href")); // a �±��� �Ӽ�(ex.href)�� �������� ������  'attr'�� ����ؾ���.
						//System.out.println((i)+"-"+elem.text()); // �̷��� �ϸ� a �±��� ���� ������ ==> ��ȭ����			
						String mLink="https://movie.daum.net"+elem.attr("href"); // mLink�� ��ȭ �������� ��ũ ����  
						Document doc2 = Jsoup.connect(mLink).get(); //doc2�� URL(mLink)�� ������ Document(HTML)�� �����´�. 
						//System.out.println(doc2); //doc2�� mLink�� Document �������� �� Ȯ�� 
						
						// ��ȭ ���� ���� �����ͼ� ��� 
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
						// ����, ����, �帣, .... �� �츮�� ���������� �ϴ� �������� ���� �±׸� ������� �ʱ� ������
						// �� �������� �ѹ��� Elements�� ������ �� ����
						// ==> ���� �����鸸 ���� �±׸� ������ �����Ƿ� (ex. ��� ��ȭ������ strong �±� ���) ���� �������� Element ���� ������ش�. 
						Element title=doc2.selectFirst("div.subject_movie strong.tit_movie"); 
						//selectFirst : ù��° �±� ������. div.subject_movie �ȿ� strong�� �������� �� ���Ƽ� selectFirst ����ߴ�.
						System.out.println(title.text());
						Element score= doc2.selectFirst("div.subject_movie em.emph_grade");
						System.out.println(score.text());
						Element genre=doc2.select("dl.list_movie dd.txt_main").get(0);  //dd.txt_main�� ������ ==> get(#)�� ��������  
						System.out.println(genre.text());
						Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1); 
						System.out.println(regdate.text());
						
						Element timeAndGrade=doc2.select("dl.list_movie dd").get(3); 
						System.out.println(timeAndGrade.text()); // 102��, ��ü������  
						// �ð��̶� ������� �پ���Ƿ� StringTokenizer�� �� �� �и�������.
						// �μ����� �簳�����ڰ� ����° dd����  ,�������� StringTokenizer �� �� ���� 
						// try catch �� ���ָ� �μ��� �������� ������ ������. 
						// try catch �ϸ� ������ �κ�(�μ���)���� for�� ���������� �ٽ� �ö� ���� �ٽ� ������. ==> �μ��� �� ���� ���� �������� �ٽ� for�� ����.
						String temp=timeAndGrade.text();
						StringTokenizer st=new StringTokenizer(temp,","); 
						String strTime=st.nextToken();
						String strGrade=st.nextToken().trim();
						System.out.println(strTime);
						System.out.println(strGrade);
						
						Element director=doc2.select("dl.list_movie dd.type_ellipsis").get(0);
						System.out.println(director.text());
						Element actor=doc2.select("dl.list_movie dd.type_ellipsis").get(1);
						System.out.println(actor.text());
						Element story=doc2.selectFirst("div.desc_movie p");
						System.out.println(story.text());
						
						MovieVO vo = new MovieVO();
						vo.setTitle(title.text());
						vo.setScore(Double.parseDouble(score.text()));
						vo.setGrade(strGrade);
						vo.setTime(strTime);
						vo.setActor(actor.text());
						vo.setDirector(director.text());
						vo.setGenre(genre.text());
						vo.setRegdate(regdate.text());
						vo.setStory(story.text());
						
						dao.movieInsert(vo);
						
					} catch (Exception ex) {}				
					
				}
			}
			System.out.println("DataBase Insert End....");
		} catch (Exception ex) {}
		return list;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieManager m = new MovieManager();
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