import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Point;

public class Main2 extends JFrame {
	public Main2() {
		
		Price p = new Price();
		
		
		JPanel pnl = new JPanel();
		JPanel pnl2 = new JPanel();
		pnl2.setBounds(165, 68, 178, 100);
		JCheckBox check1 = new JCheckBox("짜장면");
		check1.setBounds(49, 43, 79, 40);
		check1.setPreferredSize(new Dimension(200, 30));
		JCheckBox check2 = new JCheckBox("짬뽕");
		check2.setBounds(49, 110, 79, 40);
		JCheckBox check3 = new JCheckBox("탕수육");
		check3.setBounds(49, 175, 79, 40);
		pnl.setLayout(null);
		
		getContentPane().add(pnl);
		pnl.setBackground(Color.DARK_GRAY);
		setSize(400, 300);
		pnl2.setPreferredSize(new Dimension(100, 100));
		pnl2.setBackground(Color.pink);
		pnl2.setLayout(null);
		
		JPanel price = new JPanel();
		price.setBounds(37, 44, 111, 30);
		price.setPreferredSize(new Dimension(50, 30));
		pnl2.add(price);
		price.setLayout(null);
		
		JLabel pp = new JLabel();
		pp.setBounds(27, 10, 57, 15);
		price.add(pp);
		
		JLabel lblNewLabel = new JLabel("총 가격은");
		lblNewLabel.setBounds(67, 19, 52, 15);
		pnl2.add(lblNewLabel);
		
		
		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);
		pnl.add(pnl2);
	
	
		check1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {  // 체크가 되었나 안되었나도 하나의 이벤트
				
				if(check1.isSelected()) {

					if (check1.isSelected() && check2.isSelected()) {
						pp.setText(Integer.toString(p.zza + p.zzam));
					} 
					if (check2.isSelected() && check3.isSelected()) {
						pp.setText(Integer.toString(p.zzam + p.tang));
					} 
					if (check1.isSelected() && check3.isSelected()) {
						pp.setText(Integer.toString(p.zza + p.tang));
					}  
					if(check1.isSelected() && check2.isSelected() && check3.isSelected()) {
						pp.setText(Integer.toString(p.zza + p.tang + p.zzam));
					}
					if(check1.isSelected()) {
						pp.setText(Integer.toString(p.zza));
					}
					if(check2.isSelected()) {
						pp.setText(Integer.toString(p.zzam));
					}
					if(check3.isSelected()) {
						pp.setText(Integer.toString(p.tang));
					}
				} else {
					pp.setText(null);
				}
				if(check1.isSelected() && check2.isSelected() && check3.isSelected()) {
					pp.setText(Integer.toString(p.zza + p.tang + p.zzam));
				} else if (check1.isSelected() && check2.isSelected()) {
					pp.setText(Integer.toString(p.zza + p.zzam));
				} else if (check1.isSelected() && check3.isSelected()) {
					pp.setText(Integer.toString(p.zza + p.tang));
				}
			}
		});
		
		check2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {  // 체크가 되었나 안되었나도 하나의 이벤트
				
				if(check2.isSelected()) {

					if (check1.isSelected() && check2.isSelected()) {
						pp.setText(Integer.toString(p.zza + p.zzam));
					} 
					else if (check2.isSelected() && check3.isSelected()) {
						pp.setText(Integer.toString(p.zzam + p.tang));
					} 
					else if (check1.isSelected() && check3.isSelected()) {
						pp.setText(Integer.toString(p.zza + p.tang));
					}  
					else if(check1.isSelected() && check2.isSelected() && check3.isSelected()) {
						pp.setText(Integer.toString(p.zza + p.tang + p.zzam));
					}
					else if(check1.isSelected()) {
						pp.setText(Integer.toString(p.zza));
					}
					else if(check2.isSelected()) {
						pp.setText(Integer.toString(p.zzam));
					}
					else if(check3.isSelected()) {
						pp.setText(Integer.toString(p.tang));
					}
				} else {
					pp.setText(null);
				}
				if(check1.isSelected() && check2.isSelected() && check3.isSelected()) {
					pp.setText(Integer.toString(p.zza + p.tang + p.zzam));
				}
			}
		});
	
		check3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {  // 체크가 되었나 안되었나도 하나의 이벤트
				
				if(check3.isSelected()) {
					

					if (check1.isSelected() && check2.isSelected()) {
						pp.setText(Integer.toString(p.zza + p.zzam));
					} 
					else if (check2.isSelected() && check3.isSelected()) {
						pp.setText(Integer.toString(p.zzam + p.tang));
					} 
					else if (check1.isSelected() && check3.isSelected()) {
						pp.setText(Integer.toString(p.zza + p.tang));
					}  
					else if(check1.isSelected() && check2.isSelected() && check3.isSelected()) {
						pp.setText(Integer.toString(p.zza + p.tang + p.zzam));
					}
					else if(check1.isSelected()) {
						pp.setText(Integer.toString(p.zza));
					}
					else if(check2.isSelected()) {
						pp.setText(Integer.toString(p.zzam));
					}
					else if(check3.isSelected()) {
						pp.setText(Integer.toString(p.tang));
					}
				} else {
					pp.setText(null);
				}
				if(check1.isSelected() && check2.isSelected() && check3.isSelected()) {
					pp.setText(Integer.toString(p.zza + p.tang + p.zzam));
				}
			}
		});
		
		
		
		if (check1.isSelected() && check2.isSelected()) {
			pp.setText(Integer.toString(p.zza + p.zzam));
		} 
		if (check2.isSelected() && check3.isSelected()) {
			pp.setText(Integer.toString(p.zzam + p.tang));
		} 
		if (check1.isSelected() && check3.isSelected()) {
			pp.setText(Integer.toString(p.zza + p.tang));
		}  
		if(check1.isSelected() && check2.isSelected() && check3.isSelected()) {
			pp.setText(Integer.toString(p.zza + p.tang + p.zzam));
		}
		if(check1.isSelected()) {
			pp.setText(Integer.toString(p.zza));
		}
		if(check2.isSelected()) {
			pp.setText(Integer.toString(p.zzam));
		}
		if(check3.isSelected()) {
			pp.setText(Integer.toString(p.tang));
		}
		
		
		
		
	}
	
	class Price {
		int zzam = 6000;
		int zza = 4000;
		int tang = 10000;
		
		public int total() {
			return zza + zzam + tang;
		}
		
	}
	
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
