package game;

public class Race {
	private int strBonus = 0;
	private int conBonus = 0;
	private int dexBonus = 0;
	private int intBonus = 0;
	private int wisBonus = 0;
	private int chaBonus = 0;
	private int acBonus = 0;
	private int fortBonus = 0;
	private int refBonus = 0;
	private int willBonus = 0;
	private int speedBonus = 0;
	public int[] attrMods = new int[11];
	
	public Race(String race) {
		addBonuses(race);
	}
	
	
	
	private void addBonuses(String race) {
		switch(race){
			case "orc": 
				strBonus+=2;
				conBonus+=2;
			break;
			default:
				System.out.println("invalid or no race variable passed to Race.addBonuses");
		}
		
		
		
		
		attrMods[0]=strBonus;
		attrMods[1]=conBonus;
		attrMods[2]=dexBonus;
		attrMods[3]=intBonus;
		attrMods[4]=wisBonus;
		attrMods[5]=chaBonus;
		attrMods[6]=acBonus;
		attrMods[7]=fortBonus;
		attrMods[8]=refBonus;
		attrMods[9]=willBonus;
		attrMods[10]=speedBonus;
	}
	
	
}
