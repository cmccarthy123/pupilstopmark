import javax.swing.*;
import java.io.*;     
public class TOPPUPIL
{
    // array of MEMBER objects
    private pupil pupilList[];
    // number of members to be calculated after reading file
    int noOfPupils;
    FILEREADCSV examDataFile;

    public void TOPUPIL()
    {
        examDataFile = new FILEREADCSV();
    }

    // top level algorithm
    public void processPUPIL() throws IOException

    {
        setUpPupilList();
        findExamMark();
    }

    public void setUpPupilList() throws IOException

    {
        System.out.println("exam data here: list of pupils");
        System.out.println("** Preparing to read data file.");
        // read file, fetch data as String array containing the rows
        String[] dataRows = examDataFile.readCSVtable();
        // calculate the number of member rows, skip headings
        noOfPupils = dataRows.length - 1;


        // update user with number of rows with membership details
        System.out.println("** " + noOfPupils + " rows read.\n\n");
    }

    public void findExamMark()
    {
        // placeholder
    }

}

