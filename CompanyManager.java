import java.util.Scanner;
import java.util.ArrayList;

public class CompanyManager {
    ArrayList<Employee> empList = new ArrayList<Employee> ();

    public void displayMenu() {
        Scanner scnr = new Scanner(System.in);
        int userInput;

        do {
            System.out.print(
                "--- Menu ---\n" +
                "0 - Exit\n" +
                "1 - Add Employee\n" +
                "2 - Rename Employee\n" +
                "3 - Update Employee Role\n" +
                "4 - Update Employee Salary\n" +
                "6 - Display Salary Report\n" +
                "Enter option (0-6):"
            );

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
                    System.out.print("Set salary for employee " + employeeID + ": ");
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
