/*
  Team Patcraft -- Jason Chua, Sadia Azmine
  APCS1 pd9
  HW30 -- Ye Olde Role Playing Game, Expanded
  2015-11-14
*/

public class Tank extends Character {

    //default constructor
    //calls instance variables of Character and edits them
    public Tank(String tankName) {
	name = tankName;
	health = 200;
	strength = 80;
	defense = 100;
	attack = 0.2;
    }

    public void normalize() {
	defense = 100;
	attack = 0.2;
    }

    public void specialize() {
	defense -= 10;
	attack += 0.5;
    }

    public String about() {
	return "The tank is able to take a lot of hits. Tanks have high health and defense, but low attack.\n";
    }
}
