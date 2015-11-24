package TicTacToe;

public interface TicTacToeInput {
   public int[] getMove(TicTacToeLogic logic);
   public void win(int player);
}
