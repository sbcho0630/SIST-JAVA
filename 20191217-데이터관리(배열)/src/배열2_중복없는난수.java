/*
 * �ߺ��� ���� ���� �����  �ڡڡ�
 * => �迭 
 * ===========
 * =====
 * �����߻� ==> �� �迭 �ȿ� ���� ���ڰ� ������ ����  
 * ===== 
*/
public class �迭2_�ߺ����³��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] com=new int[9];
		int su=0; //�����߻� �� ����
		boolean bCheck=false; //�ߺ����θ� Ȯ�� 
		
		for(int i=0;i<com.length;i++) {
			bCheck=true;
			//========
			while(bCheck) { //bCheck=true�� while���� ��� ����� 
				//�����߻�
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				//�ߺ����� Ȯ��
				for(int j=0;j<i;j++) { 
					if(com[j]==su) { 
						bCheck=true; 
						break;
					}
				}
			}
			//========
			com[i]=su;
		}
		
		//i=0�϶� 1) su�� ���� �����, 2) bCheck�� false�� ��, 3) for�� ����X. --> 4) while�� �������� --> 5) com[0]�� su(����)�� ������. 
		//i=1�϶� 1) su�� �����߻���, 2) bCheck�� false�� ��, 
		//		3-1) com[0]�� ���� �̹��� ���� su�� ���� ���ٸ� --> bCheck�� true�� ����� for�� �������� --> while�� �ٽ� ���Ƽ� su�� ������ �ٽ� ����. 
		//		3-2) com[0]�� ���� �̹��� ���� su�� ���� ���� ������ --> for�� ���������� �ö� --> ����X --> bCheck=false�ϱ� while�� ��� --> com[1]�� su(����)�� ������. 
		
		for(int i:com) {
			System.out.println(i);
		}
		
				
		
	}

}
