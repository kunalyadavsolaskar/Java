import java.util.Scanner;

class Gusser{
	String guessStr;
	String guessStr() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Guesser Guess the String");
		guessStr=scanner.nextLine();
		return guessStr;
		}
}
class Player{
	String guessStr;
	String guessStr() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Player Guess the String");
		guessStr=scanner.nextLine();
		return guessStr;
		}
}
class Umpire{
	String strFromGusser;
	String strFromPlayer1;
	String strFromPlayer2;
	String strFromPlayer3;
	
	
	void collectNumFromGuesser(){
		Gusser g=new Gusser();
		strFromGusser=g.guessStr();
		}
	
	void collectNumFromPlayer() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		strFromPlayer1=p1.guessStr();
		strFromPlayer2=p2.guessStr();
		strFromPlayer3=p3.guessStr();
	}
	void compare() {
		if (strFromGusser.equals(strFromPlayer1)) {
			if (strFromGusser.equals(strFromPlayer2) && strFromGusser.equals(strFromPlayer3)) {
				System.out.println("All Player's Guesses are correct ALL WIN");
			}
			else if (strFromGusser.equals(strFromPlayer2)) {
				System.out.println("Player 1 And Player 2  WIN");
			}
			else if (strFromGusser.equals(strFromPlayer3)) {
				System.out.println("Player 1 And Player 3  WIN");
			}
			else {
				System.out.println("Player 1 WIN");
			}
		}
		else if(strFromGusser.equals(strFromPlayer2))
		{
			if(strFromGusser.equals(strFromPlayer3))
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(strFromGusser.equals(strFromPlayer3))
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
}




public class stringGusserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stubum
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		

	}

}
