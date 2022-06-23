import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o valor em metros: ");
        double medida = input.nextDouble();
        double calculo = medida * 100;
        System.out.println("O valor em centímetros, é: " + calculo);
    }
}
