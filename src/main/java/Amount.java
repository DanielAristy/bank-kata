public class Amount {

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

    public boolean negative(Amount otherAmount) {
        return this.valor > otherAmount.valor;
    }
}
