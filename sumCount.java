import java.util.Scanner;
public class sumCount
{
   Scanner scnr = new Scanner(System.in);
   int start;
   int end;
   int sum;
   int count;
   public void input()
   {
       System.out.println("Enter two numbers (first one smaller)");
       start = scnr.nextInt();
       end = scnr.nextInt();
   }
   public void sumAndcount()
   {
       while(start < end)
       {
           
           if(start % 2 == 0)
           {
               count++;
               sum = sum + start;
               start = start +2;
               
               continue;
           }
           start++;
       }
       System.out.println("Count of even numbers between the given numbers :" + count);
       System.out.println("Sum of even numbers between the given numbers :" + sum);
   }
   public static void main(String args[])
   {
       sumCount obj = new sumCount();
       obj.input();
       obj.sumAndcount();
   }
}