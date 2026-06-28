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
                case 1:
                    //
                case 2:
                    //
                case 3:
                    //
                case 4:
                    String employeeID;
                    double newSalary;
                    System.out.print("Enter employee ID: ");
                    employeeID = scnr.next();
                    System.out.print("\nSet salary for employee " + employeeID + ": ");
                    newSalary = scnr.nextDouble();
                    boolean found = false;
                    for (Employee employee : empList) {
                        if (employee.getEmployeeID() == employeeID) {
                            employee.setSalary(newSalary);
                            found = true;
                            System.out.println("Salary updated for employee " + employeeID + " to: " + newSalary + ".");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                case 5:
                    //
                case 6:
                    //
            }
        } while (userInput != 0);
        System.out.println("Exiting program!");
    }
}
