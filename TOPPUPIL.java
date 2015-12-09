import javax.swing.*;
import java.io.*;     
public class TOPPUPIL
{
    // array of MEMBER objects
    private PUPIL pupilList[];
    // number of members to be calculated after reading file
    int noOfPUPILS;
    int topMark ;

    FILEREADCSV examDataFile;
    
    int maxDataPosition ;

    String fileContent = "" ;

    FILEWRITECSV resultsFile ;
    public void TOPUPIL()
    {
        examDataFile = new FILEREADCSV() ;
        resultsFile = new FILEWRITECSV() ;
        topMark = 0 ;
        noOfPUPILS = 49 ;
    }

    // top level algorithm
    public void processPUPIL() throws IOException

    {
        setUppupilList();
        counttopMark();
    }

    private void setUppupilList () throws IOException 
    {
        //first user message
        System.out.println("Feeback of marks" ) ;
        System.out.println("** Preparing to read data file.") ;

        // read file, fetch data as String array containing the rows
        String[] datarows = examDataFile.readCSVtable () ;

        //calculate the number of member rows, skip headings
        noOfPUPILS = datarows.length - 1 ;

        // update user with number of rows with membership details
        System.out.println ("** " + noOfPUPILS +  " rows read ." ) ;

        // prepare array for pupils 
        pupilList = new PUPIL[noOfPUPILS] ;

        //create pupil objects and copy data from source
        for (int i = 0 ; i < noOfPUPILS ; i++) {
            pupilList[i] = new PUPIL () ;

            //adjust to skip headings 
            pupilList[i].readPupilDetails(datarows[ i +1]);
        }

    }

    public void counttopMark() throws IOException
    {
        String fileContent = "" ;
        System.out.println("pupil with the top mark\n") ;
        int maxDataposition = 0 ;

        for (int i= 0; i< noOfPUPILS; i++) {

            if (pupilList[i].getMark() > topMark) {
                topMark = pupilList[i].getMark() ;
                maxDataposition = i;
                fileContent = fileContent.concat(pupilList[i].writeDetails()) ;

            } 
        }
        System.out.println( "\n top mark is : " + topMark) ;
        System.out.println( "which belongs to: " + pupilList[maxDataPosition].getfName() + " " + pupilList[maxDataPosition].getsName() ) ;
        System.out.println () ;
        System.out.println("** preparing to write data file") ;
        resultsFile.writeCSVtable(fileContent)  ;
        System.out.println("** File written and closed.") ;
    }
    
    
}