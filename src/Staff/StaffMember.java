/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Staff;

/**
 *
 * @author mikeyang
 */
public abstract class StaffMember {
    
        /*
	 * All staff members have a staff ID as well as basic personal details
	 * 
	 * They are all assigned to a Dept(I set it as Categories) and have a role (i.e. the function they perform)
	 * 
	 * All STaff members perform a task, but this task is different depending on the staff member
	 * 
	 * All staff members can be identified by asking them their name
	 * 
	 */
    
        private String firstname;
	private String surname;
	private String staff_ID; //to create a unique ID will combine symbol or word with 
	private Categories StaffCgs; //the categories they belongs
	private StaffType role;  //specific role (or job title)
        
        
        private static int currentStaffNumber = 1000;	//Start the staff ID badges at 1000
        
        //To hire a new staff member you need their name, they belong to which sort of categories, and their job title (role)
        public StaffMember(String firstname, String surname,Categories StaffCgs, StaffType role) {
		

		this.firstname = firstname;
		this.surname =  surname;
		this.staff_ID = generateIDBadge();	//when a new staff member is hired, they get a ID number.
		this.StaffCgs = StaffCgs;
		this.role = role;

            
	}
        
        private String generateIDBadge() {
		
		//Note -- A more complex ID creation method could be performed here.
                //give staff member a unique ID
		currentStaffNumber++;
                String staffID = "UE" + currentStaffNumber;
		return staffID;
		
	}

        //below are getters
        public String getStaff_ID() {
            return staff_ID;
        }

        public Categories getStaffCgs() {
            return StaffCgs;
        }

        public static int getCurrentStaffNumber() {
            return currentStaffNumber;
        }

        public StaffType getRole() {

                return this.role;
        }

        public String getfirstName() {

                return this.firstname;
        }

        public String getSurname() {

                return this.surname;
        }


}
