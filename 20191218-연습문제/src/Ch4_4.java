
public class Ch4_4 {

	public static void main(String[] args) {
		//4-4
		//1+(-2)+3+(-4)+... ==> �� ������ ���ؾ� ���� 100 �̻�?
		//(���1) - �� ���. while ������ Ǯ����. 
		int i=1;
		int sum=0;
		while(sum<100) {
			if(i%2!=0) {
				sum+=i;
			}
			else {
				sum-=i;
			}
			i++;
		}
		System.out.println((i-1)+"��° ������, ������"+sum);
		//i�� sum�� ���ϰų� �� �� i ������Ų �Ŀ� sum<100 �˻��ϹǷ�, i���� 1 ���� ���� ��. 
		//i=199�϶� sum�� +199 �ǰ� i++�Ǽ� sum>=100 ��. 
		
		//(���2) 
		int total=0;
		for(int k=1;total<100;k++) {
			if(k%2!=0) {
				total+=k;
			}
			else {
				total-=k;
			}
			if(total>=100) {
				System.out.println(k+"��° ������, ������ "+total);
				break;
			}
		}
	
				 

	}
}
