import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	public Main() {
		JPanel pnl = new JPanel();
		JCheckBox check1 = new JCheckBox("첫번째");
		JCheckBox check2 = new JCheckBox("두번째");
		JCheckBox check3 = new JCheckBox("세번째");
		
//		check1.setSelected(true);  // 체크박스에 true 면 체크 해준다.
//		System.out.println(check2.isSelected()); // isSelected 는 선택 됬는지 안됬는지 확인후 불린값으로 반환
		
		check1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {  // 체크가 되었나 안되었나도 하나의 이벤트
				System.out.println("사용자가 체크박스를 눌렀음");
				System.out.println(check1.isSelected());
			}
		});
		
		
		check2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange();
				System.out.println(result == ItemEvent.SELECTED); // getStateChange 의 결과값은 인트값인데 이것을 상수를 이용해 원하는 값으로 변경.
			}
		});
		
		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().setVisible(true);
	}

}
