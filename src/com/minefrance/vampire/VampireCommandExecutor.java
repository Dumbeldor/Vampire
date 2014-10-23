package com.minefrance.vampire;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VampireCommandExecutor implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(sender instanceof Player) 
		{
			if(label.equalsIgnoreCase("vampire")) 
			{
				if(args.length == 0)
				{
					p.sendMessage("Usage /help vampire");
				}
				else if(args.length == 1)
				{
					if(args[0].equalsIgnoreCase("join"))
					{
						p.sendMessage("Vous avez rejoins les vampires !");
					}
					else if(args[0].equalsIgnoreCase("leave"))
					{
						p.sendMessage("Vous avez quitter les vampires !");
					}
				}
				else
				{
					p.sendMessage("Usage /help vampire");
				}
			}
			/*else if(label.equalsIgnoreCase("explosion"))
			{
				Location lp = p.getLocation();
				Location location = new Location(lp.getWorld(), lp.getX(), lp.getY(), lp.getZ());
				p.getWorld().createExplosion(location, 4);
				
			}*/
		} 
		else 
		{
			sender.sendMessage("[Vampire]Il faut etre un joueur pour effectuer cette commande !");
		}
		
		
		return false;
	}

}
