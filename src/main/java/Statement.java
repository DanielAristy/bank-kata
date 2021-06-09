import java.util.LinkedList;
import java.util.List;

public class Statement {

    private static final int TOP_OF_THE_LIST = 0;

    public static final String STATEMENT_HEADER = "date       | credit   | debit    | balance";

    private List<StatementLine> statementLines = new LinkedList<>();

    public void addLineContaining(Transaction transaction, Amount currentBalance) {
        statementLines.add(TOP_OF_THE_LIST, new StatementLine(transaction, currentBalance));
    }

}