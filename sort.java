public class sort
{
    public static void main(String args [])
    {
        int array[] = {4 , 7 , 6 , 2};
        for(int i = 0; i < array.length -1  ; i++)
        {
            
            int x = i;
            for(int j = i + 1 ; j < array.length ;j++)
            {
                if(array[j] < array[x])
                {
                    x = j;
                }
            }
            int tmp  = array[i];
            array[i] = array[x];
            array[x] = tmp;
        }
        for(int i = 0 ; i < array.length ; i++)
        {
            System.out.println(array[i]);
        }
    }
}