import java.util.Scanner;
public class fun
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner (System.in);
        System.out.println("Enter principal :");
        double principal = scnr.nextDouble();
        System.out.println("Enter time in yrs :");
        double time = scnr.nextDouble();
        System.out.println("Enter rate :");
        double rate = scnr.nextDouble();
        double si = simpleInterest (principal , time , rate);
        System.out.println("Simple interest : " + si);
        double ci = compoundInterest(principal , time , rate);
        System.out.println("Compound interest : " + ci);
        double difference = ci - si;
        System.out.println("Difference between compund interest and simple interest : " + difference);
    }
    public static double simpleInterest(double principal , double time , double rate)
    {
        double si = (principal * rate * time) / 100;
        return si;
    }
    public static double compoundInterest(double principal , double time , double rate)
    {
        double amount = Math.pow((1 + rate / 100) , time);
        double amount1 = principal * amount;
        double ci = amount1 - principal;
        return ci;
    }
}