public class TestManage {
	public static void main(String[] args) {
		DiaryManage m = new DiaryManageImpl();
		
		m.add(new Mydiary(6.21, "이게모야", "맑음", "적을 말이 없네"));
		
		m.add(new Mydiary(6.28, "저건모야", "맑음", "적을 말이 없네잉"));
		
		m.add(new Mydiary(6.17, "도데체 모야", "맑음", "적을 말이 없네"));
		
		System.out.println(m.list());
		
		m.edit(6.17, "수정된 내용");
		
		System.out.println(m.list().get(0).getTitle());
		
		m.deletFirst();
		
		System.out.println(m.list().size());
		
		System.out.println(m.list());
	}

}
