
public class TicTacToe {
	public static void main(String[] args){
		TicTacToeInput gui=new TicTacToeGUI();
		TicTacToeInput console=new TicTacToeCommandLineUI();
		TicTacToeLogic logic=new TicTacToeLogic();
		int win=0;
		while(win==0){
			//int[] move=gui.getMove(logic);
			int[] move=console.getMove(logic);
			logic.setCell(move);
			win=logic.isWin();
			if(win!=0){
				System.out.println("Player "+win+" wins.");
				//end program
				//break
			}
		}
	}
}
