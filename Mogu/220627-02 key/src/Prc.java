import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Prc extends JFrame {
	public Prc() {
		super("로그인 프로그램");
		JPanel pnl = new JPanel();
		JTextField id = new JTextField(10);
		id.setBounds(94, 35, 253, 28);
		JPasswordField ps = new JPasswordField(10);
		ps.setBounds(94, 89, 253, 30);
		
		Prc2 map = new Prc2();
				
	
		
		getContentPane().add(pnl);
		pnl.setLayout(null);
		pnl.add(id);
		pnl.add(ps);
		
		
		JButton btn = new JButton("로그인");
		btn.setBounds(43, 145, 126, 31);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(map.getMap().containsKey(id.getText()) && map.getMap().containsValue(ps.getText())) {
				JOptionPane.showMessageDialog(Prc.this, "로그인 성공");
				setVisible(false);
				new Prc3();
				} else {
					JOptionPane.showMessageDialog(Prc.this, "아이디나 비밀번호를 확인하세요!");
				}
			}
		});
		pnl.add(btn);
		
		JButton btn2 = new JButton("회원가입");
		btn2.setBounds(221, 145, 126, 31);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				map.setVisible(true);
			
			}
		});
		pnl.add(btn2);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(25, 41, 57, 15);
		pnl.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(25, 96, 57, 15);
		pnl.add(lblNewLabel_1);
		
		
		setSize(400, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pnl.setBackground(Color.pink);
		
	    setLocationRelativeTo(null); // 창이 가운데에서 출력된다
		
	}
	
	
	
	public static void main(String[] args) {
		new Prc().setVisible(true);
	}
}
