/*
 * 
 * 	*
 * 	**
 * 	***
 *  ****
 *  ***
 *  **
 *  *
 *  for������ �ڵ�?
 * 
*/
public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; 
		int b=a++; // b=10, a=11 
		int c=++a; // a=12, c=12
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);	
		
		char ch1='A';
		System.out.println(ch1++); // ����� �� ������Ŵ --> A��� //�̰� int�� �ƴ϶� char�� ��µ�!!
		char ch2='A';
		System.out.println(++ch2); // ������Ų �� ��� --> B���  

		int i=10;
		int j=i++ + i++ + ++i + ++i + i++ + i++ + i-- + --i;
		//  j= 10 + 11  +  13 +  14 + 14  + 15  + 16  +  14
		//  i    11    12 13    14      15    16    15  14
		System.out.println("j="+j);
		
		int x=10;
		int y=9;
		boolean bCheck=(x<y)&&(++y==x); 
		// false&& --> bCheck=false. �ڿ��� ���� �̹� false �̹Ƿ� �������� �������X --> y�� �״�� 9.�� 
		System.out.println(bCheck); 
		System.out.println("x="+x); //10 
		System.out.println("y="+y); //9  
		
		//���������� --> �ݺ����� ���� ����. ex) for (i=0;i<4;i++){}
		
		// ! : ����������. not. ������� �׻� boolean(true/false)�� --> ���ǹ��� ���� ����. 
		
	}

}




