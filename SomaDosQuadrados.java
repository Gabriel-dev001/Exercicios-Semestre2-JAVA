import java.util.Scanner;

public class SomaDosQuadrados{
    public static void main(String[] args) { //Math.pow(base, expoente)
        var sc = new Scanner(System.in);

        System.out.print("Escreva seu primeiro valor: ");
        var num1 = sc.nextInt();

        System.out.print("Escreva seu segundo valor: ");
        var num2 = sc.nextInt();

        System.out.print("Escreva seu terceiro valor: ");
        var num3 = sc.nextInt();

        num1 = (int)Math.pow(num1, 2);
        num2 = (int)Math.pow(num2, 2);
        num3 = (int)Math.pow(num3, 2);

        var resultado = num1+num2+num3;

        System.out.println(String.format("A soma dos valores ao Quadrado: %s", resultado));
    }
}
