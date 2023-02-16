/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Group;

import Group.*;

/**
 *
 * @author mikeyang
 */
public enum GroupCategories {
            
            /**
             * override below 5 groups method toString and training day
             * 1. to String it's only for return enumerate type to string
             * 2.training day represents different categories of groups training on some a day
             * 
             */
        ADULTGROUP{

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Adult Group";
		}
                
                @Override
                public String trainingDay(){
                        
                        return "Monday";
                }

	},
        ELDERLYGROUP{

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Elderly Group";
		}
                
                @Override
                public String trainingDay(){
                    
                        return"Tuesday";
                }

        },
        TEENSGROUP{

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Teens Group";
		}
                @Override
                public String trainingDay(){
                
                        return"Wednesday";
                }

        },
        RETIREGROUP{

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Retire Group";
		}
                @Override
                public String trainingDay(){
                
                        return "Thursday";
                }

        },
        NERDGROUP{

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Nerd Group";
		}
                @Override
                public String trainingDay(){
                
                        return "Friday";
                }

        };

	public abstract String toString();
	
        public abstract String trainingDay();
        
        //above 2 abstracts methods are for different categories of group Override they're attributes

}

