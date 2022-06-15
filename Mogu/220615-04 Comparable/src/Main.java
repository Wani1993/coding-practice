import java.util.Arrays;

class Member implements Comparable<Member> { // <> 를 이용해서 누구와 비교할것인가 지정하는것
	private String name;
	private int height;
	private int weight;
	

	public Member(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Member o) {
		return this.height - o.height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
}

public class Main {
	public static void main(String[] args) {
		Member[] members = { new Member("키큰놈", 190, 60), new Member("키작은놈", 130, 30), new Member("중간쯔음", 176, 65) };
		
		Arrays.sort(members);
		System.out.println(members[0].getHeight());
		System.out.println(members[1].getHeight());
		System.out.println(members[2].getHeight());
		
		
		
	}
}
