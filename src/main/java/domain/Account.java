package domain;

import domain.Amount;
import domain.Statement;
import domain.Transaction;

import java.io.PrintStream;
import java.util.Date;

public class Account {

    private Statement statement;
    private Amount balance = Amount.amountOf(0);

    //Constructor para instancia de este objeto que se declara en la clase
    public Account(Statement statement) {
        this.statement = statement;
    }

    public void deposit(Amount amount, Date date) {
        recordTransaction(amount, date);
    }

    void withdrawal(Amount amount, Date date){
        recordTransaction(amount.negative(), date);
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
