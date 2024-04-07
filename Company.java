public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5]; 

        employees[0] = new Employee("Jan Kowalski", 5000);
        employees[1] = new Employee("Mariusz Tynmian", 3500);
        employees[2] = new Employee("Łukasz Tytman", 2500);
        employees[3] = new Employee("Jacek Żyznowski", 5800);
        employees[4] = new Employee("Adam Trojecki", 5300);

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(6000);

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
