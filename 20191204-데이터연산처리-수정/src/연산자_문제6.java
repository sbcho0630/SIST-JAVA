
public class ������_����6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������
		int numOfApples=123;
		
		//�ٱ��� ũ��
		int sizeOfBucket=10;
		
		//��� ����� ��µ� �ʿ��� �ٱ����� ��
		int numOfBucket;
		
		//���� �������� 0�̸� �� �������� ��. 
		//���� �������� 0�� �ƴ϶�� +1 �ؾ�. 
		if (numOfApples%sizeOfBucket==0) {
			numOfBucket = numOfApples/sizeOfBucket;
		}
		else {
			numOfBucket = numOfApples/sizeOfBucket + 1;
		}
						
		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);
		

	}

}
