public class Student {
	private String name;
	private int num;
	private String part;
	private String grade;
	private double grades;
	
	public Student(String name, int num, String part, String grade, double grades) {
		this.name = name;
		this.num = num;
		this.part = part;
		this.grade = grade;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getGrades() {
		return grades;
	}

	public void setGrades(double grades) {
		this.grades = grades;
	}
	
	public void testPrint() {
		System.out.println("학생이름 : " + name);
		System.out.println("학번 : " + num);
		System.out.println("학과 : " + part);
		System.out.println("학년 : " + grade);
		System.out.println("학점 : " + grades);
	}
	
	
}
