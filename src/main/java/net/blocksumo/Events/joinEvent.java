package net.blocksumo.Events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.EventListener;

public class joinEvent implements EventListener {

    public void onJoin(PlayerJoinEvent e) {
        Location spawn = new Location(Bukkit.getWorld("Hub"), 0, 0, 0, 0, 0);
    }
}
