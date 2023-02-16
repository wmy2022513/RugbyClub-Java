/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Staff;

import java.util.Random;



/**
 *
 * @author mikeyang
 */

public abstract class CoachingStaff extends StaffMember {

    protected int qLevel;
    //only CoachingStaff and its Sub-class need this

    
    public CoachingStaff(String firstname, String surname, StaffType role) {
       
        super(firstname, surname, Categories.COACHINGSTAFF, role);
        
        this.qLevel = qLevel;
        
        Random r = new Random();
        //give Head Coach QuaLification Level:5 , and the rest CoachingStaff will get Qualification Level randomly
        if(role == StaffType.HEADCOACH ){
            
            this.qLevel = 5;
        
        }else{
            
            this.qLevel = r.nextInt(4) + 1;

        }
    }
    

    @Override
	//return the coaching-staffs information
	public String toString() {
		
		return "\n********* \nStaff ID:\t" + this.getStaff_ID() + "\nFirstname:\t" + this.getfirstName() + "\nSurname:\t" + this.getSurname() + "\nRole:\t" + this.getRole().toString() + "\nQualification Level:\t" +this.qLevel  ;
	}
}
