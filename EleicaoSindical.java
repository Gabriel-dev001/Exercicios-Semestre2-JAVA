import java.util.Scanner;

public class EleicaoSindical{
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        float [] votosCanditado = new float[3];
        var votosValidos = 0.0;

        for(int i=0; i<votosCanditado.length; i++){
            System.out.print("Total de votos validos do canditado "+(i+1)+" :");
            votosCanditado[i] = sc.nextFloat();
            votosValidos = votosValidos+votosCanditado[i];
        }

        System.out.print("Total de Votos brancos: ");
        var brancos = sc.nextInt();

        System.out.print("Total de Votos nulos: ");
        var nulos = sc.nextInt();

        var totalEleitores = votosValidos+brancos+nulos;

        System.out.println("\n\nNumero total de eleitores: "+totalEleitores);
        System.out.println("Votos validos em relacao a quantidade de eleitores: "+((votosValidos/totalEleitores)*100));
        System.out.println("Votos validos do candidato 1 em relação à quantidade de eleitores: "+((votosCanditado[0]/totalEleitores)*100));
        System.out.println("Votos validos do candidato 2 em relação à quantidade de eleitores: "+((votosCanditado[1]/totalEleitores)*100));
        System.out.println("Votos validos do candidato 3 em relação à quantidade de eleitores: "+((votosCanditado[2]/totalEleitores)*100));
        System.out.println("Votos nulos em relacao a quantidade de eleitores: "+((nulos/totalEleitores)*100));
        System.out.println("Votos brancos em relacao a quantidade de eleitores: "+((brancos/totalEleitores)*100));

    }
}
