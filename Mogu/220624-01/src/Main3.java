import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main3 extends JFrame{
   public Main3() {
      super("라디오버튼");
      
      JPanel pnl = new JPanel();
      
      JRadioButton rdb1 = new JRadioButton("라디오1"); 
      JRadioButton rdb2 = new JRadioButton("라디오2");
      JRadioButton rdb3 = new JRadioButton("라디오3");
      ButtonGroup group = new ButtonGroup(); // 라디오버튼을 그룹안으로 넣는 클래스. 그래야지 그룹안에서 한개씩만 클릭가능.
      group.add(rdb1);
      group.add(rdb2);
      group.add(rdb3);
      
//      JRadioButton rdb4 = new JRadioButton("4번쨰");
//      JRadioButton rdb5 = new JRadioButton("5번쨰");
      
      rdb1.addItemListener(new ItemListener() {
         
         @Override
         public void itemStateChanged(ItemEvent e) {
            System.out.println(e.getStateChange() == ItemEvent.SELECTED);
            
         }
      });
      
      
      pnl.add(rdb1);
      pnl.add(rdb2);
      pnl.add(rdb3);
      //pnl.add(rdb4);
      //pnl.add(rdb5);
      
      add(pnl);
      
      setSize(500, 500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public static void main(String[] args) {
      new Main3().setVisible(true);

   }

}