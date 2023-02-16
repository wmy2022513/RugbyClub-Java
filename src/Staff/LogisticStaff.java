/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Staff;

/**
 *
 * @author mikeyang
 */
public abstract class LogisticStaff extends StaffMember{
    

    public LogisticStaff(String firstname, String surname, StaffType role) {
        super(firstname, surname, Categories.LOGISTICSTAFF, role );
        
}
    @Override
	//return the logistic-staffs information
	public String toString() {
		
		return "\n********* \nStaff ID:\t" + this.getStaff_ID() + "\nFirstname:\t" + this.getfirstName() + "\nSurname:\t" + this.getSurname() + "\nRole:\t" + this.getRole().toString() ;
	}
}
    

