package game;
// this is Combatant
class Character {
	// should be built by constructor
	String name = "Bobby Dragonslayer";
	short level 		=  1;
	short strength 		= 18;
	short constitution  = 17;
	short dexterity 	= 16;
	short intelligence  = 15;
	short wisdom 		= 14;
	short charisma 		= 13;
	String race = "Dragonborn";
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
	
	public void getRaceModifiers() {
		
		int[] tempAbilityScores = new int[6];
		tempAbilityScores = rce.getAbilityScoresArray();
		for(int i=0;i<6;++i) {
			abilityScores[i] += tempAbilityScores[i];
		}
		
		int[] tempSavesScores = new int[4];
		tempSavesScores = rce.getSavesScoresArray();
		for(int i=0;i<4;++i) {
			savesScores[i] += tempSavesScores[i];
		}
		
		
		savesScores = rce.getSavesScoresArray();
		speed += rce.getBaseSpeed();
		languages = rce.getLanguages();
	}
	
	
	//////////////
	
	
	
	
	
	
	
	int strMod, conMod, dexMod, intMod, wisMod, chaMod;
	int armorClass, fortitude, reflex, will;
	

	// STAT set/Get MODS
	public void setStrMod(short strength) {strMod = (strength - 10) / 2 + (level / 2);}
	public void setConMod(short constitution) {conMod = (constitution - 10) / 2 + (level / 2);}
	public void setDexMod(short dexterity) {dexMod = (dexterity - 10) / 2 + (level / 2);}
	public void setIntMod(short intelligence) {intMod = (intelligence - 10) / 2 + (level / 2);}
	public void setWisMod(short wisdom) {wisMod = (wisdom - 10) / 2 + (level / 2);}
	public void setChaMod(short charisma) {chaMod = (charisma - 10) / 2 + (level / 2);}
	
	public void setModifiers() {
		setStrMod(this.strength);
		setConMod(this.constitution);
		setDexMod(this.dexterity);
		setIntMod(this.intelligence);
		setWisMod(this.wisdom);
		setChaMod(this.charisma);
	}
	
	public int getStrMod() {return strMod;}
	public int getConMod() {return conMod;}
	public int getDexMod() {return dexMod;}
	public int getIntMod() {return intMod;}
	public int getWisMod() {return wisMod;}
	public int getChaMod() {return chaMod;}
	
	//END set/Get MODS
	
	
	//START set/Get Defenses
	
	
	
	//END set/Get Defenses
	
	
	
	
	
	
	
}


