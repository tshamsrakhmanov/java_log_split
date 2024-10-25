public class SampleLogger {
    public void error_no_valid_arguments(String version) {
        System.out.printf("// java_log_splitter ver. %s\n", version);
        System.out.println("// No valid arguments provided");
        System.out.println("// Please see --help or -help for instructions");
    }

    public void info_help_message(String version) {
        System.out.printf("java_log_split ver. %s\n", version);
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
    }

    public void error_not_enough_arguments(String version) {
        System.out.printf("// java_log_splitter ver. %s\n", version);
        System.out.println("// Not enough arguments provided. Abort.");
        System.out.println("// Please see --help or -help for instructions");
    }
}
