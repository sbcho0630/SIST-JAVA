import java.util.Scanner;

class StudentVO2{
	String name;
	int kor;
	int eng;
	int math;
	
}
public class StudentMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentVO2[] std=new StudentVO2[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			StudentVO2 vo=new StudentVO2();
			System.out.println(vo);
			System.out.println("�̸�:");
			vo.name=scan.next();
			
			System.out.println("����:");
			vo.kor=scan.nextInt();
			
			System.out.println("����:");
			vo.eng=scan.nextInt();
			
			System.out.println("����:");
			vo.math=scan.nextInt();
			
			std[i]=vo; // ������ �ϳ��ε� ������ ���� �� �ִ�. ������� �ּҸ� ���� ���ָ� ��. 
			// ������ �� �迭�� �����ϴ���, �޸𸮿� �����ϴ���... �ϸ� ��...
			
		}
		 for(StudentVO2 s:std) {
			 System.out.println(s.name+" "+s.kor+" "+s.eng+" "+s.math);
		 }
	}

}
