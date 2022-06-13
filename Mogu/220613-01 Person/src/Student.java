
public class Student extends Person {
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age);  // 생성자의 첫 문장이어야만 함
		this.score = score;
	}

	public void setAge() {
		age = 10;
	}
	
	public int getScore() {
		return score;
	}
}
