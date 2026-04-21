package intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class HighestAvgSalaryDept {

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

        Map<String, Double> avgMap = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeAvg::getDepartment,
                        Collectors.averagingDouble(EmployeeAvg::getSalary)
                ));

        Map.Entry<String, Double> result = avgMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("Highest Avg Salary Dept: " + result);
    }
}