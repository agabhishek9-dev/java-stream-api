package difficult;

import java.util.*;
import java.util.stream.Collectors;

enum SalaryRange { LOW, MEDIUM, HIGH }

class Emp {
    String name;
    double salary;

    Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() { return salary; }
}

public class SalaryGrouping {

    public static void main(String[] args) {

        List<Emp> employees = Arrays.asList(
                new Emp("Alice",45000),
                new Emp("Bob",78000),
                new Emp("Charlie",120000),
                new Emp("David",99000),
                new Emp("Eva",30000),
                new Emp("Frank",105000)
        );

        Map<SalaryRange, List<Emp>> result = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> getRange(e.getSalary())
                ));

        System.out.println(result);
    }

    private static SalaryRange getRange(double salary) {
        if (salary < 50000) return SalaryRange.LOW;
        if (salary < 100000) return SalaryRange.MEDIUM;
        return SalaryRange.HIGH;
    }
}
