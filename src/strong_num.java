import jdk.net.Sockets;

import java.util.Scanner;

public class strong_num {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num");
        int n = scanner.nextInt();
        int temp, rem, i, factorial = 1, sum = 0;
        temp = n;
        while (n > 0) {
            rem = n % 10;
            int fact=1;
            for (i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum += fact;
            //System.out.println("fact "+fact);
            n = n / 10;
        }
        System.out.println(sum);
        if (sum == temp)
            System.out.printf("Strong num");
        else
            System.out.printf("not a Strong num");
        //System.out.println("factorial "+factorial);


    }
}
//System.out.println("remainder"+rem);
