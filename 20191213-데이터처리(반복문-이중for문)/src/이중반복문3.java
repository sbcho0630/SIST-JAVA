/*
 * 	// ����ó����ɻ�, �ڵ��׽�Ʈ ==> 2for
 * 
 * 1. break : �ݺ� �ߴ�
 * ex) 
 * 	for(int i=1;i<=10;i++){
 * 		if(i==5)
 * 			break;
 * 		System.out.print(i);  // ���:1234 // ���� break�� �־ 5�� ���X. 
 * 	}
 * 
 * 2. continue : Ư�� �κ��� ������ �� 
 *  ex) 
 *   	for(int i=1;i<=10;i++){
 * 		if(i==5)
 * 			continue;
 * 		System.out.print(i);  // ���:1234678910 // i==5���� continue�� ������ ������(i++)�� �ö󰡼� 5������ sysout �� �� ��ġ�� ����. 
 * 	}
 * 
 *  break
 *  continue
 *  ======== ������ �ݺ����� ����
 *  		 break ==> for, do~while, while, switch~case 
 *  		 continue ==> for, do~while, while
 *  		  �� ����) return ==> � ����̵� ����� �����ϴ�.   
 *  
*/
public class ���߹ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++){
			if(i==5)
				break;				  //break : �ݺ� �ߴ�
				System.out.print(i);  // ���:1234 // ���� break�� �־ 5�� ���X. 
		}
		System.out.println();
		
		for(int i=1;i<=10;i++){
			if(i==5||i==7)
				continue; 			  //continue: Ư�� �κ��� ������ �� 
				System.out.print(i);  // ���:123468910 // 5�� 7������ continue������ sop����X�ϰ� ���ǽ����� ���ư��Ƿ� 5,7�� ���X
		}
		System.out.println();
		
		for(int i=1;i<=10;i++){
			if(i%2!=0)
				continue; 			  //continue: Ư�� �κ��� ������ �� 
				System.out.print(i);  // �����: ¦���� ���� 
		}
		System.out.println();
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==2)
					break;		// �� break�� �Ҽӹ����� 2�� for����. ��, j=1�� �������� i=1,2,3 �� ���´�.  ==> break�� �Ҽ� ���常 ������ �� �ִ�.�ڡ�
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println();
		
		for(int i=1;i<=3;i++) {
			if(i==2)	 
				break;			// �� break�� �Ҽӹ����� 1�� for����. ��,  i=1�� ������ j=1,2,3 �� ���´�. ==> break�� �Ҽ� ���常 ������ �� �ִ�. �ڡ�
			for(int j=1;j<=3;j++) {
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println();		
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==2)
					continue;		// j=2�� ������. //j==2�϶� continue�Ʒ� �� ����X. ���� ���������� �ö�. ==> j=2�ϋ� ���X //===>�Ҽӹ����� 2�� for���� ������   
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println();
		
		for(int i=1;i<=3;i++) {
			if(i==2) 
				continue;			//i=2�� ������.  //i==2�϶� continue�Ʒ� �� ����X. ���� ���������� �ö�. ==> i=2�϶� ���X //===>�Ҽӹ����� 1�� for���� ������  
				for(int j=1;j<=3;j++) 
					System.out.println("i="+i+", j="+j);
		}
		System.out.println();
		
		
	}

}





