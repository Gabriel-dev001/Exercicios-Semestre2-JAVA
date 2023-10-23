import java.util.Arrays;
import java.util.Scanner;

public class OrdenandoInteiros{
    public static final int ESPACO_ARRAY = 12;

    public static void main(String[] args){
        var sc = new Scanner(System.in);
        int[] listaDesordenada = new int[ESPACO_ARRAY];


        for (int i = 0; i < listaDesordenada.length; i++) {
            System.out.print(i+1 +":");
            listaDesordenada[i] = sc.nextInt();
        }
        ordenarNumeros(listaDesordenada);
    }

    private static void ordenarNumeros(int[] listaDesordenada){
        int[] listaOrdenada = new int[listaDesordenada.length];

        for(int i=0; i<listaDesordenada.length; i++){
            int maiorNumero = 0;
            int contador = 0;

            for(int j=0; j<listaDesordenada.length; j++){
                if(listaDesordenada[j]>maiorNumero){
                    maiorNumero = listaDesordenada[j];
                    contador = j;
                }
            }
            listaOrdenada[i] = maiorNumero;
            listaDesordenada[contador] = 0;
        }

        System.out.println(Arrays.toString(listaOrdenada));
    }
}
