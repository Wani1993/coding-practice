import java.sql.SQLException;
import java.util.Arrays;

public class TestRestaurantsDao {
	public static void main(String[] args) {
	RestaurantsDao dao = new RestaurantsDaoImpl();
	
	
		try {
//			int result = dao.create("테스트중333", "1234-5676", "부산어딘가333");
//			System.out.println(result == 1);
			
//			int result = dao.update(1, "원카츠", "051-444-7878", "진구진구");
//			System.out.println(dao.read(1));
			
//			int result = dao.delete(14);
//			System.out.println(dao.read());
			
			RestaurantsDaoImpl impl = (RestaurantsDaoImpl) dao;
			int[] result = impl.create(Arrays.asList(
					new Restaurant(0, "배치1", "0101-0202", "배치주소1"), 
					new Restaurant(0, "배치2", "0202-0202", "배치주소2"),
					new Restaurant(0, "배치3", "0303-0202", "배치주소3"),
					new Restaurant(0, "배치4", "0404-0202", "배치주소4")
					));
			System.out.println(Arrays.toString(result));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
	}
}
