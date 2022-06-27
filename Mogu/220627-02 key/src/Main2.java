import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main2 extends JFrame {
	public Main2() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10);  // 패스워드 처럼 글자들이 안보인다.
		
		JTextArea ta = new JTextArea(20, 20);  // 글자를 칠수있는 구역을 만들수있다
		JScrollPane scrl = new JScrollPane(ta);  // 스크롤을 할수있는 컴포넌트를 파라메터에 넣는다
		
		
		pnl.add(tf);
		pnl.add(pf);
		
		add(pnl);
		add(scrl, "South");
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("엔터누름");
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int id = e.getID();
				if (id == KeyEvent.KEY_TYPED) {
					char ch = e.getKeyChar();
					ta.append(String.valueOf(ch) + "\n");
				}
				
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		
		
	}
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}

}
