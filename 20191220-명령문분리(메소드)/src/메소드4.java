// 1~45 �ߺ� ���� ���� �߻� (�ζ�)
/*
 * �迭 ==> 6��
 * 	for(6��){
 * 		while��(�ߺ�Ȯ��){
 * 			�����߻�
 * 			�迭�� ����� �����Ϳ� ������ ������ (����)
 * 		} 
 * 		�迭�� ����
 * 	}
*/
public class �޼ҵ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���� ����
		int[] lotto=new int[6];
		//����
		int su=0;
		//�ߺ��Ǵ��� ��
		boolean bCheck=false;
		
		for(int i=0;i<6;i++) {
			bCheck=true;

			while(bCheck) {
				su=(int)(Math.random()*45)+1;
				bCheck=false;
				for(int j=0;j<i;j++) {
					if(lotto[i]==su) {
						bCheck=true;
						break;
					}
				}
			}
			//�迭�� ����
			lotto[i]=su;
		}
		
		
		//���
		for(int i:lotto) {
			System.out.print(i+" ");
		}

	}

}
