import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	public Main() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("입력");
		
	
		pnl.add(lbl);
		
		add(pnl);
		
		pnl.setFocusable(true);  // key 입력으로도 상호 소통가능하게 바꿈
//		pnl.addKeyListener(new KeyListener() {			
//			@Override
//			public void keyTyped(KeyEvent e) { // 클릭처럼 눌렀다 땠을때
//				
//			}			
//			@Override
//			public void keyReleased(KeyEvent e) { // 버튼 땠을때 
//				
//			}			
//			@Override
//			public void keyPressed(KeyEvent e) {  // 키보드 눌렀을때
//				
//			}
//		});
		pnl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				if (code == KeyEvent.VK_LEFT) {
					lbl.setLocation(lbl.getX() - 10, lbl.getY());
				} else if (code == KeyEvent.VK_RIGHT) {
					lbl.setLocation(lbl.getX() + 10, lbl.getY());
				} else if (code == KeyEvent.VK_UP) {
					lbl.setLocation(lbl.getX(), lbl.getY() - 10);
				} else if (code == KeyEvent.VK_DOWN) {
					lbl.setLocation(lbl.getX(), lbl.getY() + 10);
				}
//				char c = e.getKeyChar();
//				lbl.setText(String.valueOf(c));  // 문자 형태로 가져와서 나타내주는거
			}
			
		});
		
		
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
