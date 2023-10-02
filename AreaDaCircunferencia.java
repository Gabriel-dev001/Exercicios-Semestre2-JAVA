import java.util.Scanner;

public class AreaDaCircunferencia {
    public static final double PI =  3.14159265;

    public static void main(String[] args){
        var sc = new Scanner(System.in);

        System.out.print("Escreva seu raio: ");
        var raio = sc.nextFloat();

        var A = PI * (raio*raio);

        System.out.println("A area da sua Circunferencia é " + A);
    }
}
