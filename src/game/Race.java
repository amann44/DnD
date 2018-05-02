package game;

public class Race {
	

	//Initializing ability scores  /Array: 0-5
	private int strBonus, conBonus, dexBonus, intBonus, wisBonus, chaBonus;
	//Initilizing  saves 		   /Array: 6-9
	private int acBonus ,fortBonus ,refBonus, willBonus;
	//Initilizing speed/initiative /Array: 10-11
	private int baseSpeed = 6;
	private int initiative = 0;
	//Initilizing the array to hold the combat stats
	private int[] attrMods = new int[11];
		
	//Initializing skill checks	   /Array: 0-16
	private int acrobatics, arcana, athletics, bluff, diplomacy, dungeoneering, endurance, heal, history, insight, intimidate, nature, perception, religion, stealth, streetwise, thievery;
	//Initilizing the array to hold racial skill check bonuses
	private int[] skillMods = new int[17];
			
	//Should these be handled by a get that passes race when necessary? Languages vary.
	private String size = "Medium";
	private String vision = "Normal";
	private String languages = "Common";


	private void compileAttributeBonuses() {
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
		attrMods[10]=baseSpeed;
		attrMods[11]=initiative;
	}
	
	private void compileSkillBonuses() {
		skillMods[0]=acrobatics;
		skillMods[1]=arcana;
		skillMods[2]=athletics;
		skillMods[3]=bluff;
		skillMods[4]=diplomacy;
		skillMods[5]=dungeoneering;
		skillMods[6]=endurance;
		skillMods[7]=heal;
		skillMods[8]=history;
		skillMods[9]=insight;
		skillMods[10]=intimidate;
		skillMods[11]=nature;
		skillMods[12]=perception;
		skillMods[13]=religion;
		skillMods[14]=stealth;
		skillMods[15]=streetwise;
		skillMods[16]=thievery;
	}

	 private void setRacialBonuses(String race) {		
		if(race == "Dragonborn") {
			languages = "Common, Draconic";	
			strBonus 	+= 2;
			chaBonus 	+= 2;
			history 	+= 2;
			intimidate 	+= 2;
		}
		else if(race == "Dwarf") {
			languages 	= "Common, Dwarven";
			vision 		= "Low-Light";			
			conBonus 	+= 2;
			wisBonus 	+= 2;			
			dungeoneering += 2;
			intimidate 	+= 2;
			baseSpeed 	= 5;
		}
		else if(race == "Eladrin") {
			languages 	= "Common, Elven";
			vision 		= "Low-Light";			
			dexBonus 	+= 2;
			intBonus 	+= 2;			
			arcana 		+= 2;
			history 	+= 2;
			willBonus 	+= 1;
		}	
		else if(race == "Elf") {
			languages 	= "Common, Elven";
			vision 		= "Low-Light";			
			dexBonus 	+= 2;
			wisBonus 	+= 2;			
			nature 		+= 2;
			perception 	+= 2;
			baseSpeed 	= 7;

		}	
		else if(race == "Half-Elf") {
			languages 	= "Common, Elven";
			vision 		= "Low-Light";			
			conBonus 	+= 2;
			chaBonus 	+= 2;			
			diplomacy 	+= 2;
			insight 	+= 2;
		}
		else if(race == "Halfling") {
			languages 	= "Common";
			size 	  	= "small";			
			dexBonus 	+= 2;
			chaBonus 	+= 2;			
			acrobatics 	+= 2;
			thievery	+= 2;
		}
		else if(race == "Human") {
			languages 	= "Common";
			conBonus 	+= 2;
			fortBonus 	+= 1;
			refBonus 	+= 1;
			willBonus 	+= 1;
		}
		else if(race == "Tiefling") {
			languages 	= "Common";
			vision 		= "Low-Light";			
			intBonus 	+= 2;
			chaBonus 	+= 2;			
			bluff 		+= 2;
			stealth 	+= 2;
		}
		else  {System.out.println("Race input error from race bonus if statement located on race class");
		}
	}
 
	 
	 
}

	


