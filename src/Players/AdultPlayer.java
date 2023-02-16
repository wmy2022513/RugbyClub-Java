/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Players;

/**
 *
 * @author mikeyang
 */
public class AdultPlayer extends Players{
    
    public AdultPlayer(String firstname, String surname, int age) {
        super(firstname, surname,age,PlayerAttributes.ADULTPLAYER);
    }
    
    //extends and inherit from players
    //a type of players who has adult features
    
}
