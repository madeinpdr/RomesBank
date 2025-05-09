package ContaCorrente;

public class SeusFundos implements IConta {
    protected double saldo;

    public SeusFundos(double saldoInicial) {
        if (saldoInicial < 0)
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0)
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        saldo += valor;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0)
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");

        double taxa = valor * 0.005;
        double total = valor + taxa;

        if (total <= saldo) {
            saldo -= total;
            return true;
        }
        System.out.println("Saldo insuficiente para saque.");
        return false;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
