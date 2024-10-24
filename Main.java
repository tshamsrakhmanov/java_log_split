import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Argument count: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }

        // if args not provided -> exit program
        if (args.length >= 2) {
            System.out.println("Arguments provided. Go with program...");
        } else {
            System.out.println("Not enough arguments provided. Abort.");
            System.out.println("Press ENTER to exit.");
            String some_input = input.nextLine();
        }

        // TODO check if 1st flag is --help, then provide info and exit


        // check if arguments provided
        // (log-file path) (sample name of part_log_file prompt as PART_) (how many parts: 5-10, basic = 5)
        // if not - show ERROR prompt, exit program
        // got to log-file, check existence
        // if not existing OR empty - ERROR prompt
        // estimate file size and calculate batch size (based on 3rd flag)

        // cycle:
        // go line-by-line in log file
        // if

        //

    }
}