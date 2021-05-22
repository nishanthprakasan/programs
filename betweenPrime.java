import java.util.Scanner;
public class betweenPrime
{
    Scanner scnr = new Scanner(System.in);
    int start;
    int end;
    boolean isPrime = false; 
    public void input()
    {
        System.out.println("Enter two numbers (first one smaller)");
        start = scnr.nextInt();
        end = scnr.nextInt();
    }
    public void getData()
    {
        for(int a = start ; a < end ; a++)
        {
            isPrime = false; 
            for(int c = 2; c < a ; c++)
            {
                if( a % c == 0)
                {
                    isPrime = true; 
                    break;
                }
            }
            if(isPrime == false)
            {
                System.out.print(a + "\t");
            }
        }
    }
    public static void main(String args[])
    {
        betweenPrime obj = new betweenPrime();
        obj.input();
        obj.getData();
    }
}