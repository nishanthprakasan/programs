import java.util.Scanner;
public class perfectNumber
{
    int start;
    //int end;
    int sum;
    private void getData()
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number:");
        start = scnr.nextInt();
        //end = scnr.nextInt();
    }
    public void result()
    {
        int a;
        for(a = 1 ; a < start ; a++)
        {
            if(start % a == 0)
            {
                sum = sum + a;
            }
            
        }
        if(sum == start)
        {
                System.out.println("Perfect number.");
                //break;
        }
        else
            {
                System.out.println("Non perfect number");
            }
            //System.out.println("Perfect number between x and y : " + start);
        }
    public static void main(String args[])
    {
        perfectNumber obj = new perfectNumber();
        obj.getData();
        obj.result();
    }
    }