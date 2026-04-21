package intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class DeptMoreThanTwo {

    public static void main(String[] args) {

        List<EmployeeAvg> employees = Arrays.asList(
                new EmployeeAvg(1, "John", "IT", 60000),
                new EmployeeAvg(2, "Alice", "HR", 55000),
                new EmployeeAvg(3, "Bob", "IT", 75000),
                new EmployeeAvg(4, "Carol", "HR", 70000),
                new EmployeeAvg(5, "David", "Finance", 65000),
                new EmployeeAvg(6, "Eve", "IT", 80000),
                new EmployeeAvg(7, "Frank", "Finance", 64000),
                new EmployeeAvg(8, "Ala", "Operations", 44000)
        );

        Map<String, Long> map = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeAvg::getDepartment,
                        Collectors.counting()
                ));

        List<String> result = map.entrySet().stream()
                .filter(e -> e.getValue() > 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Departments with >2 employees: " + result);
    }
}