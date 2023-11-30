import java.util.Arrays;
import java.util.Scanner;

public class Function_array {
    public static int[] sortarray(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Limit");
        int n=scanner.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter The value"+i+":");
            a[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        return a;
    }
    public static void main(String args[]){
        int arr[]=sortarray();
        for(int a:arr){
            System.out.println(a);
        }
    }
}
