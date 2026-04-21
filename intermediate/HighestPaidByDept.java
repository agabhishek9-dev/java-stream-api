package intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidByDept {

    public static void main(String[] args) {

        List<EmployeeAvg> employees = Arrays.asList(
                new EmployeeAvg(1, "John", "HR", 50000),
                new EmployeeAvg(2, "Jane", "IT", 70000),
                new EmployeeAvg(3, "Mike", "IT", 80000),
                new EmployeeAvg(4, "Sara", "Finance", 60000),
                new EmployeeAvg(5, "Paul", "HR", 55000)
        );

        Map<String, EmployeeAvg> result = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeAvg::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(EmployeeAvg::getSalary)),
                                Optional::get
                        )
                ));

        result.forEach((dept, emp) ->
                System.out.println(dept + " -> " + emp.name + " : " + emp.salary));
    }
}