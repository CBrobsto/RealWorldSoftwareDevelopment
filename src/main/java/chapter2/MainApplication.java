package main.java.chapter2;

import java.io.IOException;

public class MainApplication {

    private static final String FILENAME = "bank-data-simple.csv";

    public static void main(final String[] args) throws IOException {

        final BankStatementAnalyzerDecoupled bankStatementAnalyzer = new BankStatementAnalyzerDecoupled();

        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        // Replace 'FILENAME' with 'args[0]' to enter the fileName at runtime
        bankStatementAnalyzer.analyze(FILENAME, bankStatementParser);
    }

}
