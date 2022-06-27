import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main3 extends JFrame {
	public Main3() {
		JPanel pnl = new JPanel(null);  // null 값을 안주면 버튼의 컴포넌트 크기가 조절이안된다.
		pnl.setPreferredSize(new Dimension(500, 500)); 
		
		JButton btn = new JButton("Click Me");
		btn.setBounds(150, 150, 100, 100);  // JPanel 에  null 값을 준 이유. 버튼의 사이즈를 조절하기위해서.
		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setLocation((int) (Math.random() * 400), (int) (Math.random() * 400));  // 마우스를 올렸을때 위치가 랜덤하게 바뀌게 만듬
			}
			
		});
		
		pnl.add(btn);
		add(pnl);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);  // 사이즈 고정시키는거 
		
		
	}
	
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
