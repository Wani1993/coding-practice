import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main6 {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("d:\\filetest\\s1.ser"));
			
			Student s = (Student) ois.readObject(); // 객체가 직렬화가 가능해야 사용이 가능하다.
			
			System.out.println(s);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
