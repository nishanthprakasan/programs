import java.util.Scanner;
public class q6c
{
    public static void function(String s)
    {
        int length = s.length();
        char arr[] = s.toCharArray();
        System.out.println("MODERN");
        for(int i = 0 ;i < length - 1;i++) 
        {
            for(int j = 0 ;j < length - i - 1;j++) 
            {
                System.out.print(arr[j]); 
            }
            System.out.println();
        }
    }
     public static void function(int n)
    {
        for(int i = 0 ;i <= n ;i++)
        {
            for(int j = 1; j <= i ;j++)
            {
                if(j % 2 == 0)
                {
                    System.out.print("2");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number of lines :");
        int n = scnr.nextInt();
        String s = "MODERN";
        q6c obj = new q6c();
        obj.function(s);
        obj.function(n);
    }
}