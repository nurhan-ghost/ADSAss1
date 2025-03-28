package assign1;
import java.util.Scanner;

public class problem8 {
    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        if (isAllDigits(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

