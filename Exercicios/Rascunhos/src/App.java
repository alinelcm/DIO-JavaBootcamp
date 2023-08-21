import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
    
        DecimalFormat df = new DecimalFormat("#.##");

        double valorFinal = calcularValorFinal(valorInicial, taxaJuros, periodo);      

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
    public static double calcularValorFinal (double valorInicial, double taxaJuros, double periodo){
        double valorFinal = valorInicial * Math.pow((1+taxaJuros), periodo); 
        return valorFinal;
    }
}