package difficult;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
}

public class MostCommonFirstLetter {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("John","IT",60000),
                new Employee("Alice","HR",55000),
                new Employee("Bob","IT",75000),
                new Employee("Carol","HR",70000),
                new Employee("David","Finance",65000),
                new Employee("Eve","IT",80000),
                new Employee("Frank","Finance",64000),
                new Employee("Ala","Operations",44000)
        );

        Map<Character, Long> freq = employees.stream()

                // 🔥 Extract first character
                .map(e -> e.getName().charAt(0))

                // 🔥 Count frequency
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        Map.Entry<Character, Long> result = freq.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(result);
    }
}

// A=2
