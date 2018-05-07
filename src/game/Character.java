package game;
// this is Combatant
class Character {
	// should be built by constructor
	String name = "Bobby Dragonslayer";
	String race = "Dragonborn";

	short level 		=  1;
	short strength 		= 18;
	short constitution  = 17;
	short dexterity 	= 16;
	short intelligence  = 15;
	short wisdom 		= 14;
	short charisma 		= 13;
	
	Race rce = new Race(race);
	//int[] attrArray = new int[11]; // delete this
	private int[] abilityScores = new int[6];
	private int[] savesScores = new int[4];
	private int speed = 0;
	private String languages; // single language implementation. needs to change to array later for multi language support
	
	
	// We want to use an array system for keeping track of the base stats of a character
	// base: 18/17/16/15/14/13
	// race: 2/0/0/0/0/0
	// bracers 4/0/0/0/0/0
	
	
	
	//////////////
	
	
	public Character() {
		getRaceModifiers();
		System.out.print(savesScores[1]);
		
		
	}
	
	public void setModifiers() {
		getStrength(this.strength);
		getConstitution(this.constitution);
		getDexterity(this.dexterity);
		getIntelligence(this.intelligence);
		getWisdom(this.wisdom);
		getCharisma(this.charisma);
	}
	
	public int getStrMod() {return strMod;}
	public int getConMod() {return conMod;}
	public int getDexMod() {return dexMod;}
	public int getIntMod() {return intMod;}
	public int getWisMod() {return wisMod;}
	public int getChaMod() {return chaMod;}
	
	
	//////////////

}


