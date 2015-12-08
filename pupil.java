
public class pupil
{
    private String firstName;
    private String surname;
    private int examMark; 

    public pupil()
    {
        //constructor
        firstName = "";
        surname = "";
        examMark = 0;

    }

    public void readPupilDetails(String dataItems)
    {

        // unpack string of row data into fields
        String[] rowItems = dataItems.split(",");

        // store each data item as instance property
        firstName = rowItems[0];
        surname = rowItems[1];
        examMark = (Integer.parseInt(rowItems[2]));

    }

    public String writeDetails()
    {
        // join up data into a string to output as a row
        // use "," to separate csv columns
        String pupilData = "";
        pupilData = pupilData.concat(firstName);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(surname);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(Integer.toString(examMark));
        return pupilData;
    }
}