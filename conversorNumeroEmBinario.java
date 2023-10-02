import java.util.Scanner;
import java.util.Stack;

public class atividade6{
    public static void main(String[] args){
        Stack<Integer> pilhaBinario = new Stack<Integer>();
        var sc = new Scanner(System.in);

        System.out.print("Escreva um numero para transformar em binario: ");
        int numero = sc.nextInt();

        int restoDivisao;
        boolean continuar = true;

        while(continuar){
            restoDivisao = numero%2;
            pilhaBinario.push(restoDivisao);
            numero = numero/2;

            if(numero == 1||numero == 0){
                pilhaBinario.push(numero);
                break;
            }
        }

        String binariozinho="", numeroBinario="";
        int numeroDesempilhado;

        while(!pilhaBinario.empty()){
            numeroDesempilhado = pilhaBinario.pop();
            binariozinho = Integer.toString(numeroDesempilhado);
            numeroBinario = numeroBinario+binariozinho;
        }

        System.out.println("Binario: " + numeroBinario);
    }
}
