import java.io.*;
import java.util.Scanner;

public class FileReader {

    public void file_split(String path_to_file, String path_to_save, String custom_filename, int piece_count) {

        SampleLogger sampleLogger = new SampleLogger();


        // wrong originate path catcher
        File orig_path = new File(path_to_save);
        if (!orig_path.isDirectory()) {
            sampleLogger.error_broken_path();
            return;
        }

        try {

            File file = new File(path_to_file);

            int file_split_original_file_size = (int) file.length();
            int file_split_file_size_after_split = file_split_original_file_size / piece_count;

            if (file.exists()) {

                FileInputStream fis = new FileInputStream(path_to_file);
                Scanner sc = new Scanner(fis);

                for (int i = 0; i < piece_count; i++) {

                    String suffix = String.valueOf(i + 1);

                    String str_name_of_temp_file = path_to_save + custom_filename + suffix;
                    System.out.println(str_name_of_temp_file);
                    File temp_file = new File(str_name_of_temp_file);
                    Writer output_internal = new BufferedWriter(new FileWriter(str_name_of_temp_file, true));

                    while (sc.hasNextLine()) {

                        output_internal.append(sc.nextLine());
                        output_internal.append("\n");
                        int size_temp_file = (int) temp_file.length();

                        if (size_temp_file > file_split_file_size_after_split && i != piece_count - 1) {
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