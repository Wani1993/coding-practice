public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("원본");
		sb.append(",One=")
		.append(1)
		.append(",DoubleValue=")
		.append(255.0);
		
//		StringBuffer sbuffer; 
		
//		sb.reverse(); // 문자열 뒤집어주는 메소드
		
//		sb.setCharAt(0, 'Q');

//		sb.insert(0, "시작");
		
		String result = sb.toString();
		
		System.out.println(result);
		
		
		
		
		
		
//		String str = "원본 문자열";  // 같은 문자열이라면 최대한 같은 값으로 보려고 한다. 
//		String other = "다른 문자열";
//		String origin = "원본 문자열";
//		
//		String concat = str + other;
//		
//		System.out.println(str == origin);
//		System.out.println("원본 문자열다른 문자열" == concat); // 문자열 합연산이 다른이유는 참조하는 인스턴스가 달라서이다.
//		System.out.println(concat.equals("원본 문자열다른 문자열"));
	}

}
