import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco. Sua agência é: " + agencia + ", conta: " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
