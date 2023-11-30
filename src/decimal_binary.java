import java.util.Scanner;

public class decimal_binary {
    public static void  b2d(int n){
        int[]b=new int[1000];
        int i=0;
        while(n>0)
        {
            b[i]=n%2;
            n=n/2;
            i++;
        }

        //System.out.println(b[i]);
        for (int j = i-1; j >=0 ; j--) {
            System.out.print(b[j]);

        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        b2d(a);
    }
}
