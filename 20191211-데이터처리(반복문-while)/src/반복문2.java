
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ex1) A���� Z����, �� �ٿ� 5���� ������ while������ ����Ͻÿ�. 
		// ���1 - ���� Ǭ ���
		char c='A';
		while(c<=90) {
			System.out.printf("%c\t",c);
			if(c%5==4)
				System.out.println();
			c++;
		}
		System.out.printf("\n\n");
		
		//���2 - �������� Ǭ ���
		int i=1;
		char c2='A';
		while(i<=26) {
			System.out.print(c2++ +"\t");
			if(i%5==0)
				System.out.println();
			i++;
		}
		System.out.printf("\n\n");	
		
		// ex2) A~Z, a~z, �� ���� �빮��, �� ���� �ҹ��� �����ư��� ����Ͻÿ�.
		i=1;
		char c_big='A';
		char c_small='a';
		while(i<=26) {
			System.out.printf("%c\t",c_big);
			if(i%5==0) {
				System.out.println();
				for(int j=i-4;j<=i;j++) {
					System.out.printf("%c\t",c_small);
					c_small+=1;
					if(j%5==0){
						System.out.println();
					}
				}
			}
			i++;
			c_big+=1;
		}
		System.out.printf("\n\n");
		
		// ex3) ABCDE/fghij/KLMNO/... �̷������� ����Ͻÿ�. �ڡڡ�
		i=1;
		c='A';
		boolean bCheck=true;
		while(i<=26) {
			//true�� ����
			if(bCheck==true)
				System.out.print(c+"\t");
			else 
				System.out.print((char)(c+32)+"\t"); //�ҹ��ڷ�
			//5�� ������� true/false ���� �ٲ۴�.
			if(i%5==0) {
				System.out.println();
				bCheck=!bCheck;
			}
			i++;
			c++;
		}

	}

}










