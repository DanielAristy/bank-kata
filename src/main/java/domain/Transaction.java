package domain;

import domain.Amount;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {

    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String EMPTY_VALUE = "          ";

    //Formato para la reprensetancion de la fecha en una expecífica
    private SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

    private Amount value;
    private Date date;

    public Transaction(Amount value, Date date) {
        this.value = value;
        this.date = date;
    }

    public Amount balanceAfterTransaction(Amount currentBalance) {
        return currentBalance.plus(value);
    }
}
