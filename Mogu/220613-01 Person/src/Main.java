public class Main {
	public static void main(String[] args) {
		Person p = new Person("사람이름", 22);
		
		Student s = new Student("학생이름", 17, 90);
		
		System.out.println(s.getName());
		System.out.println(s.getScore());
		
//		p.getScore();
	
		Author a = new Author("작가이름", 30, "반지의제왕");
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getBookList());
	
	}
}


//상속이란 상하 계층구조를 가지고있는 클래스 간에 상위 클래스에서 성질을 그대로 물려받는것