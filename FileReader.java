/**
 * FileReader.java
 * @author Lazar Bogdan
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileReader {
    /**
     * This method adds all the intersts from the input file (input) in an array
     * @param sca is a scanner
     * @return the array of intersts
     */
    private static String[] addIntersts(Scanner sca) {
        ArrayList<String> interestArrayList = new ArrayList<>();
        while (sca.hasNext()) {
            String interest = sca.next();
            interestArrayList.add(interest);
        }
        String[] interestToArray = new String[interestArrayList.size()];
        interestToArray = interestArrayList.toArray(interestToArray);
        return interestToArray;
    }

    /**
     * This method constructs the profile
     * @param line is a scanner
     * @return p a refernce to the profile
     */
    private static Profile profileConstruction(String line) {
        Scanner in = new Scanner(line);
        in.useDelimiter(",");

        String lastName=in.next();
        String firstName=in.next();
        int day=in.nextInt();
        int month=in.nextInt();
        int year=in.nextInt();
        String townOfResidece=in.next();
        String countryOfResidence=in.next();
        String nationality=in.next();
        String e_mail=in.next();
        ArrayList<String> interestsList = new ArrayList<String>();
        while (in.hasNext()){
            interestsList.add(in.next());
        }
        String [] interests = interestsList.toArray(new String[interestsList.size()]);

        Profile p =new Profile(lastName,firstName,day,month,year,townOfResidece,countryOfResidence,nationality,e_mail,interests);
        System.out.println(p.toString());
        return p;
    }

    /**
     * This method inserts the profile into the BST
     * @param in is a scanner
     * @return the BST created from the file's data
     */
    private static BST profileInsertion(Scanner in) {
        BST tree = new BST();
        while (in.hasNextLine()) {
            String currentLine = in.nextLine();

            tree.insertProfile(profileConstruction(currentLine));
        }
        return tree;
    }

    /**
     * This method reads from the file the data
     * @param filename the path for the file from where the data is collected
     * @return a BST with the data in the files
     */
    public static BST readProfileSet(String filename) {
        File inputFile = new File(filename);
        Scanner in = null;
        try {
            in = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            System.exit(0);
        }
        return profileInsertion(in);
    }
}
