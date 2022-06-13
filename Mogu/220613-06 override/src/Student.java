
public class Student extends Human {
	private String major;

	
	
	public Student(String name, int age, String profession, String major) {
		super(name, age, profession);
		this.major = major;
	}
	
	@Override
	public String getProfession() {
		return "학생";
	}

	@Override
	public String toString() {
		return super.toString()+ " " + "전공: " + major; // super 라는 명칭을 사용함으로서 부모의 메소드를 호출할수있다.
		// "이름 : " + getName() + ", " + "나이: " + getAge + "전공: " + major; 로도 사용이 가능하다.
		// 또한 부모 클래스의 필드값을 protected 로 바꾸면 "이름 : " + name + ", " + "나이: " + age + "전공: " + major; 로도 사용가능하다.
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	

	
	
	
	

	
	
	

}
