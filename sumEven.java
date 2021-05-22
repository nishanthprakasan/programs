import java.util.Scanner;
import java.text.DecimalFormat;

public class sumEven
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("1. Enter two numbers :");
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int d = a;
        int sum_even = sum_even(a , b );
        System.out.println("Sum of all even numbers between " + d + " and " + b + " is " + sum_even);
        System.out.println("2. Enter a number :");
        double n = scnr.nextDouble();
        double product = product(n);
        Double prod = new Double(product);
        DecimalFormat df = new DecimalFormat("#.####");
        
        System.out.println("Product of numbers from 1 to n numbers with each number adding by 0.2: " + df.format(prod));
        System.out.println("3.Enter a number : ");
        int m = scnr.nextInt();
        scnr.close();
        int odd = odd(m);
        System.out.println("Sum of odd numbers of given number : " + odd);
    }
    public static int sum_even(int a , int b)
    {
        int sum = 0;
        for(int c = a ; a <= b ; a++)
        {
            if(a % 2 == 0)
            {
                sum = sum + a;
            }
        }
        return sum;
    }
    public static double product(double n)
    {
        double i=1.0;
        double sum1=1.0;
        double a = i;
        while(a <= n)
        {
            sum1 = sum1 * i;
            i = i + 0.2;
            a++;
        }
        return sum1;
    }
    public static int odd(int m )
    {
        int sum = 0;
        int d = 0;
        while(m != 0)
        {
            d = m % 10;
            if(m % 2 != 0)
            {
                sum = sum + d;
            }
            m = m / 10;
        }
        return sum;
    }
}