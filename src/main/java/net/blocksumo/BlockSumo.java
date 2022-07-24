package net.blocksumo;

import net.blocksumo.Commands.gmcCMD;
import net.blocksumo.Commands.gmsCMD;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlockSumo extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gmc").setExecutor(new gmcCMD());
        getCommand("gms").setExecutor(new gmsCMD());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
