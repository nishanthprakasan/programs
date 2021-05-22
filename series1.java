import java.util.Scanner;
public class series1
{
    public static void main(String args[])
    {
        double a = 1.0;
        Scanner scnr = new Scanner(System.in);
        double sum = 0;
        System.out.println("Enter 1 for the first series and 2 for the second:");
        int option = scnr.nextInt();
        double c = 2.0;
        int d = 0;
        switch(option)
        {
            case 1 :
            System.out.println("Enter number of terms:");
            int b = scnr.nextInt();
            for( sum = 0 ; b > 0 ; b--)
            {
                sum = Math.pow(a,2) - 1;
                a = a + 1;
                System.out.print(sum + "\t");
            }
            break;
            case 2 :
            for(sum = 0 ; d < 10 ; d++)
            {
                sum = sum + (a/c);
                a = a + 2;
                c = c + 2;
            }
            System.out.println("Sum :" + sum);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
}