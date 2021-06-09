package domain;

import domain.Amount;

import java.io.PrintStream;

public class StatementLine {

    private Transaction transaction;
    private Amount currentBalance;

    public StatementLine(Transaction transaction, Amount currentBalance) {
        this.transaction = transaction;
        this.currentBalance = currentBalance;
    }

    //Este método se encarga de imprimir el estado de la transacción y el estado actual de la cuenta
    public void printTo(PrintStream printer) {
        this.transaction.printTo(printer, currentBalance);
    }
}
