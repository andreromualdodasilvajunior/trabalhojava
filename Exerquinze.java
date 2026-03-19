    import java.util.Scanner;

        public class Exerquinze{
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
    String usuarioCorreto = "andre";
    String senhaCorreta = "1567";

    System.out.print("Digite o usuario: ");
    String usuario = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

    String resultado = (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta))
    ? "Acesso permitido"
   : "Acesso negado";

        System.out.println(resultado);
        sc.close();
            }
        }