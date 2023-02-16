/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Group;


import AdultGroup.*;
import ElderlyGroup.*;
import TeensGroup.*;
import RetireGroup.*;
import NerdGroup.*;
import java.util.Random;


/**
 *
 * @author mikeyang
 */
public enum GroupName {
    
        /**
         * enumerate 25 groups,it returns group name,which types of group belongs to,and number of players
         * use abstract method(put at the end),and override the attributes for each groups
         * use Random method, Random r = new Random(0),get a number randomly between 12~25
         * the 0 in the bracket it's the seed which is for the initial value of the internal state
         */
        BRAVEBLUES{

		@Override
		public GroupCompositions getGpName() {

			return new BraveBlues();
		}
	/**
         * 
         * @return ADULTGROUP for all ADULTGROUP sub-types
         * below 5 groups are categories of ADULTADULTGROUP
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.ADULTGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Brave Blues";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);//get random number from 12~25

                    return playersQuantity;
                }
		
	},
        YELLOWFLAMINGOS{
                @Override
		public GroupCompositions getGpName() {

			return new YellowFlamingos();
		}
	/**
         * 
         * @return ADULTGROUP for all ADULTGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.ADULTGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Yellow Flamingos";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        PINKPANTHERS{
                @Override
		public GroupCompositions getGpName() {

			return new PinkPanthers();
		}
	/**
         * 
         * @return ADULTGROUP for all ADULTGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.ADULTGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Pink Panthers";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        SPACEREBELS{
                @Override
		public GroupCompositions getGpName() {

			return new SpaceRebels();
		}
	/**
         * 
         * @return ADULTGROUP for all ADULTGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.ADULTGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Space Rebels";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        GOLDENJOKERS{
                @Override
		public GroupCompositions getGpName() {

			return new GoldenJokers();
		}
	/**
         * 
         * @return ADULTGROUP for all ADULTGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.ADULTGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Golden Jokers";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        PURPLELADIES{
                @Override
		public GroupCompositions getGpName() {

			return new PurpleLadies();
		}
	/**
         * 
         * @return ELDERLYGROUP for all ELDERLYGROUP sub-types
         * below 5 groups are categories of ELDERLYGROUP
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.ELDERLYGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Purple Ladies";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        BLUEKILLERS{
                @Override
		public GroupCompositions getGpName() {

			return new BlueKillers();
		}
	/**
         * 
         * @return ELDERLYGROUP for all ELDERLYGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.ELDERLYGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Blue Killers";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        GREENFOXES{
                @Override
		public GroupCompositions getGpName() {

			return new GreenFoxes();
		}
	/**
         * 
         * @return ELDERLYGROUP for all ELDERLYGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.ELDERLYGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Green Foxes";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        
        },
        CRIMSONKNIGHTS{
                @Override
		public GroupCompositions getGpName() {

			return new CrimsonKnights();
		}
	/**
         * 
         * @return ELDERLYGROUP for all ELDERLYGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.ELDERLYGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Crimson Knights";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        SILVERDRAGONS{
                @Override
		public GroupCompositions getGpName() {

			return new SilverDragons();
		}
	/**
         * 
         * @return ELDERLYGROUP for all ELDERLYGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.ELDERLYGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Silver Dragons";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
                    
        },
        DANCINGGENTLEMAN{
                @Override
		public GroupCompositions getGpName() {

			return new DancingGentleman();
		}
	/**
         * 
         * @return TEENSGROUP for all TEENSGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.TEENSGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Dancing Gentleman";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        GREENBOMBERS{
                @Override
		public GroupCompositions getGpName() {

			return new GreenBombers();
		}
	/**
         * 
         * @return TEENSGROUP for all TEENSGROUP sub-types
         * below 5 groups are categories of TEENSGROUP
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.TEENSGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Green Bombers";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        BIRMINGHAMCOTTONS{
                @Override
		public GroupCompositions getGpName() {

			return new BirminghamCottons();
		}
	/**
         * 
         * @return TEENSGROUP for all TEENSGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.TEENSGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Birmingham Cottons";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        LONDONWARRIORSFC{
                @Override
		public GroupCompositions getGpName() {

			return new LondonWarriorsFC();
		}
	/**
         * 
         * @return TEENSGROUP for all TEENSGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.TEENSGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "London Warriors FC";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        BELFASTATHLETES{
                @Override
		public GroupCompositions getGpName() {

			return new BelfastAthletes();
		}
	/**
         * 
         * @return TEENSGROUP for all TEENSGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.TEENSGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Belfast Athletes";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
                
        },
        NEWYORKBUTTERFLIES{
                @Override
		public GroupCompositions getGpName() {

			return new NewYorkButterflies();
		}
	/**
         * 
         * @return RETIREGROUP for all RETIREGROUP sub-types
         * below 5 groups are categories of RETIREGROUP
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.RETIREGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "New York Butterflies";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        MANCHESTERCITIZENS{
                @Override
		public GroupCompositions getGpName() {

			return new ManchesterCitizens();
		}
	/**
         * 
         * @return RETIREGROUP for all RETIREGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.RETIREGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Manchester Citizens";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        SCREAMINGBRUMMIES{
                @Override
		public GroupCompositions getGpName() {

			return new ScreamingBrummies();
		}
	/**
         * 
         * @return RETIREGROUP for all RETIREGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.RETIREGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Screaming Brummies";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        
        },
        NEWCASTLEWOODMEN{
                @Override
		public GroupCompositions getGpName() {

			return new NewcastleWoodmen();
		}
	/**
         * 
         * @return RETIREGROUP for all RETIREGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.RETIREGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Newcastle Woodmen";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        CHICAGOREBELS{
                @Override
		public GroupCompositions getGpName() {

			return new ChicagoRebels();
		}
	/**
         * 
         * @return RETIREGROUP for all RETIREGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.RETIREGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Chicago Rebels";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        BASHFULMINKS{
                @Override
		public GroupCompositions getGpName() {
			
			return new BashfulMinks();
		}
	/**
         * 
         * @return NERDGROUP for all NERDGROUP sub-types
         * below 5 groups are categories of NERDGROUP
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.NERDGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Bashful Minks";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        CHEMICALRACERS{
                @Override
		public GroupCompositions getGpName() {

			return new ChemicalRacers();
		}
	/**
         * 
         * @return NERDGROUP for all NERDGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.NERDGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Chemical Racers";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        SWIFTMARLINS{
                @Override
		public GroupCompositions getGpName() {

			return new SwiftMarlins();
		}
	/**
         * 
         * @return NERDGROUP for all NERDGROUP sub-types
         */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.NERDGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Swift Marlins";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        RIGIDRAIDERS{
                @Override
		public GroupCompositions getGpName() {

			return new RigidRaiders();
		}
                /**
                 * 
                 * @return NERDGROUP for all NERDGROUP sub-types
                 */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.NERDGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Rigid Raiders";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0);
                    
                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);

                    return playersQuantity;
                }
        },
        BRAVENERD{
                @Override
		public GroupCompositions getGpName() {

			return new BraveNerd();
		}
                /**
                 * 
                 * @return NERDGROUP for all NERDGROUP sub-types
                 */
                @Override
                public GroupCategories whichGroupCgs() {

                    return GroupCategories.NERDGROUP;
                }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Brave Nerd";
		}
                @Override
                public int NumOfPlayers(){
                    
                    Random r = new Random(0); 
                    //fix: for get same number

                    int playersQuantity = 12 + r.nextInt(15 - 12 + 1);
                    
                    
                    return playersQuantity;
                }
        };
        
        //abstract classes overrided by above enums
        public abstract GroupCompositions getGpName();
        
        public abstract GroupCategories whichGroupCgs();
        
        public abstract int NumOfPlayers();
        
        
        /**
        * 
        * @return All available types as a formatted multi-line String
        * return a group name list as String
        */
	public static String listAllGroupNameAsString() {
			
			String list = "";
			GroupName[] types = GroupName.values();
			
			for( int counter = 0; counter<types.length; counter++) {
			
				list = list.concat((counter + 1) + ": " + types[counter].toString() + " \n");
			}
			
			return list;
		}
        
}
