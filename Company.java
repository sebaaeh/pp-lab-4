import employees.*;

public class Company {
    public static void main(String[] args) {
   
        Employee[] employees = new Employee[5]; 

        employees[0] = new Manager("Jan Kowalski", 5000, 0);
        employees[1] = new Worker("Mariusz Tynmian", 3500, "Technician");
        employees[2] = new Employee("Łukasz Tytman", 2500);
        employees[3] = new Worker("Jacek Żyznowski", 5800, "Engineer");
        employees[4] = new Worker("Adam Trojecki", 5300, "Assistant");

        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
