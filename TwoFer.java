import java.util.Scanner;

public class TwoFer {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Escreva seu nome: ");
        String nome = sc.nextLine();

        var fraseCompleta = mensagem(nome);
        System.out.println("\n" + fraseCompleta);

    }

    private static String mensagem(String nome){
        String fraseCompleta = "Um para " +nome;

        fraseCompleta = fraseCompleta + ", Um para mim.";

        return fraseCompleta;
    }
}
