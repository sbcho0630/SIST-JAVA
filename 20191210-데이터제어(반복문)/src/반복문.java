/*
 * �ݺ��� 
 * 	=============== ������ : ���� �� �� ���� ����.  
 * 	= for : �ݺ�Ƚ���� �����Ǿ� ���� �� 
 *  = while : �ݺ�Ƚ���� �����Ǿ� ���� ���� �� 
 *    �ʱⰪ
 *    while(���ǹ�){
 *  	���๮��
 *  	������
 *    }
 *  =============== ������ : �� �� �̻� �ݵ�� ���� 
 *  = do~while 
 *    �ʱⰪ
 *    do{
 *    	���๮��
 *    	������
 *    }while(���ǹ�)
 *  ===============
*/
public class �ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String[] s= {"a","b","c","d","e","f","g","h","i","k"}; int[] ss=
		 * {3,4,6,7,8,9,10,11,4,5}; int i=0; while(i<=10) {
		 * System.out.println(s[i]+"-"+ss[i]); i++; }
		 */
		
		int i=1; // 1
		int sum=0; 
		while(i<=100) { // 2
			sum+=i; // 3
			i++; //  4
		}
		
		System.out.println("1~100������ ��:"+sum);
		/*
		 * ������� : 1��2��3��4
		 *          ��2��3��4
		 *          ===
		 *          2�� false�� �Ǹ� ����
		 */		
		
		//1~100 ����, 3/5/7�� ����� ���� ���϶�
		int j=1;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		while(j<=100) {
			if(j%3==0) 
				sum1+=i;
			if(j%5==0) 
				sum2+=i;
			if(j%7==0) 
				sum3+=i;
			j++;
		}
		System.out.println("3�� ����� ��:"+sum1);
		System.out.println("5�� ����� ��:"+sum2);
		System.out.println("7�� ����� ��:"+sum3);
		
		//while�� �Ἥ ���ĺ� �빮�ڸ� ����϶�.
		
		char alphabet='A';
		while(alphabet<='Z') {
			System.out.print(alphabet+" ");
			alphabet++;
		}
		
		
		
		
	}

}







