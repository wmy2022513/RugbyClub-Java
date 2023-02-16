/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Players;
import Players.*;
/**
 *
 * @author mikeyang
 */
public abstract class Players {
    
        private String firstname;
	private String surname;
	private String player_ID; //to create a unique ID will combine symbol or word with 
	private int age;
        private PlayerAttributes plrAttr;//for define different types of player
        
        private static int currentPlayerNumber = 1000; //playerID start from 1000
        
        //constructor
        public Players(String firstname, String surname,int age ,PlayerAttributes plrAttr){
            
            this.firstname = firstname;
            this.surname = surname;
            this.player_ID = generateIDBadge();
            this.age = age;
            this.plrAttr = plrAttr;
        }
        private String generateIDBadge() {
		
		//Note -- A more complex ID creation method could be performed here.
                //give every players a unique ID
		currentPlayerNumber++;
                String playerID = "PLR" + currentPlayerNumber;
		return playerID;
		
	}
        
        @Override
        public String toString(){
            //display all the player details
            return "\n*************************** \nPlayers ID:\t" + this.player_ID + "\nFirstname:\t" + this.firstname + "\nSurname:\t" + this.surname +"\nAge:\t" + this.age;
        
        }
        //below are getters
        public String getFirstname() {
            return firstname;
        }

        public String getSurname() {
            return surname;
        }

        public String getPlayer_ID() {
            return player_ID;
        }

        public int getAge() {
            return age;
        }

        public static int getCurrentPlayerNumber() {
            return currentPlayerNumber;
        }

        public PlayerAttributes getPlrAttr() {
            return plrAttr;
        }
        
}
