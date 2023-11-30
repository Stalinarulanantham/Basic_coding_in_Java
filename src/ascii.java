import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i = 1; i <255 ; i++)
        {
            System.out.println(i+"= "+(char)i);

        }
    }
}
