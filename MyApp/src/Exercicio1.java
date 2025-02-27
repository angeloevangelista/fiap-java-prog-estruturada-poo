import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular a media de dois numeros");

        System.out.print("Digite o primeiro numero: ");
        float num1 = sc.nextFloat();

        System.out.print("Digite o segundo numero: ");
        float num2 = sc.nextFloat();

        float media = (num1 + num2) / 2;

        System.out.println("A media dos numeros: " + media);
    }
}
