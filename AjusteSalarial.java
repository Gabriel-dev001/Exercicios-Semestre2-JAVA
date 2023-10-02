import java.util.Scanner;

public class AjusteSalarial{
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Escreva o salario do seu trabalhador: ");
        var salario = sc.nextFloat();

        System.out.print("Escreva a porcentagem do aumento: ");
        var porcentagem = sc.nextFloat();
        porcentagem = porcentagem/100;

        var salarioReajustado = salario + (salario*porcentagem);

        System.out.print("\nO salario do trabalhador reajustado é: " +salarioReajustado);
    }
}
