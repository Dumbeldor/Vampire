package com.minefrance.vampire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Location;

public class TotemManager {
	
	public static HashMap<String, Selection> selections = new HashMap<String, Selection>();
	public static List<Totem> totems = new ArrayList<Totem>();
	
	public static Totem getRegionByName(String name){
		for(Totem totem : totems){
			if(totem.getName().equals(name))
				return totem;
		}
		return null;
	}
	
	public static Totem getRegionByLocation(Location location){
		return null;
	}
	
	public static Totem getRegion(Totem r){
		for(Totem totem : totems){
			if(totem.equals(r))
				return totem;
		}
		return null;
	}

}