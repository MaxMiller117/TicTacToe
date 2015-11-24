package TicTacToe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTextField;


public class ttt_UI extends JFrame {

   private JPanel contentPane;
   private final Action action = new SwingAction();
   private final Action action_1 = new SwingAction_1();
   private final Action action_2 = new SwingAction_2();
   private final Action action_3 = new SwingAction_3();
   private final Action action_4 = new SwingAction_4();
   private final Action action_5 = new SwingAction_5();
   private final Action action_6 = new SwingAction_6();
   private final Action action_7 = new SwingAction_7();
   private final Action action_8 = new SwingAction_8();
   private JTextField textField;

	/**
	 * Launch the application.
	 */
   public static void main(String[] args) {
      EventQueue.invokeLater(
            new Runnable() {
               public void run() {
                  try {
                     ttt_UI frame = new ttt_UI();
                     frame.setVisible(true);
                  } 
                  catch (Exception e) {
                     e.printStackTrace();
                  }
               }
            });
   }

	/**
	 * Create the frame.
	 */
   public ttt_UI() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(new FormLayout(new ColumnSpec[] {
         	FormFactory.RELATED_GAP_COLSPEC,
         	FormFactory.DEFAULT_COLSPEC,
         	FormFactory.RELATED_GAP_COLSPEC,
         	ColumnSpec.decode("default:grow"),
         	FormFactory.RELATED_GAP_COLSPEC,
         	FormFactory.DEFAULT_COLSPEC,
         	FormFactory.RELATED_GAP_COLSPEC,
         	FormFactory.DEFAULT_COLSPEC,},
         new RowSpec[] {
         	FormFactory.RELATED_GAP_ROWSPEC,
         	FormFactory.DEFAULT_ROWSPEC,
         	FormFactory.RELATED_GAP_ROWSPEC,
         	FormFactory.DEFAULT_ROWSPEC,
         	FormFactory.RELATED_GAP_ROWSPEC,
         	FormFactory.DEFAULT_ROWSPEC,
         	FormFactory.RELATED_GAP_ROWSPEC,
         	FormFactory.DEFAULT_ROWSPEC,
         	FormFactory.RELATED_GAP_ROWSPEC,
         	FormFactory.DEFAULT_ROWSPEC,}));
   	
      JButton btn_1_1 = new JButton();
      btn_1_1.setAction(action);
      contentPane.add(btn_1_1, "2, 4");
   	
      JButton btn_2_1 = new JButton();
      btn_2_1.setAction(action_1);
      contentPane.add(btn_2_1, "4, 4");
   	
      JButton btn_3_1 = new JButton();
      btn_3_1.setAction(action_2);
      contentPane.add(btn_3_1, "6, 4");
   	
      JButton btn_1_2 = new JButton();
      btn_1_2.setAction(action_3);
      contentPane.add(btn_1_2, "2, 6, default, top");
   	
      JButton btn_2_2 = new JButton();
      btn_2_2.setAction(action_4);
      contentPane.add(btn_2_2, "4, 6");
   	
      JButton btn_3_2 = new JButton();
      btn_3_2.setAction(action_5);
      contentPane.add(btn_3_2, "6, 6");
   	
      JButton btn_1_3 = new JButton();
      btn_1_3.setAction(action_6);
      contentPane.add(btn_1_3, "2, 8");
   	
      JButton btn_2_3 = new JButton();
      btn_2_3.setAction(action_7);
      contentPane.add(btn_2_3, "4, 8");
   	
      JButton btn_3_3 = new JButton();
      btn_3_3.setAction(action_8);
      contentPane.add(btn_3_3, "6, 8");
   	
      textField = new JTextField();
      contentPane.add(textField, "4, 10, fill, default");
      textField.setColumns(10);
   }

   private class SwingAction extends AbstractAction {
      public SwingAction() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void actionPerformed(ActionEvent e) {
         putValue(NAME, "X");
         textField.setText("You Win");
      }
   }
   private class SwingAction_1 extends AbstractAction {
      public SwingAction_1() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void actionPerformed(ActionEvent e) {
         putValue(NAME, "X");
      }
   }
   private class SwingAction_2 extends AbstractAction {
      public SwingAction_2() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void actionPerformed(ActionEvent e) {
         putValue(NAME, "X");
      }
   }
   private class SwingAction_3 extends AbstractAction {
      public SwingAction_3() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void actionPerformed(ActionEvent e) {
         putValue(NAME, "X");
      }
   }
   private class SwingAction_4 extends AbstractAction {
      public SwingAction_4() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void actionPerformed(ActionEvent e) {
         putValue(NAME, "X");
      }
   }
   private class SwingAction_5 extends AbstractAction {
      public SwingAction_5() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void actionPerformed(ActionEvent e) {
         putValue(NAME, "X");
      }
   }
   private class SwingAction_6 extends AbstractAction {
      public SwingAction_6() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void actionPerformed(ActionEvent e) {
         putValue(NAME, "X");
      }
   }
   private class SwingAction_7 extends AbstractAction {
      public SwingAction_7() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void actionPerformed(ActionEvent e) {
         putValue(NAME, "X");
      }
   }
   private class SwingAction_8 extends AbstractAction {
      public SwingAction_8() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void actionPerformed(ActionEvent e) {
         putValue(NAME, "X");
      }
   }
}
