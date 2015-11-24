package TicTacToe;

public class TicTacToeBasicAI implements TicTacToeAI {
   public int[] getMove(TicTacToeLogic logic,int p){
      int[] move=getEasyWin(logic,p);
      if(move[0]!=-1)
         return move;
      move=getRandom(logic,p);
      return move;
   }
   public int[] getEasyWin(TicTacToeLogic logic, int p){
      int[] move=new int[3];
      move[2]=p;
      int win=0;
      for(int i=0;i<3 && win!=0;i++){
         for(int j=0;j<3 && win!=0;j++){
            move[0]=i;
            move[1]=j;
            TicTacToeLogic tempLogic=logic;
            if(logic.isValid(i,j)){
               logic.setCell(i,j,p);
               win=logic.isWin();
            }
         }
      }
      if(win==0)
         move[0]=-1;
      return move;
   }
   public int[] getRandom(TicTacToeLogic logic,int p){
      int[] move=new int[3];
      move[2]=p;
      for(boolean valid=false;!valid;logic.isValid(move[0],move[1])){
         move[0]=(int)Math.random()*3;
         move[1]=(int)Math.random()*3;
      }
      return move;
   }
}
