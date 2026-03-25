import java.util.Scanner;
public class Exerdezessete {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Digite o valor da compra: ");
            double valor = sc.nextDouble();
            
            double desconto;

            if (valor > 500) {
    desconto = 0.20;
            } else if (valor >= 200) {
    desconto = 0.10;
            } else {
    desconto = 0;

            }
    double finalValor = valor - (valor * desconto);
    System.out.println("Cliente, seu valor final: " + finalValor);
    sc.close();
            }

            }
