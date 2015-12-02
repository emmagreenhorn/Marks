import javax.swing.JOptionPane;
import java.io.*;
public class SCHOOL
{
    
    private MEMBER PupilList[];
    
    int noOfPupils;
    FILEREADCSV PupilFile;

    
    public SCHOOL()
    { 
        PupilFile = new FILEREADCSV();

    }

    public void processPupils()  throws IOException
    {
        setUpPupilList();
    
        
    }

    private void setUpPupilList() throws IOException
    {
        //first user message
        System.out.println("ScotFit SCHOOL: Membership pupil update");
        System.out.println("** Preparing to read data file.");
        
        //read file, fetch data as String array contaianing the rows
        String[] dataRows = PupilFile.readCSVtable();
        //calculate the number of member rows, skip headings
        noOfPupils = dataRows.length - 1;
        //update user with number of rows with membership details
        System.out.println("**" + noOfPupils + " rows read.\n\n");
        
        //prepare array for Pupil
        PupilList = new MEMBER[noOfPupils];
        
        for  ( int i= 0; i < noOfPupils; i++)  {
            PupilList[i] = new MEMBER();
            PupilList[i].readMemberDetails(dataRows[i+1]);
        }
    }
        
    
    public void findMaxData() {
    {
       System.out.println("A report of pupils within ideal mark\n");
        //choose position of first value
        int maxDataPosition = 0;
        
        //repeat for the REST of the array
        for (int i=1; i>20; i ++) {
            
            if (PupilList[i].getmark() < PupilList[maxDataPosition].getmark()) {
                maxDataPosition = i; 
                
            }
            System.out.println("\n total for OK mark is : " + PupilList) ;
            System.out.println();
        }
                
       
  
    } 
} 
}
