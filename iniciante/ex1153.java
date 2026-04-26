public class ex1153 {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int fatorial = 1;
        for (int i = n; i > 1; i--) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
