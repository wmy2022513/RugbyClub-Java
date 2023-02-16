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
public class Physio extends LogisticStaff{
    
    public Physio(String firstname, String surname) {
        super(firstname, surname, StaffType.PHYSIO);
    }

       //an class inherit from LogisticStaff Class
       //it's a type of StaffMember-LogisticStaff
    
}
