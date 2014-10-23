package com.minefrance.vampire;

import org.bukkit.Location;

public class Totem {
	
	private String name;
	private Location l1;
	private Location l2;
	private Location spawnLocation;
	private String owner;
	
	public Totem(String name, Location l1, Location l2, Location spawnLocation, String owner)
	{
		this.name = name;
		this.l1 = l1;
		this.l2 = l2;
		this.spawnLocation = spawnLocation;
		this.owner = owner;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getL1() {
		return l1;
	}

	public void setL1(Location l1) {
		this.l1 = l1;
	}

	public Location getL2() {
		return l2;
	}

	public void setL2(Location l2) {
		this.l2 = l2;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
