import java.util.List;

public interface DiaryManage {
	void add(Mydiary d);
	List<Mydiary> list();
	void edit(Double date, String title);
	void deletFirst();
}
