import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner keyboard = new Scanner (System.in);
    //Declaring the variables.
    double salary;
    double yearsOnJob;
    //Get the annual salary.
      System.out.print ("Enter current annual salary. ");
      salary = keyboard.nextDouble ();
    //Get the number of years on job.
      System.out.print ("Enter the number of years on your current job. ");
      yearsOnJob = keyboard.nextDouble ();
    //Determine whether the user qualifies.
    if (salary >= 30000 && yearsOnJob >= 2)
      {
	System.out.print ("You qualify for the loan. ");
      }
    else
      {
	System.out.print ("You do not qualify for this loan. ");
      }
  }
}
