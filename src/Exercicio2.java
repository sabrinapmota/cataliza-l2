
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.println("digite a segunda nota:");
        double nota2 = input.nextDouble();
        System.out.println("digite a terceira nota: ");
        double nota3 = input.nextDouble();
        System.out.println("digite a quarta nota: ");
        double nota4 = input.nextDouble();

        input.close();

        double calculo = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média bimestral é: " + calculo);


    }
}