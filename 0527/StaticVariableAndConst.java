public class StaticVariableAndConst {
	public static void main(String[] args) {
		int i = 10; // 변수는 변할수있고 상수는 변하지않음. i = 변수, 10 = 상수.
		
		i++;
		
		final int ASDF;
		ASDF = 10;
		//ASDF = 15; // 상수도 초기화를 할수있다, 하지만 그 이후에는 다시 초기화가 불가능하다.
		
		final int MY_NUMBER = 22; // 상수는 변수와 차이점을 주기 위해 대문자로 작성한다.
		// MY_NUMBER++; // final int 값은 변하지 않는 수라 변화시키려고 하면 컴파일 에러가 난다.
		
		final double PI = 3.14;
		System.out.println(5 * 5 * PI);
	}
}