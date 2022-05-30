public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student("동완", 40, 30, 50);
		Student ss = new Student("진성");
		s.setName("와니");
		s.setKor(80);
		s.setEng(77);
		s.setMath(92);
		
		s.print();
		ss.print();
		
	}
}