import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroConta = 0;
        String numeroAgencia = "";
        String nomeCliente = "";
        double saldo = 0;

        boolean inputValido = false;

        while (!inputValido) {
            try {
                System.out.println("Por favor, digite o número da conta: ");
                numeroConta = input.nextInt();

                System.out.println("Por favor, digite o número da Agência: ");
                numeroAgencia = input.next();

                System.out.println("Digite seu nome: ");
                nomeCliente = input.next();

                System.out.println("Informe o seu saldo: ");
                saldo = input.nextDouble();

                inputValido = true; // Se chegou até aqui sem lançar exceção, a entrada é válida

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira os dados corretamente.");
                input.nextLine(); // Limpa o buffer do scanner
            }
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                numeroAgencia + ", sua conta é- " + numeroConta + " e seu saldo de R$" + saldo + "reais já está disponível para saque.");

        // Fechar o scanner no final
        input.close();
    }
}