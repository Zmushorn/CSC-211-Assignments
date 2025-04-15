import javax.swing.*;

/**
   This program demonstrates the PassFailExam class with a GUI interface.
*/
public class GradeDemo
{
   public static void main(String[] args)
   {
      int questions;     // Number of questions
      int missed;        // Number of questions missed
      double minPassing; // Minimum passing score
      
      // Get the number of questions on the exam using a dialog
      String questionsInput = JOptionPane.showInputDialog(null, 
                            "How many questions are on the exam?",
                            "Exam Questions", JOptionPane.QUESTION_MESSAGE);
      questions = Integer.parseInt(questionsInput);
      
      // Get the number of questions missed using a dialog
      String missedInput = JOptionPane.showInputDialog(null, 
                            "How many questions did the student miss?",
                            "Questions Missed", JOptionPane.QUESTION_MESSAGE);
      missed = Integer.parseInt(missedInput);
      
      // Get the minimum passing score using a dialog
      String minPassingInput = JOptionPane.showInputDialog(null, 
                            "What is the minimum passing score?",
                            "Minimum Passing Score", JOptionPane.QUESTION_MESSAGE);
      minPassing = Double.parseDouble(minPassingInput);
      
      // Create a PassFailExam object
      PassFailExam exam = new PassFailExam(questions, missed, minPassing);
      
      // Build the result message
      String resultMessage = "Each question counts " + exam.getPointsEach() + " points.\n" +
                           "The exam score is " + exam.getScore() + "\n" +
                           "The exam grade is " + exam.getGrade();
      
      // Display the results in a message dialog
      JOptionPane.showMessageDialog(null, resultMessage, 
                                  "Exam Results", JOptionPane.INFORMATION_MESSAGE);
      
      // Exit the program
      System.exit(0);
   }
}
