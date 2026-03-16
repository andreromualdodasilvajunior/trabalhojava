import java.util.Scanner;

public class Exerquatro {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a Temperatura em Celsius: ");
        int temp= leia.nextInt();
 
        String clima = (temp < 15) ? "Frio" :
                        (temp <= 25) ? "Agradavel" : "Quente";
        System.out.println("Aprovado");

         System.out.println(clima);
       
    }
}
