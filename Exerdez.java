import java.util.Scanner;
public class Exerdez {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = leia.nextInt();

        String resultado = (num > 0) ? "Positivo"
                : (num < 0) ? "Negativo"
                : "Zero";

        System.out.println(resultado);

        leia.close();
    }
}
    

