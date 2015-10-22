
public class TicTacToe {
	public static void main(String[] args){
		TicTacToeGUI gui=new TicTacToeGUI();
		TicTacToeLogic logic=new TicTacToeLogic();
		while(true){
			int[] move=gui.getMove(logic);
			logic.setCell(move);
			int win=logic.isWin();
			if(win!=0){
				System.out.println("Player "+win+" wins.");
				//end program
			}
		}
	}
}
