import java.util.Scanner;

public class fibonocci_series {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("enter the value");
        int n=scanner.nextInt();
        int a=-1,b=1,c;
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            if(n<c)
                break;
            System.out.println(c);
            a=b;
            b=c;

        }

    }
}
