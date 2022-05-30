// 학생

// 이름
// 국어 점수
// 영어 점수
// 수학 점수

// 생성자
// getter/setter

// 자기 평균 점수를 알려줄 수 있음.

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student(String name) {
		this(name, 0, 0, 0);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	void print() {
		System.out.printf("이름: %s, 국어점수: %d, 영어점수: %d, 수학점수: %d\n", name, kor, eng, math);
		System.out.println("평균은: " + (kor + eng + math) / 3 + "점");
	}
}

// class aver(String x) {
	// private int aver;
	
	// public void aver(String x) {
		// aver = (getEng + getKor + getMath) / 3;
		// return = aver;
	// }
// }