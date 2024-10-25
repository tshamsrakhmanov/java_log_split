public class SampleLogger {

    public void error_no_valid_arguments() {
        System.out.println("// java_log_split");
        System.out.println("// No valid arguments provided");
        System.out.println("// Please see --help or -help for instructions");
    }

    public void info_help_message() {
        System.out.println("java_log_split");
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

    public void error_not_enough_arguments() {
        System.out.println("// java_log_split");
        System.out.println("// Not enough arguments provided. Abort.");
        System.out.println("// Please see --help or -help for instructions");
    }

    public void error_broken_path() {
        System.out.println("// java_log_split");
        System.out.println("// No such file OR path is broken. Please provide valid file path");
        System.out.println("// Please see --help or -help for instructions");
    }
}
