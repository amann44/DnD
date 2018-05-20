package game;

public class Attributes {

	
	private int strMod, conMod, dexMod, intMod, wisMod, chaMod;
	private int armorClass, fortitude, reflex, will;
	short level =  1;	
	private int[] abilityScores = new int[6];
//			int[] abilityScores = {0 strength, 1 constitution, 2 dexterity, 3 intelligence, 4 wisdom, 5 charisma};
	private int[] savesScores = {armorClass = 10, fortitude = 10, reflex = 10, will = 10};
	
	
	//not sure where these will go yet
	private int speed = 0;
	private String languages; // single language implementation. needs to change to array later for multi language support
	
		
	Race raceWithinAttributes =  new Race();

	public Attributes(Race charactersRaceClass, int[] baseStats) {
		raceWithinAttributes = charactersRaceClass;
		abilityScores = baseStats;
		//System.out.println("The array variable recieved in attributes holds :" + abilityScores[0]);
		calculateStatTotals();
		setModifiers();
		//System.out.println("double check after getRaceModifiers :" + strMod);
		//System.out.println("armorClass :"+ armorClass);
		calculateDefense();
		//System.out.println("armorClass :"+ armorClass);
		//System.out.println("fortitude :"+ fortitude);
		//System.out.println("reflex :"+ reflex);
		//System.out.println("will :"+ will);
	}
	
	private void calculateStatTotals() {
		getRaceModifiers();
		//need to get equipmentmodifiers
		//need to get buff modifiers
	};
	
	private void setModifiers() {
		setStrMod();
		setConMod();
		setDexMod();
		setIntMod();
		setWisMod();
		setChaMod();
	}
	
	private void calculateDefense() {
		if (dexMod > intMod) {
			armorClass 	+= dexMod; 
			reflex 		+= dexMod;
		}
			else {
			armorClass 	+= intMod;
			reflex 		+= intMod;
		}
		
		if (strMod > conMod) fortitude += strMod;
			else fortitude += conMod;
		if (wisMod > chaMod) will += wisMod;
			else will += chaMod;	
	};
	
	private void setStrMod() {strMod = (abilityScores[0] - 10) / 2 + (level / 2);}
	private void setConMod() {conMod = (abilityScores[1] - 10) / 2 + (level / 2);}
	private void setDexMod() {dexMod = (abilityScores[2] - 10) / 2 + (level / 2);}
	private void setIntMod() {intMod = (abilityScores[3] - 10) / 2 + (level / 2);}
	private void setWisMod() {wisMod = (abilityScores[4] - 10) / 2 + (level / 2);}	
	private void setChaMod() {chaMod = (abilityScores[5] - 10) / 2 + (level / 2);}
	
	//keep an eye on if this receives the post racial+equipment change
	public int getStrMod() {return strMod;}
	public int getConMod() {return conMod;}
	public int getDexMod() {return dexMod;}
	public int getIntMod() {return intMod;}
	public int getWisMod() {return wisMod;}
	public int getChaMod() {return chaMod;}

	public int getTotalStr() {return abilityScores[0];}
	public int getTotalCon() {return abilityScores[1];}
	public int getTotalDex() {return abilityScores[2];}
	public int getTotalInt() {return abilityScores[3];}
	public int getTotalWis() {return abilityScores[4];}
	public int getTotalCha() {return abilityScores[5];}
	
	
	
	private void getRaceModifiers() {	
		int[] tempAbilityScores = new int[6];
		tempAbilityScores = raceWithinAttributes.getAbilityScoresArray();
		for(int i=0;i<6;++i) {
			abilityScores[i] += tempAbilityScores[i];
		}
		
		int[] tempSavesScores = new int[4];
		tempSavesScores = raceWithinAttributes.getSavesScoresArray();
		for(int i=0;i<4;++i) {
			savesScores[i] += tempSavesScores[i];
		}	
		
		savesScores = raceWithinAttributes.getSavesScoresArray();
		speed += raceWithinAttributes.getBaseSpeed();
		languages = raceWithinAttributes.getLanguages();
	}

}
