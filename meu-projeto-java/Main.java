import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define a localização para aceitar o ponto (.) como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=================================");
        System.out.println("   CALCULADORA DE IMC EM JAVA    ");
        System.out.println("=================================");

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu peso em kg (ex: 75.5): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        // Instanciação do objeto Pessoa
        Pessoa pessoa = new Pessoa(nome, peso, altura);

        // Exibição dos resultados
        System.out.println("\n---------------------------------");
        System.out.println("RESULTADO DO DIAGNÓSTICO:");
        System.out.println("---------------------------------");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.printf("IMC: %.2f\n", pessoa.calcularIMC());
        System.out.println("Classificação: " + pessoa.classificarIMC());
        System.out.println("=================================");

        scanner.close();
    }
}