package com.sist.music;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MusicManager {
	 
	// <���Ϲ������� ������ 200���� �޴´�.>
	public ArrayList<MusicVO> musicAllData()
	{
		ArrayList<MusicVO> list = new ArrayList<MusicVO>();
		try {
			/*
			private String title;
			private String singer;
			private String album;
			private String poster;
			private int idcrement;
			private String state;
			private String key;
			*/
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			System.out.println(sdf.format(date));
			int rank=1; 
			
			MusicDAO dao = new MusicDAO();			
			for(int i=1;i<=4;i++) // ���Ϲ����� 4���������� �ִ�. 
			{
				try 
				{
					Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=" + sdf.format(date)
							+ "&hh=12&rtm=Y&pg=" + i).get(); // doc�� HTML �ҽ��� �����´�.
					//System.out.println(doc.toString());
					Elements title=doc.select("tr.list td.info a.title");
					Elements singer=doc.select("tr.list td.info a.artist");
					Elements album=doc.select("tr.list td.info a.albumtitle"); 
					Elements poster=doc.select("tr.list td a.cover img");
					//Elements idcrement=doc.select(""); //
					Elements temp=doc.select("tr.list span.rank"); 
					for(int j=0;j<title.size();j++) 
					{
						System.out.println("����:"+rank);
						System.out.println("����:"+title.get(j).text());
						System.out.println("����:"+singer.get(j).text());
						System.out.println("�ٹ�:"+album.get(j).text());
						System.out.println("�̹���:"+poster.get(j).attr("src"));
						//System.out.println("��Ÿ:"+temp.get(j).text());
						String s=temp.get(j).text(); // 20�ϰ� 
						String ss=s.replaceAll("[^��-�R]",""); // ���Խ� : �ѱ��� �ƴϸ�(�� ��쿡�� ����) ������
						String idcrement=""; //����
						String state="";
						if(ss.equals("���"))
						{
							idcrement=s.replaceAll("[^0-9]", ""); // ���Խ� : ���ڰ� �ƴϸ�(�� ��쿡�� �ѱ�) ������ 
							state=ss;
						}
						else if(ss.equals("�ϰ�"))
						{
							idcrement=s.replaceAll("[^0-9]", "");
							state=ss;
						}
						else
						{
							idcrement="0";
							state="����";
						}
						System.out.println("����:"+state);
						System.out.println("���氪:"+idcrement);
						//System.out.println("������ Ű:"+youtubeKeyData(title.get(j).text()));
						// 20�ϰ�
						System.out.println("========================");
						MusicVO vo = new MusicVO();
						vo.setRank(rank);
						vo.setTitle(title.get(j).text());
						vo.setSinger(singer.get(j).text());
						vo.setAlbum(album.get(j).text());
						vo.setPoster(poster.get(j).attr("src"));
						vo.setState(state);
						vo.setIdcrement(Integer.parseInt(idcrement));
						vo.setKey(youtubeKeyData(title.get(j).text()));
						list.add(vo);		
						
						dao.musicInsert(vo);
						rank++;
					}
					//Elements state=doc.select("tr.list td.number span.rank span.rank span span.hide");
					Elements key=doc.select("tr.list td.info a.albumtitle"); 
				} catch (Exception ex) {}
			}  
		} catch (Exception ex) {}
		return list;
	}
	
	// <Youtube> 
	// ���� ���Ϲ������� �� ���� �޾Ƽ�, Youtube���� �� ����� ã��. 
	public String youtubeKeyData(String title)
	{
		String key="";
		try {
			Document doc=Jsoup.connect("https://www.youtube.com/results?search_query="+title).get();
			Pattern p=Pattern.compile("/watch\\?v=[^��-�R]+"); // Pattern - java.util.regex // $^.?| �տ��� \\�ٿ�����. 
			Matcher m=p.matcher(doc.toString());
			// ã��
			while(m.find())
			{
				String temp=m.group();
				key=temp.substring(temp.indexOf("=")+1,temp.indexOf("\""));
				break;
				//System.out.println(temp);
			}
		} catch (Exception ex) {}
		return key;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicManager m = new MusicManager();
		MusicDAO dao = new MusicDAO();
		ArrayList<MusicVO> list=m.musicAllData();
//		for(MusicVO vo:list)
//		{
//			dao.musicInsert(vo); // 200���� ���鼭 ���Ϲ����� 200�� ä���. 
//		}
		System.out.println("Oracle Save End....");
		//m.youtubeKeyData();
	}

}

/* 
 * <���Խ�>
 * [0-9] : ���� ��ü
 * [��-�R] : �ѱ� ��ü  
 * [A-Za-z] : ���� ��ü
 * [A-Z] : ���� �빮�� ��ü
 * [^] : ��ȣ ���� ���� �ƴ�. (NOT) 
 * ==> [^0-9] : ���� �ƴ� �� 
 *     [^��-�R] : �ѱ� �ƴ� �� 
 *     [^A-Za-z] : ���� �ƴ� �� 
 * ^[] : ��ȣ ���� ������ ������. 
 * ==> ^[0-9] : ���ڷ� �����ϴ� ��
 * 	   ^[��-�R] : �ѱ۷� �����ϴ� �� 
 *     ^[A-Za-z] : �������� �����ϴ� ��
*/
