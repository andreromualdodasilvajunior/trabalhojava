import java.util.Scanner;


public class Exeroito {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);  

        double peso = leia.nextDouble();
        double altura = leia.nextDouble();

        double imc = peso / (altura * altura);
    if (imc < 18.5) {
     System.out.println("Abaixo do peso");
     } else if (imc < 25) {
        System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
            } else {
            System.out.println("Obesidade");
            }
 String saudavel = (imc >= 18.5 && imc < 25) ? "Dentro da faixa saudável" : "Fora da faixa saudável";

        System.out.println(saudavel);
    }
}

