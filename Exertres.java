import java.util.Scanner;

public class Exertres {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a media(0-10): ");
        double media = leia.nextDouble();

        if (media >= 7) {
        
        System.out.println("Aprovado");
       } else if (media >= 5) {

         System.out.println("Recuperação");
       } else {
          System.out.println("Reprovado");
    
       

        
 

       }

    }
}