package com.sist.music;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MusicManager {
	 
	// <Áö´Ï¹ÂÁ÷¿¡¼­ ¼øÀ§°î 200°îÀ» ¹Þ´Â´Ù.>
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
			for(int i=1;i<=4;i++) // Áö´Ï¹ÂÁ÷Àº 4ÆäÀÌÁö±îÁö ÀÖ´Ù. 
			{
				try 
				{
					Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=" + sdf.format(date)
							+ "&hh=12&rtm=Y&pg=" + i).get(); // doc´Â HTML ¼Ò½º¸¦ °¡Á®¿Â´Ù.
					//System.out.println(doc.toString());
					Elements title=doc.select("tr.list td.info a.title");
					Elements singer=doc.select("tr.list td.info a.artist");
					Elements album=doc.select("tr.list td.info a.albumtitle"); 
					Elements poster=doc.select("tr.list td a.cover img");
					//Elements idcrement=doc.select(""); //
					Elements temp=doc.select("tr.list span.rank"); 
					for(int j=0;j<title.size();j++) 
					{
						System.out.println("¼øÀ§:"+rank);
						System.out.println("Á¦¸ñ:"+title.get(j).text());
						System.out.println("°¡¼ö:"+singer.get(j).text());
						System.out.println("¾Ù¹ü:"+album.get(j).text());
						System.out.println("ÀÌ¹ÌÁö:"+poster.get(j).attr("src"));
						//System.out.println("±âÅ¸:"+temp.get(j).text());
						String s=temp.get(j).text(); // 20ÇÏ°­ 
						String ss=s.replaceAll("[^°¡-ÆR]",""); // Á¤±Ô½Ä : ÇÑ±ÛÀÌ ¾Æ´Ï¸é(ÀÌ °æ¿ì¿¡´Â ¼ýÀÚ) Áö¿ö¶ó
						String idcrement=""; //¼ýÀÚ
						String state="";
						if(ss.equals("»ó½Â"))
						{
							idcrement=s.replaceAll("[^0-9]", ""); // Á¤±Ô½Ä : ¼ýÀÚ°¡ ¾Æ´Ï¸é(ÀÌ °æ¿ì¿¡´Â ÇÑ±Û) Áö¿ö¶ó 
							state=ss;
						}
						else if(ss.equals("ÇÏ°­"))
						{
							idcrement=s.replaceAll("[^0-9]", "");
							state=ss;
						}
						else
						{
							idcrement="0";
							state="À¯Áö";
						}
						System.out.println("µîÆø:"+state);
						System.out.println("º¯°æ°ª:"+idcrement);
						//System.out.println("µ¿¿µ»ó Å°:"+youtubeKeyData(title.get(j).text()));
						// 20ÇÏ°­
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
	// À§ÀÇ Áö´Ï¹ÂÁ÷¿¡¼­ °î Á¤º¸ ¹Þ¾Æ¼­, Youtube¿¡¼­ ÀÌ °îµéÀ» Ã£ÀÚ. 
	public String youtubeKeyData(String title)
	{
		String key="";
		try {
			Document doc=Jsoup.connect("https://www.youtube.com/results?search_query="+title).get();
			Pattern p=Pattern.compile("/watch\\?v=[^°¡-ÆR]+"); // Pattern - java.util.regex // $^.?| ¾Õ¿¡´Â \\ºÙ¿©¾ßÇÔ. 
			Matcher m=p.matcher(doc.toString());
			// Ã£±â
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
//			dao.musicInsert(vo); // 200¹ÙÄû µ¹¸é¼­ Áö´Ï¹ÂÁ÷ÀÇ 200°î Ã¤¿î´Ù. 
//		}
		System.out.println("Oracle Save End....");
		//m.youtubeKeyData();
	}

}

/* 
 * <Á¤±Ô½Ä>
 * [0-9] : ¼ýÀÚ ÀüÃ¼
 * [°¡-ÆR] : ÇÑ±Û ÀüÃ¼  
 * [A-Za-z] : ¿µ¹® ÀüÃ¼
 * [A-Z] : ¿µ¾î ´ë¹®ÀÚ ÀüÃ¼
 * [^] : °ýÈ£ ¾ÈÀÇ °ÍÀº ¾Æ´Ô. (NOT) 
 * ==> [^0-9] : ¼ýÀÚ ¾Æ´Ñ °Í 
 *     [^°¡-ÆR] : ÇÑ±Û ¾Æ´Ñ °Í 
 *     [^A-Za-z] : ¿µ¹® ¾Æ´Ñ °Í 
 * ^[] : °ýÈ£ ¾ÈÀÇ °ÍÀ¸·Î ½ÃÀÛÇÔ. 
 * ==> ^[0-9] : ¼ýÀÚ·Î ½ÃÀÛÇÏ´Â °Í
 * 	   ^[°¡-ÆR] : ÇÑ±Û·Î ½ÃÀÛÇÏ´Â °Í 
 *     ^[A-Za-z] : ¿µ¹®À¸·Î ½ÃÀÛÇÏ´Â °Í
*/
