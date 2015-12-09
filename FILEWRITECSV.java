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




}

