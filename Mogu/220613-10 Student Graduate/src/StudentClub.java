public class StudentClub extends Student {
	private String club;

	public StudentClub(String name, int num, String part, String grade, double grades, String club) {
		super(name, num, part, grade, grades);
		this.club = club;
	}
	
	public void testPrint() {
		System.out.println("학생이름 : " + getName());
		System.out.println("학번 : " + getNum());
		System.out.println("학과 : " + getPart());
		System.out.println("학년 : " + getGrade());
		System.out.println("학점 : " + getGrades());
		System.out.println("동아리 : " + club);
	}
}
