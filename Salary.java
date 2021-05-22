import java.io.*;
public class Salary
{
    String name;
    String address;
    String phone;
    String subject;
    String specialization;
    double salary;
    double it;
    public void getData(String na, String adr, String ph, String sub, double sal)
    {
        name = na;
        address = adr;
        phone =ph;
        subject = sub;
        salary = sal;
    }
    public static double tax(double sal)
    {
        double it = 0;
        if(sal > 175000)
        {
            it = sal * 0.075;
        }
        return it;
    }
    public void display(double it)
    {
        System.out.println ("Name : " + name);
        System.out.println ("Address : " + address);
        System.out.println ("Phone Number : " + phone);
        System.out.println ("Subject Specialization : " + subject);
        System.out.println ("Monthly Salary : " + salary);
        System.out.println ("Income Tax : " + it);
    }
    public static void main(String args[])throws Exception
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter name :");
        String na = br.readLine();
        System.out.println("Enter address :");
        String adr = br.readLine();
        System.out.println("Enter phone number :");
        String ph = br.readLine();
        System.out.println("Enter subject specialization:");
        String sub = br.readLine();
        System.out.println("Enter salary :");
        double sal = Double.parseDouble(br.readLine());
        Salary obj = new Salary();
        obj.getData(na ,adr ,ph , sub , sal);
        double incomeTax = tax(sal);
        obj.display(incomeTax);
    }
}