package net.blocksumo.Utils;


import net.blocksumo.BlockSumo;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import static net.blocksumo.BlockSumo.joined;

public class gameUtils {

    public static void startGame() {
        Location gameSpawn = new Location(Bukkit.getWorld("event"), 0, 0,0, 0, 0);


        for (Player p : joined) {
            Inventory inv = p.getInventory();

            p.teleport(gameSpawn);
            p.sendMessage(ChatColor.GREEN + "The game will start in 10 seconds.");

            new BukkitRunnable() {
                @Override
                public void run() {
                    inv.addItem(new ItemStack(Material.WHITE_WOOL, 64));
                    p.teleport(gameSpawn);
                    joined.remove(p);
                }

            }.runTaskLater(BlockSumo.getInstance(), 20*10);
        }
    }
}
