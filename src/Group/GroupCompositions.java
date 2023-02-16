/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Group;
import RugbyClub.*;
import Staff.*;
import java.util.Random;

/**
 *
 * @author mikeyang
 */
public abstract class GroupCompositions {
        
        /**
         * all different categories of group are extend from this abstract class
         * 
         */

        private GroupName GpName;
        private String group_ID;
        private GroupCategories groupCgs;
        
        
        private static int CurrentGpNumber = 100;

        //To create a new group,the content below is for the group informations
        public GroupCompositions(GroupCategories groupCgs,GroupName GpName ){

            this.group_ID = GenerateGpID();
            this.GpName = GpName;
            this.groupCgs = groupCgs;


        }
        //each group must be given  an identifier (e.g. U13A) 
        private String GenerateGpID(){

            CurrentGpNumber++;
            String gp_ID =  "U13A" + CurrentGpNumber;
            return gp_ID;
        }

        public static StaffMember getCoachRandomly(){
            //randomly get a coach from coachingStaffList
            Random r = new Random();

            int getrandomCoach = r.nextInt(RugbyClub.getcoachingStaffList().size());
            //the "size" should be same as the coachingStaffList
            return RugbyClub.getcoachingStaffList().get(getrandomCoach);
            //return a couch
        }
            
        
        
       @Override
	//return the GroupCompositions in full
	public String toString() {
		//display group details, coach and training day add in as well
            return "\n*************************** \nGroup ID:\t" + this.group_ID + "\nGroupName:\t" + this.GpName + "\nGroupCategories:" + this.groupCgs  + "\nNumber of Players:\t" + getNumOfPlayers() +"\nTraining Day:\t" + getTrainingDay() +"\nCoach :" + getCoachRandomly() ;
	}
        //belows are getter ,can let other classes access
        public GroupName getGpName() {
            return GpName;
        }

        public String getGroup_ID() {
            return group_ID;
        }

        public String getGroupCgs() {
            return groupCgs.toString();
        }

        public String getTrainingDay() {
            return groupCgs.trainingDay();
        }
        
        public int getNumOfPlayers(){
            return GpName.NumOfPlayers();
        }
        
        public String getGroupName(){
            return GpName.toString();
        }
        

}
