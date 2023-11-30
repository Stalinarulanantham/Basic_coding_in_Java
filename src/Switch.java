import java.util.Scanner;

public class Switch {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        char a=scanner.next().charAt(0);
        switch (a)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("it is vowlels");
                break;
            default:
                System.out.println("it is not vowlels");
                break;


        }
    }
}
