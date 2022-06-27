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
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;

public class Prc3 extends JFrame {
		
	
	public Prc3() {
		super("수학문제");
		
		
		What w = new What(); //내가 만든 클래스 입력
		w.run();
		
		JPanel pnl = new JPanel();  
		pnl.setSize(new Dimension(600, 400));
		pnl.setPreferredSize(new Dimension(600, 400));
		pnl.setLayout(null);
		
		JTextField result = new JTextField(15); 
		result.setBounds(32, 117, 455, 35);
		result.setPreferredSize(new Dimension(200, 35));
		result.setFont(new Font("Arial", Font.BOLD, 15));
		pnl.add(result);
		
		
		
		getContentPane().add(pnl, BorderLayout.EAST);
		setSize(600, 204);
		pnl.setBackground(Color.pink);
		
		
		JButton btn1 = new JButton("확인");
		btn1.setBounds(499, 117, 75, 35);
		btn1.setPreferredSize(new Dimension(75, 35));
		pnl.add(btn1);
		JButton exam = new JButton(w.ee());
		exam.setBounds(32, 10, 542, 97);
		exam.setPreferredSize(new Dimension(265, 50));
		exam.setFont(new Font("Arial", Font.BOLD, 50));
		
		pnl.add(exam);
		
		exam.setEnabled(false);
		
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = result.getText(); // 다이얼로그 만들기
				if(text.equals(w.result)) {
					JOptionPane.showMessageDialog(Prc3.this, "언제까지 맞추나 보자");
					w.run();
					exam.setText(w.ee());
					result.setText("");
				} else {
					JOptionPane.showMessageDialog(Prc3.this, "응 아니야~");
				}
			}
		});
		
		setLocationRelativeTo(null); // 창이 가운데에서 출력된다
		setVisible(true);
			
		
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
