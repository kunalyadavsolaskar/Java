import java.util.Scanner;

 class guessGame {
	int numFromGuesser;
	String strFromGuesser;
	int[] numFromPlayers;
	String[] strFromPlayer;
	public void compareResult() {

		boolean flag = false;
		
		for (int i = 0; i < numFromPlayers.length; i++) {
			if (numFromPlayers[i] == numFromGuesser) {
				flag = true;
				System.out.println("Players " + (i + 1) + " won the match");
			}
		}
		
		if (!flag)
			System.out.println("No player won the match");
		else
			return;
	}
	public void compareStr() {

		boolean flag = false;
		
		for (int i = 0; i < strFromPlayer.length; i++) {
			if (strFromPlayer[i].equals(strFromGuesser)) {
				flag = true;
				System.out.println("Players " + (i + 1) + " won the match");
			}
		}
		
		if (!flag)
			System.out.println("No player won the match");
		else
			return;
	}

}

class Guesser {
	int guesserNumber;
	String guesserStr;
	public int getNumberFromGuesser() {

		System.out.println("Guesser guess any number");
		Scanner sc = new Scanner(System.in);
				guesserNumber=sc.nextInt();
		return guesserNumber;
	}
	public String getstrFromGuesser() {

		System.out.println("Guesser guess any String");
		Scanner sc = new Scanner(System.in);
				guesserStr=sc.nextLine();
		return guesserStr;
	}

}

public class updatedGusserGame {

	int numOfPlayer;

	public updatedGusserGame(int numOfPlayer) {
		this.numOfPlayer = numOfPlayer;
	}

	public int[] getNumberFromPlayers() {

		int[] players = new int[numOfPlayer];
		
		for (int i = 0; i < numOfPlayer; i++) {
			System.out.println("Players " + (i + 1) + " guess the number");
			players[i] = new Scanner(System.in).nextInt();
		}
		return players;
	}
	public String[] getStrFromPlayers() {

		String[] players = new String[numOfPlayer];
		
		for (int i = 0; i < numOfPlayer; i++) {
			System.out.println("Players " + (i + 1) + " guess the number");
			players[i] = new Scanner(System.in).nextLine();
		}
		return players;
	}
	public static void main(String[] args) {

		guessGame u = new guessGame();

		
		Guesser guesser = new Guesser();
		
		
		System.out.println("Enter 1 for numbers Guess \nEnter 2 for String Guess ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		if (n==1) {
			u.numFromGuesser = guesser.getNumberFromGuesser();
			System.out.println("Enter the numbers of players");
			int numOfPlayer= sc.nextInt();
			updatedGusserGame players = new updatedGusserGame(numOfPlayer);
		u.numFromPlayers = players.getNumberFromPlayers();
		u.compareResult();}
		else if(n==2){
			u.strFromGuesser=guesser.getstrFromGuesser();
			System.out.println("Enter the numbers of players");
			int numOfPlayer= sc.nextInt();
			updatedGusserGame players = new updatedGusserGame(numOfPlayer);
			u.strFromPlayer = players.getStrFromPlayers();
			u.compareStr();
		}
		else {
			System.out.println("Enter Right Option!!!!!!");
		}

	}
}