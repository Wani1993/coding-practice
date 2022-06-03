import java.time.LocalDate;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		// java.util.Calendar
//	    Calendar now = Calendar.getInstance();
	    // 1.8 ~ java.time.LocalDate
		
//	    System.out.println("상수값 확인 : " + Calendar.YEAR);
//	    
//	    System.out.println(now.get(Calendar.YEAR));
//	    System.out.println(now.get(Calendar.MONTH) + 1);
//	    System.out.println(now.get(Calendar.DAY_OF_MONTH));
//	    System.out.println(now.get(Calendar.DAY_OF_WEEK));
	
		
		LocalDate now = LocalDate.now();
		System.out.println(now.getYear());
		
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		
		System.out.println(now.getDayOfMonth());
		
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfWeek().getValue());





	}
}
