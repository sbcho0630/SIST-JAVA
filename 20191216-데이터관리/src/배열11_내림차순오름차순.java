/*
 * 5���� ���� �߻�. ==> �迭. ������������ ������ ��. 
*/
public class �迭11_���������������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5���� �����߻� 
		int[] arr=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		//������������ ����
		for(int i=0;i<4;i++) { //i<4�� ���� : 4���� ����! �ֳĸ� ���������� �� ���Ƶ� ��. arr[4]�� �� �� �ص� �̹� ���������ϱ�. 
			//arr[0]�������� �����غ���, �� �ڿ� �ִ� ���� ���� ���ϸ� �������� ������ �� ����. 
			for(int j=i+1;j<5;j++) {
				//�տ� �ִ� ���� �� ������ ���� �߸��ȰŴϱ� �ٲ�� 
				if(arr[i]<arr[j]) {
					//��ȯ�� �� �ٷ� �� �� ��ȯ �ȵǴϱ� temp���ٰ� �ϳ� �����ϸ� ���� �� �ٲ� �� �ִ�.
					//temp���ٰ� arr[i]�� �����صΰ�, arr[i]�� arr[j]���� ����. �� �� arr[j]���� �����س��� ���� arr[i]���� ����. 
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr) {
			System.out.printf("%d\t",i);
		}
		System.out.println();
		
		//������������ ����
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					//��ȯ�� �� �ٷ� �� �� ��ȯ �ȵǴϱ� temp���ٰ� �ϳ� �����ϸ� ���� �� �ٲ� �� �ִ�.  
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr) {
			System.out.printf("%d\t",i);
		}
	}

}
