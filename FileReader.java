import java.io.*;
import java.util.Scanner;

public class FileReader {

    public void file_split(int file_split_piece_count_int, String file_split_path_to_file) {

        SampleLogger sampleLogger = new SampleLogger();

        try {

            File file = new File(file_split_path_to_file);

            int file_split_original_file_size = (int) file.length();
            int file_split_file_size_after_split = file_split_original_file_size / file_split_piece_count_int;

            if (file.exists()) {

                FileInputStream fis = new FileInputStream(file_split_path_to_file);
                Scanner sc = new Scanner(fis);

                for (int i = 0; i < file_split_piece_count_int; i++) {

                    String str_name_of_temp_file = "temp" + i;
                    File temp_file = new File(str_name_of_temp_file);
                    Writer output_internal = new BufferedWriter(new FileWriter(str_name_of_temp_file, true));

                    while (sc.hasNextLine()) {

                        output_internal.append(sc.nextLine());
                        output_internal.append("\n");
                        int size_temp_file = (int) temp_file.length();

                        if (size_temp_file > file_split_file_size_after_split && i != file_split_piece_count_int - 1) {
                            break;
                        }

                    }
                    output_internal.close();
                }

                System.out.println("// Success!");

            } else {
                sampleLogger.error_broken_path();
            }

        } catch (IOException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }
}