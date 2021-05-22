import java.util.Scanner;
public class project
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number :");
        double num = scnr.nextDouble();
        int num1 = (int)Math.sqrt(num);
        if(Math.pow(num1 ,2) == num)
        {
            System.out.println(num + " is a perfect square");
        }
        else
        {
            System.out.println(num + " is not a perfect square");
        }
    }
}