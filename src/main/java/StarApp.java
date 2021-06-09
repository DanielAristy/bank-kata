import builders.DateCreator;
import domain.Account;
import domain.Amount;
import domain.Statement;

public class StarApp {

    public static void main(String[] args) {
        //Instancia de la cuenta
        Account account = new Account(new Statement());
        account.deposit(Amount.amountOf(1000), DateCreator.date("10/01/2021"));
        account.deposit(Amount.amountOf(2000), DateCreator.date("13/01/2021"));
        account.withdrawal(Amount.amountOf(500), DateCreator.date("14/01/2021"));

        account.printStatement(System.out);
    }
}
