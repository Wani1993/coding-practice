// 의자 클래스
// 제조사
// 생산일자
// 가격
// 모델명

// 초기화 할 수 있는 생성자

// main -> 작성한 생성자를 통해 원하는 필드값을 초기화 해보세요.
class Chair {
	String made;
	int when;
	int prise;
	String model;
	
	public Chair() {
		made = "한국";
		when = 0;
		prise = 0;
		model = "none";
	}
	
	public Chair(String a, int b, int c, String d) {
		made = a;
		when = b;
		prise = c;
		model = d;
		System.out.printf("제조사: %s, 생산일자: %d, 가격: %d원, 모델명: %s\n", a, b, c, d);
	}

}

public class ChairTest {
	public static void main(String[] args) {
		Chair my = new Chair("내꺼", 2019, 10000, "게이밍의자");
		Chair b = new Chair();
	}
}