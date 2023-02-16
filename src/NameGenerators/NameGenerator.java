/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NameGenerators;
import fileReaderPlus.FileReaderPlus;
import java.util.Random;

/**
 * Base class to generate random names
 *
 * @author mikeyang
 */
public class NameGenerator {
    
    //read Fname.txt and Sname.txt by using FileReaderPlus.readFromFile method and put each into an array
    
    protected String[] firstNames = FileReaderPlus.readFromFile("Fname.txt");
	
    protected String[] surnames = FileReaderPlus.readFromFile("Sname.txt");

    public NameGenerator() {

            //nothing here - deliberate

    }

    /**
     * Generates a random name using firstnames and surnames
     * @return the name as a String
     */
    public String getRandomName() {

            Random r = new Random();

            //pick a firstname and surname based on length of array
            String fname = this.firstNames[r.nextInt(firstNames.length)];
            String sname = this.surnames[r.nextInt(surnames.length)];

            return ( fname + " " + sname);
            //return full name
    }

}
