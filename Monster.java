/*
  Team Patcraft -- Jason Chua, Sadia Azmine
  APCS1 pd9
  HW30 -- Ye Olde Role Playing Game, Expanded
  2015-11-14
*/

//Monster is a subclass of Character
public class Monster extends Character{

    //default constructor
    //calls instance variables of Character and edits them
    public Monster() {
        health = 150;
        strength = (int)(Math.random()*45)+20;
        defense = 20;
        attack = 1;
    }
}

