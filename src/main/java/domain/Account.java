package domain;

import domain.Amount;
import domain.Statement;
import domain.Transaction;

import java.io.PrintStream;
import java.util.Date;

public class Account {

    private Statement statement;
    private Amount balance = Amount.amountOf(0);

    public Account(Statement statement) {
    }

    void deposit(int amount) {

    }

    void withdraw(int amount){

    }

    void printStatements(PrintStream out) {

    }
    //
    private void recordTransaction(Amount value, Date date) {
        Transaction transaction = new Transaction(value, date);
        Amount balanceAfterTransaction = transaction.balanceAfterTransaction(balance);
        balance = balanceAfterTransaction;
        statement.addLineContaining(transaction, balanceAfterTransaction);
    }

}
