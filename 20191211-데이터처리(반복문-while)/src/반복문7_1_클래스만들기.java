import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.Scanner;
public class �ݺ���7_1_Ŭ��������� {

	public static void main(String[] args) throws Exception {
		
		//�˻��� �Է¹ޱ�
		//Scanner scan=new Scanner(System.in);
		//System.out.println("�˻��� �Է� (���):");
		//String fd=scan.next();
		
		
		int k=1;
		while(k<=4) {
			// ���Ϲ������� Top50 ��� ��������
			//Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			//���Ϲ������� TOP200 �������� (1~50,51~100,101~150,151~200 - �� 4������ �ܾ��) 
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+k).get();
			//�ҽ���ü�ܾ����
			//System.out.println(doc);
			Elements title=doc.select("td.info a.title");
			Elements singer=doc.select("td.info a.artist");
			int i=0;
			while(i<title.size()) {
				//����� ������ ����
				String data=title.get(i).text();
				//���� �˻�� ��ġ�ϸ� ���
				//if(data.contains(fd)) {
					System.out.println(data);
					System.out.println("����:"+singer.get(i).text());
					System.out.println("============================");
				//}
				i++;
			}
			k++;
		}
	}
	
	//music �޼ҵ� �����
	public static void music() throws Exception {
		int k=1;
		while(k<=4) {
			// ���Ϲ������� Top50 ��� ��������
			//Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			//���Ϲ������� TOP200 �������� (1~50,51~100,101~150,151~200 - �� 4������ �ܾ��) 
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+k).get();
			//�ҽ���ü�ܾ����
			//System.out.println(doc);
			Elements title=doc.select("td.info a.title");
			Elements singer=doc.select("td.info a.artist");
			int i=0;
			while(i<title.size()) {
				//����� ������ ����
				String data=title.get(i).text();
				//���� �˻�� ��ġ�ϸ� ���
				//if(data.contains(fd)) {
					System.out.println(data);
					System.out.println("����:"+singer.get(i).text());
					System.out.println("============================");
				//}
				i++;
			}
			k++;
		}
	}

}
