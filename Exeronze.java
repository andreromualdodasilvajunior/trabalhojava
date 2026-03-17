import java.util.Scanner;

public class Exeronze{
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

System.out.print("Bem-vindo ao cinema do André, Informe sua idade: ");
int idade = leia.nextInt();
if (idade < 12 || idade > 60 )
{
 System.out.println("O ingresso do cinema para você custa: $10,00");
 } else {
     System.out.println("O ingresso do cinema para você custa: $20,00");
     }

    }

}