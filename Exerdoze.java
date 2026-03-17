import java.util.Scanner;

public class Exerdoze {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota (0-10): ");
        int nota = scanner.nextInt();

        if (nota < 0 || nota > 10) { 
            System.out.println("Nota invalida digite de zero a dez por favor.");
        } else {
            String conceitinho;
            
            if (nota >= 9) {
                conceitinho = "A";
            } else if (nota >= 7) {
                conceitinho = "B";
            } else if (nota >= 5) {
                conceitinho = "C";
            } else {
                conceitinho = "D";
            }

            System.out.println("Conceito: " + conceitinho);
        }
        
        scanner.close(); 
    }
}