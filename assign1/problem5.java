package assign1;
import java.util.Scanner;

public class problem5 {
    public static int F(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return F(n - 1) + F(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(F(n));
        scanner.close();
    }
}
