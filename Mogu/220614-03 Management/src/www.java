import java.util.Scanner;

class www {

	Member[] m = new Member[10];
	
	
	for (int i = 0; i < a; i++) {
		
		m[i] = new Member();
		System.out.println("이름을 입력하세요.");
		Scanner si = new Scanner(System.in);
		String name = si.nextLine();
		m[i].setName(name);
		System.out.println("키를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		Double miter = sc.nextDouble();
		m[i].setCm(miter);
		System.out.println("몸무게를 입력하세요.");
		Double kg = sc.nextDouble();
		m[i].setKg(kg);
		
		if (m[i].getName() == name && m[i].getMiter() == miter && m[i].getKg() == kg) {
			System.out.println("중복된 회원입니다.");
			break;
		}
	}
}

