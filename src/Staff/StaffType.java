/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Staff;

import LogisticStaff.GroundStaff;
import LogisticStaff.Physio;
import LogisticStaff.CareTaker;
import NameGenerators.NameGenerator;
import java.util.ArrayList;
import CoachingStaff.*;

/**
 *
 * @author mikeyang
 */
        

public enum StaffType {
            
            /**
             * enumerate all sort of staff , 7 kinds
             * Override StaffMember getStaff() for get a (type of)staff name by invoke generateName() method,and return it
             * override Categories whichStaffCgs() it's for define which categories they are
             */
	GROUNDSTAFF{

		@Override
		public StaffMember getStaff() {
						
			String[] name = generateName();
			
			return new GroundStaff(name[0],name [1]);
			
		}
		
		/**
         * 
         * @return LogisticStaff for all LogisticStaff sub-types
         */
	@Override
	public Categories whichStaffCgs() {
		
            return Categories.LOGISTICSTAFF;
	}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Ground Staff";
		}
		
	},
	
	CARETAKER{

		@Override
		public StaffMember getStaff() {
						
			String[] name = generateName();
			
			return new CareTaker(name[0], name[1]);
		}
		
		/**
         * 
         * @return LogisticStaff for all LogisticStaff sub-types
         */
	@Override
	public Categories whichStaffCgs() {
		
            return Categories.LOGISTICSTAFF;
	}

		@Override
		public String toString() {
			
			return "Care Taker";
		}
	},
	PHYSIO{

		@Override
		public StaffMember getStaff() {
			
			String[] name = generateName();
			
			return new Physio(name[0], name[1]);
		}
		
		/**
         * 
         * @return LogisticStaff for all LogisticStaff sub-types
         */
	@Override
	public Categories whichStaffCgs() {
		
            return Categories.LOGISTICSTAFF;
	}

		@Override
		public String toString() {
			
			return "Physio";
		}
	},
	HEADCOACH{

		@Override
		public StaffMember getStaff() {

			String[] name = generateName();
			
			return new HeadCoach(name[0], name[1]);
		}
		
		/**
         * 
         * @return CoachingStaff for all CoachingStaff sub-types
         */
	@Override
	public Categories whichStaffCgs() {
		
            return Categories.COACHINGSTAFF;
	}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Head Coach";
		}
		
	},
	
	ASSISTANTCOACH{

		@Override
		public StaffMember getStaff() {

			String[] name = generateName();
			
			return new AssistantCoach(name[0], name[1]);
		}
		
		 /**
         * 
         * @return CoachingStaff for all CoachingStaff subtypes
         */
        @Override
	public Categories whichStaffCgs() {
			
		return Categories.COACHINGSTAFF;
	}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Assistant Coach";
		}
		
	},
	
	SWIMTEACHER{

		@Override
		public StaffMember getStaff() {

			String[] name = generateName();
			
			return new SwimTeacher(name[0], name[1]);
		}
		
		
 /**
         * 
         * @return CoachingStaff for all CoachingStaff subtypes
         */
            @Override
            public Categories whichStaffCgs() {
            
		return Categories.COACHINGSTAFF;
            }
		
            @Override
            public String toString() {
			
             return "Swim Teacher";
            }
                
	},
        
        FITNESSCOACH{

		@Override
		public StaffMember getStaff() {

			String[] name = generateName();
			
			return new FitnessCoach(name[0], name[1]);
		}
		
		
 /**
         * 
         * @return CoachingStaff for all CoachingStaff subtypes
         */
            @Override
            public Categories whichStaffCgs() {
            
		return Categories.COACHINGSTAFF;
            }
		
            @Override
            public String toString() {
			
             return "Fitness Coach";
            }
                
	};
	

	//below abstract method had been difine(override) on above
	public abstract StaffMember getStaff();
        
        public abstract Categories whichStaffCgs();
	
        //a method return an array for staff get firstname and surname,(by invoke NameGenerator
	private static String[] generateName() {
		
		NameGenerator NG = new NameGenerator();
		
		String name = NG.getRandomName();
		
		return name.split(" ");
	}
	
	//@return arraylist of Logistic staff roles
	public static ArrayList<StaffType> listLogisticStaff() {
		
		StaffType[] allTypes = StaffType.values();
		ArrayList<StaffType> LOGISTICSTAFF = new ArrayList<StaffType>();
		
		for (StaffType t: allTypes) {
			
                    
			if(t.whichStaffCgs() == Categories.LOGISTICSTAFF) {
				LOGISTICSTAFF.add(t);
			}
		}
		
		return LOGISTICSTAFF;
	}
	
	//@return arraylist of only Coaching staff roles
	public static ArrayList<StaffType> listCoachingStaff() {
		
		StaffType[] allTypes = StaffType.values();
		ArrayList<StaffType> coachingstaff = new ArrayList<StaffType>();
		
		for (StaffType t: allTypes) {
			
			if(t.whichStaffCgs() == Categories.COACHINGSTAFF) {
				coachingstaff.add(t);
			}
		}
		
		return coachingstaff;
	}
        
        
        /**
        * 
        * @return All available types as a formatted multi-line String
        */
	public static String listStaffTypesAsString() {
			
			String list = "";
			StaffType[] types = StaffType.values();
			
			for( int counter = 0; counter<types.length; counter++) {
			
				list = list.concat((counter + 1) + ": " + types[counter].toString() + "s \n");
			}
			
			return list;
		}
        
        /**
         * Filter a list of staff members from a given staff list who belong to a specified Categories
         * @param staffList - an ArrayList of staffMembers
         * @param categ - the Categories specified
         * @return ArrayList containing only staff members from Categories
         */

        //@return String ,this part is modified from below
        public static String listStaffByRole(ArrayList<StaffMember> staffList, StaffType role) {
	//this method will return staffmember of specific category		
		String list = "";
           
		for( StaffMember s: staffList) { //for each loop:traverse all the StaffMembers and print out
                    
			if(s.getRole() == role){ //stafflist getRole equals passed function
                            
                            list = list.concat(s.toString());                    
                    }
                }
                return list;
		}
	
}
