import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("JAVA Learning Hub");
        System.out.println("----------------------------------------------------------");
        System.out.println("Here are the topics you can choose from to learn / repeat: \n" +
                "----------------------------------------------------------\n" +
                "1 Syntax in JAVA\n" +
                "2 Data Types in JAVA\n" +
                "3 Variables in JAVA\n" +
                "4 Control Structure in JAVA (If / Else)\n" +
                "5 Classes and Objects in JAVA\n" +
                "6 Methods in JAVA");


        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.print("Chose a topic in which you would like to know more (1 - 6): ");
        int user_decision = Integer.parseInt(scanner.nextLine());


        if (user_decision == 1) {

            System.out.println("Your decision is - Syntax");
            System.out.println("----------------------------------------------------------");

            System.out.println("What about java SYNTAX would you like to learn? \n" +
                    "1 Comments\n" +
                    "2 Print Statement\n" +
                    "3 Operators");

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("----------------------------------------------------------");
            System.out.print("Chose one of the three topics: ");
            int syntax_decision = Integer.parseInt(scanner.nextLine());

            if (syntax_decision == 1) {
                System.out.println("Your decision: Comments");
                System.out.println("----------------------------------------------------------");
                System.out.println("Different types of comments: " +
                        "1. Single-line Comments\n" +
                        "2 Multi-line Comments\n" +
                        "----------------------------------------------------------\n" +
                        "EXPLANATION:\n" +
                        "[These are comments that start with two forward slashes\n" +
                        "(//) and continue to the end of the line.\n" +
                        "Single-line comments are used to document code or to\n" +
                        "temporarily disable code for testing purposes.]");





            }







        } else if (user_decision == 2) {
            System.out.println("Decision: Data Types");
        } else if (user_decision == 3) {
            System.out.println("Decision: Variables");
        } else if (user_decision == 4) {
            System.out.println("Decision: Control Structure");
        } else if (user_decision == 5) {
            System.out.println("Decision:  Classes and Objects");
        } else if (user_decision == 6) {
            System.out.println("Decision: Methods");
        }
        else {
            System.out.println("Invalid Input.");
        }










    }
}