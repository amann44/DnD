package game;

public class Location {
	String locName;
	boolean surroundingsInspected = false;
	
	
	public Location(String locName) {
		this.locName = locName;
	}
	
	public void displayInspectSurroundings() {
		//Cave example: Class of "Cave" needs creation that holds adjacentLocations, POIs, etc
		System.out.println("----------------------------------");
		System.out.println(">> : You notice a small cave entrace hidden through the trees.");
		System.out.println("----------------------------------\n");
	}
	
	
	
	
	
	public boolean getSurroundingsInspected() {return surroundingsInspected;}
	public void setSurroundingsInspected(boolean surroundingsInspected) {this.surroundingsInspected = surroundingsInspected;}
}
