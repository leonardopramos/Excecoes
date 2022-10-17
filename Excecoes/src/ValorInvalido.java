public class ValorInvalido extends Exception {
    public ValorInvalido() {
        super();
    }

    public ValorInvalido(String mensagem) {
        super(mensagem);
    }

    public ValorInvalido(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public ValorInvalido(Throwable causa) {
        super(causa);
    }
}