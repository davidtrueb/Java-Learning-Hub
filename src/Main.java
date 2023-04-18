import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("JAVA Learning Hub");
        System.out.println("----------------------------------------------------------");
        System.out.println("""
                Here are the topics you can choose from to learn / repeat:\s
                ----------------------------------------------------------
                1 Syntax in JAVA
                2 Data Types in JAVA
                3 Variables in JAVA
                4 Control Structure in JAVA (If / Else)
                5 Classes and Objects in JAVA
                6 Methods in JAVA""");


        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.print("Chose a topic in which you would like to know more (1 - 6): ");
        int user_decision = Integer.parseInt(scanner.nextLine());


        if (user_decision == 1) {

            System.out.println("Your decision is - Syntax");
            System.out.println("----------------------------------------------------------");

            System.out.println("""
                    What about java SYNTAX would you like to learn?\s
                    1 COMMENTS
                    2 PRINT STATEMENTS
                    3 OPERATORS""");

            new Scanner(System.in);
            System.out.println("----------------------------------------------------------");
            System.out.print("Chose one of the three topics: ");
            int syntax_decision = Integer.parseInt(scanner.nextLine());

            if (syntax_decision == 1) {
                System.out.println("""
                       SINGLE & MULTI-LINE COMMENTS
                       ----------------------------------------------------------
                       CODE:
                       // --> SINGLE LINE COMMENTS
                       /* */ --> MULTI LINE COMMENTS
                       ----------------------------------------------------------
                       DEFINITION:
                       These are comments that start with two forward slashes
                       (//) and continue to the end of the line.
                       Single-line comments are used to document code or to
                       temporarily disable code for testing purposes.
                                                
                       MULTI LINE COMMENTS EXPLANATION:
                       These are comments that start with /* and end with */.
                       Multi-line comments can span across multiple lines and
                       are used for longer explanations or documentation of code.
                       ----------------------------------------------------------""");
            } else if (syntax_decision == 2) {
                System.out.println("""
                      PRINT STATEMENTS:
                      ----------------------------------------------------------
                      CODE:
                      System.out.print("xyz") --> "STANDARD" print statement
                      System.out.println("xyz") --> "NEW LINE" print statement
                      ----------------------------------------------------------
                      DEFINITION:
                      In programming, a print statement is a statement that outputs
                      information to the console or other output device.
                      In Java, the System.out.println() method is commonly used to
                      print output to the console.
                      
                      In the examples above (System.out.print ...) >> PRINTS WITHOUT A NEW LINE.
                      In the other example above (System.out.println ...) >> PRINTS WITH A NEW LINE.
                     ----------------------------------------------------------""");
            } else if (syntax_decision ==  3) {
                System.out.println("""
                        OPERATORS SUB-OPTIONS:
                        ----------------------------------------------------------
                        1 ARITHMETIC OPERATORS
                        2 ASSIGNMENT OPERATORS
                        3 COMPARISON OPERATORS
                        4 LOGIC OPERATORS
                        5 INCREMENT AND DECREMENT OPERATORS
                        ----------------------------------------------------------""");
            }
            // new Scanner(System.in);
            // System.out.print("");
            //if ()




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