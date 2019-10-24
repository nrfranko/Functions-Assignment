import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner keyboard = new Scanner (System.in);
    //Declaring all variables associated with average test scores,
    //# of students and # of test scores per student.
    double numTestScores;
    double total;
    double numStudents;
    double testNum;
    double score;
    double average;
    double student;
    //Getting # of students and displaying.
      System.out.println ("How many students do you have? ");
      numStudents = keyboard.nextDouble ();
    //Getting # of test scores per student and displaying.
      System.out.println ("How many test scores do you have per student? ");
      numTestScores = keyboard.nextDouble ();
    //Determining each student's average test score.
    for (student = 1; student <= numStudents; student++)
      {
	//Initializing accumulator for each test score.
	total = 0;
	//Getting a student's test score and displaying.
	System.out.println ("Student number " + student);
	System.out.println ("--------------");
	for (testNum = 1; testNum <= numTestScores; testNum++)
	  {
	    System.out.println ("Enter test number " + testNum + ":");
	    score = keyboard.nextDouble ();
	    total = total + score;
	  }
	//Calculating the average test score and displaying.
	average = total / numTestScores;
	System.out.println ("The average for student " + student + " is " +
			    average);
      }
  }
}
