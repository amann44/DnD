package game;

import java.util.*;


public class DnD {
	public static void main(String[] args) {
		int userInput;
		Scanner sc = new Scanner(System.in);
		System.out.print("Welcome!\n1 : Start\n2 : Exit\nChoose an option >> : ");
		userInput = sc.nextInt();
		PlayerManager pm = new PlayerManager();
		if(userInput == 2) {
			System.out.println("Goodbye!");
			System.exit(0);
		}
		pm.displayStartingInformation();
		pm.restingStatePrompts();
		userInput = sc.nextInt();
		pm.restingInputs(userInput);
		
		//

		
	}
}


