// 학급 (반)
// 학생
// 학생
// 학생

// 1. 3명의 학생의 이름을 콘솔에 출력 할 수 있음.
// 2. 학생 3명의 총 평균을 알려줄 수 있음.
// 3. 점수가 가장 높은 학생(참조, return타입이 학생)을 알려줄 수 있음. => 동일점수. 1 < 2 < 3
public class SchoolTest {
	public static void main(String[] args) {
    Student child1 = new Student("동완", 100, 80, 90);
    Student child2 = new Student("석구", 100, 80, 90);
    Student child3 = new Student("진성", 100, 80, 90);
    
    ClassRoom room = new ClassRoom(child1, child2, child3);
	
//  System.out.println(me.getB().getName());
    
	room.printNames();
	int avg = room.getTotalAvg();
	System.out.println(avg);
	
	Student top = room.getTop();
	System.out.println("1등 : " + top.getName());
	 
	}
}
