import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            // executando repetidas vezes ate alguem atender
            System.out.println("Telefone tocando");

        } while (tocando());
        System.out.println("Alô !!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu?" + atendeu);
        // negando ele continua tocando
        return !atendeu;
    }
}