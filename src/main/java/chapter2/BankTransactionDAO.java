package main.java.chapter2;

import java.time.LocalDate;

/**
 * Example 2.9 - An example of informational cohesion.
 * Data Access Object's (DAO) essentially abstract and encapsulate access to a data source.
 */
public class BankTransactionDAO {

    public BankTransaction create(final LocalDate date, final double amount, final String description) {
        // ...
        throw new UnsupportedOperationException();
    }

    public BankTransaction read(final long id) {
        // ...
        throw new UnsupportedOperationException();
    }

    public BankTransaction update(final long id) {
        // ...
        throw new UnsupportedOperationException();
    }

    public void delete(final BankTransaction bankTransaction) {
        // ...
        throw new UnsupportedOperationException();
    }
}
