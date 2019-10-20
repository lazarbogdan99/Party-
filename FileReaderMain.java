import java.util.Scanner;

public class FileReaderMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter file name: ");
        String filename = in.nextLine();

        BST testTree = FileReader.readProfileSet("input");

    }
}
