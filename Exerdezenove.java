import java.util.Scanner; 

public class Exerdezenove {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Digite a velocidade do teu veículo(km/h): ");
        double velocidade = scanner.nextDouble();  
        
 System.out.print("Digite o limite da via(km/h): ");
        double limite = scanner.nextDouble();
        
    double excesso = velocidade - limite;
        double percentualExcesso = (excesso / limite) * 100; 
        
        String classificacao;
    
        if (velocidade <= limite) {
            classificacao = "SEM multa";
        } else if (percentualExcesso <= 20) {
            classificacao = "Multa leve";
        } else if (percentualExcesso <= 50) {
            classificacao = "Multa grave";
        } else {

            classificacao = "Multa gravissima + suspensão";
        }
        System.out.println("A velocidade é: " + velocidade + " km/h");
        System.out.println("E o limite era: " + limite + " km/h");

        System.out.printf("Excesso: %.1f%% acima do limite\n", percentualExcesso);
        System.out.println("A classificação: " + classificacao);
        
        scanner.close();
    }
}