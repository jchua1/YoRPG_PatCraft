/*
  Team Patcraft -- Jason Chua, Sadia Azmine
  APCS1 pd9
  HW30 -- Ye Olde Role Playing Game, Expanded
  2015-11-14
*/

public class Mage extends Character {

    //default constructor
    //calls instance variables of Character and edits them
    public Mage(String mageName) {
	name = mageName;
	health = 75;
	strength = 50;
	defense = 20;
	attack = 10.0;
    }

    //overridden attack method that allows mage to ignore defense of target
    public int attack(Character x) {
	int dmg = (int)(strength * attack);
	x.lowerHP(dmg);
	
	if (dmg > 0) {
	    return dmg;
	}
	else {
	    return 0;
	}
    }

    public void normalize() {
	defense = 20;
	attack = 10.0;
    }

    public void specialize() {
	defense -= 5;
	attack += 0.1;
    }

    public String about() {
	return "The mage casts spells. Mages have low health, defense, and strength, but make up for them with their high attack. In addition, their attacks also ignore their enemy's defense.\n";
    }
}
