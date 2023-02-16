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
public class SwimTeacher extends CoachingStaff{

    public SwimTeacher(String firstname, String surname) {
        super(firstname, surname, StaffType.SWIMTEACHER);
    }

    //an class inherit from CoachingStaff Class
    //it's a type of StaffMember-CoachingStaff
    
}
