import java.sql.SQLException;
import java.util.List;

public interface RestaurantsDao {
   int create(String businessName, String number, String address) throws SQLException;
   List<Restaurant> read() throws SQLException;
   Restaurant read(int companyNum) throws SQLException;
   int update(int companyNum, String businessName, String number, String address) throws SQLException;
   int delete(int companyNum) throws SQLException;

}