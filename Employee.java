package mon5date12;

// Base class
class User {
    int id;
    String name;

    // Constructor
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Subclass + Main class
public class Employee extends User {
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    // Method to calculate annual salary
    double calculateAnnualSalary() {
        return salary * 12;
    }

    // Main method (program starts here)
    public static void main(String[] args) {

        Employee emp = new Employee(1, "Devika c.l", 20000);

        System.out.println("Employee ID: " + emp.id);
        System.out.println("Employee Name: " + emp.name);
        System.out.println("Monthly Salary: " + emp.salary);
        System.out.println("Annual Salary: " + emp.calculateAnnualSalary());
    }
}