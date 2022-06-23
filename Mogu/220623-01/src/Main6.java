import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main6 extends JFrame {
	public Main6() {
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);  //y방향으로 쌓을 패널
		pnlBox.setLayout(box);
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		JTextField tf1 = new JTextField(20);  // 텍스트 입력창 길이
		JTextField tf2 = new JTextField(20);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf1.getText();  // 다이얼로그 만들기
				tf2.setText(text);
				JOptionPane.showMessageDialog(Main6.this, text);
			}
		});
		
		
		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);
		
		
		add(pnlBox);
		
		pack(); // 사이즈를 결정해주는 메소드  외부에 있는 컴포넌트에 크기를 맞춰서 조절해주는것.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String[] args) {
		Main6 m = new Main6();
		m.setVisible(true);
	}
}
