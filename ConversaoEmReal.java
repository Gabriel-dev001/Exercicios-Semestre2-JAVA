import java.util.Scanner;

public class ConversaoEmReal{
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        System.out.print("Cotacao do dolar: ");
        var cotacaoDolar = sc.nextDouble();

        System.out.print("Dolares: ");
        var dolares = sc.nextDouble();

        var reais = dolares/cotacaoDolar;

        System.out.println("R$: " + reais + "\nUS$: " + dolares);

    }
}
