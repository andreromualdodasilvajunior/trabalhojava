import java.util.Scanner;

public class Exersete {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        int a = leia.nextInt();

        System.out.print("Digite o lado B: ");
        int b = leia.nextInt();

        System.out.print("Digite o lado C: ");
        int c = leia.nextInt();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }

        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }
}