import java.util.Arrays;
import java.util.Random;

public class OrdenacaoVetor {
    public static void main(String[] args) {

        int [] vetor = new int [10];
        Random aleatorio = new Random();
        for(int i=0; i< vetor.length;i++){
            vetor[i] = aleatorio.nextInt(0,100);
        }
        Arrays.sort(vetor);
        for (int i=0;i< vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }
}
