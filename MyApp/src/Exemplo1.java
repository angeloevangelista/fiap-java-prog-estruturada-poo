import java.time.Year;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = meuScanner.nextLine();

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = meuScanner.nextInt();

        int idade = Year.now().getValue() - anoNascimento;

        System.out.println("Hello, " + nome +  "!" + " Você tem " + idade + " anos!" );
    }
}
