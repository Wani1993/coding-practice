import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Prc2 extends JFrame {
	private Map<String, String> map;

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Prc2() {
		super("회원가입 프로그램");
		map = new HashMap<>();
		JPanel pnl = new JPanel();
		JTextField id = new JTextField(10);
		id.setBounds(106, 35, 152, 28);
		JPasswordField ps = new JPasswordField(10);
		ps.setBounds(106, 106, 152, 30);

		JPasswordField psre = new JPasswordField();
		psre.setBounds(106, 174, 152, 28);
		pnl.add(psre);
		psre.setColumns(10);

		getContentPane().add(pnl);
		pnl.setLayout(null);
		pnl.add(id);
		pnl.add(ps);

		JButton btn = new JButton("회원가입");
		btn.setBounds(75, 266, 126, 31);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (id.getText().length() >= 4 && id.getText().length() <= 12 && ps.getText().length() >= 4
						&& ps.getText().length() <= 12) {
					if (map.containsKey(id.getText())) {
						JOptionPane.showMessageDialog(Prc2.this, "이미 가입된 아이디입니다");
					}
					if (ps.getText().equals(psre.getText()) && !ps.getText().equals("") && !psre.getText().equals("")) {
						if (!map.containsKey(id.getText())) {
							map.put(id.getText(), ps.getText());  // 맵에 아이디 비번 저장
							JOptionPane.showMessageDialog(Prc2.this, "회원가입 완료");
							id.setText("");
							ps.setText("");
							psre.setText("");
							System.out.println("되고있니");
						    setVisible(false);
						}
					} else {
						JOptionPane.showMessageDialog(Prc2.this, "비밀번호를 확인해주세요");
					}
				} else {
					if (id.getText().length() < 4) {
						JOptionPane.showMessageDialog(Prc2.this, "아이디가 너무 짧습니다.");
					} else if (id.getText().length() > 12) {
						JOptionPane.showMessageDialog(Prc2.this, "아이디가 너무 길어요우.");
					} else if (ps.getText().length() < 4) {
						JOptionPane.showMessageDialog(Prc2.this, "비밀번호가 너무 짧습니다.");
					} else if (ps.getText().length() > 12) {
						JOptionPane.showMessageDialog(Prc2.this, "비밀번호가 너무 길어요우.");
					}
				}
			}
		});
		pnl.add(btn);

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(32, 41, 57, 15);
		pnl.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(29, 113, 57, 15);
		pnl.add(lblNewLabel_1);

		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pnl.setBackground(Color.LIGHT_GRAY);

		JLabel lblNewLabel_2 = new JLabel("비밀번호 확인");
		lblNewLabel_2.setBounds(16, 179, 84, 15);
		pnl.add(lblNewLabel_2);

		setLocationRelativeTo(null); // 창이 가운데에서 출력된다

	}

	public static void main(String[] args) {
		new Prc2().setVisible(true);
	}
}
