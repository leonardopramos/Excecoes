public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente c = new ContaCorrente(200);

        c.deposito(100);
        c.retirada(100);
        c.retirada(300);
        System.out.println(c.getSaldo());
    }
}
