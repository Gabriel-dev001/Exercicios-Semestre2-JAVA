import java.util.LinkedList;

public class atividade2{
    private static LinkedList<Integer> filaClonada1(){
        LinkedList<Integer> fila1 = new LinkedList<>();
        LinkedList<Integer> filaClonada1 = new LinkedList<>();

        fila1.add(3);
        fila1.add(22);
        fila1.add(45);

        for (Integer item : fila1) {
            filaClonada1.push(item);
        }

        return filaClonada1;
    }

    private static LinkedList<Integer> filaClonada2(){
        LinkedList<Integer> fila2 = new LinkedList<>();
        LinkedList<Integer> filaClonada2 = new LinkedList<>();

        fila2.add(5);
        fila2.add(2);
        fila2.add(48);
        fila2.add(104);

        for (Integer item : fila2) {
            filaClonada2.push(item);
        }

        return filaClonada2;
    }

    public static void main(String[] args) {
        LinkedList<Integer> fila1 = new LinkedList<>();
        LinkedList<Integer> fila2 = new LinkedList<>();


        fila1 = filaClonada1();
        fila2 = filaClonada2();

        var maiorFila = identificadoMaiorFila(fila1, fila2);
        System.out.println(maiorFila);

        System.out.println("\nFila 1:");
        fila1 = filaClonada1();
        verificacaoMaiorMenor(fila1);

        fila1 = filaClonada1();
        mediaAritmetica(fila1);

        fila1 = filaClonada1();
        quantidadeNumerosPares(fila1);


        System.out.println("\nFila 2:");
        fila2 = filaClonada2();
        verificacaoMaiorMenor(fila2);

        fila2 = filaClonada2();
        mediaAritmetica(fila2);

        fila2 = filaClonada2();
        quantidadeNumerosPares(fila2);

    }

    private static String identificadoMaiorFila(LinkedList<Integer> fila1, LinkedList<Integer> fila2){
        var tamanhoFila1 = fila1.size();
        var tamanhoFila2 = fila2.size();

        if(tamanhoFila1>tamanhoFila2){
            return "A fila 1 é a maior !!! ";
        }else if (tamanhoFila1 == tamanhoFila2){
            return "As filas sao iguais !!! ";
        }else{
            return "A fila 2 é a maior !!! ";
        }
    }

    private static void verificacaoMaiorMenor(LinkedList<Integer> fila){
        LinkedList<Integer> filaClonada = new LinkedList<>();

        for (Integer item : fila) {
            filaClonada.push(item);
        }

        int numeroBase = 0;
        var numeroRetirado = 0;

            for (int i=0; i<fila.size(); i++){
            numeroRetirado = fila.remove();

            if(numeroRetirado>numeroBase){
                numeroBase = numeroRetirado;
            }
        }

        var maiorNumero = numeroBase;
        numeroRetirado = 0;

        for(int i = 0; i<filaClonada.size(); i++){
            numeroRetirado = filaClonada.remove();

            if(numeroRetirado<numeroBase){
                numeroBase = numeroRetirado;
            }
        }

        var menorNumero = numeroBase;
        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("Menor numero: " + menorNumero);
    }

    private static void mediaAritmetica(LinkedList<Integer> fila){
        var numeroSomado = 0;
        var tamanhoPilha = fila.size();
        Integer numeroRetirado;

        for (int i=0; i<fila.size(); i++){
            numeroRetirado = fila.remove();
            numeroSomado = numeroSomado+numeroRetirado;
        }

        var media = numeroSomado/tamanhoPilha;
        System.out.println("Media: " + media);
    }

    private static void quantidadeNumerosPares(LinkedList<Integer> fila){
        var numerosPares = 0;
        Integer numeroRetirado;

        for (int i=0; i<fila.size(); i++){
            numeroRetirado = fila.remove();

            if(numeroRetirado%2 == 0){
                numerosPares++;
            }
        }

        System.out.println("Existem " + numerosPares + " numeros pares na Lista.");
    }
}
