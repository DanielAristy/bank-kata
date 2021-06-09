package domain;

import java.text.DecimalFormat;

public class Amount {

    //Declaracion del formato decimal en el cual se toman dos decimales despues del punto
    private DecimalFormat decimalFormat = new DecimalFormat("#.00");
    private final int valor;

    public Amount(int valor) {
        this.valor = valor;
    }

    public static Amount amountOf(int value) {
        return new Amount(value);
    }

    public Amount plus(Amount otherAmount) {
        return amountOf(this.valor + otherAmount.valor);
    }

    //Se define si el objeto es mayor que
    public boolean isGreaterThan(Amount otherAmount) {
        return this.valor > otherAmount.valor;
    }

    // Se resta el valor que se obtiene
    public Amount negative() {
        return amountOf(-valor);
    }
    //Es funcion lo que permite es obtener siempre el valor absoluto de un numero
    public Amount absoluteValue() {
        return amountOf(Math.abs(valor));
    }

    public String moneyRepresentation() {
        return decimalFormat.format(valor);
    }

    //Sobre escritura del método equals como finalidad de validar los valores
    @Override
    public boolean equals(Object obj) {
        Amount other = (Amount) obj;
        if (valor != other.valor)
            return false;
        return true;
    }
}
