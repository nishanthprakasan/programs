import java.util.Scanner;
public class factorial
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number:");
        double number = scnr.nextInt();
        double b = number;
        double a;
        double product = 1;
        for(a = 0 ; a < b ; a++)
        {
            product = product * number;
            number-- ;
        }
        System.out.println("Factorial of " + b + " is " + product);
    }
}