//1번
// 책 클래서 (class Book)
// 필드(상태) : 제목, 저자
// 메소드(기능) : 제목과 저자를 콘솔에 출력가능

//2번
// 날짜 클래스
// 필드 : 연도, 월, 일
// 메소드 : "2022-05-27"
//        "05/27/22"

//3번
//영화
//제목, 평점, 감독, 발표된 연도
//모든 값을 콘솔 출력하는 기능

// 위의 클래스를 테스트 할수있는 메인 메소드를 포함하는 클래스를 작성하고
// 인스턴스화 하여, 필값을 대입연산 후 출력메소드를 호출하여 콘솔에서 값 확인.

class Book {
	String title;
	String author;
	void print() {
		System.out.println("제목 : " + title  + "  " + "저자 : " + author);
	}
}

class String Date(int year, int month, int day) {
	String date = "year-month-day";
	
}