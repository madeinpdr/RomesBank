package ContaCorrente;

public class SeusFundosPremium extends SeusFundos {

    public SeusFundosPremium(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0)
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");

        double taxa = valor * 0.001;
        double total = valor + taxa;

        if (total <= saldo) {
            saldo -= total;
            return true;
        }
        System.out.println("Saldo insuficiente para saque.");
        return false;
    }
}
