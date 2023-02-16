/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Staff;
import Staff.StaffType;
/**
 *
 * @author mikeyang
 */
public class SingletonHC {
    

    private static SingletonHC FixedHeadCoach = null;
    // Static variable reference of FixedHeadCoach of type Singleton
    public StaffMember OneHeadCoach;
    //Declaring a variable of StaffMember
    
    private SingletonHC(){
    
        OneHeadCoach = StaffType.HEADCOACH.getStaff();
    // Constructor
    // Here I'm creating private constructor
    // restricted to this class itself
    }
    
    // Static method
    // Static method to create instance of Singleton class
    public static SingletonHC getFixedHeadCoach() {
        
        if(FixedHeadCoach == null){ 
        
            FixedHeadCoach = new SingletonHC();
        }
        
        return (FixedHeadCoach);
    }

}
