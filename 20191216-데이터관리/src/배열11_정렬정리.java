import java.util.Arrays;

public class �迭11_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���� 
		int[] arr=new int[5];
		//�ʱⰪ 
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("���� ��:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();		
		
		System.out.println("���� �� (��������):");
		//�������� �������� ���� (ASC) 
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("���� �� (��������):");
		//�������� �������� ���� (DESC) 
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
		// Arrays.sort(arr); <=== �̷��� �ѹ濡�� �������� ���ĵ�. 
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
