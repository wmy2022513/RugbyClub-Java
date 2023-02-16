/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoachingStaff;

import Staff.CoachingStaff;
import Staff.StaffType;

/**
 *
 * @author mikeyang
 */
public class FitnessCoach extends CoachingStaff{
    
    public FitnessCoach(String firstname, String surname) {
        super(firstname, surname, StaffType.FITNESSCOACH);
    }
    
        
    //an class inherit from CoachingStaff Class
    //it's a type of StaffMember-CoachingStaff
    
}
