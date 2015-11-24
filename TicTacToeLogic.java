package TicTacToe;

public class TicTacToeLogic {
   private int[][] board; //0 is blank, 1 is player 1's piece, 2 is player 2's piece
   public TicTacToeLogic(){
      board=new int[3][3];
   }
   public int getCell(int x,int y){
      return board[x][y];
   }
   public void setCell(int x,int y,int p){
      board[y][x]=p;
   }
   public void setCell(int[] move){
      setCell(move[0],move[1],move[2]);
   }
   public int isWin(){ //0 is no win, 1 is player 1 wins, 2 is player 2 wins
      for(int i=0;i<3;i++){
         if(board[i][0]==board[i][1] && board[i][0]==board[i][2] && board[i][0]!=0) //horizontal win condition
            return board[i][0];
         if(board[0][i]==board[1][i] && board[0][i]==board[2][i] && board[i][0]!=0) //vertical win condition
            return board[0][i];
      }
      if(board[1][1]==board[0][0] && board[1][1]==board[2][2] && board[1][1]!=0) //downward diagonal win condition
         return board[1][1];
      if(board[1][1]==board[0][2] && board[1][1]==board[2][0] && board[1][1]!=0) //upward diagonal win condition
         return board[1][1];
      return 0;
   }
   public boolean isValid(int x,int y){
      return x<3 && y<3 && getCell(x,y)==0;
   }
   public boolean isValid(int x,int y,int p){
      return isValid(x,y);
   }
   public boolean isValid(int[] move){
      return isValid(move[0],move[1]);
   }
}
