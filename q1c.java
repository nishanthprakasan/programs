import java.util.Scanner;
public class q1c
{
    public static void Calculate(int l , int b , char chr)
    {
        int area = 0;
        int perimeter = 0;
        if(chr == 'a' || chr == 'A')
        {
            area = l * b;
            System.out.println("Area of rectangle : " + area);
        }
        else
        {
            perimeter = 2 * ( l + b);
            System.out.println("Perimeter of rectangle : " + perimeter);
        }
    }   
    public static void Calculate(int s ,char chr)
    {
        int area = 0;
        int perimeter = 0;
        if(chr == 'a' || chr == 'A')
        {
            area = s * s;
            System.out.println("Area of square : " + area);
        }
        else
        {
            perimeter = 4 * s;
            System.out.println("Perimeter of square : " + perimeter);
        }
    }   
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter choice(in character)");
        char chr = scnr.next().charAt(0);
        System.out.println("Enter length :");
        int l = scnr.nextInt();
        System.out.println("Enter breadth :");
        int b = scnr.nextInt();
        System.out.println("Enter side of square :");
        int s = scnr.nextInt();
        q1c obj = new q1c();
        obj.Calculate(l , b , chr);
        obj.Calculate(s , chr);
    }
}