import java.util.Scanner;

public class VelocidadeProjetil{
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Escreva a distancia em metros que o projetil percorreu: ");
        double distancia = sc.nextDouble();

        System.out.print("Escreva o tempo em minutos que demorou para o inpacto: ");
        double tempo = sc.nextDouble();

        var velocidade = (distancia*1000)/(tempo*60);

        System.out.println("Velocidade do projetil em metros por segundo: " + velocidade);
    }
}
