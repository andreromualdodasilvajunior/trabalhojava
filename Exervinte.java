import java.util.Scanner;

public class Exervinte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jogador um (pedra, papel ou tesoura): ");
        String j1 = sc.nextLine();

        System.out.print("Jogador dois (pedra, papel ou tesoura): ");
        String j2 = sc.nextLine();

        if (j1.equals(j2)) {
            System.out.println("Empatou");
        } else if (
                (j1.equals("pedra") && j2.equals("tesoura")) ||
                (j1.equals("tesoura") && j2.equals("papel")) ||
                (j1.equals("papel") && j2.equals("pedra"))
        ) {
            System.out.println("Jogador um venceu");
        } else {
            System.out.println("Jogador dois venceu");
        }

        sc.close();
    }
}