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
        empList.add(new Employee("5", "Nicole", "HR", 45000.00));
        empList.add(new Employee("6"));

        int userInputInt;
        String employeeID;
        boolean found = false;
        do {
            System.out.print(
                    "--- Menu ---\n" +
                    "0 - Exit\n" +
                    "1 - Add Employee\n" +
                    "2 - Remove Employee\n" +
                    "3 - Update Employee Role\n" +
                    "4 - Update Employee Salary\n" +
                    "5 - Display Employee List\n" +
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
                        //O(n) runtime efficiency for search
                        if (employee.getEmployeeID().equals(userInputID)) {
                            System.out.println("Invalid Employee ID: Employee ID already exists");
                            validID = false;
                            break;
                        } else {
                            //set up sout for options of constructors
                            //set up switch for option selected for constructors
                            }
                        }
                    continue;
                case 2:
                    System.out.print("Enter employee ID: ");
                    employeeID = scnr.next();
                    found = false;

                    //O(n) runtime efficiency for search
                    for (Employee employee : empList) {
                        if (employee.getEmployeeID().equals(employeeID)) {
                            found = true;
                            System.out.println("Removing employee " + employeeID);
                            empList.remove(empList.indexOf(employee));
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    continue;
                case 3:
                    System.out.print("Enter employee ID: ");
                    employeeID = scnr.next();
                    String newRole;
                    found = false;

                    //O(n) runtime efficiency for search
                    for (Employee employee : empList) {
                        if (employee.getEmployeeID().equals(employeeID)) {
                            found = true;
                            System.out.print("Set role for employee " + employeeID + ": ");
                            newRole = scnr.next();
                            employee.setRole(newRole);
                            System.out.println("Role updated for employee " + employeeID + " to: " + newRole + ".");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    continue;
                case 4:
                    System.out.print("Enter employee ID: ");
                    employeeID = scnr.next();

                    //O(n) runtime efficiency for search
                    for (Employee employee : empList) {
                        if (employee.getEmployeeID().equals(employeeID)) {
                            found = true;
                            double newSalary;
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
                    continue;
                case 5:
                    //
                    continue;
                case 6:
                    //
                    continue;
                default:
                    System.out.println("Invalid option.");
            }
        } while (userInputInt != 0);
        System.out.println("Exiting program!");
    }
}