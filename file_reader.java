import java.io.*;
import java.util.Scanner;

public class file_reader {

    String file_name = "";

    public void get_filename (String file_name) {
        this.file_name = file_name;
    }

    public void file_print () {
        try {
            //the file to be opened for reading
            FileInputStream fis = new FileInputStream(this.file_name);
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