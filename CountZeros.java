import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first number which represents N
        int N = scanner.nextInt();
        int count = 0;

        // Loop through the next N numbers and count zeros
        for (int i = 0; i < N; i++) {
            if (scanner.nextInt() == 0) {
                count++;
            }
        }

        // Print the result
        System.out.println(count);

    }
}
