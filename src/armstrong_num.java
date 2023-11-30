import java.util.Scanner;

public class armstrong_num {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int temp=number;
        int digit1,digit2,digit3;
        digit1=temp%10;
        temp=temp/10;
        digit2=temp%10;
        temp=temp/10;
        digit3=temp%10;
        int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
        if(number==result) {
            System.out.println(" a armstrong of"+number+"="+result);
        }
        else
            System.out.println("not a armstrong of"+number+"="+result);

    }
}
