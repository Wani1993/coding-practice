import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.util.Random;

import javax.management.StringValueExp;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JLabel;

public class Prc extends JFrame {
		
	
	public Prc() {
		super("수학문제");
		
		
		What w = new What(); //내가 만든 클래스 입력
		w.run();
		
		JPanel pnl = new JPanel();  
		JButton exam = new JButton(w.ee());
		exam.setPreferredSize(new Dimension(265, 50));
		exam.setFont(new Font("Arial", Font.BOLD, 50));
		
		JTextField result = new JTextField(15); 
		result.setPreferredSize(new Dimension(200, 35));
		result.setFont(new Font("Arial", Font.BOLD, 15));
		
		pnl.add(exam);
		pnl.add(result);
		
		
		
		getContentPane().add(pnl);
		setSize(302, 143);
		pnl.setBackground(Color.pink);
		
		exam.setEnabled(false);
		
		
		JButton btn1 = new JButton("확인");
		btn1.setPreferredSize(new Dimension(75, 35));
		pnl.add(btn1);
		
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = result.getText(); // 다이얼로그 만들기
				if(text.equals(w.result)) {
					JOptionPane.showMessageDialog(Prc.this, "언제까지 맞추나 보자");
					w.run();
					exam.setText(w.ee());
					result.setText("");
				} else {
					JOptionPane.showMessageDialog(Prc.this, "응 아니야~");
				}
			}
		});
		
		setLocationRelativeTo(null); // 창이 가운데에서 출력된다
		
			
		
	}
	
	class What {
		int a;
		int b;
		String result;
		
			
		public String ee() {
			String s = this.a + "+" + this.b;
			return s;
		}
		
		public void run() {
			Random ran = new Random();
			this.a = ran.nextInt(99) + 1;
			this.b = ran.nextInt(99) + 1;
			
			this.result = String.valueOf((a + b));
		}
		
		
	}


	public static void main(String[] args) {
		Prc p = new Prc();
		p.setVisible(true);
		
		
	}
}
