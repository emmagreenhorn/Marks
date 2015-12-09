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

        int count = 0;
        for  ( int i= 0; i < noOfPupils; i++)  
        {
            PupilList[i] = new MEMBER();
            PupilList[i].readMemberDetails(dataRows[i+1]);
        }

    }

    public void findMaxData() 
    {
        {
            System.out.println("A report of pupils within ideal mark\n");
            //choose position of first value
            int maxDataPosition = 0;

            //repeat for the REST of the array
            for (int i=1; i < noOfPupils; i ++) {

                if (PupilList[i].getmark()  < PupilList[maxDataPosition].getmark()) {
                    maxDataPosition = i; 

                }

            }
            System.out.println("Position is:" + maxDataPosition + " , Value is:");
            PupilList[maxDataPosition].displayData();
            System.out.println();
        } 
    }

    /**
     * 
     * 
     *     FILEREADCSV markFile; // to read file from storage
    FILEWRITECSV resultFile; // to write data to storage

    public void CLUB() throws IOException
    {
    //create file handler objects 
    markFile = new FILEREADCSV();
    resultFile = new FILEWRITECSV();
    }

    public void countOKmark() throws IOException
    { 
    //prepare a String to write data to disc
    String fileContent = "";

    System.out.println("A report of members with highest mark\n");
    //start the count
    int count = 0;
    //loop for each item: pupil 

    for (int i = 0; i < noOfPupils; i++) {
    { 
    //decide if current item: member matches target: mark
    if((PupilList[i].getmark() > 18.5) && (PupilList[i].getmark() < 25) )
    {
    //add 1 to count: for OK mark
    count = count +1;
    //display the details for the member
    PupilList[i].displayDetails();
    //use new line to seperate rows in csv file, after 1st line
    if (count>1)
    {
    fileContent = fileContent.concat("\n");
    }
    //join on next line of data for writing to file
    fileContent =
    fileContent.concat(memberList[i].writeDetails());
    }
    }
    //display the final count: mark
    System.out.println("\n Total for OK mark is : " + count);
    //A blank line to seperate this report from others.
    System.out.println();
    //send for writing to file as a string containing all data
    System.out.println("** Preparing to write data file.");
    resultFile.writeCSVtable(fileContent);
    System.out.println("** File written and closed.");
    }
    }
     */

}
