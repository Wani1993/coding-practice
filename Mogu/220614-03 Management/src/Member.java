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
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Member implements Comparable<Member> {
	protected String name;
	protected double miter;
	protected double kg;
	private double BMI;
	
	
	


	@Override
	public int compareTo(Member o) {  // 이부분을 어떻게 사용해야 되는지 ? 
		int i = (int) (this.miter - o.miter);
		return i;
		//return (int) (this.miter - o.miter);
	}

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

	public double getMiter() {
		return miter;
	}

	public void setmiter(double miter) {
		this.miter = miter;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}
	
	public double setBmi() {
		this.BMI = this.kg / (this.miter * this.miter);
		return BMI;
	}
	
	public double getBmi() {
		return this.BMI;
	}

	@Override
	public String toString() {
		return "[회원이름:" + name + " 키:" + miter + "m 몸무게:" + kg + "kg]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(miter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (Double.doubleToLongBits(kg) != Double.doubleToLongBits(other.kg))
			return false;
		if (Double.doubleToLongBits(miter) != Double.doubleToLongBits(other.miter))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}

class WeightComparator implements Comparator<Member> {  // 오름차순으로 정렬하는 방법 ?

	@Override
	public int compare(Member o1, Member o2) {
		return (int) (o1.getKg() - o2.getKg());
	}
	
}

class NameComparator implements Comparator<Member> {

	@Override
	public int compare(Member o1, Member o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}



class Manage {
	
	Member[] m = new Member[10];
	
	Scanner scan = new Scanner(System.in);
	public void memberIn() {
		System.out.println("몇명의 회원을 입력하시겠습니까?");
		int a = scan.nextInt();
		
		for (int i = 0; i < a; i++) {
			m[i] = new Member();
			System.out.println("이름을 입력하세요.");
			Scanner si = new Scanner(System.in);
			String name = si.nextLine();
			m[i].setName(name);
			System.out.println("키를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			Double miter = sc.nextDouble();
			m[i].setmiter(miter);
			System.out.println("몸무게를 입력하세요.");
			Double kg = sc.nextDouble();
			m[i].setKg(kg);
			
			m[i].setBmi();							
			}
		}  // 중복 등록 안되게 하려면 어떻게 해야하는지 ?
	
	
	public void getBiman() {
		int[] count = new int[6];
		String[] name = new String[10];
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
			name[i] = "";
		}

		for (int i = 0; i < name.length; i++) {
			if (m[i] != null) {
				if (m[i].getBmi() >= 35) {
					name[0] += m[i].toString();
					count[0]++;
				} else if (m[i].getBmi() >= 30) {
					name[1] += m[i].toString();
					count[1]++;
				} else if (m[i].getBmi() >= 25) {
					name[2] += m[i].toString();
					count[2]++;
				} else if (m[i].getBmi() >= 23) {
					name[3] += m[i].toString();
					count[3]++;
				} else if (m[i].getBmi() >= 18.5) {
					name[4] += m[i].toString();
					count[4]++;
				} else if (m[i].getBmi() > 0) { 
					name[5] += m[i].toString();
					count[5]++;
				}
			}
		
			
		}
		System.out.printf("고도비만: %d명\n", count[0]);
		System.out.println(name[0]);
		System.out.printf("중도비만: %d명\n", count[1]);
		System.out.println(name[1]);
		System.out.printf("경도비만: %d명\n", count[2]);
		System.out.println(name[2]);
		System.out.printf("과체중: %d명\n", count[3]);
		System.out.println(name[3]);
		System.out.printf("정상: %d명\n", count[4]);
		System.out.println(name[4]);
		System.out.printf("저체중: %d명\n", count[5]);	
		System.out.println(name[5]);
	}

	public void printMember() {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				System.out.println(m[i]);
			}
		}
	}
	
	public void menu() {
		System.out.println("-------회원관리 프로그램-------");
		System.out.println("1.회원 등록　　　　　2.회원목록");
		System.out.println("3.BMI별 회원목록     4.프로그램종료");
		System.out.println("---------------------------");
	}
	
	public void beginIng() {
		
		while (true) {
			menu();
			int n = scan.nextInt();
			if (n == 1) {
				memberIn();
			} else if (n == 2) {
				printMember();
			} else if (n == 3) {
				getBiman();
			} else if (n == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			
		}
	}
	
	public void mWin() {
		Arrays.sort(m);
		
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
			System.out.print(m[i].getName() + " ");
			}
		}		
	}
	
	public void sortMem() {
		WeightComparator a = new WeightComparator();
//		for (int i = 0; i < m.length; i++) {
//			int result = a.compare(m[i], m[i+1]);
//		}
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				Arrays.sort(m, a);
				System.out.println(m[i].getName());
			}
		}
//		Arrays.sort(m, a);
//		System.out.println(m[0].getName());
//		System.out.println(m[1].getName());
		
	}
		
}




