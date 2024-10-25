public class Main {

    public static void main(String[] args) {

        int piece_counter = 5;

        SampleLogger sampleLogger = new SampleLogger();

        if (args.length < 1) {
            sampleLogger.error_no_valid_arguments();
            return;
        }

        // check if 1st flag is help -> provide it
        if (args[0].equals("--help") || args[0].equals("-help")) {
            sampleLogger.info_help_message();
            return;
        }

        // if not all args not provided -> exit program
        if (args.length < 2) {
            sampleLogger.error_not_enough_arguments();
            return;
        }

        if (args.length > 2) {
            piece_counter = Integer.parseInt(args[2]);
        }

        FileReader reader = new FileReader();

        reader.file_split(piece_counter, args[0]);

    }
}