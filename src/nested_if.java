import java.util.Scanner;

public class nested_if {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the marital status m/U?");
        char a=scanner.next().charAt(0);
        if((a=='u'||a=='U'))
        {

            System.out.println("Enter your are male or female as M/F");
            char b=scanner.next().charAt(0);
            System.out.println("Enter your are age");
            int c= scanner.nextInt();
            if((b=='m'||b=='M')&&30<=c)
            {
                System.out.println("your are eligible");
            }
            else if((b=='f'||b=='F')&&25<=c)
            {
                System.out.println("your are eligible");
            }
        else if(a=='m'||a=='M')
            {
                System.out.println("not eligible");
            }
        else
            {
                System.out.println("not valid");
            }
        }
    }
}
