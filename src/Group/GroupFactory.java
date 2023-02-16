/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Group;

import java.util.Random;


/**
 *
 * @author mikeyang
 */
public class GroupFactory {
    	/* @return a random groupName */
	public GroupCompositions getGpName() {
		
		Random r = new Random();
		GroupName[] types = GroupName.values();

		int number = r.nextInt(types.length);//pick a random number based on how many group names we need

		return getGpName(types[number]);
	}

	/* @return an group of a specified type
	 * @param type -- the type specified */	
	public GroupCompositions getGpName(GroupName type) {
		
		return type.getGpName();
	}
}
