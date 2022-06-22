import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//중국집 주문 가격 계산기

//짜장면 : 2500
//짬뽕 : 4000
//볶음밥 : 4000

//메뉴를 '추가'

//계산결과 출력가능
public class Main4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		map.put("짜장면", 2500);
		map.put("짬뽕", 4000);
		map.put("볶음밥", 4000);
		map.put("탕수육", 12000);
		List<String> list = new ArrayList<>();
		
				
			
				while (true) { 
					try {
						System.out.println("중국집 주문 가격 계산기");
						System.out.println("1.메뉴 선택");
						System.out.println("2.메뉴 추가");
						System.out.println("3.선택한 메뉴");
						System.out.println("4.총 가격은 ?");
						System.out.println("5.영수증 출력");
						System.out.println("0.시스템 종료");
						int num = scan.nextInt();

						if (num == 1) {
							for (Map.Entry<String, Integer> s : map.entrySet()) {
								String key = s.getKey();
								Integer value = s.getValue();
								System.out.println("메뉴 : " + key + ", 가격 : " + value);
							}

							while (true) {
								System.out.println("메뉴를 선택하세요 ~끝내고싶으면 끝이라고 치세요~");
								Scanner sc = new Scanner(System.in);
								String menu = sc.nextLine();

								if (map.containsKey(menu)) {
									list.add(menu);
								} else if (menu.equals("끝")) {
									break;
								} else {
									System.out.println("메뉴를 확인해");
								}
							}
						} else if (num == 2) {
							Scanner si = new Scanner(System.in);
							System.out.println("추가할 메뉴를 입력하세요.");
							String add = si.nextLine();
							System.out.println("가격을 입력하세요");
							Scanner sc = new Scanner(System.in);
							int price = scan.nextInt();
							if (!map.containsKey(add)) {
								map.put(add, price);
							} else {
								System.out.println("중복된 메뉴입니다.");
							}
						} else if (num == 3) {
							System.out.println(list);
						} else if (num == 4) {
							Integer sum = 0;
							for (int i = 0; i < list.size(); i++) {
								sum += map.get(list.get(i));
							}
							System.out.println("총 가격은: " + sum);
						} else if (num == 5) {
							for (int i = 0; i < list.size(); i++) {
								System.out.println("주문한 메뉴: "+ list.get(i) + " " + "가격: "+ map.get(list.get(i)));
							} 
							Integer sum = 0;
							for (int i = 0; i < list.size(); i++) {
								sum += map.get(list.get(i));
							}
							System.out.println("결제할 금액: " + sum);
						} else if (num == 0){
							System.out.println("프로그램 종료");
							break;
						}

					} catch (Exception e) {
						System.out.println("잘못입력하셨습니다");
						scan.nextLine();
					}
					
				}
			
		

//		Integer sum = 0;
//		for (Map.Entry<String, Integer> s : map.entrySet()) {
//			String key = s.getKey();
//			Integer value = s.getValue();
//			System.out.println("메뉴 : " + key + ", 가격 : " + value);
//			sum += value;
//		}
//		System.out.println("총 가격은 : " + sum);
//	

	}
}
