import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        Scanner scnr = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("0 - Exit");
            System.out.println("1 - Add Employee");
            System.out.println("2 - Rename Employee");
            System.out.println("3 - Update Employee Role");
            System.out.println("4 - Update Employee Salary");
            System.out.println("5 - Display Employee List");
            System.out.println("6 - Display Salary Report");
            System.out.println("\nEnter option (0-6):");

            userInput = scnr.nextInt();

            switch (userInput) {
                //FIXME SET CASES FOR EACH OPTION
            }
        } while (userInput != 0);
    }
}
