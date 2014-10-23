package com.minefrance.vampire;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Vampire extends JavaPlugin {
	
	public File totemFile;
	public FileConfiguration totemConfig;
	
	@Override
	public void onEnable() {
		getLogger().info("Plugin Vampire bien charge");
		CommandExecutor vampireExecutor = new VampireCommandExecutor();
		getCommand("vampire").setExecutor(vampireExecutor);

		Listener l = new VampireListener();
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(l, this);
	}
	@Override
	public void onDisable() {
		saveConfig();
	}
	
	private void initializeTotem(){
		totemFile = new File(this.getDataFolder(), "totem.yml");
		if(!totemFile.exists()) 
		{
			totemFile.getParentFile().mkdir();
			this.saveResource("totem.yml", false);
		}
		totemConfig = YamlConfiguration.loadConfiguration(totemFile);
		for(String name : totemConfig.getConfigurationSection("").getKeys(false))
		{
			String path = name + ".";
			String[] s1 = totemConfig.getString(path + "l1").split(",");
			String[] s2 = totemConfig.getString(path + "l2").split(",");
			String[] s3 = totemConfig.getString(path + "spawnLocation").split(",");
			Location l1 = new Location(Bukkit.getWorld(s1[0]), Integer.parseInt(s1[1]), Integer.parseInt(s1[2]), Integer.parseInt(s1[3]));
			Location l2 = new Location(Bukkit.getWorld(s2[0]), Integer.parseInt(s2[1]), Integer.parseInt(s2[2]), Integer.parseInt(s2[3]));
			Location spawnLocation = new Location(Bukkit.getWorld(s3[0]), Integer.parseInt(s3[1]), Integer.parseInt(s3[2]), Integer.parseInt(s3[3]));
			String owner = totemConfig.getString(path + "owner");
			Totem newTotem = new Totem(name, l1, l2, spawnLocation, owner);
			TotemManager.totems.add(newTotem);
		}
	private void saveTotem(){
		for(Totem totem : TotemManager.totems)
		{
			string name = totem.getName();
			String l1 = totem.getL1().getWorld().getName() + "," + totem.getL1().getBlockX() + "," + region.getL1().getBlockXY() + "," + region.getL1().getBlockZ()
		}
	}
	}

}
