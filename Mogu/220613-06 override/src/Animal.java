public class Animal {
	public void sound() {
		System.out.println("동물은 제각각의 소리를 냅니다.");
	}
}

class Dog extends Animal {
	@Override // annotation
	public void sound() { // 메소드 오버라이드 (method override) : 부모클래스의 해더부분을 그대로 적고 바디부분을 자식클래스에 맞는 행동에 맞게 작성하는것
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	// method override
	public void sound() {
		System.out.println("냥냥");
	}
}
