import java.util.Scanner;
public class q5b
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int j;
        int i;
        int n = 3;
        int m = 3;
        int array[][] = new int[m][n];
        System.out.println("Enter 9 numbers :");
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                array[i][j] = scnr.nextInt();
            }
        }
        for(int f = 0; f < m ; f++)
        {
            for(int t = 0 ; t < n ;t++)
            {
                System.out.print(array[f][t] + " ");
            }
            System.out.println();
        }
        int rows = array.length;
        int cols = array[0].length;
        int product = 1;
        for(int x = 0 ; x < m ;x++)
        {
            product = 1;
            for(int y = 0 ; y < n ; y++)
            {
                product = product * array[y][x];
                //System.out.println("Product : "+ product);
            }
            System.out.println("Product : "+ product);
        }
    }
}