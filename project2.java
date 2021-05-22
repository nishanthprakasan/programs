import java.util.Scanner;
public class project2
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int i = scnr.nextInt();
        int b = 1;
        double num = 0;
        int a;
        for(a = 5 ; b <= i; b++)
        {
            num = Math.pow(a , 2) - 1;
            System.out.print( num + "\t");
            a = a + 5;
        }
    }
}