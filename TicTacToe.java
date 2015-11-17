
public class TicTacToe {
	public static void main(String[] args){
		TicTacToeInput gui=new TicTacToeGUI();
		TicTacToeInput console=new TicTacToeCommandLineUI();
		TicTacToeLogic logic=new TicTacToeLogic();
		int win=0;
		while(win==0){
			TicTacToeInput io=console;
			int[] move=io.getMove(logic);
			logic.setCell(move);
			win=logic.isWin();
			if(win!=0){
				io.win(win);
				System.exit(0);
			}
		}
	}
}
