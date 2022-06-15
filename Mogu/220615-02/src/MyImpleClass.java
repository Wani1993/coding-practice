
public final class MyImpleClass extends MySubClass {
	
	

//	@Override
//	public void myMethod() {
//		System.out.println("새롭게 재정의를 하였습니다.");
//	}  // 부모 클래스에서 파이널 메소드로 지정하게 되면 자식 클래스에서 오버라이드를 할수가없다.

	@Override
	public void myMethod2() {
		System.out.println("마이 메소드2 오버라이드 구현");
	}
	
	public static void main(String[] args) {
		Myclass m = new MyImpleClass();
		m.myMethod();
		
		MySubClass sub = (MySubClass) m;
		
		sub.myMethod2();
		
	}
	
}
