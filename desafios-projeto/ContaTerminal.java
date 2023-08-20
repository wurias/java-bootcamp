import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String agencia;
        String nomeCliente;
        int contaNumero;
        double saldo = 237.48;

        System.out.println("Informe o nome do cliente: ");
            nomeCliente = scan.nextLine();

        System.out.println("Sua Agência: ");
            agencia = scan.nextLine();

        System.out.println("Número da Conta: ");
            contaNumero = scan.nextInt();

        System.out.println(
                "Olá " + nomeCliente + "."
                .concat("\nObrigado por criar uma conta em nosso banco.")
                .concat("\nSua Agência é: " + agencia)
                .concat("\nSua Conta: " + contaNumero)
                .concat("\nSaldo Disponível: " + saldo)
        );

    }
}
