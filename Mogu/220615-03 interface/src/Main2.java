
public class Main2 {
	public static void main(String[] args) {
		Hi s1 = new Kor();
		Hi s2 = new Eng();
		Hi s3 = new Ame();
		
		s1.hi();
		s2.hi();
		s3.hi();
		
		Hi[] arr = new Hi[3];  // Hi 라는 
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].hi();
		}
		
	}
}
