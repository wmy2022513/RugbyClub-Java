/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RugbyClub;


import Group.*;
import Players.*;
import Staff.*;
import java.util.ArrayList;
import Staff.SingletonHC;
import inpututilsModified.InputUtilsModified;
import java.util.Random;
/**
 *
 * @author mikeyang
 */
public class RugbyClub {

        private ArrayList<GroupCompositions> groupList;
        
        private static ArrayList<StaffMember> staffList;
	
        private static ArrayList<StaffMember> coachingStaffList;
        
        private ArrayList<Players> playerList;
        private static ArrayList<String> playersWithCoach;
	
	public RugbyClub() {
		
		this.groupList = new ArrayList<GroupCompositions>();		
		this.staffList = new ArrayList<StaffMember>();
                this.coachingStaffList = new ArrayList<StaffMember>();
                
                this.playerList = new ArrayList<Players>();
                
                this.playersWithCoach = new ArrayList<String>();
                
                createGroups(25); // create Groups method
                createLogisticStaffs(5); //create logisticStaff method ,each type create 5 , it has 3 types
                createCoachingStaffs(12); //create coaghingStaff method,each type create 12 ,it has 4 types(include head coach) 
                createPlayers(60);// create players method,each type create 60, it has 5 types
	}
        public static void main(String[] args) {

            InputUtilsModified myKB = new InputUtilsModified(); 
            RugbyClub myRugbyClub = new RugbyClub();

            boolean exit = false; //initialize, it is the "switch" of menu and this project
            boolean staffListPage = false;//initialize,it is the "switch" of "List staff by a category"
            boolean groupTrainDay = false;//initialize,it is the "switch" of "List groups by the day they train"
            boolean playerByGroup = false;//initialize,it is the "switch" of "List players by choosing a group"
            

            while(!exit ){
                //main menu
                System.out.println("Welcome to RugbyClub\n***********************\nPlease choose a number:");
                System.out.println("1.Menu");
                System.out.println("2.List All Staff");
                System.out.println("3.List staff by a category chosen by the user ");
                System.out.println("4.List all Groups details");
                System.out.println("5.List Groups by the day they train");
                System.out.println("6.List all the players by choosing a particular Group ");
                System.out.println("7.List all Players");
                System.out.println("8.exit\n***********************");
                switch(myKB.getUserInt(1,9)){ //invoke InputUtilsModified.getUserInt method to give user a range of options
                    case 1:
                        break;
                    case 2:
                        System.out.println(myRugbyClub.getStaffList());//list all staff
                        break;
                    case 3:
                        while(!staffListPage){ //go to staff page,choose a type of staff member to display
                        System.out.println("Choose a number");
                        System.out.println(myRugbyClub.listClubStaff()); 
                        //invoke this method ,the stafftypes will shows up by list
                        System.out.println("8: go back to menu"); //add this prompt,it's for case 8:back to menu
                        switch(myKB.getUserInt(1, 8)){
                        //user will enter a number and get information of staff members of different type    
                            case 1:
                                System.out.println(myRugbyClub.listStaffByRole(StaffType.GROUNDSTAFF));
                                break;
                            case 2:
                                System.out.println(myRugbyClub.listStaffByRole(StaffType.CARETAKER));
                                break;
                            case 3:
                                System.out.println(myRugbyClub.listStaffByRole(StaffType.PHYSIO));
                                break;
                            case 4:
                                System.out.println(myRugbyClub.listStaffByRole(StaffType.HEADCOACH));
                                break;
                            case 5:
                                System.out.println(myRugbyClub.listStaffByRole(StaffType.ASSISTANTCOACH));
                                break;
                            case 6:
                                System.out.println(myRugbyClub.listStaffByRole(StaffType.SWIMTEACHER));
                                break;
                            case 7:
                                System.out.println(myRugbyClub.listStaffByRole(StaffType.FITNESSCOACH));
                                break;
                            case 8:
                                staffListPage = true;//jump out this switch-case and go back to menu
                                break;
                            }
                        }
                        staffListPage = false;
                        //set false again,otherwise we can't access this page again,if we had left and want to go back
                        //Because in the case 8: staffListPage had been set to true
                        break;
                    case 4:
                        System.out.println(myRugbyClub.listAllGroups());
                        break;
                    case 5:
                        while(!groupTrainDay){  
                            System.out.println("Choose a day to see which groups are trainning in that day");
                            System.out.println("Only Weekdays,no body willing to trained on weekend");
                            System.out.println("1.Monday\n2.Tuesday\n3.Wednesday\n4.Thursday\n5.Friday\n\n6.Back to menu");
                            switch(myKB.getUserInt(1, 6)){
                                case 1:
                                    System.out.println(myRugbyClub.listGroupsByTrainingDay("Monday") + "\n");
                                    break;
                                case 2:
                                    System.out.println(myRugbyClub.listGroupsByTrainingDay("Tuesday") + "\n");
                                    break;
                                case 3:
                                    System.out.println(myRugbyClub.listGroupsByTrainingDay("Wednesday") + "\n");
                                    break;
                                case 4:
                                    System.out.println(myRugbyClub.listGroupsByTrainingDay("Thursday") + "\n");
                                    break;
                                case 5:
                                    System.out.println(myRugbyClub.listGroupsByTrainingDay("Friday") + "\n");
                                    break;
                                case 6:
                                    groupTrainDay = true;//jump out this switch-case and go back to menu
                                    break;
                            }
                        }
                        groupTrainDay = false;
                        //set false again,otherwise we can't access this page again,if we had left and want to go back
                        //Because in the case 6: groupTrainDay had been set to true
                        break;
                    case 6:
                        while(!playerByGroup){
                            //list players by user choose a group function
                            System.out.println("Choose a Group to display players");
                            System.out.println(myRugbyClub.listAllGroupName());//invoke method,list all group name for user choose
                            System.out.println("26.go back to menu");//back to menu button
                            switch(myKB.getUserInt(1, 26)){
                                case 1:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.BRAVEBLUES));
                                    break;
                                case 2:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.YELLOWFLAMINGOS));
                                    break;
                                case 3:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.PINKPANTHERS));
                                    break;
                                case 4:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.SPACEREBELS));
                                    break;
                                case 5:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.GOLDENJOKERS));
                                    break;
                                case 6:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.PURPLELADIES));
                                    break;
                                case 7:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.BLUEKILLERS));
                                    break;
                                case 8:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.GREENFOXES));
                                    break;
                                case 9:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.CRIMSONKNIGHTS));
                                    break;
                                case 10:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.SILVERDRAGONS));
                                    break;
                                case 11:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.DANCINGGENTLEMAN));
                                    break;
                                case 12:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.GREENBOMBERS));
                                    break;
                                case 13:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.BIRMINGHAMCOTTONS));
                                    break;
                                case 14:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.LONDONWARRIORSFC));
                                    break;
                                case 15:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.BELFASTATHLETES));
                                    break;
                                case 16:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.NEWYORKBUTTERFLIES));
                                    break;
                                case 17:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.MANCHESTERCITIZENS));
                                    break;
                                case 18:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.SCREAMINGBRUMMIES));
                                    break;
                                case 19:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.NEWCASTLEWOODMEN));
                                    break;
                                case 20:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.CHICAGOREBELS));
                                    break;
                                case 21:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.BASHFULMINKS));
                                    break;
                                case 22:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.CHEMICALRACERS));
                                    break;
                                case 23:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.SWIFTMARLINS));
                                    break;
                                case 24:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.RIGIDRAIDERS));
                                    break;
                                case 25:
                                    System.out.println(myRugbyClub.listPlayersByGroup(GroupName.BRAVENERD));
                                    break;
                                case 26:
                                    playerByGroup = true;
                                    break; //jump out switch-case
                            }
                        }
                        playerByGroup = false;//set false again,for next time access
                        break;
                    case 7:
                        System.out.println(myRugbyClub.listAllPlayers());//list all players in the club
                        break;
                    case 8:
                        exit = true;
                        break;
                            
            }
            
        }
    }
        
    /**
         * Generate a number of groups that are going to training on different day
         * @param numGroups - the number of groups wanted,fixed to 25
         */
    private void createGroups(int numGroups) {

            GroupFactory myGroupFactory = new GroupFactory();
            
            GroupName[] types = GroupName.values(); 
            
            for (int i=0; i<numGroups; i++) {

                    GroupCompositions someGroups = myGroupFactory.getGpName(types[i]); //put all the groups

                    this.groupList.add(someGroups);//put into arraylist
            }    
    }

        

    private void createLogisticStaffs(int numStaff) { 
           //create LogisticStaff and put into ArrayList:staffList

       for (int i=0; i<numStaff; i++) {
           //each type create following the quantity "numStaff"
           StaffMember GroundStaff = StaffType.GROUNDSTAFF.getStaff();
           StaffMember CareTaker = StaffType.CARETAKER.getStaff();
           StaffMember Physio = StaffType.PHYSIO.getStaff();
           this.staffList.add(GroundStaff);
           this.staffList.add(CareTaker);
           this.staffList.add(Physio);
           //adding each types of Logistic staff to staffList
	}
       
    }
    private void createCoachingStaffs(int numStaff) { 
           //create CoachingStaff and put into ArrayList:staffList   
           SingletonHC Hcoach = SingletonHC.getFixedHeadCoach();
           //only can have one fixed HeadCoach,if use for-loop traverse it, will always get the same HeadCoach
           this.staffList.add(Hcoach.OneHeadCoach); 


        for (int i=0; i<numStaff; i++) {
           //each type create following the quantity "numStaff"
           StaffMember AssistantCoach = StaffType.ASSISTANTCOACH.getStaff();
           StaffMember SwimTeacher = StaffType.SWIMTEACHER.getStaff();
           StaffMember FitnessCoach = StaffType.FITNESSCOACH.getStaff();
           this.staffList.add(AssistantCoach);
           this.staffList.add(SwimTeacher);
           this.staffList.add(FitnessCoach);
           
           //adding each types of Coaches to staffList
	}
       for(StaffMember s:staffList){
           //get coaching staff from stafflist
           if(s.getStaffCgs()== s.getStaffCgs().COACHINGSTAFF){
           this.coachingStaffList.add(s); 
           //put coaching Staffs to the other ArrayList,it's for assign coaches to group
           }
       }
       
    }
    
    private void createPlayers(int numPlayers){
            
        for (int i=0;i<numPlayers;i++){
            //each type create following the quantity "numPlayers"
            Players AdultPlayer = PlayerAttributes.ADULTPLAYER.getPlayerDetails();
            Players ElderlyPlayer = PlayerAttributes.ELDERLYPLAYER.getPlayerDetails();
            Players NerdPlayer = PlayerAttributes.NERDPLAYER.getPlayerDetails();
            Players RetirePlayer = PlayerAttributes.RETIREPLAYER.getPlayerDetails();
            Players TeensPlayer = PlayerAttributes.TEENSPLAYER.getPlayerDetails();
            
            this.playerList.add(AdultPlayer);
            this.playerList.add(ElderlyPlayer);
            this.playerList.add(NerdPlayer);
            this.playerList.add(RetirePlayer);
            this.playerList.add(TeensPlayer);
            //put all of them into playerList , by using ArrayList.add() function
        }
    }
    
    public String listAllPlayers(){
        //list all players and change data type to String
        //will use this for display
            String list ="";

             for(Players p:playerList){

                list = list.concat(p.toString());

             }
             return list;
    }
    
    public String listAllStaff(){ 
           //list All Staff(logisticStaff and CoachingStaff)
           
           String list = ""; //declare a null variable,it's for store staff information
           
		for( StaffMember s: staffList) {
			
			list = list.concat(s.toString());
                        //change data type to string then store to list
		}
		
                return list;
       }

        /**
         * This part is mainly for display Groups information
         * @return 
         */
    public String listAllGroups(){
           
           String list = ""; //declare a null variable,it's for store group information
                                                    
		for( GroupCompositions g: groupList) { //for each loop,treaverse groupList
			
			list = list.concat(g.toString()); //change data type by invoke toString method
		}
		
                return list;
       }
    

    
    public String listPlayersByGroup(GroupName gpName){
            //list players by the group user choose
            String list ="";
            
            Random r = new Random();
            
            int number = r.nextInt(275); 
            //randomly get a number,players totally have 300,each group assigned 12~15 players
            //  275+(12~15)> 300
                
            for(GroupCompositions g:groupList){
                
                if(g.getGpName() == gpName){

                    list = list.concat(g.toString());

                    for(int i=number;i<=gpName.NumOfPlayers()-1+number;i++){
                        //get number of players from gpName(Group name), i and NumOfPlayers both + number
                        list = list.concat(playerList.get(i).toString());
                        //concat: appends a string to the end of another string

                    }
                    
                }
            }
            
            return list;
    }
    


    public String listGroupsByTrainingDay(String trainingDay){
           
           String list = "";
           
		for( GroupCompositions g: groupList) {
                    if(g.getTrainingDay().equals(trainingDay)) //if g.getTrainingDay() equals to passed fuction "training day"(String)
                                                          
			list = list.concat(g.toString()); //then change data type(to String) and put into list
		}
		
                return list;
       }

    
    //below are getters
    public String listClubStaff(){
        
        return Staff.StaffType.listStaffTypesAsString();

    }

    public String listStaffByRole(StaffType type){
        
        return Staff.StaffType.listStaffByRole(staffList, type);
    }

    public String listAllGroupName(){
        
        return Group.GroupName.listAllGroupNameAsString();
    }

    public ArrayList<GroupCompositions> getGroupList() {
        return groupList;
    }

    public String getStaffList() {
        return listAllStaff();
    }
    public static ArrayList<StaffMember> getcoachingStaffList(){
        return coachingStaffList;
    }
    
    
}
