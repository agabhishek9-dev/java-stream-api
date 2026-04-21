package difficult;

import java.util.*;
import java.util.stream.Collectors;

class WorkRecord {
    String name;
    String dept;

    WorkRecord(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getName() { return name; }
}

public class Employees3Dept {

    public static void main(String[] args) {

        List<WorkRecord> records = List.of(
                new WorkRecord("John","IT"),
                new WorkRecord("John","Finance"),
                new WorkRecord("John","HR"),
                new WorkRecord("Alice","IT"),
                new WorkRecord("Alice","HR"),
                new WorkRecord("Bob","Finance"),
                new WorkRecord("Bob","Finance"),
                new WorkRecord("David","IT"),
                new WorkRecord("David","Finance"),
                new WorkRecord("David","HR"),
                new WorkRecord("David","Admin")
        );

        Map<String, List<WorkRecord>> grouped = records.stream()
                .collect(Collectors.groupingBy(WorkRecord::getName));

        List<String> result = grouped.entrySet().stream()
                .filter(e -> e.getValue().size() >= 3)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(result);
    }
}

// [John, David]
