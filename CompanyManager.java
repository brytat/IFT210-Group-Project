import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class CompanyManager {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<Employee>();

        //Populates sample data for empList
        empList.add(new Employee("1", "Joe", 60000.00));
        empList.add(new Employee("2", "Sarah"));
        empList.add(new Employee("3", 50000.00));
        empList.add(new Employee("4", "Bob", "Sales"));
        empList.add(new Employee("5", "Nicole", "Human Resources", 45000.00));
        empList.add(new Employee("6"));

        int userInputInt;

        do {
            System.out.print(
                    "--- Menu ---\n" +
                    "0 - Exit\n" +
                    "1 - Add Employee\n" +
                    "2 - Rename Employee\n" +
                    "3 - Update Employee Role\n" +
                    "4 - Update Employee Salary\n" +
                    "6 - Display Salary Report\n" +
                    "Enter option (0-6): "
            );

            userInputInt = scnr.nextInt();

            switch (userInputInt) {
                case 1:
                    boolean validID = true;
                    String userInputID;
                    System.out.print("Enter employee ID: ");
                    userInputID = scnr.next();
                    for (Employee employee : empList) {
                        System.out.println("Test");
                        //O(n) runtime efficiency for search
                        if (employee.getEmployeeID().equals(userInputID)) {
                            System.out.print("Invalid Employee ID: Employee ID already exists");
                            validID = false;
                            break;
                        } else {
                            //set up sout for options of constructors
                            //set up switch for option selected for constructors
                            }
                        }
                case 2:
                    //
                case 3:
                    //
                case 4:
                    String employeeID;
                    double newSalary;
                    boolean found = false;

                    System.out.print("Enter employee ID: ");
                    employeeID = scnr.next();

                    //O(n) runtime efficiency for search
                    for (Employee employee : empList) {
                        System.out.println("Test");
                        if (employee.getEmployeeID().equals(employeeID)) {
                            found = true;
                            System.out.print("Set salary for employee " + employeeID + ": ");
                            newSalary = scnr.nextDouble();
                            employee.setSalary(newSalary);
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
        } while (userInputInt != 0);
        System.out.println("Exiting program!");
    }
}