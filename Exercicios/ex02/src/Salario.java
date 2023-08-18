import java.util.Locale;
import java.util.Scanner;

public class Salario{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o salário bruto: R$");
        double salarioBruto = scanner.nextDouble();
        System.out.print("Digite o adicional de benefícios: R$");
        double benefícios = scanner.nextDouble();

        double imposto = calcularImposto (salarioBruto);
        calcularSalario(salarioBruto, imposto, benefícios);

        scanner.close();

    }
    public static double calcularImposto(double salarioBruto) {
       /*  double imposto;
        if (salarioBruto <= 1100.00) {
            imposto = 0.05;
        } else if (salarioBruto >= 1100.01 && salarioBruto <= 2500) {
            imposto = 0.10;
        } else {
            imposto = 0.15;
        }
        return imposto;*/
        return (salarioBruto <= 1100.00) ? 0.05 : ((salarioBruto >= 1100.01 && salarioBruto <= 2500) ? 0.10 : 0.15);
    }
    public static void calcularSalario (double salarioBruto, double imposto, double benefícios){
        double salario = salarioBruto -(salarioBruto * imposto) + benefícios;
        System.out.println("Salário a ser transferido é de R$" + salario);
    }


}
