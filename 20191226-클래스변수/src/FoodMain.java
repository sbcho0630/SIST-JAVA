import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


// ī�װ� Ŭ�� (ex. �ѽ�) ==> �ش� ī�װ��� �´� ���� ����Ʈ�� ��µ� ==> ���� ����Ʈ Ŭ�� �� �󼼺��� ȭ������ ������. 
// 1. ī�װ� ��� 2. �� ���� ������ ��
class Category{
	int cateno; //cno:category number
	String poster;
	String title;
	String subTitle;
	String link;
}
class Food{
	int cateno;
	int no;
	String[] poster=new String[4];  // Ŭ���� �ȿ� �迭�� ���� �� �ִ�!
	String title;
	double score;
	String addr;
	String tel;
	String type;
	String price;
	String parking;
	String time;
	String menu;
	int good;
	int soso;
	int bad;
}
public class FoodMain {
	Category[] foodCategoryData() throws Exception {
		Category[] cate=new Category[12];
		Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
		Elements title=doc.select("div.info_inner_wrap span.title");
		Elements poster=doc.select("ul.list-toplist-slider img");
		Elements sub=doc.select("div.info_inner_wrap p.desc");
		Elements link=doc.select("ul.list-toplist-slider a");
		for(int i=0;i<12;i++) {
			Category g=new Category();
			g.cateno=i+1;
			// ���� �������� ��� 2���� 
			// 1. �±� ���� : text(); ex) <span>2020 ���� �α� ���� Top 60</span> 
			// 2. �±� �� : attr();  ex) <a href="��ũ �ּ�"></a> ==> attr("class");
			// 					  ex) <img data-lazy="http://mp-seoul-image.jpg"> ==> attr("data-lazy"); 
			g.title=title.get(i).text(); // <span></span> ������ �ؽ�Ʈ �������� ���ؼ� text(); �������
			g.subTitle=sub.get(i).text();
			g.poster=poster.get(i).attr("data-lazy");
			g.link=link.get(i).attr("href");
			cate[i]=g; // // ������ �ϳ��ε� ������ ���� �� �ִ�. ������� �ּҸ� ���� ���ָ� ��. 
			// ������ �� �迭�� �����ϴ���, �޸𸮿� �����ϴ���... �ϸ� ��...
			// Ŭ������ �������� ���Ƶ� �ٸ� �ּҿ� �����ϰ� �� �� �����Ƿ� ����! 
			
			
		}
		return cate;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
