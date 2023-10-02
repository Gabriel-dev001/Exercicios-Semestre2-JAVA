import java.util.Scanner;

public class SomaDosPares {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int somaPares = 0;

        System.out.print("Escreva o comeco do seu intervalo: ");
        int comeco = sc.nextInt();
        System.out.print("Escreva o final do seu intervalo: ");
        int fim = sc.nextInt();

        while(fim<comeco){
            System.out.print("O final do seu intervalo tem que ser maior que o comeco: ");
            fim = sc.nextInt();
        }

        while(comeco<=fim){
            if(comeco%2 == 0){
                somaPares = somaPares+comeco;
            }
            comeco++;
        }

        System.out.print("A soma dos numero pares entre esse intervalo é: " + somaPares);
    }
}
