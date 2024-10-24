public class Main {
    public static void main(String[] args) {

        final String VERSION = "0.05";

        if (args.length < 1) {
            System.out.printf("// java_log_splitter ver.%s\n",VERSION);
            System.out.println("// No valid arguments provided");
            System.out.println("// Please see --help or -help for instructions");
            return;
        }

        // check if 1st flag is help -> provide it
        if (args[0].equals("--help") || args[0].equals("-help")) {
            System.out.println("java_log_split v0.05");
            System.out.println("Usage: CMD [PATH1] [PATH2] [SPLIT]");
            System.out.println("PATH1 {mandatory argument}");
            System.out.println("    Path to log file which is taken for splitting operation");
            System.out.println("PATH2 {mandatory argument}");
            System.out.println("    Path to folder, where split log files will be reside");
            System.out.println("SPLIT {optional argument}");
            System.out.println("    Number of pieces to split log file to");
            System.out.println("    base value: 5");
            System.out.println(" ");
            System.out.println("// Author: Timur Shamsrakhmanov //");
            System.out.println("// Autumn 2024                  //");
            return;
        }

        // if not all args not provided -> exit program
        if (args.length < 2) {
            System.out.printf("// java_log_splitter ver.%s\n",VERSION);
            System.out.println("// Not enough arguments provided. Abort.");
            System.out.println("// Please see --help or -help for instructions");
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