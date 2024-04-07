import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Jan Kowalski", 5000, 0);
        employees[1] = new Worker("Mariusz Tynmian", 3500, "złota rączka");
        employees[2] = new Employee("Łukasz Tytman", 2500);
        employees[3] = new Worker("Jacek Żyznowski", 5800, "inżynier");
        employees[4] = new Worker("Adam Trojecki", 5300, "inżynier");
        employees[5] = new Manager("Anna Nowak", 4800, 0);
        employees[6] = new Worker("Karol Bajka", 4000, "specjalista");

        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
        }

        int nonManagersCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagersCount++;
            }
        }

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(nonManagersCount - 1);
                employee.setSalary(7500);
            }
        }

        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}