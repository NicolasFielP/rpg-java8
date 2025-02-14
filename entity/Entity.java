package entity;


public abstract class Entity {

    private String name;
    private int health;
    private int maxHealth;
    //setters
    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setName(String name) {
        this.name = name;
    }


    //getters

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public String getName(){
        return name;
    }


}
