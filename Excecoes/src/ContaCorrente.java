public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldoInicial) throws SaldoNegativo   {
        if(saldoInicial < 0){
            throw new SaldoNegativo("O saldo não pode ser negativo.");
        }
        saldo = saldoInicial;
    }

    public void deposito(double valor) throws ValorInvalido   {
        if(valor <= 0){
            throw new ValorInvalido("O valor de depósito não pode ser negativo.");
        }
        saldo += valor;
    }

    public void retirada(double valor) throws ValorInvalido   {
        if(valor <= 0){
            throw new ValorInvalido("O Valor de saque não pode ser negativo.");
        } else if(valor > this.saldo){
            throw new RetiradaMaiorSaldo("O valor de saque não pode ser maior que o saldo" + "\n" + "Saldo atual: " + getSaldo());
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return (saldo);
    }
}