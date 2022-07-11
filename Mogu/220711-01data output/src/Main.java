import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable { // 객체가 직렬화가 가능하도록 클래스를 확장하는거
	private String name;
	private int age;
	private double score;  // 직렬화 안되게 하려면 transient 타입 앞에 붙여주면된다.

	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

}

public class Main {
	public static void main(String[] args) {
		// 학생
		// 이름: 문자열
		// 나이: 정수
		// 학점: 실수

		BufferedReader br = null;
		List<Student> list = new ArrayList<>();
		
		
		try {
			br = new BufferedReader(new FileReader(new File("d:\\filetest\\students.txt")));
						
			while (true) {
				String name = br.readLine();  // 한줄씩 읽는 메소드를 이용해서 이름을 구해온다
				int age = Integer.valueOf(br.readLine());  // 나이는 정수형이기때문에 인트형으로 형변환 시켜줘야한다
				double score = Double.valueOf(br.readLine()); // 점수는 실수형이기때문에 더블로 형변환 시켜줘야한다
				
				Student s = new Student(name, age, score);
				list.add(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<Student> list = new ArrayList<>(
//				Arrays.asList(new Student("홍길동", 22, 2.5), new Student("둘리", 33, 3.3), new Student("도우너", 44, 4.4)));
//
//		PrintWriter pw = null;
//		
//		try {
//			pw = new PrintWriter(new File("d:\\filetest\\students.txt"));
//			
//			for(int i = 0; i < list.size(); i++) {
//				Student s = list.get(i);  // 리스트에 들어간 인덱스 번호 하나마다 정보를 가져온다
//				
//				pw.println(s.getName());
//				pw.println(s.getAge());
//				pw.println(s.getScore());
//			}
//			
//			pw.flush();
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			pw.close();
//		}
//		
		
		
	}
}