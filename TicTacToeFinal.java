import java.util.Scanner;

public class TicTacToeFinal
{
	static Scanner input = new Scanner(System.in);
	
	//0 is free, 1 is player, 2 is computer 

	//integers that represent if the space is free or taken by either player or computer
	static int A1, A2, A3, B1, B2, B3, C1, C2, C3; 
	static String pA1 = "";
	static String pA2 = "";
	static String pA3 = "";
	static String pB1 = "";
	static String pB2 = "";
	static String pB3 = "";
	static String pC1 = "";
	static String pC2 = "";
	static String pC3 = "";
	static String compmove = "";

	public static void main(String[] args){

		String prompt = "enter your move: ";
		String error = "not a valid move. try again: ";
		String winner = "You win!";
		String draw = "It's a draw.";
		String loser = "You lost!";
		
		for (int i = 0; i < 9; i++){
		displayBoard();
		System.out.println(prompt);
		String move = input.nextLine();

		//check to see if valid move, and if not, prompt's for move again
		while (isValidMove(move) == false) {
			System.out.println(error);
			move = input.nextLine();
			}
		//make the valid move
		makeMove(move);

		//check to see if game is won, if not, let the computer make a move
		if (isGameWon() == true){
			displayBoard();
			System.out.println(winner);
			i = 9;
		}
		
		computerMove();
		makeMove(compmove);
		
		//computer has moved, so increment move counter
		i++;
		if (isGameWon() == true)
		{
			displayBoard();
 			System.out.println(loser);
 			i = 9;
		} 
	}
		
		//if i = 9, that means the board is filled, so check if draw
		if (isGameWon() == false){
			displayBoard();
			System.out.println(draw);
		}

	}

	public static boolean isValidMove(String X) {
		if (X.equals("A1") && A1 == 0)
			return true;
		if (X.equals("A2") && A2 == 0)
			return true;
		if (X.equals("A3") && A3 == 0)
			return true;
		if (X.equals("B1") && B1 == 0)
			return true;
		if (X.equals("B2") && B2 == 0)
			return true;
		if (X.equals("B3") && B3 == 0)
			return true;
		if (X.equals("C1") && C1 == 0)
			return true;
		if (X.equals("C2") && C2 == 0)
			return true;
		if (X.equals("C3") && C3 == 0)
			return true;
		return false;			
	}

	public static void makeMove(String X){
		if (X.equals("A1")){
			A1++;
			if (A1 == 1){
				pA1 = "X";
			}
			else {
				pA1 = "O";
			}
		}
		if (X.equals("A2")){
			A2++;
			if (A2 == 1){
				pA2 = "X";
			}
			else {
				pA2 = "O";
			}
		}
		if (X.equals("A3")){
			A3++;
			if (A3 == 1){
				pA3 = "X";
			}
			else {
				pA3 = "O";
			}
		}
		if (X.equals("B1")){
			B1++;
			if (B1 == 1){
				pB1 = "X";
			}
			else {
				pB1 = "O";
			}
		}
		if (X.equals("B2")){
			B2++;
			if (B2 == 1){
				pB2 = "X";
			}
			else {
				pB2 = "O";
			}
		}
		if (X.equals("B3")){
			B3++;
			if (B3 == 1){
				pB3 = "X";
			}
			else {
				pB3 = "O";
			}
		}
		if (X.equals("C1")){
			C1++;
			if (C1 == 1){
				pC1 = "X";
			}
			else {
				pC1 = "O";
			}
		}
		if (X.equals("C2")){
			C2++;
			if (C2 == 1){
				pC2 = "X";
			}
			else {
				pC2 = "O";
			}
		}
		if (X.equals("C3")){
			C3++;
			if (C3 == 1){
				pC3 = "X";
			}
			else {
				pC3 = "O";
			}
		}
	}

	public static void displayBoard() {
		//method to print the board layout
		System.out.println("   1     2     3");
		System.out.println("A " + pA1 + "  |  " + pA2 + "  |  " + pA3);
		System.out.println("  -----------");
		System.out.println("B " + pB1 + "  |  " + pB2 + "  |  " + pB3);
		System.out.println("  -----------");
		System.out.println("C " + pC1 + "  |  " + pC2 + "  |  " + pC3);
	}

	public static void computerMove() {
		int index = (int) (Math.random() * 3);
		String[] options = {"A", "B", "C"};
		compmove = options[index] + ((int) (Math.random() * 3 + 1));
		if (compmove.equals("A1")){
			A1++;
		}
		if (compmove.equals("A2")){
			A2++;
		}
		if (compmove.equals("A3")){
			A3++;
		}
		if (compmove.equals("B1")){
			B1++;
		}
		if (compmove.equals("B2")){
			B2++;
		}
		if (compmove.equals("B3")){
			B3++;
		}
		if (compmove.equals("C1")){
			C1++;
		}
		if (compmove.equals("C2")){
			C2++;
		}
		if (compmove.equals("C3")){
			C3++;
		}
	}

	public static boolean isGameWon() {

		//check to see if any horizontal rows are complete
		if ((A1 == A2) && (A1 == A3) && (A1 != 0)){
			return true; 

		}
		if ((B1 == B2) && (B1 == B3) && (B1 != 0)){
			return true; 
		}
		if ((C1 == C2) && (C1 == C3) && (C1 != 0)){
			return true; 
		}
		//check to see if any vertical rows are complete
		if ((A1 == B1) && (A1 == C1) && (A1 != 0)){
			return true;  
		}
		if ((A2 == B2) && (A2 == C2) && (A2 != 0)){
			return true; 
		}
		if ((A3 == B3) && (A3 == C3) && (A3 != 0)){
			return true; 
		}

		//check to see if any diagonals are complete
		if ((A1 == B2) && (A1 == C3) && (A1 != 0)){
			return true; 
		}
		if ((A3 == B2) && (A3 == C1) && (A3 != 0)){
			return true; 
		}
		return false;
	}

	
}


