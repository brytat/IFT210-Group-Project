/*
Team Name: Team 16

Member 1: Bryton Tateishi
ASU ID: 1238285466

Member 2: Cris Farrell
ASU ID: 1235833666
*/

public class Employee {
    private String employeeID;
    private String employeeName = "No name on record";
    private String role = "Unassigned";
    private double salary = 0.00;

    public Employee(String employeeID) {
        this.employeeID = employeeID;
        System.out.printf("Employee created with:\n" +
            "   ID: %s\n" +
            "   name: No name on record\n" +
            "   role: Unassigned\n" +
            "   salary: $0.00/year.\n",
            employeeID
        );
    }
    public Employee(String employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        System.out.printf("Employee created with:\n" +
            "   ID: %s\n" +
            "   name: %s\n" +
            "   role: Unassigned\n" +
            "   salary: $0.00/year.\n",
            employeeID,
            employeeName
        );
    }

    public Employee(String employeeID, double salary) {
        this.employeeID = employeeID;
        this.salary = salary;
        System.out.printf("Employee created with:\n" +
            "   ID: %s\n" +
            "   name: No name on record\n" +
            "   role: Unassigned\n" +
            "   salary: $%.2f/year.\n",
            employeeID,
            salary
        );
    }

    public Employee(String employeeID, String employeeName, String role) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.role = role;
        System.out.printf("Employee created with:\n" +
            "   ID: %s\n" +
            "   name: %s\n" +
            "   role: %s\n" +
            "   salary: $0.00/year.\n",
            employeeID,
            employeeName,
            role
        );
    }

    public Employee(String employeeID, String employeeName, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.salary = salary;
        System.out.printf("Employee created with:\n" +
            "   ID: %s\n" +
            "   name: %s\n" +
            "   role: Unassigned\n" +
            "   salary: $%.2f/year.\n",
            employeeID,
            employeeName,
            salary
        );
    }

    public Employee(String employeeID, String employeeName, String role, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.role = role;
        this.salary = salary;
        System.out.printf("Employee created with:\n" +
            "   ID: %s\n" +
            "   name: %s\n" +
            "   role: %s\n" +
            "   salary: $%.2f/year.\n",
            employeeID,
            employeeName,
            role,
            salary
        );
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
