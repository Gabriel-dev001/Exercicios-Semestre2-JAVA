import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioLiquidoProfessor{
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.###");
        var sc = new Scanner(System.in);

        System.out.print("Valor da hora-aula: ");
        var valorAula = sc.nextDouble();

        System.out.print("Número de horas trabalhadas no mês: ");
        var horasTrabalhadas = sc.nextDouble();

        System.out.print("Percentual de desconto do INSS: ");
        var porcetagemDesconto = sc.nextDouble();
        porcetagemDesconto = porcetagemDesconto/100;

        var salarioBruto = valorAula*horasTrabalhadas;
        var desconto = salarioBruto*porcetagemDesconto;
        var salarioLiquido = salarioBruto-desconto;

        String salarioLiquidoFormatado = df.format(salarioLiquido);
        String salarioBrutoFormatado = df.format(salarioBruto);

        System.out.print("Salario Bruto: R$" + salarioBrutoFormatado + "\nSalario liquido: R$" + salarioLiquidoFormatado);
    }
}
