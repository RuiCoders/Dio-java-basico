import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCathAboutMe {

    public static void main(String[] args)  {
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu Sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua Idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Ola. me chamo " + nome.toLowerCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + "anos ");
            System.out.println("Minha altura é " + altura + "cm");
            scanner.close();
        } 
        catch (InputMismatchException e){
            System.out.println("O campos de Idade e altura precisar ser numericos");
        }

    }
}
