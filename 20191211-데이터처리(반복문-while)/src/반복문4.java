
public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////100���� 999���� 7�� ��� ����, 4�� ����� �ƴ� ���� ���� 
		
		int multiple7=0,multiple4=0;
		
		int i=100; //��������
		while(i<=999) {
			if(i%7==0)
				multiple7+=1;
			if(i%4!=0)
				multiple4+=1;
			i++;
		}
		System.out.println("100~999 �� 7�� ����� "+multiple7+"�� �Դϴ�.");
		System.out.println("100~999 �� 4�� ����� �ƴ� ���Ǵ� "+multiple4+"�� �Դϴ�.");


	}

}
