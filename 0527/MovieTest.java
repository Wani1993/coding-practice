//3번
//영화
//제목, 평점, 감독, 발표된 연도
//모든 값을 콘솔 출력하는 기능

class Movie {
	
	void print(String t, String g, String d, String y) {
		String title = t;
		String grade = g;
		String director = d;
		String year = y;
		System.out.printf("제목: %s, 평점: %s, 감독: %s, 발표된 연도: %s", t, g, d, y);
		
	}
}



public class MovieTest {
	public static void main(String[] args) {
		Movie c = new Movie();
		c.print("기생충", "9.07", "봉준호", "2019년");
	} 
}