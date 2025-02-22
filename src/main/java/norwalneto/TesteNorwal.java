package norwalneto;

import java.util.Locale;
import java.util.Scanner;

public class TesteNorwal {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite Seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite Sua idade: ");
        Integer idade = sc.nextInt();
        System.out.print("Digite sua data de nascimento: ");
        Integer nascimento = sc.nextInt();
        System.out.println("Digite seu endereço: ");
        String endereco = sc.nextLine();

        System.out.printf("Seu nome é: %s e sua idade %d e sua data de nascimento e %d", nome, idade, nascimento);

        sc.close();
    }
}
