/*
  Team Patcraft -- Jason Chua, Sadia Azmine
  APCS1 pd9
  HW30 -- Ye Olde Role Playing Game, Expanded
  2015-11-14
*/

//Warrior is a subclass of Character
public class Warrior extends Character {

    //default constructor
    //calls instance variables of Character and edits them
    public Warrior(String warriorName) {
        name = warriorName;
        health = 150;
        strength = 100;
        defense = 40;
        attack = 0.4;
    }

    public void normalize() {
	defense = 40;
	attack = 0.4;
    }

    public void specialize() {
	defense -= 5;
	attack += 0.75;
    }

    public String about() {
	return "The warrior is the most basic class. Its stats are average.\n";
    }
}

