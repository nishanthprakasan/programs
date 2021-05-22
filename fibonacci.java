import java.util.Scanner;
public class fibonacci
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number of terms :");
        int count=scnr.nextInt();    
        int n2 = 1; 
        int n3;
        int i;
        int n1 = 0;
        System.out.print(n1+" "+n2);   
        for(i = 2 ; i < count; ++i)    
        {    
             n3 = n1 + n2;    
             System.out.print(" " + n3);    
             n1 = n2;    
             n2 = n3;   
        }
    }   
}