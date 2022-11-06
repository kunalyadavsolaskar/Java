import java.util.Scanner;

class Guesser{
	int guessNum;
	int guessNum() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Guesser Guess the Number");
		guessNum=scanner.nextInt();
		return guessNum;
		}
}
class Player{
	int guessNum;
	int guessNum() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Player Guess the Number");
		guessNum=scanner.nextInt();
		return guessNum;
		}
}
class Umpire{
	int numFromGusser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	void collectNumFromGuesser(){
		Guesser g=new Guesser();
		numFromGusser=g.guessNum();
		}
	
	void collectNumFromPlayer() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare() {
		if (numFromGusser==numFromPlayer1) {
			if (numFromGusser==numFromPlayer2 && numFromGusser==numFromPlayer3) {
				System.out.println("All Player's Guesses are correct ALL WIN");
			}
			else if (numFromGusser==numFromPlayer2) {
				System.out.println(" Player 1 And Player 2  WIN");
			}
			else if (numFromGusser==numFromPlayer3) {
				System.out.println(" Player 1 And Player 3  WIN");
			}
			else {
				System.out.println(" Player 1 WIN");
			}
		}
		else if(numFromGusser==numFromPlayer2)
		{
			if(numFromGusser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGusser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
}




public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stubum
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		

	}

}
