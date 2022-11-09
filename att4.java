import java.util.Scanner;
public class att4
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int referencia, n=10, contadorMenor=0,contadorIgual=0;
        int[] numero = new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Digite um numero: ");
            numero[i] = scan.nextInt();
            
            
        }
        System.out.println("Qual o valor da referencia: ");
        referencia = scan.nextInt();
        
        System.out.println("\n\n===============\n");
        System.out.println("QUANTOS SÂO MENORES\n");
        for(int i=0;i<n;i++){
            if(referencia>numero[i]){
                contadorMenor++;
            }
        }
        System.out.println(contadorMenor);
        System.out.println("\n===============\n");
        System.out.println("NUMEROS MAIORES\n");
        for(int i=0;i<n;i++){
            if(numero[i]>referencia){
                System.out.println("\n"+numero[i]);
            }
        }
        System.out.println("\n===============\n");
        System.out.println("QUANTAS VEZES SE REPETE\n");
        for(int i=0;i<n;i++){
            if(numero[i]==referencia){
                contadorIgual++;
            }
        }
        System.out.println(contadorIgual);
    }
}
