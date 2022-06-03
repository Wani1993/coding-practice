
public class ClassRoom {
	private Student stu1;
	private Student stu2;
	private Student stu3;
	
	public ClassRoom() {}

	public ClassRoom(Student stu1, Student stu2, Student stu3) {
		this.stu1 = stu1;
		this.stu2 = stu2;
		this.stu3 = stu3;
	}

	public void printNames() {
		System.out.println("1번 학생: " + stu1.getName());
		System.out.println("2번 학생: " + stu2.getName());
		System.out.println("3번 학생: " + stu3.getName());
	}
	
	public int getTotalAvg() {
		return (stu1.getAverage() + stu2.getAverage() + stu3.getAverage()) / 3;
 	}
	
	// 비교 메소드를 이용한 평균이 제일 큰 사람 구하는 메소드
    public Student getTop() {
	    return max(max(stu1, stu2), stu3);  
	}
	  
    // 두개 비교해서 큰거 알려주는 메소드
	public Student max(Student left, Student right) {
		if (left.getAverage() >= right.getAverage()) {
			return left;
		} else {
			return right;
		}
	}
	 
	public Student getStu1() {
		return stu1;
	}

	public void setStu1(Student stu1) {
		this.stu1 = stu1;
	}

	public Student getStu2() {
		return stu2;
	}

	public void setStu2(Student stu2) {
		this.stu2 = stu2;
	}

	public Student getStu3() {
		return stu3;
	}

	public void setStu3(Student stu3) {
		this.stu3 = stu3;
	}
	
	
	
}