public class bubbleSort
{
    public static void main(String args[])
    {
        int input[] = {65 , 47 , 40 , 9 , 37 , 72 , 45 , 17};
        for(int i = 0 ; i < input.length ; i++)
        {
            
            for(int a = 0 ; a <  input.length - i - 1 ; a++)
            {
                if(input[a] > input[a+1])
                {
                    int tmp = input[a];
                    input[a] = input[a+1];
                    input[a+1] = tmp;
                }
            }
        }
        for(int i = 0 ; i <  input.length; i++)
        {
           System.out.println(input[i]);
        }
    }
}