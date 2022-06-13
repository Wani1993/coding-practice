public class SmartPhone extends Phone {
	private String os;
	private String vs;
	private String ssd;
	private String cam;
	private String blue;

	public SmartPhone(String maker, int prise, String gg, String os, String vs, String ssd, String cam, String blue) {
		super(maker, prise, gg);
		this.os = os;
		this.vs = vs;
		this.ssd = ssd;
		this.cam = cam;
		this.blue = blue;
	}

	public void testPrint() {
		System.out.printf("제조사는 %s 가격은 %,d 통신타입은 %s 운영체제 타입은 %s 운영체제 버전은 %s 메모리 크기는 %s 카메라 %s 블루투스 %s\n", getMaker(), getPrise(), getGg(), os, vs, ssd, cam, blue);
		//return super.testPrint() + " " + "운영체제 타입은 " + os + " " + "운영체제 버전은 " + vs + " " + "메모리 크기는 " + ssd + " "
		//		+ "카메라 " + cam + " " + "블루투스 " + blue;
	}

}
