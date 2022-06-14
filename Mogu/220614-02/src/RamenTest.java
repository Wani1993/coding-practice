
public class RamenTest {
	public static void main(String[] args) {
		CupRamen s = new CupRamen("삼양", "육개장", 800);
		CupRamen n = new CupRamen("농심", "육개장", 850);
		CupRamen o = new CupRamen("농심", "육개장", 900);
		
		System.out.println(s.equals(n));
		System.out.println(n.equals(o));
		System.out.println(s.equals(o));
		System.out.println(o);
		
		
	}
}
