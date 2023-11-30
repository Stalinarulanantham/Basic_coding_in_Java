import java.util.Scanner;

public class factor_of_a_given_num {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
    int n=scanner.nextInt();
        //int n=64;
    for(int i=1;i<=n;i++) {
        if (n % i == 0)
            System.out.print(i + ",");
    }
    }
}
