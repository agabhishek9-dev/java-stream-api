package intermediate;//2. Sort Employees by Salary

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;
    String department;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public String getDepartment() { return department; }

    public String toString() {
        return name + " : " + salary;
    }
}

public class SortEmployees {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", "HR", 50000),
                new Employee(102, "Alice", "IT", 70000),
                new Employee(103, "Bob", "IT", 45000),
                new Employee(104, "David", "Finance", 90000)
        );

        List<Employee> asc = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();

        List<Employee> desc = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();

        System.out.println("Ascending: " + asc);
        System.out.println("Descending: " + desc);
    }
}