package com.minefrance.vampire;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class VampireListener implements Listener {
	ArrayList<Location> loc = new ArrayList<Location>();
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		Material bloc = e.getBlock().getType();
	 	if(bloc.equals(Material.DIAMOND_BLOCK))
	 	{
	 		Location location = new Location(p.getWorld(), p.getLocation().getX(), p.getLocation().getY(), p.getLocation().getZ());
	 		loc.add(location);
	 		p.sendMessage("Posez 3 blocs de diams en hauteur pour créer un Totem et devenir un Vampire !");
	 		if(loc.size() == 3)
	 		{
	 			p.sendMessage("Vous êtes maintenant un VAMPIRE !");
	 		}
	 	}
	}
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		String message = e.getMessage();
		Player p = e.getPlayer();
		if(message.contains("Dumbeldor") || message.contains("dum"))
		{
			p.sendMessage("Vous voulez parler à Dieu ? Il arrive ;)");
		}
	}
	
}
