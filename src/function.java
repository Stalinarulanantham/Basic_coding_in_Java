import java.util.Scanner;

class Method
{
    public void add(int a,int b)
    {
        //int a=123;
        //int b=10;

        System.out.println("Addition  :"+(a+b));
    }
    public void sub()
    {
        Scanner scanner=new Scanner(System.in);
        //int a=123;
        //int b=10;
        System.out.println("enter the value a=");
        int a=scanner.nextInt();
        System.out.println("enter the value b=");
        int b=scanner.nextInt();
        System.out.println("Addition  :"+(a-b));
    }
    public int factorial(int n)
    {
        if(n==1)
            return 1;
        else
            return (n*factorial(n-1));
    }
    public int multi(int c,int d)
    {
        return (c/d);
    }
}
public class function {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Method o=new Method();
        System.out.println("enter the ad no.");
        int  a=scanner.nextInt();
        int  b=scanner.nextInt();
        o.add(a,b);
        o.sub();
        System.out.println("enter the value c=");
        int c=scanner.nextInt();
        System.out.println("enter the value d=");
        int d=scanner.nextInt();
        int e=o.multi(c,d);
        System.out.println("enter the multiple value="+e);

//o.factorial(5);
        //a=Scanner.nextInt();
        System.out.println("factorial no ");
        int n = scanner.nextInt();
        System.out.println("FACTORIAL OF :"+o.factorial(5));
    }
}
