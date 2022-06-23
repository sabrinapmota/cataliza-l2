import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade de horas: ");
        double hora = input.nextDouble();
        System.out.println("Informe o valor da hora: ");
        double valorHora = input.nextDouble();
        double calculo1 = hora * valorHora;
        double calculoInss = calculo1 * 8 / 100;
        double descontoSindicato = calculo1 * 5 / 100;
        double descontoIr = calculo1 * 11 / 100;
        double salarioLiquido = calculo1 - calculoInss - descontoIr - descontoSindicato;
    System.out.printf("o valor do salário bruto é: %.2f \n", calculo1);
        System.out.printf("O valor do desconto de INSS é: %.2f \n ", calculoInss);

        System.out.printf("O valor do desconto sindical é: %.2f \n ", descontoSindicato);
        System.out.printf("o valor do salário líquido é: %.2f \n ", salarioLiquido);
    }
}
