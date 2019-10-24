import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    Scanner keyboard = new Scanner (System.in);

    //Declaring the variables.
    double hits;
    double atBat;
    double battingAverage;
    //Getting the number of hits.
      System.out.println ("Enter the player's number of hits. ");
      hits = keyboard.nextDouble ();
    //Getting the numbers at bats.
      System.out.println ("Enter the player's number of times at bat. ");
      atBat = keyboard.nextDouble ();
    //Calculating the batting average.
      battingAverage = hits / atBat;
    //Displaying the batting average.
      System.out.println ("The player's batting average is " +
			  battingAverage);

  }
}
