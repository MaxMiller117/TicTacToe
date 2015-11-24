package TicTacToe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.Sizes;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;
import java.util.Scanner;

import javax.swing.Action;
import javax.swing.JTextField;


public class ttt_UI extends JFrame implements TicTacToeInput {

   private JPanel contentPane;
   private final CGN action = new SwingAction();
   private final CGN action_1 = new SwingAction_1();
   private final CGN action_2 = new SwingAction_2();
   private final CGN action_3 = new SwingAction_3();
   private final CGN action_4 = new SwingAction_4();
   private final CGN action_5 = new SwingAction_5();
   private final CGN action_6 = new SwingAction_6();
   private final CGN action_7 = new SwingAction_7();
   private final CGN action_8 = new SwingAction_8();
   CGN[] actions={action,action_1,action_2,action_3,action_4,action_5,action_6,action_7,action_8};
   private JTextField textField;
   
   TicTacToeAI ai;
   int win=0;
   int currentPlayer=1;
   boolean ready=false;
   int lastButton=-1;

	/**
	 * Launch the application.
	 */
   public int[] getMove(TicTacToeLogic logic){
	   System.out.println("It is Player "+currentPlayer+"'s turn.");
	   for(int i=0;i<3;i++){
	      System.out.println("["+logic.getCell(i,0)+","+logic.getCell(i,1)+","+logic.getCell(i,2)+"]");
	   }
	   for(int i=0;i<3;i++)
		   for(int j=0;j<3;j++)
			   actions[j+3*i].setName(""+logic.getCell(i,j));
	   
	   int[] output=new int[3];
	   output[2]=currentPlayer;
	   if(currentPlayer==1){
		   boolean valid=false;
		   while(!valid){
			   while(!ready){System.out.print("");};
			   valid=logic.isValid((lastButton-1)%3,(lastButton-1)/3);
			   if(ready && !valid)
				   ready=false;
		   }
		   System.out.println(ready);
		   output[0]=(lastButton-1)%3;
		   output[1]=(lastButton-1)/3;
	   }else
		   output=ai.getMove(logic,currentPlayer);
	   
	   if(currentPlayer==1)
	      currentPlayer=2;
	   else
	      currentPlayer=1;
	   ready=false;
	   System.out.println("x:"+output[0]+"    y:"+output[1]+"     p:"+output[2]);
	   return output;
	   //Will return move in form of {x,y,p}
   }
   	public void win(int p){
   		win=p;
   		textField.setText("Player "+p+" wins!");
   	}
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
   public ttt_UI(){
	   this(new TicTacToeBasicAI());
   }
   
   public ttt_UI(TicTacToeAI tttai) {
	   
	  setVisible(true);
	   
	  ai=tttai;
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(40dlu;pref)"),
				FormFactory.RELATED_GAP_COLSPEC,
				new ColumnSpec(ColumnSpec.FILL, Sizes.bounded(Sizes.PREFERRED, Sizes.constant("40dlu", true), Sizes.constant("40dlu", true)), 0),
				FormFactory.RELATED_GAP_COLSPEC,
				new ColumnSpec(ColumnSpec.FILL, Sizes.bounded(Sizes.PREFERRED, Sizes.constant("40dlu", true), Sizes.constant("40dlu", true)), 0),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				new RowSpec(RowSpec.CENTER, Sizes.bounded(Sizes.DEFAULT, Sizes.constant("40dlu", false), Sizes.constant("40dlu", false)), 0),
				FormFactory.RELATED_GAP_ROWSPEC,
				new RowSpec(RowSpec.CENTER, Sizes.bounded(Sizes.DEFAULT, Sizes.constant("40dlu", false), Sizes.constant("40dlu", false)), 0),
				FormFactory.RELATED_GAP_ROWSPEC,
				new RowSpec(RowSpec.CENTER, Sizes.bounded(Sizes.DEFAULT, Sizes.constant("40dlu", false), Sizes.constant("40dlu", false)), 0),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JButton btn_1_1 = new JButton();
		btn_1_1.setAction((Action) action);
		contentPane.add(btn_1_1, "2, 4, fill, fill");
		
		JButton btn_2_1 = new JButton();
		btn_2_1.setAction((Action) action_1);
		contentPane.add(btn_2_1, "4, 4, default, fill");
		
		JButton btn_3_1 = new JButton();
		btn_3_1.setAction((Action) action_2);
		contentPane.add(btn_3_1, "6, 4, default, fill");
		
		JButton btn_1_2 = new JButton();
		btn_1_2.setAction((Action) action_3);
		contentPane.add(btn_1_2, "2, 6, default, fill");
		
		JButton btn_2_2 = new JButton();
		btn_2_2.setAction((Action) action_4);
		contentPane.add(btn_2_2, "4, 6, default, fill");
		
		JButton btn_3_2 = new JButton();
		btn_3_2.setAction((Action) action_5);
		contentPane.add(btn_3_2, "6, 6, default, fill");
		
		JButton btn_1_3 = new JButton();
		btn_1_3.setAction((Action) action_6);
		contentPane.add(btn_1_3, "2, 8, default, fill");
		
		JButton btn_2_3 = new JButton();
		btn_2_3.setAction((Action) action_7);
		contentPane.add(btn_2_3, "4, 8, default, fill");
		
		JButton btn_3_3 = new JButton();
		btn_3_3.setAction((Action) action_8);
		contentPane.add(btn_3_3, "6, 8, default, fill");
		
		textField = new JTextField();
		textField.setEditable(false);
		contentPane.add(textField, "4, 10, fill, default");
		textField.setColumns(10);
   }
   
   private class SwAction extends AbstractAction {
	   	  public SwAction() {
	         putValue(NAME, "\t");
	         putValue(SHORT_DESCRIPTION, "Some short description");
	      }
	      public void actionPerformed(ActionEvent e) {
	         //putValue(NAME, "X");
	         textField.setText("You Win");
	      }
   }
   private interface CGN{
	   public void setName(String str);
   }
   
   private class SwingAction extends AbstractAction implements CGN {
      public SwingAction() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void setName(String str){
    	  putValue(NAME,str);
      }
      public void actionPerformed(ActionEvent e) {
    	 if(!ready){
    		 //putValue(NAME, "X");
    		 lastButton=1;
    		 ready=true;
    	 }
      }
   }
   private class SwingAction_1 extends AbstractAction implements CGN {
      public SwingAction_1() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void setName(String str){
    	  putValue(NAME,str);
      }
      public void actionPerformed(ActionEvent e) {
    	 if(!ready){
    		 //putValue(NAME, "X");
    		 lastButton=2;
    		 ready=true;
    	 }
      }
   }
   private class SwingAction_2 extends AbstractAction implements CGN {
      public SwingAction_2() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void setName(String str){
    	  putValue(NAME,str);
      }
      public void actionPerformed(ActionEvent e) {
    	 if(!ready){
    		 //putValue(NAME, "X");
    		 lastButton=3;
    		 ready=true;
    	 }
      }
   }
   private class SwingAction_3 extends AbstractAction implements CGN {
      public SwingAction_3() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void setName(String str){
    	  putValue(NAME,str);
      }
      public void actionPerformed(ActionEvent e) {
    	  if(!ready){
         //putValue(NAME, "X");
         lastButton=4;
         ready=true;}
      }
   }
   private class SwingAction_4 extends AbstractAction implements CGN {
      public SwingAction_4() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void setName(String str){
    	  putValue(NAME,str);
      }
      public void actionPerformed(ActionEvent e) {
    	  if(!ready){
         //putValue(NAME, "X");
         lastButton=5;
         ready=true;}
      }
   }
   private class SwingAction_5 extends AbstractAction implements CGN {
      public SwingAction_5() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void setName(String str){
    	  putValue(NAME,str);
      }
      public void actionPerformed(ActionEvent e) {
    	  if(!ready){
         //putValue(NAME, "X");
         lastButton=6;
         ready=true;}
      }
   }
   private class SwingAction_6 extends AbstractAction implements CGN {
      public SwingAction_6() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void setName(String str){
    	  putValue(NAME,str);
      }
      public void actionPerformed(ActionEvent e) {
    	  if(!ready){
         //putValue(NAME, "X");
         lastButton=7;
         ready=true;}
      }
   }
   private class SwingAction_7 extends AbstractAction implements CGN {
      public SwingAction_7() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void setName(String str){
    	  putValue(NAME,str);
      }
      public void actionPerformed(ActionEvent e) {
    	  if(!ready){
         //putValue(NAME, "X");
         lastButton=8;
         ready=true;}
      }
   }
   private class SwingAction_8 extends AbstractAction implements CGN {
      public SwingAction_8() {
         putValue(NAME, "\t");
         putValue(SHORT_DESCRIPTION, "Some short description");
      }
      public void setName(String str){
    	  putValue(NAME,str);
      }
      public void actionPerformed(ActionEvent e) {
    	  if(!ready){
         //putValue(NAME, "X");
         lastButton=9;
         ready=true;}
      }
   }
}
