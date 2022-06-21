import java.time.LocalDate;

interface LeafletHandler {
	String give();
}
// 위의 인터페이스를 구현하는 클래스를  작성하세요. 추상 메소드를 오버라이드 해야합니다. 구현바디는 (전화번호 문자열 반환)
// 일수 광고 전단지 제공자
// 전화 번호가 포함되어야함.
class Lorn implements LeafletHandler {
	private String phone;
	
		
	public Lorn(String phone) {
		super();
		this.phone = phone;
	}

	@Override
	public String give() {
		
		return phone;
	}
}

// 선거 광고 전단지 제공자
// 선거 날짜가 포함되어야함.

class VoteAd implements LeafletHandler {
	private LocalDate day;
	
	

	public VoteAd(LocalDate day) {
		super();
		this.day = day;
	}



	@Override
	public String give() {
		// TODO Auto-generated method stub
		return "투표날짜: " + day.toString();
	}
	
	
		
	
}

// 광고 대행사
// 그때그때 일수광고 또는 선거광고
class AdCompany {
	LeafletHandler ad;

	public AdCompany(LeafletHandler ad) {
		super();
		this.ad = ad;
	}

	public LeafletHandler getAd() {
		return ad;
	}

	public void setAd(LeafletHandler ad) {
		this.ad = ad;
	}
	
	public void consoleAd() {
		System.out.println(ad.give());
	}
}



public class Main {
	public static void main(String[] args) {
		LeafletHandler h1 = new Lorn("010-8888-4444");
//		String 전화번호가 포함된 일수광고 문자열 = h1.give();
		
//		LeafletHandler h2 = new 선거광고();
//		String 선거날짜가 포함된 광고 문자열 = h2.give();
		
//		광고대행사 p = new 광고대행사(일수광고);
		AdCompany company = new AdCompany(new Lorn("010-1111-2222"));
//		p.광고() << 일수광고
		company.consoleAd();
		
//		p.set고객(선거광고);
		company.setAd(new VoteAd(LocalDate.now()));
//		p.광고() << 선거광고
		company.consoleAd();
	}

}
