import java.util.Scanner;
import java.lang.String;

public class string {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //char  a,b,c,d;
        String a="stalin";
        String b="STALIN";
        System.out.println("Equal="+a.equalsIgnoreCase(b));
        System.out.println("length="+a.length());
        System.out.println("length="+a.charAt(3));
        System.out.println("length"+a.toUpperCase());
        System.out.println("length"+a.toLowerCase());
        System.out.println(""+a.toCharArray());
        System.out.println(""+a.replace("stalin","fdsfcedxd"));
        System.out.println(""+a);
        System.out.println(""+a.isEmpty());







    }
}
