import java.util.Stack;

public class Atividade1{
    private static Stack<Integer> pilhaClonada1(){
        Stack<Integer> pilha1 = new Stack<Integer>();
        Stack<Integer> pilhaClonada1 = new Stack<>();

        pilha1.push(2);
        pilha1.push(7);
        pilha1.push(12);

        for (Integer item : pilha1) {
            pilhaClonada1.push(item);
        }

        return pilhaClonada1;
    }

    private static Stack<Integer> pilhaClonada2(){
        Stack<Integer> pilha2 = new Stack<Integer>();
        Stack<Integer> pilhaClonada2 = new Stack<>();

        pilha2.push(5);
        pilha2.push(17);
        pilha2.push(79);
        pilha2.push(55);

        for (Integer item : pilha2){
            pilhaClonada2.push(item);
        }

        return pilhaClonada2;
    }

    public static void main(String[] args){
        Stack<Integer> pilha1 = new Stack<Integer>();
        Stack<Integer> pilha2 = new Stack<Integer>();

        pilha1 = pilhaClonada1();
        pilha2 = pilhaClonada2();
        var maiorPilha = identificadoMaiorPilha(pilha1, pilha2);

        System.out.println(maiorPilha);

        System.out.println("\n\nPilha1:");
        pilha1 = pilhaClonada1();
        verificacaoMaiorMenor(pilha1);

        pilha1 = pilhaClonada1();
        mediaAritmetica(pilha1);

        pilha1 = pilhaClonada1();
        quantidadeNumerosPares(pilha1);



        System.out.println("\nPilha2:");
        pilha2 = pilhaClonada2();
        verificacaoMaiorMenor(pilha2);

        pilha2 = pilhaClonada2();
        mediaAritmetica(pilha2);

        pilha2 = pilhaClonada2();
        quantidadeNumerosPares(pilha2);
    }

    private static String identificadoMaiorPilha(Stack<Integer> pilha1, Stack<Integer> pilha2){
        var tamanhoPilha1 = pilha1.size();
        var tamanhoPilha2 = pilha2.size();

        if(tamanhoPilha1>tamanhoPilha2){
            return "A pilha 1 é a maior !!! ";
        }else{
            return "A pilha 2 é a maior !!!";
        }
    }

    private static void verificacaoMaiorMenor(Stack<Integer> pilha){
        Stack<Integer> pilhaClonada = new Stack<>();

        for (Integer item : pilha) {
            pilhaClonada.push(item);
        }

        Integer numeroBase = 0;
        Integer numeroDesempilhado;

        while(!pilha.empty()){
            numeroDesempilhado = pilha.pop();

            if(numeroDesempilhado>numeroBase){
                numeroBase = numeroDesempilhado;
            }
        }

        var maiorNumero = numeroBase;
        numeroDesempilhado = 0;

        while(!pilhaClonada.empty()){
            numeroDesempilhado = pilhaClonada.pop();

            if(numeroDesempilhado<numeroBase){
                numeroBase = numeroDesempilhado;
            }
        }
        var menorNumero = numeroBase;

        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("Menor numero: " + menorNumero);
    }

    private static void mediaAritmetica(Stack<Integer> pilha){
        var numeroSomado = 0;
        var tamanhoPilha = pilha.size();
        Integer numeroDesempilhado;

        while(!pilha.empty()) {
            numeroDesempilhado = pilha.pop();
            numeroSomado = numeroSomado + numeroDesempilhado;
        }

        var media = numeroSomado/tamanhoPilha;
        System.out.println("Media: " + media);
    }

    private static void quantidadeNumerosPares(Stack<Integer> pilha){
        var numerosPares = 0;
        Integer numeroDesempilhado;

        while(!pilha.empty()){
            numeroDesempilhado = pilha.pop();
            if(numeroDesempilhado%2 == 0){
                numerosPares++;
            }
        }

        System.out.println("Existem " + numerosPares + " numeros pares na Lista.");
    }
}
