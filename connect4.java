import java.util.Scanner;
//rows = 7 , columns = 6// row sleeping line column standing line
public class connect4
{
    static String game[][] = {{"1","2","3","4","5","6","7"} , {"1","2","3","4","5","6","7"},
                   {"1","2","3","4","5","6","7"} , {"1","2","3","4","5","6","7"}, {"1","2","3","4","5","6","7"} ,{"1","2","3","4","5","6","7"}};
    static boolean isWinner = false;
    private int input(int a , String player1 , String player2)
    {
        Scanner scnr = new Scanner(System.in);
        String position = "";
        do
        {
            if(a % 2 ==0)
            {
                System.out.println(player1 + " to enter position :");
            }
            else
            {
                System.out.println(player2 + " to enter position :");
            }
            position = scnr.nextLine();
        }
        while(validate(position) == false);
        return Integer.parseInt(position) - 1;
    }
    
    private boolean validate(String position)
    {
    	int posi = 0;
    	try 
        {
        	posi = Integer.parseInt(position);
        }
        catch(NumberFormatException e)
        {
        	System.out.println("Enter integer value.");
        	return false;
        }
    	if(posi >= 8 || posi <= 0)
        {
            System.out.println("Enter value between 1 and 7.");
            return false;
        }
        
        else if(game[0][posi - 1] == "b" || game[0][posi - 1] == "r")
        {
            System.out.println("This row has been filled choose another one.");
            return false;
        }
        return true;
    }
    
    private void index(int choice , int a)
    {
        for(int i = game.length -1; i >= 0 ; i--)
        {
            if(a % 2 == 0)
            {
                if(game[i][choice] != "b" && game[i][choice] != "r" )
                {
                    game[i][choice] = "b";
                    i = -1;
                }
            }
            else
            {
                if(game[i][choice] != "r" && game[i][choice] != "b")
                {
                    game[i][choice] = "r";
                    i = -1;
                }
            }
            
        } 
    }
    
    private void print()
    {
        for(int i = 0 ; i  < game.length ; i++)
        {
           for(int a = 0 ; a < game[0].length ; a++)
           {
               System.out.print(game[i][a]+ " ");
           }
           System.out.println();
        }
    }
    
    private void winner()
    {
        int blueCount ;
        int redCount;
        for(int i = 0 ; i  < game.length ; i++)
        {
           blueCount = 0;
           redCount = 0;
           for(int a = 0 ; a < game[0].length ; a++)
           {
              if(game[i][a] == "b")
               {
                   blueCount++;
                   redCount = 0;
               }
               else if(game[i][a] == "r")
               {
                   redCount++;
                   blueCount = 0;
               }
               else
               {
                   blueCount = 0;
                   redCount = 0;
               }
               if(blueCount == 4 || redCount == 4)
               {
                   isWinner = true; 
                   a = 10;
                   i = 10;
               }
            }
        }
       if(isWinner == false)
       {	
    	   for(int k = 0 ; k  < game[0].length ; k++)
           {
              blueCount = 0;
              redCount = 0;
              for(int b = 0 ; b < game.length ; b++)
              {
                 if(game[b][k] == "b")
                  {
                      blueCount++;
                      redCount = 0;
                  }
                  else if(game[b][k] == "r")
                  {
                      redCount++;
                      blueCount = 0;
                  }
                  else
                  {
                      blueCount = 0;
                      redCount = 0;
                  }
                  if(blueCount == 4 || redCount == 4)
                  {
                      isWinner = true; 
                      b = 10;
                      k = 10;
                  }
               }
          }
       }
       if(isWinner == false)// downwards diagonal
       {	
    	   for(int k = 0 ; k  <= game[0].length - 4; k++)
           {
    		  int duplicate = k;
              blueCount = 0;
              redCount = 0;
              for(int b = 0 ; b <= game.length - 1 && k < 7; b++)
              {
                 if(game[b][k] == "b")
                  {
                      blueCount++;
                      redCount = 0;
                  }
                  else if(game[b][k] == "r")
                  {
                      redCount++;
                      blueCount = 0;
                  }
                  else
                  {
                      blueCount = 0;
                      redCount = 0;
                  }
                  if(blueCount == 4 || redCount == 4)
                  {
                      isWinner = true; 
                      b = 10;
                      k = 10;
                  }
                  k++;
               }
              k = duplicate;
           }
    	   if(isWinner == false)// upwards diagonal
           {	
        	   for(int k = 0 ; k  <= game[0].length - 4; k++)
               {
        		  int duplicate = k;
                  blueCount = 0;
                  redCount = 0;
                  for(int b = game.length - 1; b >= 0 && b < 10 && k < 7; b--)
                  {
                	  if(game[b][k] == "b")
                      {
                          blueCount++;
                          redCount = 0;
                      }
                      else if(game[b][k] == "r")
                      {
                          redCount++;
                          blueCount = 0;
                      }
                      else
                      {
                          blueCount = 0;
                          redCount = 0;
                      }
                      if(blueCount == 4 || redCount == 4)
                      {
                          isWinner = true; 
                          b = 12;
                          k = 12;
                      }
                      k++;
                   }
                  k = duplicate;
               }
           }
       }
    }
    public static void main(String args[])
    {
        connect4 obj = new connect4();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter player one's name :");
        String player1 = scnr.nextLine();
        System.out.println("Enter player two's name :");
        String player2 = scnr.nextLine();
        System.out.println(player1 + " with blue(b) pieces");
        System.out.println(player2 + " with red(r) pieces");
        for(int i = 0 ; i  < (game.length * game[0].length) ; i++)
        {
           int position = obj.input(i , player1 , player2);
           obj.index(position , i);
           obj.print();
           obj.winner();
           if(isWinner == true && i % 2 == 0)
           {
               System.out.println(player1 + " has won.");
               System.exit(0);;
           }
           else if(isWinner == true && i % 2 == 1)
           {
               System.out.println(player2 + " has won.");
               System.exit(0);
           }
        }
        scnr.close();
    }
}