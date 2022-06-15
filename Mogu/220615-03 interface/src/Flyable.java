// 추상적인 설명을 하기위한 통로 라고 생각하면됨. 인터페이스임을 구분하기위해 첫글자에 I를 붙이기도한다.
public interface Flyable {
//	public abstract void fly();  앞에는 생략해도 기본적으로 퍼블릭 값이 들어간다.
	void fly();
	
//	public void print() {
//		System.out.println("dkdkdk");
//	}  
	// 인터페이스는 추상적인 메소드만 가질수있다.
	
}

class Animal {}
class Bird extends Animal{}

class Eagle extends Bird implements Flyable { // 독수리는 날수 있는 새다
	@Override
	public void fly() {
		System.out.println("독수리가 푸드득 푸드득");
	}
	
}  // 독수리는 날수 있는 새다

class penguin extends Bird{}

class FlyingFish extends Animal implements Flyable {
	@Override
	public void fly() {
		System.out.println("날치가 물 위로 남");
	}
	
}

class Plane implements Flyable {
	@Override
	public void fly() {
		System.out.println("비행기가 남");
	}
	
}