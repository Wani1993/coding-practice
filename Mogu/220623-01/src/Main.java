import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		// CLI
		
		// GUI
		// AWT / SWING
		// JavaFX
		
		JFrame frame = new JFrame();
		frame.setTitle("제목 입니다");
		
		frame.getContentPane().add(new JLabel("Hello World")); // 안에 글자 넣을때 쓰는 메소드
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(500, 500);  // 사이즈를 정해주고
		frame.setVisible(true);  // 이 메소드를 사용해야 창이 나타난다 (true 일때만)
	}
}
