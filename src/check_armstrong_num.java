import java.util.Scanner;

public class check_armstrong_num {
    public static void main(String args[]) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the number");
        //int number = scanner.nextInt();
        int number;
        int temp;int digit1, digit2, digit3;
        for (number = 100; number <= 999; number++)
        {
            temp = number;
            digit1 = temp % 10;
            temp = temp / 10;
            digit2 = temp % 10;
            temp = temp / 10;
            digit3 = temp % 10;
            int result = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);
            if (number == result) {
                System.out.println(" a armstrong of" + number + "=" + result);
            }
        }
    }
}