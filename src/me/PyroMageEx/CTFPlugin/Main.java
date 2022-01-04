package me.PyroMageEx.CTFPlugin;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.plugin.java.JavaPlugin;

import me.PyroMageEx.CTFPlugin.Commands.GetFlagCommand;
import me.PyroMageEx.CTFPlugin.Items.ItemEvents;

public class Main extends JavaPlugin{
	public Block RedFlag = null;
	public Block BlueFlag = null;
	@Override
	public void onEnable() {
		new GetFlagCommand(this);
		new ItemEvents(this);
	}
	@Override
	public void onDisable() {
		
	}
}
