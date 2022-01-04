package me.PyroMageEx.CTFPlugin.Items;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.PyroMageEx.CTFPlugin.Main;
import net.md_5.bungee.api.ChatColor;

public class ItemEvents implements Listener{
	private Main plugin;
	public ItemEvents(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onFlagRightClick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		e.setCancelled(true);
		String itemName = p.getInventory().getItemInMainHand().getItemMeta().getDisplayName();
		if(itemName.equals(ChatColor.RED+""+ChatColor.BOLD+"Red Flag")&&e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			Block target = e.getClickedBlock();
			this.plugin.RedFlag = target;
			Location red = this.plugin.RedFlag.getLocation();
			p.sendMessage("The red flag has been set to: "+red.getX()+", "+red.getY()+", "+red.getZ());
		} else if (itemName.equals(ChatColor.BLUE+""+ChatColor.BOLD+"Blue Flag")&&e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			Block target = e.getClickedBlock();
			this.plugin.BlueFlag = target;
			Location blue = this.plugin.BlueFlag.getLocation();
			p.sendMessage("The blue flag has been set to: "+blue.getX()+", "+blue.getY()+", "+blue.getZ());
		}
	}
}
