package main.java.chapter2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Example 2.2
 * Answers the queries:
 *  What is the total profit and loss from a list of bank statements? Is it
 *      positive or negative?
 *  How many bank transactions are there in a particular month?
 */
public class BankStatementAnalyzerProblematic {

    private static final String RESOURCES = "src/main/resources/";
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(final String[] args) throws Exception {
        final Path path = Paths.get(RESOURCES + "bank-data-simple.csv");
        final List<String> lines = Files.readAllLines(path);
        double total = 0;
        for (final String line: lines) {
            String[] columns = line.split(",");
            double amount = Double.parseDouble(columns[1]);
            total += amount;
        }

        System.out.println("The total for all transactions is " + total);

        total = 0;
        for (final String line: lines ) {
            final String[] columns = line.split(",");
            final LocalDate date = LocalDate.parse(columns[0], DATE_FORMATTER);
            if (date.getMonth() == Month.JANUARY) {
                final double amount = Double.parseDouble(columns[1]);
                total += amount;
            }
        }

        System.out.println("The total for all transactions in January is " + total);
    }
    /*
    * Problematic implementation because it follows the anti-pattern of a God class and
    * has duplicate parsing code. This is an example of what happens with copy-paste additive
    * programming. See example 2.3 for how to incorporate the Single Responsibility Principle (SRP)
    * into the solution.
    */
}
