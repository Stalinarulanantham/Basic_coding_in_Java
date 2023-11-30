import java.util.Scanner;

public class Reverse_the_number {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enterr the number");
        int n=scanner.nextInt();
        int rem;int rev = 0;
        while(n!=0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println(rev);
        /*for(int i=n;n>=1;)
        {
            System.out.print(n);
            n=n-1;

        }*/
    }
}
