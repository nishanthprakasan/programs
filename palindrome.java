import java.util.Scanner;
public class palindrome
{   
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scnr.nextInt();
        int a  = number;
        int numReverse = 0;
        while(number > 0)
        {
            int digit = number % 10;
            numReverse = numReverse * 10 + digit;
            number = number / 10;
        }
        if(a == numReverse)
        {
            System.out.println("It is a palindrome number.");
        }
        else
        {
            System.out.println("It is not a palindrome number");
        }
    }
}