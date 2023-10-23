import java.util.Scanner;

public class MediaDoAluno{
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        boolean continuar = true;
        while(continuar){
            System.out.print("Nome do seu aluno: ");
            var nomeAluno = sc.nextLine();

            System.out.print("Nota 1: ");
            var nota1 = sc.nextFloat();

            System.out.print("Nota 2: ");
            var nota2 = sc.nextFloat();

            System.out.print("Nota 3: ");
            var nota3 = sc.nextFloat();

            System.out.print("Nota 4: ");
            var nota4 = sc.nextFloat();

            var media = (nota1+nota2+nota3+nota4)/4;

            if(media<5){
                System.out.printf("%s: Reprovado!!!%n", nomeAluno);
                System.out.printf("Media: %f%n\n\n", media);
            }else{
                System.out.printf("%s: Aprovado!!!%n", nomeAluno);
                System.out.printf("Media: %f%n\n\n", media);
            }

            var novoCalculo = "";

            while(!novoCalculo.equalsIgnoreCase("n") && !novoCalculo.equalsIgnoreCase("s")){
                System.out.println("Realizar outro calculo? [s,n]");
                novoCalculo = sc.next();
            }

            if(novoCalculo.equalsIgnoreCase("n")){
                continuar = false;
                System.out.println("Acabou!!!");
                break;
            }
        }
    }
}
