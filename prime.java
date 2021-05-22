import java.util.Scanner;
public class prime
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scnr.nextInt();
        int a = 0;
        boolean isPrime = false;
        int z = number;
        if(number == 0 )
        {
            System.out.println("Zero is neither a prime number nor composite number.");
        }
        else
        {
            for( a = 2 ;a < number; a++)
            {
                if(number % a == 0)
                {
                    isPrime = true;
                    break;
                }
            }
            if(isPrime == false)
            {
                System.out.println(number + " is a prime number");
            }
            else
            {
                System.out.println(number + " is not a prime number");
            }
        }
        int c = 0;
        int sqr = z * z;
        int temp = number;
        while(temp>0)
        {
            c++;
            temp=temp/10;
        }
        int lastSquareDigits = (int) (sqr % (Math.pow(10,c)));
             
        if(z == lastSquareDigits)
        {
            System.out.println(z + " is an automorphic number");
        }
        else
        {
            System.out.println(z + "is not an Automorphic number");
        }
    }
}