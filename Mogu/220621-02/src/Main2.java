import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// 학생
// 이름
// 나이

// 학생은 이름과 나이가 같으면 동일 학생입니다

// 고길동 15
// 둘리 22
// 도우너 33

// 위의 학생을 원소로 가지는 리스트를 생성하고
// 도우너 33  학생의 인덱스를 찾아보세용

class duli implements Comparable<duli>{
	private String name;
	private int age;
	private int score;
	
	public duli(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public duli(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
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

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof duli))
			return false;
		duli other = (duli) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int compareTo(duli o) {
		return score - o.score;
	}


	
	
}



public class Main2 {
	 public static void main(String[] args) {
		 List<duli> list = new LinkedList<>();
		 
		 list.add(new duli("고길동", 15, 90));
		 list.add(new duli("둘리", 22, 80));
		 list.add(new duli("도우너", 33, 95));
		 
		 System.out.println("도우너의 인덱스 번호: " + list.indexOf(new duli("도우너", 33)));
		 System.out.println(list);
		 
		 // 정렬
		 Collections.sort(list);  // duli 클래스의 대소를 구분할수있는 기준이 없기때문에 컴파일 에러가 난다
		 Collections.reverse(list);
		 System.out.println(list);
		 
		 Comparator<duli> comparator = new Comparator<duli>() {  // 익명 클래스 생성 , 비교대상을 오버라이드 해서 새로운 비교기준을 만듬
			
			@Override
			public int compare(duli o1, duli o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		 
		Collections.sort(list, comparator);
		System.out.println(list);
		 
	 }
}
