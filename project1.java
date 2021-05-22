public class project1
{
    public static void main(String args[])
    {
        int a = 2;
        int s = 0;
        int sum = 0;
        int difference = 0;
        while(a <= 20)
        {
            sum = sum + a;
            difference = difference + a + 2;
            a = a + 4;
        }
        s = sum - difference;
        System.out.println("Answer: " + s);
    }
}