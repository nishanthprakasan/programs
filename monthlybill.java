import java.util.Scanner;
public class monthlybill
{
    public static double cal(int u)
    {
       double cost;
       double sum = 0;
       if(u <= 100)
       {
           sum = u * 1.25;
       }
       if(u > 100 && u <= 200)
       {
           cost = 100 * 1.25;
           sum = cost;
           u = u - 100;
           cost = u * 1.5;
           sum = sum + cost;
       }
       if(u > 200)
       {
           cost = 100 * 1.25;
           sum = cost;
           u = u - 100;
           cost = 100 * 1.5;
           sum = sum + cost;
           u = u - 100;
           cost = u * 1.8;
           sum = sum + cost;
       }
       return sum;
    }
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Consumer number :");
        int consumerNo = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Enter name :");
        String name = scnr.nextLine();
        System.out.println("Enter present reading :");
        int presentReading = scnr.nextInt();
        System.out.println("Enter previous reading :");
        int previousReading = scnr.nextInt();
        int u = presentReading - previousReading;
        if(previousReading < 0 || presentReading < 0 || u < 0)
        {
            System.out.println("Enter correct value");
            System.exit(0);
        }
        System.out.println("Consumer No. \t " + "Name \t" + "Units consumed \t" + "Amount");
        System.out.println(consumerNo + "\t" + "\t" + name + "\t" + u + "\t" + "\t"+ cal(u));
    }
}