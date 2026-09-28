import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //exercício 1:
        System.out.println("Informe o seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Informe a sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Nome: " + nome + "\nIdade: " + idade);

        //exercício 2:
        System.out.println("\nInforme o primeiro número:");
        double primeiro = teclado.nextDouble();
        System.out.println("Informe o segundo número:");
        double segundo = teclado.nextDouble();

        double multiplicacao = primeiro * segundo;
        System.out.println("Resultado: " + multiplicacao);

        // exercício 3:
        Locale BRASIL = new Locale("pt", "BR");
        teclado.useLocale(BRASIL);
        System.out.println("\nInforme o seu salário:");
        double salario = teclado.nextDouble();
        System.out.printf(BRASIL, "Salário: R$ %.2f", salario );
    }
}