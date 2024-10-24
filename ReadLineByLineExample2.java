import java.io.*;
import java.util.Scanner;

public class ReadLineByLineExample2 {
    public static void main(String[] args) {
        try {
            //the file to be opened for reading
            FileInputStream fis = new FileInputStream("C:\\Users\\ololo\\IdeaProjects\\java_log_split\\main.log.2014-11-17");
            Scanner sc = new Scanner(fis);    //file to be scanned
            //returns true if there is another line to read

            int counter = 0;
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
                counter += 1;
                //returns the line that was skipped
            }

            System.out.println(counter);
            sc.close();     //closes the scanner
        } catch (IOException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }
}