import java.io.*;
import java.util.Scanner;

public class FileReader {


    String file_name;

    public void get_filename(String file_name) {
        this.file_name = file_name;
    }

    public void file_split(int piece_counter_input) {

        try {

            File file = new File(this.file_name);

            int length = (int) file.length();
            // divide as-is, we'll later just add leftovers after this divide to final piece
            int chosen_piece_size = length / piece_counter_input;
            System.out.println(chosen_piece_size);

            if (file.exists()) {

                FileInputStream fis = new FileInputStream(this.file_name);
                Scanner sc = new Scanner(fis);    //file to be scanned

                for (int i = 0; i < piece_counter_input; i++) {

                    String str_name_of_temp_file = "temp" + i;
                    File temp_file = new File(str_name_of_temp_file);
                    Writer output_internal = new BufferedWriter(new FileWriter(str_name_of_temp_file, true));

                    while (sc.hasNextLine()) {

                        output_internal.append(sc.nextLine());
                        output_internal.append("\n");
                        int length_of_temp_file = (int) temp_file.length();

                        if (length_of_temp_file > chosen_piece_size && i != piece_counter_input - 1) {
                            break;
                        }

                    }
                    output_internal.close();
                }

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
