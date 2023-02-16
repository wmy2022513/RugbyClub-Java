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
public class CareTaker extends LogisticStaff{
    
    public CareTaker(String firstname, String surname) {
        super(firstname, surname, StaffType.CARETAKER);
    }
    
    //an class inherit from LogisticStaff Class
    //it's a type of StaffMember-LogisticStaff
    
}
