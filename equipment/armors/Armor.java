package equipment.armors;


public abstract class Armor {
    //variables
    private String name;
    private int defense;

    //constructor
    public Armor(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    //getters
    public String getArmorName() {
        return name;
    }
    public int getDefense() {
        return defense;
    }

}
