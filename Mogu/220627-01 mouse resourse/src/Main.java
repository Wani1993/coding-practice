import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	public Main() {
		JPanel pnl = new JPanel();
		
		MouseListener listener = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				//System.out.println("마우스 버튼을 뗌"); 
			}			
			@Override
			public void mousePressed(MouseEvent e) {
				//System.out.println("마우스 버튼을 누름");
			}			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("EXIT!!");  // 마우스가 벗어났을때
			}			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("ENTER!!"); // 마우스가 올려졌을때
			}			
			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getButton()) {
				case MouseEvent.BUTTON1:
					System.out.println("1번");
					break;
					
				case MouseEvent.BUTTON2:
					System.out.println("2번");
					break;
					
				case MouseEvent.BUTTON3:
					System.out.println("3번");
				}
				
				System.out.println("왼쪽 버튼인가요?" + SwingUtilities.isLeftMouseButton(e));
			
				if(e.getClickCount() == 3) {
					System.out.println("트리플클릭!!");
					pnl.setBackground(Color.cyan);
				} else if (e.getClickCount() == 2) {  // 클릭 횟수를 기억해서 가져오는거
					System.out.println("더블클릭!!");
					pnl.setBackground(Color.orange);
				} else if (e.getClickCount() == 1) {
					pnl.setBackground(Color.pink);
				}
			}
		};
		
		
		MouseMotionListener motion = new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스가 움직입니다아아" + e.getX() + "," + e.getY());  // 마우스커서의 X, Y 위치를 나타내준다. 
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
	//	pnl.addMouseListener(listener);
		pnl.addMouseMotionListener(motion);
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // 창이 가운데에서 출력된다
		
	}
	public static void main(String[] args) {
		new Main().setVisible(true);
	}

}
