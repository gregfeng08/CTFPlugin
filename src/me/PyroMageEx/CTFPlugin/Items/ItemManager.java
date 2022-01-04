package me.PyroMageEx.CTFPlugin.Items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class ItemManager {
	public static ItemStack RedFlag() {
		ItemStack customItem = new ItemStack(Material.RED_WOOL, 1);
		ItemMeta meta = customItem.getItemMeta();
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Item used to set the location of the red flag");
		
		meta.setLore(lore);
		meta.setDisplayName(ChatColor.RED+""+ChatColor.BOLD+"Red Flag");
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.hasItemFlag(ItemFlag.HIDE_ENCHANTS);
		
		customItem.setItemMeta(meta);
		return customItem;
	}
	public static ItemStack BlueFlag() {
		ItemStack customItem = new ItemStack(Material.BLUE_WOOL, 1);
		ItemMeta meta = customItem.getItemMeta();
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Item used to set the location of the blue flag");
		
		meta.setLore(lore);
		meta.setDisplayName(ChatColor.BLUE+""+ChatColor.BOLD+"Blue Flag");
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		customItem.setItemMeta(meta);
		return customItem;
	}
}
