public class SomandoNaturais{
    public static void main(String[] args) {
        int inicio = 1, fim = inicio+100, resultado = 0;

        for(int i=inicio; i<fim; i++){
            resultado = resultado+i;
        }

        System.out.printf("A soma do intervalo de %s a %s: %s%n", inicio, fim, resultado);
    }
}
