import java.util.Scanner;

class Mathamatical{
    public static int power(int base,int power){
        int result=1;
        for (int i = 0; i < power; i++) {
            result*=base;
        }
        return result;

    }
}
public class static_Example {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("power of "+a+"^"+b+":"+Mathamatical.power(a,b));
    }
}
