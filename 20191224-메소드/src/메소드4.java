
public class �޼ҵ�4 {
	static String[] movieList(int page) {
		String[] data=new String[5];
		String[] title= {
				"��λ�",
				"�õ�",
				"���� V ���",
				"�ܿ�ձ� 2",
				"���̺꽺 �ƿ�",
				"�길��: �ؽ�Ʈ ����",
				"���Ӵ�",
				"Ĺ��",
				"�ź����Ʈ ������ �ϴõ����� �� �丣������",
				"6 ����׶���",
				"���ʰ��� �׳�"
		};
		
		int rowSize=5; //�� �������� 5���� ������ �ϰڴ� 
		int j=0; //5���� �����ִ� ���� 
		int pagecnt=(page*rowSize)-rowSize; //������
		// page : ������ �ѹ�. ex) 1page, 2page, ...
		// pagecnt : �������� ������.  
		// 1page => ��ȭ 0~4�� ==> pagecnt=0
		// 2page => ��ȭ 5~9�� ==> pagecnt=5
		// 3page => ��ȭ 10~14�� ==> pagecnt=10 
		
		int k=0;
		//i�� ��ȭ�� ��ȣ 0,1,2,3,4,5,6,7,....
		for(int i=0;i<title.length;i++) {
			if(j<5 && i>=pagecnt) { //j�� 5���� �Ǹ� �����ϰ� ��������  //i�� ���������������� ũ�� ������ �־��. 
				data[k]=title[i];
				k++;
				j++;
			}
		}
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int page=1;
		String[] data=movieList(page);
		for(String s:data) {
			System.out.println(s);
		}

	}

}





