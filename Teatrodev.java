import java.util.Scanner;


public class Teatrodev {

    static Scanner sc = new Scanner(System.in);

    static int salas = 2;
    static int linhas = 12;
    static int colunas = 12;

    static String[] nomes = {"Sala 1", "Sala 2"};

    static char[][][] cadeiras = new char[salas][linhas][colunas];

    static double preco = 50.0;

    static String[] titulos = new String[20];

    public static void main(String[] args) {

        // iniciar tudo livre
        for (int s = 0; s < salas; s++) {
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    cadeiras[s][i][j] = 'L';
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            titulos[i] = "Exercício " + (i + 1);
        }

        int op;

        do {
            System.out.println("\n1-Ver mapa");
            System.out.println("2-Reservar");
            System.out.println("3-Comprar");
            System.out.println("4-Cancelar");
            System.out.println("5-Relatório");
            System.out.println("6-Exercícios");
            System.out.println("0-Sair");

            op = sc.nextInt();

            if (op == 1) mapa();
            if (op == 2) operar(1);
            if (op == 3) operar(2);
            if (op == 4) operar(3);
            if (op == 5) relatorio();
            if (op == 6) exercicios();

        } while (op != 0);
    }

    static int escolherSala() {
        System.out.println("Sala:");
        for (int i = 0; i < salas; i++) {
            System.out.println(i + "-" + nomes[i]);
        }
        int s = sc.nextInt();
        if (s < 0 || s >= salas) return -1;
        return s;
    }

    static void mapa() {
        int s = escolherSala();
        if (s == -1) return;

        for (int i = 0; i < linhas; i++) {
            System.out.print((char)('A'+i) + " ");
            for (int j = 0; j < colunas; j++) {

                char e = cadeiras[s][i][j];

                String simb = (e=='L')?"[ ]":(e=='R')?"[R]":"[X]";

                System.out.print(simb);
            }
            System.out.println();
        }
    }

    static void operar(int tipo) {

        int s = escolherSala();
        if (s == -1) return;

        System.out.print("Linha (A-L): ");
        char l = sc.next().toUpperCase().charAt(0);

        System.out.print("Coluna (1-12): ");
        int c = sc.nextInt();

        int i = l - 'A';
        int j = c - 1;

        if (i<0||i>=linhas||j<0||j>=colunas) {
            System.out.println("Erro");
            return;
        }

        char atual = cadeiras[s][i][j];

        if (tipo == 1) { // reservar
            if (atual=='L') {
                cadeiras[s][i][j] = 'R';
                System.out.println("Reservado");
            }
        }

        if (tipo == 2) { // comprar
            if (atual=='L') cadeiras[s][i][j] = 'X';
            else if (atual=='R') cadeiras[s][i][j] = 'X';
        }

        if (tipo == 3) { // cancelar
            if (atual=='R') cadeiras[s][i][j] = 'L';
        }
    }

    static void relatorio() {

        int l=0,r=0,x=0;

        for (int s=0;s<salas;s++) {
            for (int i=0;i<linhas;i++) {
                for (int j=0;j<colunas;j++) {

                    if (cadeiras[s][i][j]=='L') l++;
                    if (cadeiras[s][i][j]=='R') r++;
                    if (cadeiras[s][i][j]=='X') x++;
                }
            }
        }

        System.out.println("Livres:"+l);
        System.out.println("Reservadas:"+r);
        System.out.println("Ocupadas:"+x);
        System.out.println("Arrecadado:"+ (x*preco));
    }

    static void exercicios() {

        int pagina = 0;
        int porPagina = 7;

        String op;

        do {

            int inicio = pagina*porPagina;
            int fim = Math.min(inicio+porPagina, 20);

            for (int i=inicio;i<fim;i++) {
                System.out.println((i+1)+"-"+titulos[i]);
            }

            if (pagina>0) System.out.println("A-Anterior");
            if (pagina<2) System.out.println("P-Próxima");
            System.out.println("V-Voltar");

            op = sc.next();

            if (op.equalsIgnoreCase("A") && pagina>0) pagina--;
            else if (op.equalsIgnoreCase("P") && pagina<2) pagina++;
            else if (op.equalsIgnoreCase("V")) break;

        } while (true);
    }
}