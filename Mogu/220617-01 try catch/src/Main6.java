// 은행 계좌
// 필드 : 잔고(int)
// 메소드 : 입금(int) : void
//        출금(int) : void >> 출금액이 보유 잔고 이상일때 예외를 발생시켜서 throws 할수있게끔
class BankWithdrwException extends RuntimeException {
	private int lack;
	
	
	
	
	public BankWithdrwException(String message, int lack) {
		super(message);
		this.lack = lack;
	}




	public int getLack() {
		return lack;
	}
	
}



public class Main6 {
	
	private int dallor;
	
	
	
	public Main6(int dallor) {
		this.dallor = dallor;
	}


	public int getDallor() {
		return dallor;
	}

	public int addDallor(int a) {
		return this.dallor += a;
	}
	
	public int minusDallor(int a) throws RuntimeException {
		if(this.dallor >= a) {
			this.dallor -= a;
			return this.dallor;
		} else {
			throw new BankWithdrwException("돈이없어서 뽑을수가 없셈!", a - this.dallor);
		}
	}
	
	public void bankDallor() {
		System.out.println("현재 잔액은: " + getDallor());
	}
	
	


	public static void main(String[] args) {
		// 은행 계좌 객체 생성
		// 입금/출금/게터 테스트
		// 출금 // 예외처리
		
		Main6 d = new Main6(500);
		d.addDallor(100);
		d.bankDallor();
		
		try {
			d.minusDallor(40);
			d.bankDallor();
			d.minusDallor(600);
			d.bankDallor();
		} catch (BankWithdrwException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLack());
		}
		
		
		
	}
} 

