import entity.*;
import entity.enemies.Slime;
import equipment.*;
import gameManagement.*;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        BattleManager.battle(player, new Slime());
    }

}