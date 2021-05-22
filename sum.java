import java.util.Scanner;
public class sum
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int result = sum(a , b);
        System.out.println("Sum : " + result);
        double average = average(a,b);
        System.out.println("Average : " + average);
    }
    public static int sum(int a , int b)
    {
        int sum ;
        sum = a + b;
        return sum;
    }
    public static double average(int a , int b)
    {
        double average ;
        average = (a + b)/2.0;
        return average;
    }
}    