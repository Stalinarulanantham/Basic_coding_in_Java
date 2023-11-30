import java.util.Scanner;

public class jagged_array_for {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a[][]={
                {10,20,30,40},
                {10,20,30},
                {10,20,30,50}

        };
        for(int k[]:a){
            for(int l:k)
            {
                System.out.print(" "+l);
            }
            System.out.println("");
        }
    }
}
