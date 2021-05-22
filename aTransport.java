import java.util.Scanner;
public class aTransport
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = scnr.nextLine();
        System.out.println("Enter weight of goods : ");
        double weight = scnr.nextDouble();
        double charge = 10.0;
        double cost = cost(weight , charge);
        System.out.println("Name" + "\t" + "\t" + "Weight" +"\t" + "\t" + "Bill Amount");
        System.out.println(name + "\t" + weight + "\t" + cost);
    }
    public static double cost(double weight ,double charge)
    {
        double cost = 0.0;
        double sum = 0.0;
        if(weight <= 10.0)
        {
            cost = charge * weight;
            sum = sum + cost;
            weight = weight - 10.0;
        }
        double x = sum;
        return x;
    }
}