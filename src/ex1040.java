import java.util.Scanner;
import java.util.Locale;

public class ex1040 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();

        float media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10.0f;

        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0f) {
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5.0f) {
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.println("Aluno em exame.");

            float exame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", exame);

            float mediaFinal = (media + exame) / 2.0f;

            if (mediaFinal >= 5.0f) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", mediaFinal);
        }

        sc.close();
    }
}