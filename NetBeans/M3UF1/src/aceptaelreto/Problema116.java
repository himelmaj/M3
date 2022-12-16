package aceptaelreto;
import java.util.Scanner;
public class Problema116 {
    static Scanner z = new Scanner(System.in);
    public static void main(String[] args) {
        int n = z.nextInt();
        if (n > 0 && n <= 5) {
            for (int i = 0; i < n; i++) {
                System.out.println("Hola mundo.");
            }
        }
    }
}
