// 회원 관리 프로그램
// 회원을 콘솔입력으로 등록할수있게. 최대 10명
// 중복 등록이 되면 안됨
// 기준에 따라 집계를 해서 목록을 보여줘야합니다.

// 회원
// 이름
// 키
// 몸무게

// BMI 지수
// BMI = 몸무게(kg) / 키*2(m)

// 고도비만 : 35 이상
// 중도비만 : 30 이상 - 35 미만
// 경도비만 : 25 이상 - 30 미만
// 과체중 : 23 이상 - 25 미만
// 정상 : 18.5 이상 - 23 미만
// 저체충 : 18.5 이하
import java.util.Scanner;

public class Member {
	protected String name;
	protected double miter;
	protected double kg;
	
		
	public Member() {
		
	}

	public Member(String name, double miter, double kg) {
		this.name = name;
		this.miter = miter;
		this.kg = kg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCm() {
		return miter;
	}

	public void setCm(double miter) {
		this.miter = miter;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}
	
	public double getBmi() {
		 return  this.kg / (this.miter * this.miter);
	}

	@Override
	public String toString() {
		return "[회원이름=" + name + ", 키=" + miter + ", 몸무게=" + kg + "]";
	}
	
}




class Manage {
	
	MemberBmi[] m = new MemberBmi[10];
	
	Scanner scan = new Scanner(System.in);
	public void memberIn() {
		System.out.println("몇명의 회원을 입력하시겠습니까?");
		int a = scan.nextInt();
		
		for (int i = 0; i < a; i++) {
			m[i] = new MemberBmi();
			System.out.println("이름을 입력하세요.");
			Scanner si = new Scanner(System.in);
			String name = si.nextLine();
			m[i].setName(name);
			System.out.println("키를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			Double cm = sc.nextDouble();
			m[i].setCm(cm);
			System.out.println("몸무게를 입력하세요.");
			Double kg = sc.nextDouble();
			m[i].setKg(kg);
		}
	}
	
	public void getBiman(MemberBmi a) {
		if (a.getBmi() >= 35) {
			System.out.println("고도비만");
		} else if (a.getBmi() >= 30) {
			System.out.println("중도비만");
		} else if (a.getBmi() >= 25) {
			System.out.println("경도비만");
		} else if (a.getBmi() >= 23) {
			System.out.println("과체중");
		} else if (a.getBmi() >= 18.5) {
			System.out.println("정상");
		} else {
			System.out.println("저체중");
		}
	}

	public void printmember() {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				System.out.println(m[i]);
			}
		}
	}
	
	
	
	
}






