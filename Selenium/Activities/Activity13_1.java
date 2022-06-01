package activity;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Activity13_1a {
    public static void main(String[] args) throws IOException, CsvException {
        //Create a new CSVReader Object.
        CSVReader reader = new CSVReader(new FileReader("src/test/java/tests/sample.csv"));
        //Create a List of String array to fetch the lines.
        List<String[]> listStrArray = reader.readAll();
        //Print the total number of rows.
        System.out.println("The total number of rows are : " + listStrArray.size());
        //Create an iterator.
        Iterator<String[]> itr = listStrArray.iterator();
        //Read till all the lines are over from the file.
        while (itr.hasNext())
        {
            String[] strArr=itr.next();
            //Print each of the line.
            for(int i=0;i<strArr.length;i++)
            {
                System.out.print(" " + strArr[i]);
            }
            System.out.println(" ");
        }


    }

}