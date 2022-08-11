import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String line = "This is a book.";
		Pattern p = Pattern.compile("is");  // 파라미터 안에 있는 값을 찾아낸다
		Matcher m = p.matcher(line);
		
//		System.out.println(m.lookingAt());
		boolean find = m.find();  // find에 스타트 인덱스를 설정해서 그부분 부터 찾을수도있다.

		if(find) {
			System.out.println(m.start());
			System.out.println(m.end());
		}
		
		find = m.find();
		if(find) {
			System.out.println(m.start());
			System.out.println(m.end());
		}
		
		find = m.find();
		if(!find) {
			System.out.println("음슴");
		}
	}
}
