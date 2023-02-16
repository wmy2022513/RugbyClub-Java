/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Players;


import NameGenerators.NameGenerator;
import java.util.Random;

/**
 *
 * @author mikeyang
 */
public enum PlayerAttributes {
        
    /**
     * enumerate 5 kinds of players
     * It's mainly for get their name
     * the different feature is about their age range
     */
        ADULTPLAYER{
            
            //override getPlayerDetails(),adding features    
            @Override
            public Players getPlayerDetails(){
                
                String[] name = generateName();
                
                Random r = new Random();
                
                int age = 25 + r.nextInt(35 - 25 + 1);
            //randomly get a integer which represents their age, range is 25~35
                return new AdultPlayer(name[0],name[1],age);
                //return(firstname,surname,age)
            }

        },
        ELDERLYPLAYER{
            
            @Override
            public Players getPlayerDetails(){
                
                String[] name = generateName();
                
                Random r = new Random();
                
                int age = 35 + r.nextInt(45 - 35 + 1);
            //randomly get a integer which represents their age, range is 35~45
                return new AdultPlayer(name[0],name[1],age);
            }

        },
        NERDPLAYER{
            
            @Override
            public Players getPlayerDetails(){
                
                String[] name = generateName();
                
                Random r = new Random();
                
                int age = 18 + r.nextInt(25 - 18 + 1);
            //randomly get a integer which represents their age, range is 18~25
                return new AdultPlayer(name[0],name[1],age);
            }

        },
        RETIREPLAYER{
            
            @Override
            public Players getPlayerDetails(){
                
                String[] name = generateName();
                
                Random r = new Random();
                
                int age = 55 + r.nextInt(65 - 55 + 1);
            //randomly get a integer which represents their age, range is 55~65
                return new AdultPlayer(name[0],name[1],age);
            }

        },
        TEENSPLAYER{
            
            @Override
            public Players getPlayerDetails(){
                
                String[] name = generateName();
                
                Random r = new Random();
                
                int age = 12 + r.nextInt(18 - 12 + 1);
            //randomly get a integer which represents their age, range is 12~18
                return new AdultPlayer(name[0],name[1],age);
            }

        
        };

        //abstract class getPlayerDetails will be override and add in features
        public abstract Players getPlayerDetails();
        

        
        
        
        //invoke NameGenerator and split name stores to name[0],name[1],then return an array
        private static String[] generateName() {

            NameGenerator NG = new NameGenerator();

            String name = NG.getRandomName();

            return name.split(" ");
	}
        
}
