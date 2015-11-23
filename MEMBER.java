
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
    private int mark;
    
  
    
    
     
    public MEMBER()
    {
        // initialise instance variables
        firstName ="";
        surName ="";
        mark = 0;
        
        
    } 
    
    public void readMemberDetails(String dataItems)
    {
        //unpack string of row data into fields
        String[] rowItems = dataItems.split(",");
        
        //store each data item as instance property
        firstName = rowItems[0];
        surName = rowItems[1];
        mark = Integer.parseInt(rowItems[2]);
    
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
      memberData = memberData.concat(Integer.toString(mark));
      return memberData;
    
     
    

    }
  
        
    
    } 
