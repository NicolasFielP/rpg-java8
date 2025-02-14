package equipment.weapons;
import entity.enemies.Enemy;

public abstract class Weapon {
    //variables
    private String name;
    private int damage;

    //constructor
    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public void attack(Enemy enemy){

    };

    //getters
    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }
}