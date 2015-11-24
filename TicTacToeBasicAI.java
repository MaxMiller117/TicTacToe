package TicTacToe;

public class TicTacToeBasicAI implements TicTacToeAI {
   public int[] getMove(TicTacToeLogic logic,int p){
      int[] move=getEasyWin(logic,p);
      if(move[0]!=-1)
         return move;
      System.out.println("Picking random move...");
      move=getRandom(logic,p);
      return move;
   }
   public int[] getEasyWin(TicTacToeLogic logic, int p){
      int[] move=new int[3];
      move[2]=p;
      int win=0;
      for(int i=0;i<3 && win==0;i++){
         for(int j=0;j<3 && win==0;j++){
            move[1]=i;
            move[0]=j;
            TicTacToeLogic tempLogic=logicCopy(logic);
            if(tempLogic.isValid(i,j)){
               tempLogic.setCell(i,j,p);
               win=tempLogic.isWin();
            }
            if(win!=0)
            	System.out.println("Found winning move.");
         }
      }
      if(win==0){
         move[0]=-1;
         System.out.println("No winning move.");
      }
      return move;
   }
   public int[] getRandom(TicTacToeLogic logic,int p){
      int[] move=new int[3];
      move[2]=p;
      for(boolean valid=false;!valid;valid=logic.isValid(move[0],move[1])){
         move[0]=(int)(Math.random()*3);
         move[1]=(int)(Math.random()*3);
      }
      System.out.println("...picked.");
      return move;
   }
   public TicTacToeLogic logicCopy(TicTacToeLogic logic){
	   TicTacToeLogic out=new TicTacToeLogic();
	   for(int i=0;i<3;i++)
		   for(int j=0;j<3;j++)
			   out.setCell(i,j,logic.getCell(i,j));
	   return out;
   }
}
