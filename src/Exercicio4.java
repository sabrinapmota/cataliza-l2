import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas: ");
        double numeroHoras = input.nextDouble();
        System.out.println("digite o valor por hora: ");
        double valorHora = input.nextDouble();
        double calculo = numeroHoras * valorHora;
        System.out.println("O valor total do salário é: " + calculo);
    }
}
