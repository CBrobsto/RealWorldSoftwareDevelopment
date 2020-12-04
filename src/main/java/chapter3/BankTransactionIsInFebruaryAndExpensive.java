package main.java.chapter3;

import java.time.Month;

public class BankTransactionIsInFebruaryAndExpensive implements BankTransactionFilter {

    @Override
    public boolean test(final BankTransaction bankTransaction) {
        return (bankTransaction.getDate().getMonth() == Month.FEBRUARY
                && bankTransaction.getAmount() >= 1_000);
    }
}

/* Example of calling findTransactions() with a specific implementation of BankTransactionFilter.
 *
 * final List<BankTransaction> transactions =
 *      bankStatementProcessor.findTransactions(new BankTransactionIsInFebruaryAndExpensive());
 */
