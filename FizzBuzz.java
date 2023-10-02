import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Escreva o comeco da sua lista: ");
        int comeco = sc.nextInt();
        System.out.print("Escreva o final da sua lista: ");
        int fim = sc.nextInt();

        while(comeco<=fim){
            String fizzOuBuzz = transformador(comeco);
            System.out.println(fizzOuBuzz);
            comeco++;
        }
    }

    private static String transformador(int numeroVerificar){
        if(numeroVerificar%3 == 0 && numeroVerificar%5 == 0){
            return "FizzBuzz";

        }else if(numeroVerificar%3 == 0){
            return "Fizz";

        }else if(numeroVerificar%5 == 0){
            return "Buzz";

        }else{
            String numero = Integer.toString(numeroVerificar);
            return numero;
        }
    }

}
