/*
  Team Patcraft -- Jason Chua, Sadia Azmine
  APCS1 pd9
  HW30 -- Ye Olde Role Playing Game, Expanded
  2015-11-14
*/

public class Rogue extends Character {

    //default constructor
    //calls instance variables of Character and edits them
    public Rogue(String rogueName) {
	name = rogueName;
	health = 100;
	strength = 100;
	defense = 0;
	attack = 5.0;
    }

    public void normalize() {
	defense = 0;
	attack = 5.0;
    }

    public void specialize() {
	defense -= 10;
	attack += 5.0;
    }

    public String about() {
	return "The rogue uses unethhical methods of attack. Rogues have no defense, but high attack and health.\n";
    }
}

