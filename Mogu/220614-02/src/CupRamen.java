// 컵라면
// 제조사
// 이름
// 가격

// 생성자, 게터세터 , 오버라이드, equals - 제조사가 같으면
public class CupRamen {
	private String maker;
	private String name;
	private int price;
	
	public CupRamen(String maker, String name, int price) {
		this.maker = maker;
		this.name = name;
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maker == null) ? 0 : maker.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CupRamen))
			return false;
		CupRamen other = (CupRamen) obj;
		if (maker == null) {
			if (other.maker != null)
				return false;
		} else if (!maker.equals(other.maker))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public String toString() {
		return maker + " " + name + " " + price; 
	}
	
	
}
	
	

