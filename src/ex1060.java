import java.util.Scanner;

public class ex1060 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            double valor = sc.nextDouble();

            if (valor > 0) {
                positivos++;
            }
        }

        System.out.println(positivos + " valores positivos");

        sc.close();
	}

}
