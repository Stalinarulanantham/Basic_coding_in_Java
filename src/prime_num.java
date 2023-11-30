import java.util.Scanner;

public class prime_num {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        //int n=64;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 2)
            System.out.print("it is not a prime no of =" +n+"="+count );
        else
            System.out.print("it is a prime no of "+n);
    }
}


