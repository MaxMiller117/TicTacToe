import java.util.Scanner;

public class TicTacToeCommandLineUI implements TicTacToeInput {
	int currentPlayer=1;
	public int[] getMove(TicTacToeLogic logic){
		System.out.println("It is Player "+currentPlayer+"'s turn.");
		for(int i=0;i<3;i++){
			System.out.println("["+logic.getCell(i,0)+","+logic.getCell(i,1)+","+logic.getCell(i,2)+"]");
		}
		int[] output=new int[3];
		output[2]=currentPlayer;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter x-coordinate:");
		output[0]=in.nextInt()-1;
		System.out.println("Enter y-coordinate:");
		output[1]=in.nextInt()-1;
		if(currentPlayer==1)
			currentPlayer=2;
		else
			currentPlayer=1;
		return output;
		//Will return move in form of {x,y,p}
	}
	public void win(int player){
		System.out.println("Player "+player+" wins.");
	}
}
