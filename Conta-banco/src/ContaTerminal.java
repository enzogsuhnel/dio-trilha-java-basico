import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favro, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Insira o número da Conta !");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu Nome !");
        String nome = scanner.next();

        System.out.println("Digite o seu saldo desejado !");
        Double saldo = scanner.nextDouble();




        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua Agência é " + agencia + ", conta" + numero + "e seu saldo");
        System.out.println(saldo + " já está disponivel para saque!");
    }

}

