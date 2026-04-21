package difficult;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    String id;
    LocalDate date;
    double amount;

    Transaction(String id, LocalDate date, double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() { return date; }
    public double getAmount() { return amount; }
}

public class HighestSpendDay {

    public static void main(String[] args) {

        List<Transaction> list = Arrays.asList(
                new Transaction("T1", LocalDate.of(2024,1,1),300),
                new Transaction("T2", LocalDate.of(2024,1,1),200),
                new Transaction("T3", LocalDate.of(2024,1,2),500),
                new Transaction("T4", LocalDate.of(2024,1,2),300),
                new Transaction("T5", LocalDate.of(2024,1,3),100)
        );

        Map<LocalDate, Double> total = list.stream()

                // 🔥 Group by date
                .collect(Collectors.groupingBy(
                        Transaction::getDate,
                        Collectors.summingDouble(Transaction::getAmount)
                ));

        Map.Entry<LocalDate, Double> result = total.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(result);
    }
}

// 2024-01-02=800.0
