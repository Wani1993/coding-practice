import java.util.Calendar;

public class Prc {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DATE);
		int dayweek = now.get(Calendar.DAY_OF_WEEK);

		// System.out.println(" " + year+"년 " + month + "월 " + date + "일 ");

		String sun = "";
		switch (dayweek) {
		case 1:
			sun = "월";
			break;
		case 2:
			sun = "화";
			break;
		case 3:
			sun = "수";
			break;
		case 4:
			sun = "목";
			break;
		case 5:
			sun = "금";
			break;
		case 6:
			sun = "토";
			break;
		case 7:
			sun = "일";
			break;
		}

		System.out.println("   " + year + "년 " + month + "월 " + date + "일 " + sun + "요일");
		System.out.println("일　 월　 화　 수　 목　 금　토");

		// 수요일일때 1일

		now.set(year, month - 1, 1);
		int end = now.getActualMaximum(Calendar.DAY_OF_MONTH);
		int start = now.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < start; j++) {
					System.out.print("   ");
				}
			}
			if (i < 10) {
				System.out.print(" ");
			}

			System.out.print(" " + i + "");

			if (start % 7 == 0) {
				System.out.println();
			}
			start++;

		}

	}
}
