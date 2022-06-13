
public class Person {
	protected String name;
	protected int age; // protected 는 자식들만 찾아올수있도록 하는 접근제한자
	
	// 부모의 생성자 (부모의 필드를 초기화할수있는것)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}
}
