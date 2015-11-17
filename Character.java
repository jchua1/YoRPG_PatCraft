/*
  Team Patcraft -- Jason Chua, Sadia Azmine
  APCS1 pd9
  HW30 -- Ye Olde Role Playing Game, Expanded
  2015-11-14
*/

public abstract class Character {

    //instance variables
    protected String name;
    protected int health, strength, defense;
    protected double attack;

    //returns true if health is over 0
    //false otherwise
    public boolean isAlive() {
        return health > 0;
    }

    //returns name value
    public String getName() {
        return name;
    }

    //returns defense value
    public int getDefense() {
        return defense;
    }

    //only lowers hp if x is positive
    //otherwise no damage is dealt
    public void lowerHP(int x) {
        if (x > 0) {
            health -= x;
        }
    }

    //saves damage integer to local variable dmg
    //lowers hp of given character argument by dmg
    //returns dmg
    public int attack(Character x) {
        int dmg = (int)(strength * attack) - x.getDefense();
        x.lowerHP(dmg);

        //returns 0 if dmg is negative so display message does not display
        //negative damage
        if (dmg > 0) {
            return dmg;
        }
        else {
            return 0;
        }
    }

    //resets defense and attack to normal values
    public abstract void normalize();

    //decreases defense and increases attack
    public abstract void specialize();

    //information about classes and attributes of each
    public abstract String about();
}
