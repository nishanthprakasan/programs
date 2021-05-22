import java.util.*;
public class numpattern
{
    public static boolean perfectnumber(int sum , int number)
    {
        boolean isPerfect = false;
        if(sum == number)
        {
            isPerfect = true;
        }
        return isPerfect;
    }
    public static int factors(int number)
    {
        int sum = 0;
        for(int x = 1 ; x < number ;x++)
        {
            if(number % x == 0)
            {
                sum = sum + x;
            }
            else
            {
                continue;
            }
        }
        return sum;
    }
    public static void display(boolean isPerfect , int sum , int number)
    {
        if(isPerfect == true)
        {
                System.out.println(sum);
        }
    }
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter maximum number :");
        int number = scnr.nextInt();
        System.out.println("Perfect numbers between 1 and " + number);
        for(int y = 1 ; y < number ; number--)
        {
                int sum = factors(number);
                boolean isPerfect = perfectnumber(sum , number);
                display(isPerfect , sum , number);
        }
    }
}