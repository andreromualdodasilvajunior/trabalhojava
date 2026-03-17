import java.util.Scanner;

public class Exercinco {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o numero 1: ");
        double a = leia.nextDouble();

         System.out.print("Digite o numero 2: ");
        double b = leia.nextDouble();

         System.out.print("Digite o operador (+ - * /): ");
        char op = leia.next().charAt(0);

        switch(op) {
          case '+':
            System.out.println("Resultado: " + (a + b));
            break;

            case '-':

            System.out.println("Resultado: " + (a - b));

            break;

            case '*':
           System.out.println("Resultado: " + (a * b));
           break;
           case '/':
            if (b !=0) {
          System.out.println("Resultado: " + (a / b));

          } else {

           System.out.println("Divisão por zero");

          }
           break;
           default:

            System.out.println("Operador invalido.");
       }

      }
}
