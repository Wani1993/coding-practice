// 강아지 Dog 클래스
// name : 이름
// breed : 종
// age : 나이
public class Dog {
	private String name;
	private String breed;
	private int age;

    // 강아지 3개의 모든 필드를 전달받아 초기화 할 수있는 생성자
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		//필드값이랑 파라미터 이름은 같아도 되는데 초기화하는 부분이 필드값이랑 이름이 같으면 안된다.
		//고로, 초기화 하는 부분앞에 this.를 붙여줌으로써 필드값이랑 구분짓게된다.
	}
	
	// 강아지 이름, 종을(2개만 전달받은 값) 초기화하고
    // 나이는 1살로 초기화 할 수 있는 생성자
	public Dog(String n, String b) {
		this(n, b, 1);
	}
	
	// 모든 필드를 private 접근 제한자로 정보은닉(캡슐화) 하고
    // 각 필드의 public한 getter/setter를 작성해보세요.
	public String getName() {
		return name;
	}
	
	public boolean setName(String n) {
		if (n != null) {
		    name = n;
			return true;
		}
		return false;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String b) {
		breed = b;
	}
	
	public int getAge() {
	    return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(breed);
		System.out.println(age);
	}
}