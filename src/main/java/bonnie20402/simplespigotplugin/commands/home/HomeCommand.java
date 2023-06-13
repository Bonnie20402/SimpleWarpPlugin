package bonnie20402.simplespigotplugin.commands.home;

import bonnie20402.simplespigotplugin.controllers.home.HomeController;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public final class HomeCommand implements CommandExecutor {
    private final HomeController homeController;

    public HomeCommand(HomeController homeController) {
        this.homeController = homeController;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player))return true;
        Player player = (Player) sender;
        HashMap<String,String> messages = homeController.getHomeMessages();
        if(homeController.hasHome(player)) {
            homeController.teleportToHome(player);
            sender.sendMessage(ChatColor.GREEN + messages.get( "homed"));
        }else sender.sendMessage(ChatColor.RED + messages.get("homeless"));
        return true;
    }
}
