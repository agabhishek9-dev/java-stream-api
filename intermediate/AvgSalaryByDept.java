package intermediate;

import java.util.*;
import java.util.stream.Collectors;

class EmployeeAvg {
    int id;
    String name;
    String department;
    double salary;

    EmployeeAvg(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class AvgSalaryByDept {

    public static void main(String[] args) {

        List<EmployeeAvg> employees = Arrays.asList(
                new EmployeeAvg(1, "John", "HR", 50000),
                new EmployeeAvg(2, "Jane", "IT", 70000),
                new EmployeeAvg(3, "Mike", "IT", 80000),
                new EmployeeAvg(4, "Sara", "Finance", 60000),
                new EmployeeAvg(5, "Paul", "HR", 55000)
        );

        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeAvg::getDepartment,
                        Collectors.averagingDouble(EmployeeAvg::getSalary)
                ));

        System.out.println("Average Salary by Dept: " + result);
    }
}