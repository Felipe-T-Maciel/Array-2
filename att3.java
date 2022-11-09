import java.util.Arrays;
import java.util.Random;
public class att3 {
    public static void main(String[] args) {
        Random ran = new Random();
        int random = ran.nextInt(100)+0;
        int[] numeros = new int[random];

        System.out.println("não ordenados:");
        for(int i=0;i<numeros.length;i++){
            numeros[i] = ran.nextInt(100)+0;
            System.out.println(numeros[i]);
        }

        Arrays.sort(numeros);

        System.out.println("\n==================\nNúmeros ordenados:");
        for(int numero : numeros)
            System.out.println(numero);
        System.out.println(); 
    }
}
