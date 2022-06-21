import java.util.ArrayList;
import java.util.List;

public class DiaryManageImpl implements DiaryManage {
	private List<Mydiary> list;

	
	
	public DiaryManageImpl() {
		list = new ArrayList<>();
	}

	@Override
	public void add(Mydiary d) {
		list.add(d);
	}

	@Override
	public List<Mydiary> list() {
		return list;
	}

	@Override
	public void edit(Double date, String title) {
		int index = list.indexOf(new Mydiary(date));
		if (index >= 0) {
			Mydiary d = list.get(index);
			d.setTitle(title);
		}
	}

	@Override
	public void deletFirst() {
		if(!list.isEmpty()) {
			list.remove(0);
		}
	}
	

}
