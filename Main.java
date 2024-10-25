import java.io.File;

public class Main {

    public static void main(String[] args) {

        int piece_counter = 5;

        SampleLogger sampleLogger = new SampleLogger();

        if (args.length < 1) {
            sampleLogger.error_no_valid_arguments();
            return;
        }

        if (args[0].equals("--help") || args[0].equals("-help")) {
            sampleLogger.info_help_message();
            return;
        }

        if (args.length < 2) {
            sampleLogger.error_not_enough_arguments();
            return;
        }

        if (args.length > 2) {
            piece_counter = Integer.parseInt(args[2]);
        }

        String path_to_file = args[0];
        String path_to_save = args[1];


        if (!isValidPath(path_to_save)) {
            sampleLogger.error_broken_path();
            return;
        }

        int temp_index = path_to_save.lastIndexOf("/");
        String first_part = path_to_save.substring(0, temp_index + 1);
        String last_part = path_to_save.substring(temp_index + 1);


        FileReader reader = new FileReader();
        reader.file_split(path_to_file, first_part, last_part, piece_counter);

    }

    public static boolean isValidPath(String input_path) {
        boolean answer = true;

        if (!input_path.contains("/")) {
            answer = false;
        } else {
            int temp_index = input_path.lastIndexOf("/");
            String first_part = input_path.substring(0, temp_index);
            String last_part = input_path.substring(temp_index + 1);

            File temp_file = new File(first_part);

            if (last_part.contains("/")) {
                answer = false;
            }

            if (!temp_file.isDirectory()) {
                answer = false;
            }
        }
        return answer;
    }
}