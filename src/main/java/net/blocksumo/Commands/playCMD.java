package net.blocksumo.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static net.blocksumo.BlockSumo.joined;
import static net.blocksumo.Utils.gameUtils.startGame;

public class playCMD implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player p) {
            if (joined.contains(p)){
                joined.add(p);
                if (joined.size() >= 3) {
                    startGame();
                }
            }
        }
        return false;
    }
}
