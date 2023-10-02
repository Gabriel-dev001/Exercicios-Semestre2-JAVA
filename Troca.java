import java.util.Scanner;

public class Troca{
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Escreva o valor de 'A': ");
        var a = sc.nextLine();

        System.out.print("Escreva o valor de 'B': ");
        var b = sc.nextLine();

        var coringa = a;
        a = b;
        b = coringa;

        System.out.print("\nO valor de 'A': "+a+"\nOvalor de 'B': "+b);

    }
}
