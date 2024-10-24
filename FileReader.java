import java.io.*;
import java.util.Scanner;

public class FileReader {


    String file_name;

    public void get_filename(String file_name) {
        this.file_name = file_name;
    }

    public void file_split() {
        try {

            File file = new File(this.file_name);

            if (file.exists()) {
                FileInputStream fis = new FileInputStream(this.file_name);
                Scanner sc = new Scanner(fis);    //file to be scanned

                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());

                }

                sc.close();
            } else {
                System.out.println("// java_log_splitter");
                System.out.println("// No such file OR path is broken. Please provide valid file path");
                System.out.println("// Please see --help or -help for instructions");
            }


        } catch (IOException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }

}
