package entity.enemies;

import equipment.armors.Armor;
import equipment.armors.Rags;
import equipment.weapons.Punches;
import equipment.weapons.Weapon;

public class Slime extends Enemy{

    public Slime() {
        super("Slime",
                5,
                5,
                0,
                1,
                new Punches(),
                new Rags());
    }
}
