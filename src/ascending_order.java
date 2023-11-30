import java.util.Arrays;
import java.util.Scanner;

public class ascending_order {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a[]=new int[]{8,2,9,7,33,3,87};
        System.out.println("Before Sort =");
        /*for(int element :a)
        {
            System.out.print(element);
        }*/

        //to short the programme
        System.out.println("Before Sort "+Arrays.toString(a));
        int temp;
        for (int i = 0; i <a.length ; i++)
        {
            //System.out.println(a[i]+",");
            for (int j = i+1; j < a.length; j++)
            {
                //System.out.print(a[j]+",");
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    //System.out.println("Before Sort "+Arrays.toString(a));
                }
            }
        }
        System.out.println("Acending order "+Arrays.toString(a));
        //System.out.println("decending order "+Arrays.toString(b));


    }
}
