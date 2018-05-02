package game;

class CharacterInformationbackup {
	String name = "Bobby Dragonslayer";
	short level 		=  1;
	short strength 		= 10;
	short constitution  = 10;
	short dexterity 	= 10;
	short intelligence  = 10;
	short wisdom 		= 10;
	short charisma 		= 10;
	
	
	int strMod;
	int conMod;
	int dexMod;
	int intMod;
	int wisMod;
	int chaMod;
	
	int fortitude;
	int reflex;
	int will;

	// STAT set/Get MODS
	public void setStrMod(short strength) {
		strMod = (strength - 10) / 2 + (level / 2);
	}
	public int getStrMod() {
		return strMod;
	}
	
	public void setConMod(short constitution) {
		conMod = (constitution - 10) / 2 + (level / 2);
	}
	public int getConMod() {
		return conMod;
	}
	
	public void setDexMod(short dexterity) {
		dexMod = (dexterity - 10) / 2 + (level / 2);
	}
	public int getDexMod() {
		return dexMod;
	}
	
	public void setIntMod(short intelligence) {
		intMod = (intelligence - 10) / 2 + (level / 2);
	}
	public int getIntMod() {
		return intMod;
	}
	
	public void setWisMod(short wisdom) {
		wisMod = (wisdom - 10) / 2 + (level / 2);
	}
	public int getWisMod() {
		return wisMod;
	}
	
	public void setChaMod(short charisma) {
		chaMod = (charisma - 10) / 2 + (level / 2);
	}
	public int getChaMod() {
		return chaMod;
	}
	
	//END set/Get MODS
	
	
	//START set/Get Defenses
	
	
	
	//END set/Get Defenses
	
	
	
	
	
	
	
}


