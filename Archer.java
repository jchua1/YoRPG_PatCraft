/*
  Team Patcraft -- Jason Chua, Sadia Azmine
  APCS1 pd9
  HW30 -- Ye Olde Role Playing Game, Expanded
  2015-11-14
*/

public class Archer extends Character {
    
    //default constructor
    //calls instance variables of Character and edits them
    public Archer(String archerName) {
	name = archerName;
	health = 100;
	strength = 100;
	defense = 20;
	attack = 2.5;
    }

    public void normalize() {
	defense = 20;
	attack = 2.5;
    }

    public void specialize() {
	defense -= 5;
	attack += 1;
    }

    public String about() {
	return "The archer shoots arrows from afar. Archers have low defense, bug high strength and attack.\n";
    }
}
