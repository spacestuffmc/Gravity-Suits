/*
 * Copyright 2019 SpaceStuffMC
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.spacestuffmc.gravitysuit;

import org.bukkit.ChatColor;

import java.io.Serializable;

/**
 * This class holds objects of the locations of set areas
 * where there are zero g's
 *
 * @author Alex Woodward
 */
public class ZeroGArea implements Serializable {
	/**Holds the 2 block locations from which everything in between
	 * will be labeled as a zero-g area*/
	int x1;
	int y1;
	int z1;
	int x2;
	int y2;
	int z2;
	
	/**The world environment that is zero g*/
	private String world;
	
	/**Name ID of the area*/
	private String nameID;
	
	/**Initializes the object's attributes*/
	ZeroGArea(int x1, int y1, int z1, int x2, int y2, int z2, String world, String nameID) {
		this.x1=x1;
		this.y1=y1;
		this.z1=z1;
		this.x2=x2;
		this.y2=y2;
		this.z2=z2;
		this.world=world;
		this.nameID=nameID;
	}
	
	
	
	/**Returns the data of this instance
	 * @return String well presented data of this instance
	 */
	public String toString() {
		return ChatColor.LIGHT_PURPLE + nameID + ChatColor.RED + ":" + 
				ChatColor.GOLD + "Corner 1: " + ChatColor.AQUA +
				"\n(" + x1 + ", " + y1 + ", " +
				z1 + ")\n" + ChatColor.GOLD + "Corner 2: " + ChatColor.AQUA +
				"(" + x2 + ", " + y2 + ", " + z2;
	}
	
	/**Getter method for the ID*/
	String getID() {
		return nameID;
	}
	
	/**Getter method for the world*/
	String getWorld() {
		return world;
	}
}
