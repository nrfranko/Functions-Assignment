import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner keyboard = new Scanner (System.in);
    //Declaring variables!!
    double numTestScores;
    double total;
    double numStudents;
    double testNum;
    double score;
    double average;
    double student;
    //Getting # of students.
      System.out.println ("How many students do you have? ");
      numStudents = keyboard.nextDouble ();
    //Get # of test scores per student.
      System.out.println ("How many test scores are there per student? ");
      numTestScores = keyboard.nextDouble ();
    //Determing average for each test score.
    for (testNum = 1; testNum <= numTestScores; testNum++)
      {
	System.out.println ("Enter the number of test scores. " + testNum +
			    ":");
	score = keyboard.nextDouble ();
	total = total + score;
      }
    //Calculating and displaying the average.
    average = total / numTestScores;
    System.out.println ("The average for student " + student + "is " +
			average);

  }
}
