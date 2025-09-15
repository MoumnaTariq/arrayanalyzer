import java.util.Scanner;

public class arrayanalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (N): ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input numbers
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = arr[0];
        int max = arr[0];
        int evenCount = 0;
        int oddCount = 0;

        // Analyze array
        for (int num : arr) {
            sum += num;

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        double average = (double) sum / n;

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);

        // Print array in reverse
        System.out.print("Array in reverse order: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
