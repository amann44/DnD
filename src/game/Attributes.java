package game;

public class Attributes {

	
	int strMod, conMod, dexMod, intMod, wisMod, chaMod;
	int armorClass, fortitude, reflex, will;
	short level =  1;

	// STAT set/Get MODS
	public void setStrMod(short strength) {strMod = (strength - 10) / 2 + (level / 2);}
	public void setConMod(short constitution) {conMod = (constitution - 10) / 2 + (level / 2);}
	public void setDexMod(short dexterity) {dexMod = (dexterity - 10) / 2 + (level / 2);}
	public void setIntMod(short intelligence) {intMod = (intelligence - 10) / 2 + (level / 2);}
	public void setWisMod(short wisdom) {wisMod = (wisdom - 10) / 2 + (level / 2);}
	public void setChaMod(short charisma) {chaMod = (charisma - 10) / 2 + (level / 2);}
/*	
	public void setModifiers() {
		setStrMod(this.strength);
		setConMod(this.constitution);
		setDexMod(this.dexterity);
		setIntMod(this.intelligence);
		setWisMod(this.wisdom);
		setChaMod(this.charisma);
	}
*/	
	public int getStrMod() {return strMod;}
	public int getConMod() {return conMod;}
	public int getDexMod() {return dexMod;}
	public int getIntMod() {return intMod;}
	public int getWisMod() {return wisMod;}
	public int getChaMod() {return chaMod;}
	
	
	
	
	
	
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
	//END set/Get MODS
	
	
	//START set/Get Defenses
	
	
	
	//END set/Get Defenses
	
	
	
	
	
	
	
	
	
	
	
	
}
