 import java.util.Scanner;

    public class Exerdezesseis{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
    System.out.print("Digite o primeiro numero: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Múltiplo de 3 e 5");
            
        } else if (num % 3 == 0) {
            System.out.println("Múltiplo de 3");
            } else if (num % 5 == 0) {
                            System.out.println("Múltiplo de 5");
} else {
                System.out.println("Nao é multiplo de nenhuma");

}  
sc.close();
            }
        }

        
       