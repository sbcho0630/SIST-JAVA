/*
*/
public class �������ǹ�_����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� : �����߻�. 
		// ���� : ��ǻ�Ϳ��� ������ ���� ����.
		
		int score=(int)(Math.random()*101);
		//0.0~0.99 *101 // 0.00 ~ 99.... --> int (0.0 ~ 99.xx) --> 0~100
		System.out.println("score="+score);
		
		//90�� �̻� A, 80�� �̻�  B, 70�� �̻� C, 60�� �̻� D, 60�� ���� F
		if(score>=90) 
			System.out.println("A");
		else if(score>=80) 
			System.out.println("B");
		else if(score>=70) 
			System.out.println("C");
		else if(score>=60) 
			System.out.println("D");
		else  
			System.out.println("F");

	}

}
