import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    //Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner (System.in);

    //Constant for the size of the array.
    final int SIZE = 6;

    //Array to hold each employee's hours.
    double[] hours = new double[SIZE];

    //Variable to hold the hourly pay rate.
    double payRate;

    //Variable to hold a gross pay amount.
    double grossPay;

    //Variableto use a loop counter.
    int index;

    //Get each employee's hours worked.
    for (index = 0; index < hours.length; index++)
      {
	System.out.println ("Enter the hours worked by ");
	System.out.print ("employee " + (index + 1) + ": ");
	hours[index] = keyboard.nextDouble ();
      }

    //Get the hourly pay rate.
    System.out.print ("Enter the hourly pay rate: ");
    payRate = keyboard.nextDouble ();

    //Display each employee's gross pay.
    System.out.println ("Here is each employee's gross pay: ");
    for (index = 0; index < hours.length; index++)
      {
	grossPay = hours[index] * payRate;
	System.out.printf ("Employee %d: $%.2f\n", (index + 1), grossPay);
      }
  }
}
