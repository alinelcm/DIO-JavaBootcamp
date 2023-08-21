import java.util.Scanner;

public class deposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            double valor = scanner.nextDouble();
            
            if (valor > 0) {
                System.out.println("Deposito realizado com sucesso!");
                System.out.printf("Saldo atual: R$%.2f\n", valor);
                continuar = false; // Encerra o loop
            } else if (valor < 0) {
                System.out.println("Valor invalido! Digite um valor maior que zero.");
                scanner.nextLine();
            } else {
                System.out.println("Encerrando o programa...");
                continuar = false; // Encerra o loop
            }
        }
        
        scanner.close();
    }
}
