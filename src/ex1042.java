import java.util.Scanner;
import java.util.Locale;

public class ex1042 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int menor, meio, maior;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }

        // Ordem crescente
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);

        System.out.println();

        // Ordem original
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}