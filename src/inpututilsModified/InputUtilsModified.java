/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututilsModified;

import java.util.Scanner;

/**
 *
 * @author Ken Healy
 */
public class InputUtilsModified {

    /**
     * Prompts user to enter some text -- if input includes numbers then
     * display error and ask again
     * @param prompt -- the prompt or question to ask the user
     * @return - valid user input (text) 
     * 
     */
    public String getUserText(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        boolean valid = false; //assume not valid
        String userInput;
        
        do{
           
            System.out.println(prompt);
        
            userInput = myKB.nextLine().trim(); // get input
        
            if (userInput.matches("[a-zA-Z ]+")){
                //this is valid input - note this will allow space characters also
                valid=true;
            }
            else{
                //not valid text
                System.out.println("Invalid - enter text only please");
            }
            
         }while (!valid); //keep going until valid input received
        
       return userInput;
 
    }
    
    /**
     * Prompt user to enter an integer - if invalid keep asking
     * @param prompt the prompt or question to ask user
     * @return valid user input as an int
     * 
     */
    public int getUserInt(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        int userInput=0;
        boolean valid = false;
        
      do{
            System.out.println(prompt);
        
            try{
            
                userInput = myKB.nextInt(); //get a int
                valid = true; // i can only get to this line if it was a number
                
            }catch (Exception e){
                //error -- must not have entered numbers
                System.out.println("Invalid -- you must enter an integer only!");
                myKB.nextLine(); //reads enter from keyboard to prevent infinite loop
                
        }
      }while(!valid);
        
     return userInput;
  }
        
    /**
     * Prompt user to enter an integer within a given range - if invalid keep asking
     * @param prompt the prompt or question to ask user
     * @param minValue the lowest value allowed
     * @param maxValue the largest value allowed
     * @return valid user input as an int
     * 
     */
    public int getUserInt( int minValue, int maxValue){ 
        // modified ,remove prompt,do-loop changed to while-loop, add if-codition        
        Scanner myKB = new Scanner(System.in);
        int userInput=0;    //initialized variable
        boolean valid = false;

        while((!valid) || (userInput <minValue) || (userInput >maxValue)){        

            try{
                
                userInput = myKB.nextInt(); //get a int
                //add below condition,mainly for rugby club menu
                if((userInput <minValue) || (userInput >maxValue)){
                    //prompt user , must enter a number in the range
                    System.out.println("The number must be between " + minValue + " and " + maxValue);
                    
                }else{
                     valid = true;
                }
            }catch (Exception e){
                //error -- must not have entered numbers
                System.out.println("Invalid -- you must enter an integer only!");
                myKB.nextLine(); //reads enter from keyboard to prevent infinite loop
                
            }
        }
        
     return userInput;
  }
    
    /**
     * Prompt user to enter an integer greater than a certain value
     * @param prompt the prompt to be issued
     * @param minValue the lowest value allowed
     * @return a valid int from the user
     */
    public int getUserInt(String prompt, int minValue){
        
        Scanner myKB = new Scanner(System.in);
        int userInput=0;
        boolean valid = false;
        
      do{
            System.out.println(prompt);
            System.out.println("The number must be larger than " + minValue );
            try{
            
                userInput = myKB.nextInt(); //get a int
                valid = true; // i can only get to this line if it was a number
                
            }catch (Exception e){
                //error -- must not have entered numbers
                System.out.println("Invalid -- you must enter an integer only!");
                myKB.nextLine(); //reads enter from keyboard to prevent infinite loop
                
        }
      }while((!valid) || (userInput <minValue) );
        
     return userInput;
  }
}
