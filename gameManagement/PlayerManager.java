package gameManagement;

import entity.Player;
import equipment.armors.Rags;
import equipment.weapons.Punches;

public class PlayerManager {
     public static void setInitialGear(Player player){
            //status
            player.setMaxHealth(10);
            player.setHealth(10);

            player.setDefense(0);
            player.setStrength(0);
            //equipment
            player.setWeapon(new Punches());
            player.setArmor(new Rags());
    }
    public static void levelUp(Player player){
        player.setLevel(player.getLevel()+1);
    }

}
