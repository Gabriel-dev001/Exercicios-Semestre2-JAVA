import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class atividade4{
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<Integer>();
        LinkedList<Integer> filaPar = new LinkedList<>();
        LinkedList<Integer> filaImpar = new LinkedList<>();

        int numero;
        int numeroDesempilhado;

        System.out.println("Incremente na Pilha");
        boolean continuar = true;

        while (continuar){
            numero = sc.nextInt();

            if(numero<0){
                continuar = false;
                break;
            }

            pilha.push(numero);
        }

        int tamanhoPilha = pilha.size();

        int[] vetorPilha = new int[pilha.size()];

        for(int i=0; i<tamanhoPilha; i++){
            numeroDesempilhado = pilha.pop();
            vetorPilha[i] = numeroDesempilhado;

            if(numeroDesempilhado%2==0){
                filaPar.add(numeroDesempilhado);
            }else{
                filaImpar.add(numeroDesempilhado);
            }
        }

        System.out.println("PILHA:");
        for (int item:vetorPilha){
            System.out.println(item);
        }

        System.out.println("FILA PAR:");
        for (int item:filaPar){
            System.out.println(item);
        }

        System.out.println("FILA IMPAR:");
        for (int item:filaImpar){
            System.out.println(item);
        }
    }
}
