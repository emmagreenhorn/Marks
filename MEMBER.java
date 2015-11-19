
/**
 * Write a description of class MEMBER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MEMBER
{
    //list of properties
    private String firstName;
    private String surName;
    private float mark;
    
     
    public MEMBER()
    {
        // initialise instance variables
        firstName ="";
        surName ="";
        mark = 0;
    }
    
    public String writeDetails()
    {

    //join up data into a string to output as a row
      // use "," to seperate csv columns 
      String memberData = "";
      memberData = memberData.concat(firstName);
      memberData = memberData.concat(",");
      memberData = memberData.concat(surName);
      memberData = memberData.concat(",");
      memberData = memberData.concat(Float.toString(mark));
      return memberData;
    

    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   
    
        // put your code here
        
    
    } 
