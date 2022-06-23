import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main5 extends JFrame {
	public Main5() {
		JPanel pnl = new JPanel(); // 기본값이 flow 로 생성이 된다.
//		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);  // 위치 왼쪽 , 오른쪽 설정
//		pnl.setLayout(flow);
//		
//		BorderLayout border = new BorderLayout();  // 자기의 영역에 컴포넌트를 가득 채운다.
//		pnl.setLayout(border);
//		
//		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS); // 박스를 쌓는 기준을 정할수있다 x축, y축
//		pnl.setLayout(box);
		
		GridLayout grid = new GridLayout(2, 2); // 컴포넌트를 똑같은 크기로 나눠서 채워준다.
		pnl.setLayout(grid);
		pnl.setLayout(null);  // 레이아웃 전부 없애는거
		
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		
		btn1.setLocation(10, 30);
		btn1.setSize(200, 300);
		
		btn2.setBounds(220, 50, 90, 40);
		
		btn1.setPreferredSize(new Dimension(300, 300));  // 버튼 사이즈 수정
		btn1.setMinimumSize(new Dimension(300, 300));
		btn1.setMaximumSize(new Dimension(300, 300));
		// 사이즈 수정같은경우 맨 마지막께 설정이된다.
		
		pnl.add(btn1, "West");  // 이거나
		pnl.add(btn2);  // 이거나 편한대로 ㄱ
		pnl.add(btn3, BorderLayout.EAST);
		pnl.add(btn4, BorderLayout.WEST);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Main5().setVisible(true);
	}
}
