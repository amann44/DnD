package game;

import java.util.Scanner;

public class PlayerManager {
	int userInput;
	String location;
	Location loc = new Location(location);
	Scanner sc = new Scanner(System.in);
	Character ch = new Character();
	String characterState = "Resting";
	
	public PlayerManager() {
		this.location = ch.getLocation();
		Location loc = new Location(location);
	}
	
	public int getUserInput() {
		System.out.println("Choose an option >> : ");
		userInput = sc.nextInt();
		return userInput;
	}
	
	public void displayStartingInformation() {
		System.out.println("Location: " + location);
		//General "what's going on" information goes here
		//Location, hp, level, xpToNextLevel, etc
		//MOVE LOGIC TO restingStatePrompts????
	}
	
	public void restingStatePrompts() {
		while (characterState == "Resting") {
		System.out.println("----------------------------------");
		System.out.println("Location: " + ch.getLocation());
		System.out.println("----------------------------------");
		System.out.println("What would you like to do?");
		System.out.println("----------------------------------\n");
		System.out.println("1 : Inspect Surroundings");
		System.out.println("2 : Go To...");
		System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		restingInputs(getUserInput());
		}
		
		
	}
	
	public void playerAcknowledge() {
		userInput = 99;
		System.out.println("0 : 'Okay!'\n");
		while(userInput != 0)
		userInput = getUserInput();

	}
	
	public void restingInputs(int userInput) {
		switch (userInput) {
		case 1:
			loc.displayInspectSurroundings();
			loc.setSurroundingsInspected(true);
			break;
		case 2:
			if(loc.surroundingsInspected == false) {
				System.out.println("----------------------------------");
				System.out.println(">> You know of nowhere to go.");
				System.out.println("----------------------------------\n");
				playerAcknowledge();
				
			} else {
				//Cave example: Class of "Cave" needs creation
				System.out.println("----------------------------------");
				System.out.println("Where would you like to go?");
				System.out.println("----------------------------------\n");
				System.out.println("1 : Nearby Cave");
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				restingInputsGoTo(getUserInput());
				
			}
			break;
		}
		
		
			
		}
	public void restingInputsGoTo(int goToWhere) {
		if(goToWhere == 1){
			ch.setLocation("Cave");
		}
		
		
	}
	
}
