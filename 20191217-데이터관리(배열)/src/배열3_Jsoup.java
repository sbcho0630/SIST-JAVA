import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/*
 * 	<div class="wrap_movie">
		<div class="info_tit">
			<em class="ico_movie ico_allrating">��ü������</em>
			<a href="/moviedb/main?movieId=117866" class="name_movie #title">���ʰ��� �׳�</a>
		</div>
	</div>
*/
public class �迭3_Jsoup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// �迭
		Movie[] m=new Movie[16];
		Document doc=Jsoup.connect("https://movie.daum.net/premovie/released").get();
		//������ url1 ����
		Elements link=doc.select("div.info_tit a.name_movie");
		
		int k=1;
		
		for(int i=0; i<link.size();i++) {
			try {
				//url1 ���
				//System.out.println(link.get(i).attr("href"));
				//url1 �����ؼ� url2 ����
				String link_data="https://movie.daum.net"+link.get(i).attr("href");
				//url2 ���
				//System.out.println(link_data);
			 	
				//�� ������������ ���� �������� 
				//�������� url �־��� 
				Document doc2=Jsoup.connect(link_data).get();
				//�� ������������ ������ ���̵� ���� 
				Element title_kr=doc2.selectFirst("div.subject_movie strong.tit_movie");
				Element title_en=doc2.selectFirst("div.subject_movie span.txt_origin");
				Element score=doc2.selectFirst("a.raking_grade em.emph_grade");
				Element genre=doc2.select("dl.list_movie dd.txt_main").get(0);
				Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1);
				Element grade=doc2.select("dl.list_movie dd").get(3);
				Element director=doc2.select("dl.list_movie dd").get(4);
				Element actor=doc2.select("dl.list_movie dd").get(5);
				/*
				 * //�� �� �����Դ��� ��� System.out.println("count:"+(k)); //������������ ������ ���̵� ���
				 * System.out.println(title_kr.text()); System.out.println(title_en.text());
				 * System.out.println(score.text()); System.out.println(genre.text());
				 * System.out.println(regdate.text()); System.out.println(grade.text());
				 * System.out.println(director.text()); System.out.println(actor.text());
				 * System.out.println("=============================");
				 */
				//Ŭ���� ����
				m[i]=new Movie();
				m[i].title_kr=title_kr.text();
				m[i].title_en=title_en.text();
				m[i].score=Double.parseDouble(score.text());
				m[i].grade=grade.text();
				m[i].genre=genre.text();
				m[i].regdate=regdate.text();
				m[i].director=director.text();
				m[i].actor=actor.text();
				//�� �� �����Դ��� ���
				k++;
			}catch(Exception ex) {k--;}
			//���� �� �������� 20���ε�, 4���� ���� ���(ex. �ִϸ��̼��̶� �ֿ��� ����) ������ �� ���� --> �� 16���� ������ �� �ִ���. 
			//try catch �Ἥ ���� ���� �ֵ��� �������� �ʾ���. 	
		}
		/*
		 * Scanner scan=new Scanner(System.in); System.out.println("��ȭ��ȣ ����(0~15):");
		 * int index=scan.nextInt(); System.out.println("========= ��� =========");
		 * System.out.println("��ȭ��:"+m[index].title_kr);
		 * System.out.println("����:"+m[index].director);
		 * System.out.println("�⿬:"+m[index].actor);
		 * System.out.println("������:"+m[index].regdate);
		 * System.out.println("�帣:"+m[index].genre);
		 */
		
		//ex1. ������ ���� ���� ��ȭ�� ����϶�.
		
		double max=0.0;
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) { //������ �����ϸ� 16���� �ƴ϶� �� ���� 14��?13��?�� ����. ������ �𸣳� �� �� �� �־ �׷�. �׷��Ƿ� null�� ��������.
				if(m[i].score>max) {
					max=m[i].score;
				}
			}
		}
		System.out.println(max);
		
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) { 
				if(m[i].score==max) {
					System.out.println(m[i].title_kr); //������ 9.5(max)�� �ֵ��� ������ ���� �� ����. 
				}
			}
		}

		
	}

}
