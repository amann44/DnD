package game;

public class Equipment {

	private String armorProficiency;
	private String weaponProficiency;
	
	
	
	private short armorClass;
	private short armorClassShield;
	private String armorClassDexterity;
	private short strengthRequirement;
	private Boolean stealthDisadvantage = false;
	
	
	
	private Boolean armorEquipped = false;
	
	private Boolean mainHandOccupied = false;
	private Boolean offHandOccupied = false;
	
	private short numDice;
	private short diceSize;
	private String damageType;
	private String weaponProperty;
	private Boolean weaponRanged = false;
	private String attackModifierStat;
	private String weaponTypeEquipped;
	private String armorTypeEquipped;
	
	

	
	//method used to equip/unequip weapons (used in inventory class?)
	
	public void equipWeapon(String weaponName) {
		assignWeaponInfo(weaponName);
		weaponTypeEquipped = weaponName;
		attackModifierStat = "strength";
		mainHandOccupied = true;
		if (weaponProperty.contains("two-handed") && offHandOccupied == true)
			unequipShield();
		if (weaponProperty.contains("versatile") && offHandOccupied == false)
			diceSize += 2;
		if (weaponProperty.contains("finesse"))
			attackModifierStat = "dexterity";
		if (weaponProperty.contains("ammunition"))
			attackModifierStat = "dexterity";
	};
	
	public void unequipWeapon() {
		attackModifierStat = "strength";
		mainHandOccupied = false;
		offHandOccupied = false;
		weaponTypeEquipped = "UnArmed";
		numDice = 1;
		diceSize = 1;
		damageType = "bludgeoning";	
	};
		
	//method used to equip armor (used in inventory class?)
	public void equipArmor(String armorName) {
		assignArmorInfo(armorName);
		armorTypeEquipped = armorName;
	};
	public void unequipArmor() {
		armorClass = 10;	
		armorClassDexterity = "Full"; 	
		stealthDisadvantage = false;
		armorTypeEquipped = "UnArmored";
	};	
	//method to send to weapon swing	
	//method to send to attributes

	/*
	 * equip weapon constructor
	 * equip weapon and shield constructor
	 * equip 2 handed weapon and remove shield constructor
	 * equip armor constructor
	 */
	
	
	/* Weapon 1
	 * magical modifier
	 *      done weapon type equipped
	 * weapon name
	 * weapon proficiency type
	 * 		done weapon hit die
	 * 		done damage type
	 * 		done weapon size done with "heavy"
	 * 		done melee or ranged? >
	 * 		done one-handed, two-handed, versatile
	 * properties
	 */
	private void assignWeaponInfo(String weaponType) {
	     switch (weaponType) {
	         case "Club":					numDice = 1;	diceSize = 4; 	damageType = "bludgeoning";		weaponProperty = "light";					break;
	         case "Dagger":					numDice = 1;	diceSize = 4; 	damageType = "piercing";		weaponProperty = "finesse, light, thrown";	break;
	         case "Great Club":				numDice = 1;	diceSize = 8; 	damageType = "bludgeoning";		weaponProperty = "two-handed";				break;
	         case "Handaxe":				numDice = 1;	diceSize = 6; 	damageType = "slashing";		weaponProperty = "light, thrown";			break;
	         case "Javelin":				numDice = 1;	diceSize = 6; 	damageType = "piercing";		weaponProperty = "thrown";					break;
	         case "Light Hammer":			numDice = 1;	diceSize = 4; 	damageType = "bludgeoning";		weaponProperty = "light, thrown";			break;
	         case "Mace":					numDice = 1;	diceSize = 6; 	damageType = "bludgeoning";		weaponProperty = null;						break;
	         case "Quarterstaff":			numDice = 1;	diceSize = 6; 	damageType = "bludgeoning";		weaponProperty = "versatile";				break;
	         case "Sickle":					numDice = 1;	diceSize = 4; 	damageType = "slashing";		weaponProperty = "light";					break;
	         case "Spear":					numDice = 1;	diceSize = 6; 	damageType = "piercing";		weaponProperty = "versatile, thrown";		break;
	         
	         case "Light Crossbow":			numDice = 1;	diceSize = 8; 	damageType = "piercing";		weaponProperty = "Ammunition, loading, two-handed";		break;
	         case "Dart":					numDice = 1;	diceSize = 4; 	damageType = "piercing";		weaponProperty = "finesse, thrown";			break;
	         case "Short Bow":				numDice = 1;	diceSize = 6; 	damageType = "piercing";		weaponProperty = "Ammunition, two-handed";	break;
	         case "Sling":					numDice = 1;	diceSize = 4; 	damageType = "bludgeoning";		weaponProperty = "Ammunition";				break;
	         
	         case "Battleaxe":				numDice = 1;	diceSize = 8; 	damageType = "slashing";		weaponProperty = "versatile";				break;
	         case "Flail":					numDice = 1;	diceSize = 8; 	damageType = "bludgeoning";		weaponProperty = "";						break;
	         case "Glaive":					numDice = 1;	diceSize = 10; 	damageType = "slashing";		weaponProperty = "heavy, reach, two-handed";		break;
	         case "Greataxe":				numDice = 1;	diceSize = 12; 	damageType = "slashing";		weaponProperty = "heavy, two-handed";		break;
	         case "Greatsword":				numDice = 2;	diceSize = 6; 	damageType = "slashing";		weaponProperty = "heavy, two-handed";		break;
	         case "Halberd":				numDice = 1;	diceSize = 10; 	damageType = "slashing";		weaponProperty = "heavy, reach, two-handed";		break;
	         case "Lance":					numDice = 1;	diceSize = 12; 	damageType = "piercing";		weaponProperty = "reach, special";			break;
	         case "Longsword":				numDice = 1;	diceSize = 8; 	damageType = "slashing";		weaponProperty = "versatile";				break;
	         case "Maul":					numDice = 2;	diceSize = 6; 	damageType = "bludgeoning";		weaponProperty = "heavy, two-handed";		break;
	         case "Morningstar":			numDice = 1;	diceSize = 8; 	damageType = "piercing";		weaponProperty = "";						break;
	         case "Pike":					numDice = 1;	diceSize = 10; 	damageType = "piercing";		weaponProperty = "heavy, reach, two-handed";		break;
	         case "Rapier":					numDice = 1;	diceSize = 8; 	damageType = "piercing";		weaponProperty = "Finesse";					break;
	         case "Scimitar":				numDice = 1;	diceSize = 6; 	damageType = "slashing";		weaponProperty = "finesse, light";			break;
	         case "Shortsword":				numDice = 1;	diceSize = 6; 	damageType = "piercing";		weaponProperty = "finesse, light";			break;
	         case "Trident":				numDice = 1;	diceSize = 6; 	damageType = "piercing";		weaponProperty = "thrown, versatile";		break;
	         case "War Pick":				numDice = 1;	diceSize = 8; 	damageType = "piercing";		weaponProperty = "";						break;
	         case "Warhammer":				numDice = 1;	diceSize = 8; 	damageType = "bludgeoning";		weaponProperty = "versatile";				break;
	         case "Whip":					numDice = 1;	diceSize = 4; 	damageType = "slashing";		weaponProperty = "finesse, reach";			break;
	         
	         
	         
	         case "Hand Crossbow":			numDice = 1;	diceSize = 6; 	damageType = "piercing";		weaponProperty = "Ammunition, loading, light";					break;
	         case "Heavy Crossbow":			numDice = 1;	diceSize = 8; 	damageType = "piercing";		weaponProperty = "Ammunition, loading, two-handed, heavy";		break;
	         case "Long Bow":				numDice = 1;	diceSize = 8; 	damageType = "piercing";		weaponProperty = "Ammunition, two-handed, heavy";				break;
	         
	         
   	         default:
	             //throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
	     }
	}
	

	
	
	
	/* Shield
	 * magical modifier
	 * shield name
	 * proficiency type
	 * properties
	 */	
	
	private void equipShield() {
		if (offHandOccupied = false) {
			armorClassShield = 2;
			offHandOccupied = true;
		}
		else System.out.println("A shield cannot be equipped without an empty off-hand.");
	};
	
	private void unequipShield() {
		if (offHandOccupied = true) {
			armorClassShield = 0;
			offHandOccupied = false;
		}
		else System.out.println("There is no shield to unequip.");
	};	

	
	
	/*
	 * magical modifier
	 		* done armor type equipped
	 * armor name
	 * armor proficiency type
	 		* done armor class	
	 		* done maximum dexterity modifier bonus
	 		* done stealth disadvantage
	 ////*str requirement or speed loss penalty/////
	 */
	
	
	public void assignArmorInfo(String equippedArmor) {
	     switch (equippedArmor) {
	         case "Padded Armor":			armorClass = 11;	armorClassDexterity = "Full"; 	stealthDisadvantage = true;
	             break;
	         case "Leather Armor":			armorClass = 11;	armorClassDexterity = "Full";  
	             break;
	         case "Studded Leather Armor":	armorClass = 12;	armorClassDexterity = "Full";
	             break;
	         case "Hide Armor":				armorClass = 12;	armorClassDexterity = "Two";
	             break;
	         case "Chain Shirt Armor":		armorClass = 13;	armorClassDexterity = "Two";
	             break;
	         case "Scale Mail Armor":		armorClass = 14;	armorClassDexterity = "Two";	stealthDisadvantage = true;
	             break;
	         case "Breastplate Armor":		armorClass = 14;	armorClassDexterity = "Two";
	             break;
	         case "Half Plate Armor":		armorClass = 15;	armorClassDexterity = "Two";	stealthDisadvantage = true;
	             break;
	         case "Ring Mail Armor":		armorClass = 14;	armorClassDexterity = "Zero";	stealthDisadvantage = true;
	             break;
	         case "Chain Mail Armor":		armorClass = 16;	armorClassDexterity = "Zero";	stealthDisadvantage = true;
	             break;
	         case "Splint Mail Armor":		armorClass = 17;	armorClassDexterity = "Zero";	stealthDisadvantage = true;
	             break;
	         case "Full Plate Armor":		armorClass = 18;	armorClassDexterity = "Zero";	stealthDisadvantage = true;
	             break;
    	         default:
	             //throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
	     }
	}
	
}
