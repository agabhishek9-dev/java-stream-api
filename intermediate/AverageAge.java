package intermediate;

import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() { return age; }
}

public class AverageAge {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("A", 20),
                new Person("B", 30),
                new Person("C", 40)
        );

        double avg = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);

        System.out.println("Average Age: " + avg);
    }
}
