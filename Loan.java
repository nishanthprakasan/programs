import java.util.Scanner;
public class Loan
{
   Scanner scnr = new Scanner(System.in);
   int time;
   double principal;
   double rate;
   double interest;
   double amount;
   public void getData()
   {
        System.out.println("Enter principal : ");
        principal= scnr.nextDouble();
        System.out.println("Enter time :");
        time = scnr.nextInt();
        System.out.println("Enter rate :");
        rate = scnr.nextDouble();
   }
   public void compute()
   {
       interest = ( principal * rate * time) / 100.0;
       amount  = principal + interest;
   }
   public void display()
   {
       System.out.println("Interest : " + interest);
       System.out.println("Amount : " + amount);
   }
   public static void main(String args[])
   {
       Loan value = new Loan();
       value.getData();
       value.compute();
       value.display();
   }
}