package me.PyroMageEx.CTFPlugin.Commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.PyroMageEx.CTFPlugin.Main;
import me.PyroMageEx.CTFPlugin.Items.ItemManager;

public class GetFlagCommand implements CommandExecutor{
	private Main plugin;
	public GetFlagCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("get").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		String arg1 = args[0].toLowerCase();
		if(arg1.equals("red")) {
			p.getInventory().addItem(ItemManager.RedFlag());
		} else if (arg1.equals("blue")) {
			p.getInventory().addItem(ItemManager.BlueFlag());
		} else if (arg1.equals("redloc")) {
			Location red = this.plugin.RedFlag.getLocation();
			p.sendMessage("The red flag is located at: "+red.getX()+", "+red.getY()+", "+red.getZ());
		} else if (arg1.equals("blueloc")) {
			Location blue = this.plugin.BlueFlag.getLocation();
			p.sendMessage("The red flag is located at: "+blue.getX()+", "+blue.getY()+", "+blue.getZ());
		} else {
			p.sendMessage("Invalid Command [red/blue/redloc/blueloc]");
		}
		return false;
	}
}
