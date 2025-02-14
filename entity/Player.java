package entity;

import equipment.armors.Armor;
import equipment.weapons.Weapon;

public class Player extends Entity{
    // variables
    private int level = 0;
    private int currentExperience = 0;

    //level up definition
    protected double maxExperience = 100*Math.pow(level, 1.5);

    //stats

    private int defense;
    private int strength;

    private Weapon weapon;
    private Armor armor;

    //setters
    public void setLevel(int level) {
        this.level = level;
    }

    public void setCurrentExperience(int currentExperience) {
        this.currentExperience = currentExperience;
    }

    public void setMaxExperience(double maxExperience) {
        this.maxExperience = maxExperience;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    //getters

    public int getLevel() {
        return level;
    }

    public int getCurrentExperience() {
        return currentExperience;
    }

    public double getMaxExperience() {
        return maxExperience;
    }


    public int getDefense() {
        return defense;
    }

    public int getStrength() {
        return strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }
}
