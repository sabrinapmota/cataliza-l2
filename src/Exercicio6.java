import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o número desejado: ");
        int numero = input.nextInt();

        int calculo1 = numero - 1;
        int calculo2 = numero + 1;
        System.out.println("O número antecessor é: " + calculo1);
        System.out.println("O número sucessor é: " + calculo2);

    }
}
