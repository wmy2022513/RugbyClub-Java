package Staff;

import java.util.ArrayList;

public enum Categories {
        
        /**
         * this RugbyClub has 2 types of staff
         * below abstract method override their features
         * Staff type(logistic or coaching)
         * and also return a list  which both are invoke from StaffType class
         */
	LOGISTICSTAFF{

		@Override
		public StaffMember getStaff(StaffType type) {
		
			return type.getStaff();
		}

		@Override
		public ArrayList<StaffType> listAllTypes() {
			
			return StaffType.listLogisticStaff();
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Logistic Staff";
		}
		
	},
	
	COACHINGSTAFF{

		@Override
		public StaffMember getStaff(StaffType type) {
			
			return type.getStaff();
		}

		@Override
		public ArrayList<StaffType> listAllTypes() {
			
			return StaffType.listCoachingStaff();
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Coaching Staff";
		}

	};
	
	//@return a StaffMmeber of a specific type
	public abstract StaffMember getStaff(StaffType type);
	
	
	public abstract ArrayList<StaffType> listAllTypes();
	
	public abstract String toString();
	
	
}
