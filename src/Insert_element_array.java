import java.util.Arrays;
import java.util.Scanner;
public class Insert_element_array
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[]a={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Enter the index places");
        int b=scanner.nextInt();
        System.out.println("Enter the value");
        int c=scanner.nextInt();
        //int index=2;
        //int value=55;
        System.out.println("Before Sort "+Arrays.toString(a));
        for (int i=a.length-1;i>b;i--)
        {
         a[i]=a[i-1];
        }
        a[b-1]=c;
        System.out.println("after Sort "+Arrays.toString(a));

    }
}
