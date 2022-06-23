import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mycounter extends JFrame {
	private int number = 0;
	
	public Mycounter() {
		super("카운터");
		
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("0");
		JButton btn = new JButton("증가");
		
		
		JLabel lbl2 = new JLabel("0");
		JButton btn2 = new JButton("감소");
		JButton btn3 = new JButton("바꿔");
		
		btn.addActionListener(new ActionListener( ) {
			@Override
			public void actionPerformed(ActionEvent e) {
				number++;
				lbl.setText(String.valueOf(number));
				if(number == 10) {
					pnl.setBackground(Color.black);
					}
			}
		});
		
		pnl.add(lbl);
		pnl.add(btn);
			
		pnl.add(btn2);
		pnl.add(btn3);
		
		btn2.addActionListener(new ActionListener( ) {
			@Override
			public void actionPerformed(ActionEvent e) {
				number--;
				lbl.setText(String.valueOf(number));
				if(number == -10) {
					pnl.setBackground(Color.red);
				}
			}
		});
		
		
		btn3.addActionListener(new ActionListener( ) {
			@Override
			public void actionPerformed(ActionEvent e) {
				number = 0;
				lbl.setText(String.valueOf(number));
				pnl.setBackground(Color.cyan);
			}
		});
		
	
		

		
		add(pnl);
		pnl.setBackground(Color.orange);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		Mycounter c = new Mycounter();
		c.setVisible(true);
	}
}
