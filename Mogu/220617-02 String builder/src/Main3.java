import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple banana carrot donut";
		
		StringTokenizer st = new StringTokenizer(longLine, " "); // 왼쪽은 짤라내고자 하는 문자열, 오른쪽은 기준이 되는 문자열
//		st.hasMoreTokens(); // 잘라 냈을때 있는지 확인하는 메소드
//		String a = st.nextToken();
//		System.out.println(a);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
//		for(int i = 13; i <= 18; i++) {
//			System.out.print(longLine.charAt(i));
//		}
//		
//		String[] split = longLine.split(" ");
//		System.out.println(split[2]);
		
	}
} 
