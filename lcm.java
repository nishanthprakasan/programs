import java.util.Scanner;
public class lcm
{
    public static void main(String args[])
   {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int lcm = (num1 > num2) ? num1 : num2; 
        if(num1 == 0 || num2 == 0)
        {
            lcm = 0;
        }
        else
        {
            while(true)
            {
                if(lcm % num1 == 0 && lcm % num2 == 0)
                {
                    break;
                }
                lcm++;
        }
        }
        System.out.println("LCM is : " + lcm);
   }
}