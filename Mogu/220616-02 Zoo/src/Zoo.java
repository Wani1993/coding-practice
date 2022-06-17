import java.util.Scanner;

// 동물원 관리

// 동물 - 종, 나이, 무게

// 직원 - 역할(조련사, 경영 등등), 이름
// 조련사는 동물들을 담당합니다.

// 동물은 육식/ 초식으로 나누어서 관리됩니다.
// 주식으로 분류하여 동물 목록을 볼 수 있음.
// 조련사 담당에 따라 동물 목록을 볼 수 있음. (담당자가 없는 동물도 볼 수 있어야 함)


public class Zoo  {

	Animal lion = new Animal("육식", "사자", 2, 100);
	Animal tiger = new Animal("육식", "호랑이", 3, 120);
	Animal rabbit = new Animal("초식", "토끼", 2, 5);
	Animal dear = new Animal("초식", "사슴", 4, 80);
	Animal holse = new Animal("초식", "말", 3, 110);
	
	Animal[] ani = { lion, tiger, rabbit, dear, holse };
	
	Employee kim = new Employee("조련사1", "킴");
	Employee Min = new Employee("조련사2", "민");
	Employee Jin = new Employee("경영관리사", "진");
	
	Employee[] im = { kim, Min, Jin };
	
	public void printName() {
		for (int i = 0; i < ani.length; i++) {
			System.out.println(ani[i].toString());
		}
	}

	public void yName() {
		for (int i = 0; i < ani.length; i++) {
			if (ani[i].getHabits().equals("육식")) {
			System.out.println(ani[i].toString());
			}
		}
	}
	

	public void cName() {
		for (int i = 0; i < ani.length; i++) {
			if (ani[i].getHabits().equals("초식")) {
			System.out.println(ani[i].toString());
			}
		}
	}
   
	public void start() {
		System.out.println("------------동물원 관리 프로그램------------");
		System.out.println("1.동물 목록		2.직원들 목록");
		System.out.println("3.초식동물		4.육식동물");
		System.out.println("5.조련사 담당동물		6.동물별 담당조련사");
		System.out.println("7.프로그램 종료");
		System.out.println("---------------------------------------");
	}
	
	public void animalList() {
		for (int i = 0; i < ani.length; i++) {
			System.out.println(ani[i].getSpecies());
		}
	}
	
	public void imployeeList() {
		for (int i = 0; i < im.length; i++) {
			System.out.println(im[i].getBreaker() + " " + im[i].getName());
			
		}
	}
	
	public void cAnimal() {
		for (int i = 0; i < ani.length; i++) {
			if(ani[i].habits.equals("초식")) {
				System.out.printf("종 : %s, 나이 : %d살, 무게 : %dkg\n", ani[i].getSpecies(), ani[i].getAge(), ani[i].getKg());
			}
		}
	}
	
	public void yAnimal() {
		for (int i = 0; i < ani.length; i++) {
			if(ani[i].habits.equals("육식")) {
				System.out.printf("종 : %s, 나이 : %d살, 무게 : %dkg\n", ani[i].getSpecies(), ani[i].getAge(), ani[i].getKg());
			}
		}
	}
	
	public void tamer(int a) {
		if (a == 1) {
			System.out.printf("조련사 1 %s가 관리하는 동물은 : %s,%s,%s\n", im[0].getName(), ani[0].getSpecies(), ani[2].getSpecies(), ani[3].getSpecies());
		} else if (a == 2) {
			System.out.printf("조련사 2 %s가 관리하는 동물은 : %s\n", im[1].getName(), ani[1].getSpecies());
		} else {
			System.out.printf("이 직원은 %s%s입니다.\n", im[2].getBreaker(), im[2].getName());
		}
	}
	
	public void aniTamer() {
		for (int i = 0; i < ani.length; i++) {
			if(i == 0 || i == 2 || i == 3) {
			System.out.println(ani[i].getSpecies() + " " +  "담당조련사 : " + im[0].getName());
			} else {
				System.out.println(ani[i].getSpecies() + " " + "담당조련사 : " + im[1].getName());
			}
		}
	}
	
	public void beginIng() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			start();
			int a = scan.nextInt();
			if(a == 1) {
				animalList();
			} else if (a == 2) {
				imployeeList();
			} else if (a == 3) {
				cAnimal();
			} else if (a == 4) {
				yAnimal();
			} else if (a == 5) {
				System.out.println("조련사를 선택하세요");
				int b = scan.nextInt();
				tamer(b);
			} else if (a == 6){
				aniTamer();
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
