package com.minefrance.vampire;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class JoinCommandExecutor implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(sender instanceof Player) 
		{
			if(label.equalsIgnoreCase("vampire")) 
			{
				p.sendMessage("Vous avez rejoins les vampires !");
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

		}
		
		
		return false;
	}

}
