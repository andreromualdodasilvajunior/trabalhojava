import java.util.Scanner;

public class Exerum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

System.out.print("Informe o número: ");
int numero = scanner.nextInt();

String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
   System.out.println("O número " + numero + " é: " + resultado);
        scanner.close();

    }

}
 