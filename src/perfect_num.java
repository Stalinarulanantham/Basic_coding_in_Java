import java.util.Scanner;

public class perfect_num {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                c += i;

            }
        }
        if (c == n)
            System.out.println(n + "is a perfect no.");
        else
            System.out.println(n + "is not a perfect no.");
    }
}
