
package mainproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lsant
 */
public class MainProject {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Reads the file
        BufferedReader myReader = new BufferedReader(new FileReader("MovieMetadataEdited2.csv"));
        String line = myReader.readLine();
        //Splits the file into columns
        String[] lineArr;
        //First line of the file
        String[] movieClassifications;
      //  List<> movieList = new ArrayList<>();
        List<String[]> movieList = new ArrayList<>();
        System.out.println("*----------Welcome to EirVid!----------*");
        System.out.println(line);
        int counter = 1;
        
        movieClassifications = line.split(",");
        //Parses the file
        //Keeps reading while has line
        while ((line = myReader.readLine()) != null){
            counter++;
            if (counter == 1010) {
                System.out.println(line);
            }
            lineArr = line.split(",");
            movieList.add(lineArr);
            //Prints the first element of the array
//            System.out.println(lineArr[0]);
        }
        for (int list = 0; list < movieList.size(); list ++){
        //Loops the movies and gets the elements on the array
        for (int movie = 0; movie < movieClassifications.length; movie ++){
//            System.out.println(movieClassifications[movie]);
            
//                System.out.println(movieList.get(list)[movie]);
                try {
                    String tst = movieList.get(list)[movie];
                    System.out.println(movieList.get(list)[movie]);
                } catch (ArrayIndexOutOfBoundsException e) {
//                    System.out.println( movieList.get(list));
System.out.println(list + " ::: " + movie);
                }
                
                
            }
            
        }
        
    }
}
