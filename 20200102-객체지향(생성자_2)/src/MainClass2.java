/*
 * 1. �������� �ʱ�ȭ
 * 	1) ������ : ������ ȣ���� ���� �׻� new ����� ==> �θ������� new �ϴϱ� ���� �����ϴ°� �Ұ���. 
 * 	2) setter : �� �����ߴٰ� ���� ���� �� ���� ������ �� �ִ�. 
*/
class Music{
	//Movie m=new Movie(); //���� ����(��Ű��) �ȿ� �����Ƿ�  Movie�� public�� �ƴϾ ������ �� �ִ�.
	private int mno;
	private String title;
	private String singer;
	
	//ĸ��ȭ. �����ʹ� �������� �б⾲�� ����� ������. 
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	//
	public Music(int mno, String title, String singer) {
		super();
		this.mno = mno;
		this.title = title;
		this.singer = singer;
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		Music music = new Music(100, "��鸮�� �ɵ� �ӿ��� �� ��Ǫ���� �������ž�", "�����");
		
		// ����
		/*
		 * music.setMno(100); music.setTitle("��鸮�� �ɵ� �ӿ��� �� ��Ǫ���� �������ž�");
		 * music.setSinger("�����");
		 */
		
		// �б�
		System.out.println(music);
		System.out.println(music.getMno());
		System.out.println(music.getTitle());
		System.out.println(music.getSinger());
		
		// ������ music�� ������ �� �ƴ϶� ���ο� music�� �������....
		music = new Music(101, "��鸮�� ��", "���� �ƺ���"); 
		System.out.println(music); //�ּҰ� �޶������� �� �� �ִ� 
		System.out.println(music.getMno());
		System.out.println(music.getTitle());
		System.out.println(music.getSinger());
		
		// ������ music�� ���� �ٲپ��� : setter �̿�
		music.setMno(102); 
		music.setTitle("��");
		music.setSinger("���ƾƺ�");
		System.out.println(music); //�ּҰ� ������ �� �� �ִ� 
		System.out.println(music.getMno());
		System.out.println(music.getTitle());
		System.out.println(music.getSinger());
		
	}

}
