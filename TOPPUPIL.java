import javax.swing.*;
import java.io.*;     
public class TOPPUPIL
{

    private PUPIL pupillist[];

    int noOfPUPILS;
    int topMark
    //classes to open, read/write, close files
    FILEREADCSV examData file;

    int maxDataPosition ;

    string fileContent = "" ;

    FILEWRITERCSV resultsFile;
    public TOPPUPIL() throws IOException
    {
        //create file handler objects
        examDataFile = new FILEREADCSV();
        resultsFile = new FILEWRITECSV();
        topMark = 0 ;
        noOfPUPILS = 49 ;

    }

    // top level algorithm
    public void processPupils() throws IOException
    {
        
    }

}
