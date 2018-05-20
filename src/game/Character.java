package game;
// this is Combatant
class Character {
	// should be built by constructor
	String name = "Bobby Dragonslayer";
	String race = "Dragonborn";

	 short level =  1;
	 private short strength 	= 18;
	 private short constitution = 17;
	 private short dexterity 	= 16;
	 private short intelligence = 15;
	 private short wisdom 		= 14;
	 private short charisma 	= 13;	 
	 int[] abilityScores = {strength, constitution, dexterity, intelligence, wisdom, charisma};

	Race rce = new Race(race);
	Attributes attr = new Attributes(rce, abilityScores);	
	Equipment equipment = new Equipment();
	
	
	public void testMethod() {
		equipment.
		System.out.println("Test method's getTotalStr :" + attr.getTotalStr());
	
	};

	
	/*
	private int speed = 0;
	private String languages; // single language implementation. needs to change to array later for multi language support
		
	
	public short getStrength() {return this.strength;};
	public short getConstitution() {return this.constitution;};
	public short getDexterity() {return this.dexterity;};
	public short getIntelligence() {return this.intelligence;};
	public short getWisdom() {return this.wisdom;};
	public short getCharisma() {return this.charisma;};
	 */

}


