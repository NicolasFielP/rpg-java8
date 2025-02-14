package entity.enemies;

import entity.Entity;
import equipment.armors.Armor;
import equipment.weapons.Weapon;

public class Enemy extends Entity {
    private int defense;
    private int strength;

    private Weapon weapon;
    private Armor armor;

    //setters
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

    //constructor

    public Enemy(String name, int health, int maxHealth,int defense, int strength, Weapon weapon, Armor armor) {
        this.setName(name);
        this.setHealth(health);
        this.setMaxHealth(maxHealth);
        this.defense = defense;
        this.strength = strength;
        this.weapon = weapon;
        this.armor = armor;
    }


    //getters


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
