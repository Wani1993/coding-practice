import java.util.regex.Pattern;

public class Main5 {
	public static void main(String[] args) {
					// w뒤에 +를 붙이면 한글자 이상, ?는 0이거나 1, *는 0이상
		Pattern p = Pattern.compile("\\w+"); // [a-zA-Z] 와 같은말 자바에서는 백슬러시 2개 

		Pattern p2 = Pattern.compile("\\d"); // [0-9] 와 같은말이다.
		
		Pattern p3 = Pattern.compile("\\s"); // 공백
	}
}
