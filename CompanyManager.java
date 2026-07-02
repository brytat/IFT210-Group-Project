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
                case 0:
                    break;
                case 1:
                    boolean validID = true;
                    String userInputID;
                    System.out.print("Enter new employee ID: ");
                    userInputID = scnr.next();
                    for (Employee employee : empList) {
                        //O(n) runtime efficiency for search
                        if (employee.getEmployeeID().equals(userInputID)) {
                            System.out.println("Invalid Employee ID: Employee ID already exists");
                            validID = false;
                            break;
                        }
                    }
                    if (validID) {
                        System.out.print(
                            //Options of constructors
                            "\n-- Add With Given Info --\n" +
                                "0 - Exit\n" +
                                "1 - Add ID\n" +
                                "2 - Add ID and Name\n" +
                                "3 - Add ID and Salary\n" +
                                "4 - Add ID, Name, and Role\n" +
                                "5 - Add ID, Name, and Salary\n" +
                                "6 - Add ID, Name, Salary and Role\n" +
                                "Enter option (0-6): "
                        );
                        userInputInt = scnr.nextInt();
                        if ((userInputInt < 0) && (userInputInt > 6)) {
                            System.out.println("Invalid selection");
                            break;
                        }
                        String employeeName;
                        double employeeSalary;
                        String employeeRole;

                        switch (userInputInt) {
                            case 1:
                                new Employee(userInputID);
                                break;
                            case 2:
                                System.out.print("\nEnter employee name: ");
                                employeeName = scnr.next();
                                empList.add(new Employee(userInputID, employeeName));
                                break;
                            case 3:
                                System.out.print("\nEnter employee salary: ");
                                employeeSalary = scnr.nextDouble();
                                empList.add(new Employee(userInputID, employeeSalary));
                                break;
                            case 4:
                                System.out.print("\nEnter employee name: ");
                                employeeName = scnr.next();
                                System.out.print("\nEnter employee role: ");
                                employeeRole = scnr.next();
                                empList.add(new Employee(userInputID, employeeName, employeeRole));
                                break;
                            case 5:
                                System.out.print("\nEnter employee name: ");
                                employeeName = scnr.next();
                                System.out.print("\nEnter employee salary: ");
                                employeeSalary = scnr.nextDouble();
                                empList.add(new Employee(userInputID, employeeName, employeeSalary));
                                break;
                            case 6:
                                System.out.print("\nEnter employee name: ");
                                employeeName = scnr.next();
                                System.out.print("\nEnter employee salary: ");
                                employeeSalary = scnr.nextDouble();
                                System.out.print("\nEnter employee role: ");
                                employeeRole = scnr.next();
                                empList.add(new Employee(userInputID, employeeName, employeeRole, employeeSalary));
                                break;
                        }
                    }
                    break;
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
                    break;
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
                    break;
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
                    break;
                case 5:
                    System.out.println("Employee List:");

                    System.out.printf(
                            "%-13s%-13s%-13s%-11s%n",
                            "| ID",
                            "| Name",
                            "| Role",
                            "| Salary"
                    );
                    System.out.println("-".repeat(50));
                    for (Employee employee : empList) {
                        String empID = employee.getEmployeeID();
                        String empName = employee.getEmployeeName();
                        String empRole = employee.getRole();
                        double empSal = employee.getSalary();

                        System.out.printf(
                                "%-13s%-13s%-13s%-11.2f%n",
                                "| " + empID,
                                "| " + empName,
                                "| " + empRole,
                                empSal
                        );
                    }
                    break;
                case 6:
                    double totalSalary = 0.0;
                    System.out.println("Salary Report:");
                    System.out.printf(
                        "%-13s%-13s%-13s%-11s%n",
                        "| ID",
                        "| Name",
                        "| Role",
                        "| Salary"
                    );
                    System.out.println("-".repeat(50));
                    for (Employee employee : empList) {
                        String empID = employee.getEmployeeID();
                        String empName = employee.getEmployeeName();
                        String empRole = employee.getRole();
                        double empSal = employee.getSalary();
                        totalSalary += empSal;
                        System.out.printf(
                                "| %-10s| %-15s| %-11s| %10.2f%n",
                                empID,
                                empName,
                                empRole,
                                empSal
                        );
                    }
                    System.out.println("-".repeat(50));
                    System.out.printf("Total Salary: %.1f\n", totalSalary);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (userInputInt != 0);

        System.out.println("Exiting program!");
        scnr.close();
    }
}