import java.util.Scanner;

public class Exerdezoito {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero de (0-10): ");
        int numero = sc.nextInt();
        String romano;
        
        switch (numero) {
            case 1:
   romano = "I";
                break;
            case 2:
      romano = "II";
                break;
     case 3:
romano = "III";
break;
 case 4:
      romano = "IV";
                break;
                 case 5:
      romano = "V";
                break;
                 case 6:
      romano = "VI";
                break;
                 case 7:
      romano = "VII";
                break;
                 case 8:
      romano = "VIII";
                break;
                 case 9:
      romano = "IX";
                break;
                 case 10:
      romano = "X";
                break;
                default:
                romano = "numero invalido (1-10)";
        }
        
        System.out.println("O numero " + numero + " seria assim em algarismo romano: " + romano);
        
        sc.close();
    }
}