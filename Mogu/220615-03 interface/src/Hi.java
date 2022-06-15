
public interface Hi {
	void hi();
}

interface KorHi extends Hi {
	// 인터페이스를 상속받는것
}


class Student {
	protected String name;
	protected int age;
}
class Eng extends Student implements Hi {
	@Override
	public void hi() {
		System.out.println("Hello");
	}
	
}

class Kor extends Student implements Hi {
	@Override
	public void hi() {
		System.out.println("안녕");
	}
	
}

class Ame  implements Hi {
	@Override
	public void hi() {
		System.out.println("Wassup");
	} 
	
}  



