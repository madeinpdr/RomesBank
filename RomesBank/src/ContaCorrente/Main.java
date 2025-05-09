package ContaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IConta conta;

        System.out.println("===================================");
        System.out.println("     BEM-VINDO A ROMES BANKs \n\n *** Seus fundos em boas mãos *** ");
        System.out.println("===================================");
        System.out.println("Escolha o tipo de conta para criar:");
        System.out.println("1 - SeusFundos");
        System.out.println("2 - SeusFundos Premium");
        System.out.print("Digite sua opção (1 ou 2): ");
        int tipo = scanner.nextInt();

        if (tipo == 2) {
            conta = new SeusFundosPremium(1000.0);
            System.out.println("Conta SeusFundos Premium criada com saldo inicial de R$1000.00");
        } else {
            conta = new SeusFundos(1000.0);
            System.out.println("Conta SeusFundos criada com saldo inicial de R$1000.00");
        }

        OperacaoConta operacao = new OperacaoConta(conta, scanner);
        Menu menu = new Menu(operacao, scanner);
        menu.exibir();
    }
}
