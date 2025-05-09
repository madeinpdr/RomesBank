package ContaCorrente;

import java.util.Scanner;

public class Menu {
    private final OperacaoConta operacao;
    private final Scanner scanner;

    public Menu(OperacaoConta operacao, Scanner scanner) {
        this.operacao = operacao;
        this.scanner = scanner;
    }

    public void exibir() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n-----------------------------------");
            System.out.println("          MENU DE OPERAÇÕES        ");
            System.out.println("-----------------------------------");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Ver Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção (1 a 4): ");

            int opcao = scanner.nextInt();
            System.out.println();

            try {
                switch (opcao) {
                    case 1 -> operacao.sacar();
                    case 2 -> operacao.depositar();
                    case 3 -> operacao.mostrarSaldo();
                    case 4 -> {
                        continuar = false;
                        System.out.println("✅ Sessão encerrada. Obrigado por usar o sistema!");
                    }
                    default -> System.out.println("⚠️ Opção inválida. Digite de 1 a 4.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("❌ Erro: " + e.getMessage());
            }
        }
    }
}
