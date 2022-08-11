import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
	public static void main(String[] args) {
		String line1 = "lowercase";
		String line2 = "UPPERCASE";
		String line3 = "1q2w3e";
//		Pattern p = Pattern.compile("[a-z]{9}");
//		Matcher m = p.matcher(line1);
//		
//		System.out.println(m.matches());
//		Pattern p = Pattern.compile("[0-9a-z]{6}");
//		Matcher m = p.matcher(line3);
//		System.out.println(m.matches());
		
		// 아이디는 영소문자와 숫자로 이루어 져야하고 최소 6자 최대 10자(영소문자로 시작)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("아이디");
//		String id = scan.nextLine();
//		
//		Pattern p = Pattern.compile("[a-z][a-z0-9]{5,9}");
//		Matcher m = p.matcher(id);
//		System.out.println(m.matches());
		
		String regex = "010-[0-9]{4}-[0-9]{4}";
		Pattern p = Pattern.compile(regex);
		
		System.out.println(p.matcher("010-1234-5678").matches());
		System.out.println(p.matcher("010-asdf-5678").matches());
		System.out.println(p.matcher("010-1234-!@#$").matches());
		System.out.println(p.matcher("010-005-5678").matches());
		
	}
}
