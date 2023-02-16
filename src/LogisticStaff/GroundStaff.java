/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogisticStaff;
import Staff.LogisticStaff;
import Staff.StaffType;
/**
 *
 * @author mikeyang
 */
public class GroundStaff extends LogisticStaff{
    
    public GroundStaff(String firstname, String surname) {
        super(firstname, surname, StaffType.GROUNDSTAFF);
    }
    
       //an class inherit from LogisticStaff Class
       //it's a type of StaffMember-LogisticStaff
    
}
