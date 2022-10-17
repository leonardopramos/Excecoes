
public class SaldoNegativo extends Exception {
    public SaldoNegativo() {
        super();
    }

    public SaldoNegativo(String mensagem) {
        super(mensagem);
    }

    public SaldoNegativo(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public SaldoNegativo(Throwable causa) {
        super(causa);
    }
}
