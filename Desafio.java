import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nomeCliente = "Taylan Hahn Fernandes";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int operacao = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome cliente: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("R$" + saldo);
        System.out.println("\n*************************");

        String menu = """
                \n>>> Escolha uma operação:
                1- Consultar Saldo
                2- Transferir Valor
                3- Receber Valor
                4- Encerrar e sair
                """;

        while (operacao != 4) {
            System.out.println(menu);
            operacao = leitor.nextInt();

            if (operacao == 1) {
                System.out.println("Seu saldo é de R$" + saldo);
            } else if (operacao == 2) {
                System.out.println("Qual valor deseja transferir?");
                double valorTransferido = leitor.nextDouble();
                if (valorTransferido > saldo) {
                    System.out.println("Saldo insuficiente para a operação");
                } else {
                    saldo = saldo - valorTransferido;
                    System.out.println("Saldo atual: R$" + saldo);
                }
            } else if (operacao == 3) {
                System.out.println("Qual é o valor a receber?");
                double valorRecebido = leitor.nextDouble();
                saldo = saldo + valorRecebido;
                System.out.println("Saldo atual: R$" + saldo);
            } else if (operacao != 4) {
                System.out.println("Operação inválida. Tente outra vez, por favor.");
            }
        }
    }
}
