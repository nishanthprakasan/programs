import java.util.*;
public class dum
{
    public static void main()
    {
        int count;
        int i = 2;
        int sum = 0;
        int s = 0;
        int p = 0;
        for(count = 1;count<=20;count++)
        {

            if(count%2==0)
            {
            sum = sum - i;

               }
           else 
             {
            sum = sum + i;

                }
            i = i + 2;

        }

        System.out.println(sum);
    }
}
