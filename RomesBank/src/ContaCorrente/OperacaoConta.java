package ContaCorrente;

import java.util.Scanner;

public class OperacaoConta {
    private final IConta conta;
    private final Scanner scanner;

    public OperacaoConta(IConta conta, Scanner scanner) {
        this.conta = conta;
        this.scanner = scanner;
    }

    public void sacar() {
        System.out.print("Digite o valor para SAQUE: R$");
        double valor = scanner.nextDouble();
        if (conta.sacar(valor)) {
            System.out.println("✅ Saque realizado com sucesso.");
        }
    }

    public void depositar() {
        System.out.print("Digite o valor para DEPÓSITO: R$");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
        System.out.println("✅ Depósito realizado com sucesso.");
    }

    public void mostrarSaldo() {
        System.out.printf("📌 Saldo atual: R$%.2f%n", conta.getSaldo());
    }
}
