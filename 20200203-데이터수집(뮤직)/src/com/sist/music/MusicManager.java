package com.sist.music;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MusicManager {
	 
	// <지니뮤직에서 순위곡 200곡을 받는다.>
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
			for(int i=1;i<=4;i++) // 지니뮤직은 4페이지까지 있다. 
			{
				try 
				{
					Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=" + sdf.format(date)
							+ "&hh=12&rtm=Y&pg=" + i).get(); // doc는 HTML 소스를 가져온다.
					//System.out.println(doc.toString());
					Elements title=doc.select("tr.list td.info a.title");
					Elements singer=doc.select("tr.list td.info a.artist");
					Elements album=doc.select("tr.list td.info a.albumtitle"); 
					Elements poster=doc.select("tr.list td a.cover img");
					//Elements idcrement=doc.select(""); //
					Elements temp=doc.select("tr.list span.rank"); 
					for(int j=0;j<title.size();j++) 
					{
						System.out.println("순위:"+rank);
						System.out.println("제목:"+title.get(j).text());
						System.out.println("가수:"+singer.get(j).text());
						System.out.println("앨범:"+album.get(j).text());
						System.out.println("이미지:"+poster.get(j).attr("src"));
						//System.out.println("기타:"+temp.get(j).text());
						String s=temp.get(j).text(); // 20하강 
						String ss=s.replaceAll("[^가-힣]",""); // 정규식 : 한글이 아니면(이 경우에는 숫자) 지워라
						String idcrement=""; //숫자
						String state="";
						if(ss.equals("상승"))
						{
							idcrement=s.replaceAll("[^0-9]", ""); // 정규식 : 숫자가 아니면(이 경우에는 한글) 지워라 
							state=ss;
						}
						else if(ss.equals("하강"))
						{
							idcrement=s.replaceAll("[^0-9]", "");
							state=ss;
						}
						else
						{
							idcrement="0";
							state="유지";
						}
						System.out.println("등폭:"+state);
						System.out.println("변경값:"+idcrement);
						//System.out.println("동영상 키:"+youtubeKeyData(title.get(j).text()));
						// 20하강
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
	// 위의 지니뮤직에서 곡 정보 받아서, Youtube에서 이 곡들을 찾자. 
	public String youtubeKeyData(String title)
	{
		String key="";
		try {
			Document doc=Jsoup.connect("https://www.youtube.com/results?search_query="+title).get();
			Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+"); // Pattern - java.util.regex // $^.?| 앞에는 \\붙여야함. 
			Matcher m=p.matcher(doc.toString());
			// 찾기
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
//			dao.musicInsert(vo); // 200바퀴 돌면서 지니뮤직의 200곡 채운다. 
//		}
		System.out.println("Oracle Save End....");
		//m.youtubeKeyData();
	}

}

/* 
 * <정규식>
 * [0-9] : 숫자 전체
 * [가-힣] : 한글 전체  
 * [A-Za-z] : 영문 전체
 * [A-Z] : 영어 대문자 전체
 * [^] : 괄호 안의 것은 아님. (NOT) 
 * ==> [^0-9] : 숫자 아닌 것 
 *     [^가-힣] : 한글 아닌 것 
 *     [^A-Za-z] : 영문 아닌 것 
 * ^[] : 괄호 안의 것으로 시작함. 
 * ==> ^[0-9] : 숫자로 시작하는 것
 * 	   ^[가-힣] : 한글로 시작하는 것 
 *     ^[A-Za-z] : 영문으로 시작하는 것
*/
