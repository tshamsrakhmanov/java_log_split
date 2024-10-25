import java.io.*;
import java.util.Scanner;

public class FileReader {

    public void file_split(String file_split_path_to_file, String file_split_path_to_save, int file_split_piece_count) {

        SampleLogger sampleLogger = new SampleLogger();


        // wrong originate path catcher
        File orig_path = new File(file_split_path_to_save);
        if (!orig_path.isDirectory()) {
            System.out.println("stuck here....");
            sampleLogger.error_broken_path();
            return;
        }

        try {

            File file = new File(file_split_path_to_file);

            int file_split_original_file_size = (int) file.length();
            int file_split_file_size_after_split = file_split_original_file_size / file_split_piece_count;

            if (file.exists()) {

                FileInputStream fis = new FileInputStream(file_split_path_to_file);
                Scanner sc = new Scanner(fis);

                for (int i = 0; i < file_split_piece_count; i++) {

                    String suffix = String.valueOf(i + 1);

                    String str_name_of_temp_file = file_split_path_to_save + "temp" + suffix;
                    System.out.println(str_name_of_temp_file);
                    File temp_file = new File(str_name_of_temp_file);
                    Writer output_internal = new BufferedWriter(new FileWriter(str_name_of_temp_file, true));

                    while (sc.hasNextLine()) {

                        output_internal.append(sc.nextLine());
                        output_internal.append("\n");
                        int size_temp_file = (int) temp_file.length();

                        if (size_temp_file > file_split_file_size_after_split && i != file_split_piece_count - 1) {
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