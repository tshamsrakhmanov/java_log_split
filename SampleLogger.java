public class SampleLogger {

    public void error_no_valid_arguments() {
        System.out.println("// JAVA_LOG_SPLIT [ ERROR ]");
        System.out.println("// No valid arguments provided");
        System.out.println("// Please see --help or -help for instructions");
    }

    public void info_help_message() {
        System.out.println(" ");
        System.out.println("JAVA_LOG_SPLIT");
        System.out.println("Usage: CMD [PATH1] [PATH2] [SPLIT]");
        System.out.println("PATH1 {mandatory argument}");
        System.out.println("    Path to log file which is taken for splitting operation");
        System.out.println("PATH2 {mandatory argument}");
        System.out.println("    Path to folder + template name of a split. Ex.: C:/<name template>");
        System.out.println("    By this in 'C:/' will be created <name template>1, <name template>2, ... etc");
        System.out.println("    Standard notation of pieces is 1, 2, 3, ... etc");
        System.out.println("    Use /normal/ slash in path declaration");
        System.out.println("SPLIT {optional argument}");
        System.out.println("    Number of pieces to split log file to");
        System.out.println("    base value: 5");
        System.out.println(" ");
        System.out.println("// Author: Timur Shamsrakhmanov //");
        System.out.println("// Autumn 2024                  //");
        System.out.println(" ");
    }

    public void error_not_enough_arguments() {
        System.out.println("// JAVA_LOG_SPLIT [ ERROR ]");
        System.out.println("// Not enough arguments provided. Abort.");
        System.out.println("// Please see --help or -help for instructions");
    }

    public void error_broken_path() {
        System.out.println("// JAVA_LOG_SPLIT [ ERROR ]");
        System.out.println("// Invalid arguments provided (PATH 1 / PATH 2).");
        System.out.println("// Please see --help or -help for instructions");
    }

}
