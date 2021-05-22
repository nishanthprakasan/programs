import java.util.Scanner;
public class nextPrime
{
    Scanner scnr = new Scanner(System.in);
    int number;
    int a;
    int prime;
    boolean isPrime;
    public void input()
    {
        System.out.println("Enter number:");
        number = scnr.nextInt();
    }
    public void Prime()
    {
       for(a = number ; a >= number ; a++)
       {
           isPrime = false;
           for(int b = 2 ; b < a ; b++)
           {
               if (a % b == 0)
               {
                isPrime = true;
               }
           }
           if(isPrime == false)
           {
               prime = a;
               break;
           }
       }
       System.out.println("Next prime number is : " + a);
    }
    public static void main(String args[])
    {
        nextPrime obj = new nextPrime();
        obj.input();
        obj.Prime();
    }
}
