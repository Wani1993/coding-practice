import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main2 extends JFrame {
	public Main2() {
		JPanel pnl = new JPanel();
		JButton btn = new JButton("버튼입니다");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("액션 이벤트 발생");
				
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {  //마우스리스너를 구현한 추상클래스, 바디를 다 비운 상태로 오버라이드 해놓아서 필요한것만 재정의할수있음.

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 Pressed");
			}  
			
		});
		
		pnl.add(btn);
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
