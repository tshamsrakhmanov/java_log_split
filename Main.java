import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // just exit program if there is no arguments
        if (args.length < 1) {
            System.out.println("No arguments provided -> exit program");
            return;
        }

        // check if 1st flag is help -> provide it
        if (args[0].equals("--help") || args[0].equals("-help")) {
            System.out.println("\njava_log_split v0.05");
            System.out.println("    <path> - path of log file to be splitted [mandatory]");
            System.out.println("    <path> - path to folder, where to save split pieces [mandatory]");
            System.out.println("    <integer> - summary count of pieces [optional. base value = 5]");
            System.out.println(" ");
            System.out.println("    Author: Timur Shamsrakhmanov");
            System.out.println("    Autumn 2024");
            return;
        }

        // if not all args not provided -> exit program
        if (args.length >= 2) {
            System.out.println("Arguments provided. Go with program...");
        } else {
            System.out.println("Not enough arguments provided. Abort.");
            System.out.println("Press ENTER to exit.");
            String _ = input.nextLine();
            return;
        }


        System.out.println("------------------------------------");
        System.out.println("PROGRAM EXECUTION");
        System.out.println("------------------------------------");


    }
}