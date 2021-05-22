import java.util.Scanner;
public class fun1
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter two numbers (first smaller one):");
        int x = scnr.nextInt();
        int y = scnr.nextInt();
        for(int a = 2 ; a < x || x < y; a++)
        {
            for(a = 2 ; a < x ; a++)
            if(x % a != 0)
            {
                System.out.println(x);
                break;
            }
            x++;
        }
    }
}