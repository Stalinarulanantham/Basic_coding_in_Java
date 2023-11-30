import java.util.Scanner;

public class sum_and_average {
    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter the number?");
        int n=scanner.nextInt();
        int sum=0;
        int avg;
        for(int b=1;b<=n;b++)
        {
            sum=sum+b;
        }
        avg=sum/n;
        System.out.println("sum of value"+sum);
        System.out.println("average of sum"+avg);


    }
}
