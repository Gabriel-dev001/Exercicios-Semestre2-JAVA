import java.util.LinkedList;
import java.util.Stack;

public class atividade3{
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<Integer>();
        LinkedList<Integer> fila = new LinkedList<>();

        pilha.push(3);
        pilha.push(2);
        pilha.push(7);
        pilha.push(5);

        fila.add(80);
        fila.add(7);
        fila.add(5);
        fila.add(19);

        int[] vetorPilha = new int[pilha.size()];
        int[] vetorFila = new int[fila.size()];
        int numeroDesempilhado, numeroRetirado;
        int contador = 0;

        while(!pilha.empty()){
            numeroDesempilhado = pilha.pop();
            vetorPilha[contador] = numeroDesempilhado;
            contador ++;
        }

        for (int i=0; i<fila.size(); i++){
            numeroRetirado = fila.get(i);
            vetorFila[i] = numeroRetirado;
        }

        LinkedList<Integer> numerosIguais = new LinkedList<>();
        contador = 0;

        if(vetorPilha.length<vetorFila.length){
            for(int i=0; i<vetorPilha.length; i++){

                for(int j=0; j<vetorFila.length; j++){

                    if(vetorPilha[i] == vetorFila[j]){
                        numerosIguais.add(vetorPilha[i]);


                    }
                }
            }
        }else{
            for(int i=0; i<vetorFila.length; i++){

                for(int j=0; j<vetorPilha.length; j++){

                    if(vetorFila[i] == vetorPilha[j]){
                        numerosIguais.add(vetorFila[i]);

                    }
                }
            }
        }

        System.out.println("PILHA:");
        for (int item:vetorPilha){
            System.out.println(item);
        }

        System.out.println("\nFILA:");
        for (int item:fila){
            System.out.println(item);
        }

        System.out.println("\nNUMEROS IGUAIS:");
        for (int item:numerosIguais){
            System.out.println(item);
        }
    }
}
