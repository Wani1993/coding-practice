import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mycounter2 extends JFrame implements ActionListener {
	private int number = 0;
	private JButton btn;  // 원래는 지역변수로 사용할수없었지만 필드로 선언함으로써 사용이 가능하다.
	private JButton btn2;
	private JLabel lbl;
	
	public Mycounter2() {
		super("카운터");
		
		JPanel pnl = new JPanel();
		lbl = new JLabel("0");
		btn = new JButton("증가");
	    btn2 = new JButton("감소");
		
		
			
		btn.addActionListener(this);
		btn2.addActionListener(this);
					
		pnl.add(lbl);
		pnl.add(btn);
			
		pnl.add(btn2);

		add(pnl);
		pnl.setBackground(Color.orange);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			number++;
		} else {
			number--;
		}
		lbl.setText(String.valueOf(number));
	}

	public static void main(String[] args) {
		Mycounter2 c = new Mycounter2();
		c.setVisible(true);
	}

	
}
