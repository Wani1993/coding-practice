import java.math.BigInteger;
import java.math.BigDecimal;
public class Main4 {
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		
		BigInteger value1 = new BigInteger("9223372036854775808");
		System.out.println(value1.add(new BigInteger("10")));
		
		System.out.println(value1); // 자신의 상태값은 변하지 않고 새로운 바운스에서 더하기를 진행해서 값을 돌려줌
		
		BigDecimal dec = new BigDecimal("0.123456789");
		System.out.println(dec);
		
		BigDecimal d = new BigDecimal(0.1);
		System.out.println(d);
	}
}
