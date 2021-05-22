import java.util.Scanner;
public class Square
{
    private String getData()
    {
          Scanner scnr = new Scanner(System.in);
          System.out.println("Enter number :");
          String userInput = scnr.nextLine();
          return userInput;
    }
    private boolean validateInput(String x)
    {
        boolean isNumber = true;
        int y = 0;
        try
        {
                y = Integer.parseInt(x);
        } 
        catch(NumberFormatException e)
        {
              isNumber = false;
              System.out.println("You have entered incorrect value.");
        }
        return isNumber;
    }
    private int square(int num)
    {
        int square = num * num ;
        return square;
    }
    private void display(int square , int xyz)
    {
        System.out.println("Square of " + xyz + " is : " + square); 
    }
    public static void main(String args[])
    {
        Square mySquare = new Square();
        boolean validate = false;
        String userInput = "";
        while(validate == false)
        {
            userInput = mySquare.getData();
            validate = mySquare.validateInput(userInput);
        }
        int square = mySquare.square(Integer.parseInt(userInput));
        mySquare.display(square , Integer.parseInt(userInput));
    }
}