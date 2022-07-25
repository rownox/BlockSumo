package net.blocksumo;

import net.blocksumo.Commands.gmcCMD;
import net.blocksumo.Commands.gmsCMD;
import net.blocksumo.Events.joinEvent;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class BlockSumo extends JavaPlugin {

    public static List<Player> joined = new ArrayList<>();
    public static BlockSumo instance;

    @Override
    public void onEnable() {
        instance = this;

        getServer().getPluginManager().registerEvents(new joinEvent(), this);

        getCommand("gmc").setExecutor(new gmcCMD());
        getCommand("gms").setExecutor(new gmsCMD());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static BlockSumo getInstance() {
        return instance;
    }
}
