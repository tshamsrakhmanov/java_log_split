public class Main {

    public static void main(String[] args) {

        System.out.println("// Flags provided...");

        if (args.length > 0) {
            for (String arg : args) {
                System.out.printf("  %s\n", arg);
            }
        } else {
            System.out.println("// No flags provided...");
        }

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

        FileReader reader = new FileReader();
        reader.file_split(path_to_file, path_to_save, piece_counter);

    }
}