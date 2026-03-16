import java.util.Scanner;

public class Exerdois {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int a = leia.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int b = leia.nextInt();
         int maior = (a > b) ? a : b;

         System.out.println("Maior número: " + maior);




    }
}