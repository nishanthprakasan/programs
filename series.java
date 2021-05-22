import java.util.Scanner;
public class series
{
    public static void pattern(char lim)
    {
        char num = 'A';
        int x = (int)lim;
        int y = lim  - 65 ;
        //System.out.println(y);
        for(int k = 1; k < y;k++)
        {
            for(int i = 1;i <= k;i++)
            {
                   System.out.print(num);
                   if(lim == num)
                   {
                       break;
                   }
                   num++;
            }
            System.out.println();
            if(lim == num)
            {
                break;
            }
        }
    }
    public static void pattern(int n)
    {
       int x = 1;
       for(int k = 1; k <= n;k++)
       {
             for(int i = 1;i <= k;i++)
             {
                   System.out.print(x);
                   x++; 
             }
             System.out.println();
           }
    }
    public static void pattern()
    {
       int num = 65;
       for(int k = 1;k<=5;k++)
        {
         for(int i = 1;i<=k;i++)
          {
           System.out.print((char)num+"*");
           num++;
         }
         System.out.println();
       }
    }
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter last alphabet to be printed(in capital letter) :");
        char lim = scnr.next().charAt(0);
        System.out.println("Enter number of lines :");
        int n = scnr.nextInt();
        series obj = new series();
        obj.pattern(lim);
        obj.pattern(n);
        obj.pattern();
    }
}