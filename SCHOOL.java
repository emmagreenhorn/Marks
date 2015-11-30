import javax.swing.JOptionPane;
import java.io.*;
public class SCHOOL
{
    
    private SCHOOL PupilList[];
    
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
    }
        
    
    public void countOKmark()
    {
        //placeholder 
    }
}
