import java.util.Scanner;
public class TicTacToe
{
    public static void main(String args[])throws Exception
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter name of player 1 :");
        String player1 = scnr.nextLine();
        System.out.println("Enter name of player 2 :");
        String player2 = scnr.nextLine();
        String game[][] = new String[3][3];
        String [] position = {"1","2","3","4","5","6","7","8","9"};
        int index = 0;
        int c = 0; 
        int count = 0; 
        int a = 0; 
        int b = 0;
        System.out.println("Sample tictactoe : ");
        System.out.println(position[0] + "\t" + position[1] + "\t" + position[2]);
        System.out.println(position[3] + "\t" + position[4] + "\t" + position[5]);
        System.out.println(position[6] + "\t" + position[7] + "\t" + position[8]);
        for(a = 0 ; a < 3 ; a++)
        {
            for(b = 0 ; b < 3; b++)
            {
                if(count % 2 == 0)
                {
                    System.out.println(player1 + " to play :");
                    System.out.println("Enter position where u want to enter x (1 to 9).Don't repeat the position.:");
                    game[a][b] = scnr.nextLine();
                    //System.out.println("number " + Integer.parseInt(game[a][b]));
                    if(onlyDigits(game[a][b] , game[a][b].length()) == false)
                    {
                        System.out.println("Enter an integer.");
                        b--;
                        count--;
                    }
                    else if((Integer.parseInt(game[a][b]) > 9) || (Integer.parseInt(game[a][b]) < 1))
                    {
                        System.out.println("Enter a value between 1 and 9.");
                        b--;
                        count--;
                    } 
                    else
                    {
                        for(c = 0 ; c < 9 ; c++)
                        {
                            if(game[a][b].equals(position[c]))
                            {
                                index = c;
                            }
                        }
                        if(position[index] =="x" || position[index] == "o")
                        {
                            System.out.println("Already has a value ,choose a different position.");
                            b--;
                            count--;
                        }
                        else
                        {
                            position[index] = "x";
                            c = 10;
                        }
                    }
                }
                else
                {
                    System.out.println(player2 + " to play :");
                    System.out.println("Enter position where u want to enter x (1 to 9).Don't repeat the position.:");
                    game[a][b] = scnr.nextLine();
                    if(onlyDigits(game[a][b] , game[a][b].length()) == false)
                    {
                        System.out.println("Enter an integer.");
                        b--;
                        count--;
                    }
                    else if((Integer.parseInt(game[a][b]) > 9) || (Integer.parseInt(game[a][b]) < 1))
                    {
                        System.out.println("Enter a value between 1 and 9.");
                        b--;
                        count--;
                    }
                    else
                    {
                        for(c = 0 ; c < 9 ; c++)
                        {
                            if(game[a][b].equals(position[c]))
                            {
                                index = c;
                            }
                        }
                        if(position[index] =="x" || position[index] == "o")
                        {
                            System.out.println("Already has a value, choose a different position.");
                            b--;
                            count--;
                        }
                        else
                        {
                            position[index] = "o";
                            c = 10;
                        }
                    }
                }
                if(c == 10)
                {
                    System.out.println(position[0] + "\t" + position[1] + "\t" + position[2]);
                    System.out.println(position[3] + "\t" + position[4] + "\t" + position[5]);
                    System.out.println(position[6] + "\t" + position[7] + "\t" + position[8]);
                }
                if((position[0] == position[1] && position[1] == position[2]) || 
                (position[3] == position[4] && position[3] == position[5]) ||
                (position[6] == position[7] && position[6] == position[8]) ||
                (position[0] == position[3] && position[3] == position[6]) ||
                (position[1] == position[4] && position[1] == position[7]) ||
                (position[2] == position[5] && position[2] == position[8]) ||
                (position[0] == position[4] && position[4] == position[8]) ||
                (position[2] == position[4] && position[2] == position[6]))
                {
                    if(count % 2 == 0)
                    {
                        System.out.println(player1 + " wins.");
                    }
                    else
                    {
                        System.out.println(player2 + " wins.");
                    }
                    a = 3;
                    b = 3;
                }
                else if(a == 2 && b == 2)
                {
                    System.out.println("Draw");
                }
                count++;
            }
        }
    }
    public static boolean onlyDigits(String str, int n)
    {
       boolean x = false;
       for (int i = 0; i < n; i++) 
       {
            if (str.charAt(i) >= '0'&& str.charAt(i) <= '9') 
            {
                x = true;
            }
            else 
            {
                return false;
            }
       }
       return x;
    }
}