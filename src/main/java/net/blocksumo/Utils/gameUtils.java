package net.blocksumo.Utils;


import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import static net.blocksumo.BlockSumo.joined;

public class gameUtils {
    public static void startGame() {

        Location gameSpawn = new Location(Bukkit.getWorld("event"), 0, 0,0, 0, 0);

        for (Player p : joined) {
            p.teleport(gameSpawn);
            joined.remove(p);
        }

    }

}
