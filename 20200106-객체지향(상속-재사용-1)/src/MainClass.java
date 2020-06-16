class 도형{
	public void draw() {
		System.out.println("도형 그린다");
	}
	// 추가 
}
class 원 extends 도형{
	public void draw() {
		System.out.println("원을 그린다");
	}
	// 추가  
}
class 삼각형 extends 도형{
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
}
class 네모 extends 도형{
	public void draw() {
		System.out.println("네모를 그린다");
	}
}
// 라이브러리를 상속 => 변경해서 사용 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		도형 m = new 네모();
		m.draw();
		
		m = new 삼각형();
		m.draw();
		
		m = new 원();
		m.draw();
		
		m = new 도형();
		m.draw();
	}

}
