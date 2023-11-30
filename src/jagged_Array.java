import java.util.Scanner;

public class jagged_Array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a[][]={
                {10,20,30,40},
                {10,20,30},
                {10,20,30,50}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
