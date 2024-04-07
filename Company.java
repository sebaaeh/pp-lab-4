import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5]; 

        employees[0] = new Manager("Jan Kowalski", 5000, 0);
        employees[1] = new Worker("Mariusz Tynmian", 3500, "Technician");
        employees[2] = new Employee("Łukasz Tytman", 2500);
        employees[3] = new Worker("Jacek Żyznowski", 5800, "Engineer");
        employees[4] = new Worker("Adam Trojecki", 5300, "Assistant");

        int nonManagersCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagersCount++;
            }
        }

        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagersCount);
        }

        employees[0].setSalary(7500);

        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
