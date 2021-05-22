import java.util.Scanner;
public class series6
{
    public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter number : ");
     int n = sc.nextInt();
     int sum = 0;
     int i = 1;
     int sum1 = 0;
    // int pwr = 2;
     for(int count = 1;count<=n; count++)
     {
           sum = sum + i;
           sum1 = sum1 + sum;
           //System.out.println(sum1);
           i = i * 2;
    }
    System.out.println("Sum : " + sum1);
    //if n - 2
   }
}