import java.util.Scanner;

public class ConversaoEmDolar{
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        System.out.print("Cotacao do dolar: ");
        var cotacaoDolar = sc.nextDouble();

        System.out.print("Reais: ");
        var reais = sc.nextDouble();

        var dolares = reais*cotacaoDolar;

        System.out.println("R$: " + reais + "\nUS$: " + dolares);

    }
}
