import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Main4 extends JFrame {
			
	private JTextField textField;
	public Main4() {
	super("변환 프로그램");
	
	What w = new What();
	
	JPanel pnl = new JPanel();
	ButtonGroup group = new ButtonGroup();
	
	
	
	getContentPane().add(pnl);
	pnl.setLayout(null);
	
	JPanel panel = new JPanel();
	panel.setBounds(202, 47, 117, 33);
	pnl.add(panel);
	
	JRadioButton btn2 = new JRadioButton("inch → cm");
	panel.add(btn2);
	group.add(btn2);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBounds(55, 47, 117, 33);
	pnl.add(panel_1);
	JRadioButton btn = new JRadioButton("cm → inch");
	panel_1.add(btn);
	group.add(btn);
	
	
	
	textField = new JTextField();
	textField.setBounds(55, 117, 156, 33);
	pnl.add(textField);
	textField.setColumns(10);
	
	JPanel panel_2 = new JPanel();
	panel_2.setBounds(223, 117, 220, 33);
	pnl.add(panel_2);
	panel_2.setBackground(Color.WHITE);
	SpringLayout sl_panel_2 = new SpringLayout();
	panel_2.setLayout(sl_panel_2);
	
	JLabel lblNewLabel = new JLabel("결과값");
	sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel, -8, SpringLayout.SOUTH, panel_2);
	sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel, -28, SpringLayout.EAST, panel_2);
	panel_2.add(lblNewLabel);
	
	JButton btnNewButton = new JButton("변환");
	btnNewButton.setBounds(346, 47, 97, 33);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("변환")) {
				if(btn.isSelected() == true) {
					w.setNum(Integer.parseInt(textField.getText()));
					w.ingo();
					lblNewLabel.setText(String.valueOf(w.result) + "inch");
				} else if(btn2.isSelected() == true) {
					w.setNum(Integer.parseInt(textField.getText()));
					w.cmgo();
					lblNewLabel.setText(String.valueOf(w.result) + "cm");
				} else { 
					lblNewLabel.setText("다시 입력하세요");
				}
			}
		}
	});
	
	pnl.setBackground(Color.pink);
	pnl.add(btnNewButton);
    setSize(500, 250);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
	
	
	class What {
		private int num;
		private double result; 
		
		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public double getResult() {
			return result;
		}

		public void setResult(double result) {
			this.result = result;
		}

		public void ingo() {
			result = num * 0.393701;
		}
		
		public void cmgo() {
			result = num * 2.54;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		Main4 m = new Main4();
		m.setVisible(true);
	}
}
