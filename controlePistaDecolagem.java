import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;

public class atividade5{
    private static int menu(){
        var sc = new Scanner(System.in);

        System.out.println("\nMenu:");
        System.out.println("1-Adicionar um aviao a fila de espera");
        System.out.println("2-Autorizar a decolagem do primeiro aviao da fila");
        System.out.println("3-Listar todos os avioes que estao na fila");
        System.out.println("4-Listar o numero de avioes aguardando na fila para decolagem");
        var escolha = sc.nextInt();


        return escolha;
    }

    public static void main(String[] args){
        LinkedList<String> filaAvioes = new LinkedList<>();
        boolean continuar = true;

        while(continuar){
            int chamarMetodo = menu();

            switch(chamarMetodo){
                case 1:
                    adcionarAvioes(filaAvioes);
                    break;

                case 2:
                    autorizarDecolagem(filaAvioes);
                    break;

                case 3:
                    listarAvioesFila(filaAvioes);
                    break;

                case 4:
                    listarNumerosAvios(filaAvioes);
                    break;

            }
        }
    }

    private static void adcionarAvioes(LinkedList<String> filaAvioes){
        var sc = new Scanner(System.in);
        System.out.println("Escreva o nome do Aviao:");
        String nomeAviao = sc.nextLine();

        filaAvioes.add(nomeAviao);
    }

    private static void autorizarDecolagem(LinkedList<String> filaAvioes){
        if(filaAvioes.isEmpty()){
            System.out.println("Nao existe nenhum aviao para decolar !!!");
        }else{
            String aviaoDecolado = filaAvioes.getFirst();
            filaAvioes.remove();

            System.out.println("\n\nO Aviao " + aviaoDecolado + " Decolou !!!");
        }

    }

    private static void listarAvioesFila(LinkedList<String> filaAvioes){
        if(filaAvioes.isEmpty()){
            System.out.println("Nao existe nenhum aviao na pista !!!");
        }else{
            System.out.println("Esses sao seus avioes!!!");

            for (String item:filaAvioes){
                System.out.println(item);

            }
            System.out.print("\n");
        }
    }

    private static void listarNumerosAvios(LinkedList<String> filaAvioes){
        if(filaAvioes.isEmpty()){
            System.out.println("Nao existe nenhum aviao na pista !!!");
        }else{
            int tamanhoFila = filaAvioes.size();
            System.out.println("\nNumeros de avioes na fila "+ tamanhoFila);
        }
    }
}
