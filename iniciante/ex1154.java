public class ex1154 {
   public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int idade, soma = 0, cont = 0;
        while ((idade = sc.nextInt()) >= 0) {
            soma += idade;
            cont++;
        }
        System.out.printf("%.2f\n", (double) soma / cont);
   } 
}
