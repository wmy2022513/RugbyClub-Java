/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileReaderPlus;

import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author mikeyang
 */
        /**
         * slightly different from the previous one
         * change data type to array for fit in name generator
         */
public class FileReaderPlus {
    
    public static String[] readFromFile(String myFileName){
        //declare an Array,which is for placed data
            String[] myContent = new String[200]; //set 200,beause fname.txt and sname.txt both have 200 datas
     try{
          //must have a try-catch because the file might not exist
          Scanner myFile = new Scanner(new FileReader(myFileName));
          //use .hasNext() to check to see if there is anything in the file. True/False.
          if(myFile.hasNext()){
              for(int i=0;i<myContent.length;i++){
               myContent[i] = myFile.nextLine();
              }            
            }
      }catch (Exception e){
          //error opening file
          System.out.println("Error - unable to find file " + myFileName);
      }
        return myContent;
        // return an Array
    }

}
