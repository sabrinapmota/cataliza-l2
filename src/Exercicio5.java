import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite a informação em Fahrenheit: ");
        double grausF = input.nextDouble();
        double calculo = (grausF - 32) * 5 / 9;
        System.out.printf("A temperatura em graus Celsius é: %.2f", calculo);

    }
}
