import java.util.Scanner;

public class ex1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        int resto = (int) Math.round(valor * 100); // tudo em centavos
        int qtd;

        System.out.println("NOTAS:");

        qtd = resto / 10000;
        System.out.printf("%d nota(s) de R$ 100.00%n", qtd);
        resto %= 10000;

        qtd = resto / 5000;
        System.out.printf("%d nota(s) de R$ 50.00%n", qtd);
        resto %= 5000;

        qtd = resto / 2000;
        System.out.printf("%d nota(s) de R$ 20.00%n", qtd);
        resto %= 2000;

        qtd = resto / 1000;
        System.out.printf("%d nota(s) de R$ 10.00%n", qtd);
        resto %= 1000;

        qtd = resto / 500;
        System.out.printf("%d nota(s) de R$ 5.00%n", qtd);
        resto %= 500;

        qtd = resto / 200;
        System.out.printf("%d nota(s) de R$ 2.00%n", qtd);
        resto %= 200;

        System.out.println("MOEDAS:");

        qtd = resto / 100;
        System.out.printf("%d moeda(s) de R$ 1.00%n", qtd);
        resto %= 100;

        qtd = resto / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", qtd);
        resto %= 50;

        qtd = resto / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", qtd);
        resto %= 25;

        qtd = resto / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", qtd);
        resto %= 10;

        qtd = resto / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n", qtd);
        resto %= 5;

        qtd = resto / 1;
        System.out.printf("%d moeda(s) de R$ 0.01%n", qtd);

        sc.close();
    }
}