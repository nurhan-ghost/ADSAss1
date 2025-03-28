package assign1;
import java.util.Scanner;

public class problem7 {
    public static void reversePrint(int index, int n, int[] arr) {
        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");
        reversePrint(index - 1, n, arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        reversePrint(n - 1, n, arr);
    }
}

