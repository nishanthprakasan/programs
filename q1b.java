import java.util.Scanner;
public class q1b
{
    public static double series(int n)
    {
        double sum = 0.0;
        double x = 1.0;
        for(int i = 0 ; i < n ; i++)
        {
            sum = sum + (1.0 / x);
            x++;
        }
        return sum;
    }
    public static double series(int a , int n)
    {
        double sum = 0.0;
        double y = 2.0;
        for(int i = 1 ; i <= n ; i = i + 3)
        {
            sum = sum + ( i / Math.pow(a , y));
            y = y + 3.0;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number of terms :");
        int n = scnr.nextInt();
        System.out.println("Enter divisor");
        int a = scnr.nextInt();
        q1b obj = new q1b();
        System.out.println("Sum for first series : " + series(n));
        System.out.println("Sum for second series : " + series(a,n));
    }
}
