public class StatementLine {

    private Transaction transaction;
    private Amount amount;

    public StatementLine(Transaction transaction, Amount amount) {
        this.transaction = transaction;
        this.amount = amount;
    }
}
