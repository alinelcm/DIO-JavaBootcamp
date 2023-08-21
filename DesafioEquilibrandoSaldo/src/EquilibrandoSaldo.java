import java.util.Locale;
import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Entre com o saldo atual:");
        double saldoAtual = scanner.nextDouble();
        System.out.print("Entre com o valor do depósito:");
        double valorDeposito = scanner.nextDouble();
        System.out.print("Entre com o valor de retirada:");
        double valorRetirada = scanner.nextDouble();

        scanner.close();

        double saldo = saldoAtual + valorDeposito - valorRetirada;

        System.out.printf("Saldo atualizado na conta:R$%.1f\n",saldo);
    }
}
