package com.minefrance.vampire;

import org.bukkit.Location;

public class Selection {
	
	private Location l1;
	private Location l2;
	
	public Selection(Location l1, Location l2){
		this.l1 = l1;
		this.l2 = l2;
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
	
	

}