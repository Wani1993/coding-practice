
public class TestStudent {
	public static void main(String[] args) {
		Student student1 = new Student("동완", 100, 80, 90);
		int avg1 = student1.getAverage();
		System.out.println(avg1);
		
		Student student2 = new Student("석구", 60, 70, 80);
		Student student3 = new Student("진성", 80, 70, 90);
		
		int avg2 = student2.getAverage();
		int avg3 = student3.getAverage();
		
		int sum = avg1 + avg2 + avg3;
		int totalAvg = sum / 3;
		
		System.out.println(totalAvg);
	}
}
