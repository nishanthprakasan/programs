import java.util.Scanner;

public class Employee
{
    int pan;
    String name;
    double taxincome;
    double tax;
    public void input() 
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter pan number: ");
        pan = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Enter Name: ");
        name = scnr.nextLine();
        System.out.println("Enter taxable income: ");
        taxincome = scnr.nextDouble();
    }
    
    public void cal() 
    {
        if (taxincome <= 250000)
        {
            tax = 0;
        }
        else if (taxincome <= 150000 && taxincome >= 100001)
        {
            tax = (taxincome - 100000) * 0.1;
        }
        else if (taxincome <= 250000 && taxincome >= 150001)
        {
            tax = 3000 + ((taxincome - 150000) * 0.2);
        }
        else
        {
            tax = 25000 + ((taxincome - 250000) * 0.3);
        }
    }
    
    public void display() 
    {
        System.out.println("Pan Number \t Name \t Tax-Income \t Tax");
        System.out.println(pan + "\t" + name + "\t" + taxincome + "\t" + tax);
    }
    
    public static void main(String args[]) {
        Employee obj = new Employee();
        obj.input();
        obj.cal();
        obj.display();
    }
}