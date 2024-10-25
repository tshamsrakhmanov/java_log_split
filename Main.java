

public class Main {
    public static void main(String[] args) {

        final String VERSION = "0.05";

        SampleLogger sampleLogger = new SampleLogger();

        if (args.length < 1) {
            sampleLogger.error_no_valid_arguments(VERSION);
            return;
        }

        // check if 1st flag is help -> provide it
        if (args[0].equals("--help") || args[0].equals("-help")) {
            sampleLogger.info_help_message(VERSION);
            return;
        }

        // if not all args not provided -> exit program
        if (args.length < 2) {
            sampleLogger.error_not_enough_arguments(VERSION);
            return;
        }

        FileReader reader = new FileReader();

        try {
            reader.get_filename(args[0]);
        } catch (Exception e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }

        reader.file_split();


    }
}