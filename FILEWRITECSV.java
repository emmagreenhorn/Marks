import javax.swing.*;
import java.io.*;

public class FILEWRITECSV
{
    private FileWriter fWriter;

    public void writeCSVtable(String outBuffer) throws IOException
    {
        String csvFile;
        //create a file chooser
        File currentDir = new File ("").getAbsoluteFile();
        final JFileChooser fc = new JFileChooser(currentDir);
        // In response to a button click:
        int returnVal = fc.showSaveDialog(null);
        //open file
        File file = fc.getSelectedFile();
        //optain filename
        csvFile = file.getName();

        // open the file
        fWriter = new FileWriter(csvFile);
        //write all the to the file in 1 burst
        fWriter.write(outBuffer);
        //close the file
        fWriter.close();

    }

    FILEREADCSV markFile; // to read file from storage
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
            if((PupilList[i].getMark() > 18.5) && (PupilList[i].getMark() < 25) )
            {
                //add 1 to count: for OK mark
                count = count +1;
                //display the details for the member
                memberList[i].displayDetails();
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
        }
        
    
