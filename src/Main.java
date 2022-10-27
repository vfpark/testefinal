import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int loop = 0;
        do {
            Scanner quantidade = new Scanner(System.in);
            Scanner tipo = new Scanner(System.in);
            Scanner numeros = new Scanner(System.in);
            int contador = 0;
            double numero, soma = 0, harm = 0;

            System.out.println("Digite quantos números você vai incluir no cálculo da Média Aritmética ou Harmônica: ");
            int n = quantidade.nextInt();

            System.out.println("Agora Digite ARITMETICA se desejar a Média Aritmética ou HARMONICA se desejar a Média Harmônica: ");
            String media = tipo.nextLine();

            System.out.println("Agora você deve digitar os números para sua média: ");

            do {
                numero = numeros.nextDouble();
                contador = contador + 1;
                soma = soma + numero;
                harm = harm + 1/numero;
            } while (contador != n);

            if (media.equals("ARITMETICA")) {
                double mediaAritmetica = soma / n;
                System.out.println("O valor da Média Aritmética dos valores passados é: " + mediaAritmetica);
                loop = loop + 1;
                break;
            }
            if (media.equals("HARMONICA")) {
                double mediaHarmonica = n / harm;
                System.out.println("O valor da Média Harmônica dos valores passados é: " + mediaHarmonica);
                loop = loop + 1;
                break;
            }

            System.out.println("\n\nVocê passou algum parâmetro incorreto, tente refazer lendo atentamente as solicitações\n\n");
        } while (loop == 0);

    }
}