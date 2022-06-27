import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class Main3 extends JFrame {
	public Main3() {
		JPanel red = new JPanel();
		red.setBackground(Color.red);
		
		JPanel blue = new JPanel();
		blue.setBackground(Color.blue);
		
		JTabbedPane tab = new JTabbedPane();  // 탭을 생성해서 선택하면 선택하는 탭으로 이동한다.
		tab.add("빨강", red);
		tab.add("파랑", blue);
		add(tab);
		
//		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, red, blue);  // HORIZONTAL_SPLIT or VERTICAL_SPLIT 으로 가로세로를 바꿀수있다.
//		split.setDividerLocation(150);												// 선을 기점으로 사용자가 영역을 마음대로 바꿀수있다.
//		add(split);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		
	}

	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
