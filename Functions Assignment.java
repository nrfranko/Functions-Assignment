import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    //Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner (System.in);

    //local variables.
    double sales, commissionRate, advancedPay, pay;

    //Get the amount of sales.
      sales = getSales ();

    //Get the amount of advanced pay.
      advancedPay = getAdvancedPay ();

    //Determine commission rate.
      commissionRate = determineCommissionRate (sales);

    //Calculate the pay.
      pay = sales * commissionRate - advancedPay;

    //Display the amount of pay.
      System.out.println ("The pay is $" + pay);

    //Determine whether the pay is negative.
    if (pay < 0)
      {
	System.out.println ("This salesperson must reimburse the company. ");
      }
  }

  //getSales function.
  public static double getSales ()
  {
    //Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner (System.in);

    double sales;
    System.out.println ("Enter the salesperson's monthly sales:");
    sales = keyboard.nextDouble ();

    //Return the amount of sales.
    return sales;
  }

  public static double getAdvancedPay ()
  {
    //Create a scanner object for keyboard input.
    Scanner keyboard = new Scanner (System.in);

    //Local variable to hold the advanced pay.
    double advanced;

    //Get the amount of advanced pay.
    System.out.println ("Enter the amount of advanced pay, or");
    System.out.println ("Enter 0 if no advanced pay was given: ");
    advanced = keyboard.nextDouble ();

    //Return the advanced pay.
    return advanced;
  }
  public static double determineCommissionRate (double sales)
  {
    // Local variable to hold commision rate.
    double rate;

    //Determine the commision rate.
    if (sales < 10000)
      rate = 0.10;
    else if (sales >= 10000 && sales <= 14999)
      rate = 0.12;
    else if (sales >= 15000 && sales <= 17999)
      rate = 0.14;
    else if (sales >= 18000 && sales <= 21999)
      rate = 0.16;
    else
      rate = 0.18;

    //Return the commission rate.
    return rate;
  }
}

