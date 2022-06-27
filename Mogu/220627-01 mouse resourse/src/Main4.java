import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame {
	public Main4() {
		JPanel pnl = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		URL url = Main4.class.getClassLoader().getResource("images/춘식13.png"); // 그림파일 앞에 / 를 통해  경로설정을 할수있다.
		ImageIcon image = new ImageIcon(kit.getImage(url));
		URL url2 = Main4.class.getClassLoader().getResource("images/춘식7.png"); // 경로 설정을 통해 같은 폴더안에 이미지 파일이 없더라도 가능하다.
		ImageIcon image2 = new ImageIcon(kit.getImage(url2));
		
//		Image image = kit.getImage("춘식13.png");  // 이거는 그림이 같은 폴더안에 있을때만 가능함
//	 	Image image2 = kit.getImage("춘식7.png");
	
		
		JLabel lbl = new JLabel(image);
		pnl.add(lbl);
		
		lbl.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				lbl.setIcon(image);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				lbl.setIcon(image2);
			}
		});
		
		add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
