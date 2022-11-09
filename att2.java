import java.util.Scanner;
public class att2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, decisao, termina=0;
        String buscaTelefone;

        System.out.println("Quantos telefones deseja cadastrar?\n> ");
        n = scan.nextInt();

        String[] nome = new String[n];
        Long[] telefone = new Long[n];

        for(int i=0;i<n;i++){
            System.out.println("\n\nDigite seu nome: ");
            nome[i] = scan.nextLine();
            nome[i] = scan.nextLine();
            System.out.println("Seu número: ");
            telefone[i] = scan.nextLong();
        }
        System.out.println("\n\nDeseja consultar algum telefone?\n[1] Sim\n[2] Não\n> ");
        decisao = scan.nextInt();
        if(decisao==1){
            System.out.println("\n\n\nO nome a ser buscado o telefone: ");
            buscaTelefone = scan.nextLine();
            buscaTelefone = scan.nextLine();
            for(int i=0;i<n;i++){
                String igual = nome[i]; 
                if(igual.equals(buscaTelefone)){
                    System.out.println("\n\nO telefone de "+nome[i]+" é: "+telefone[i]);
                    termina=1;
                }
            }
            if(termina!=1){
                System.out.println("O nome não foi encontrado...Tente novamente");
            }
        }
    }
}
