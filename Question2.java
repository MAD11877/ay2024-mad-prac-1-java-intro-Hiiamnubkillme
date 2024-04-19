import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
      double height = in.nextDouble();
      double weight = in.nextDouble();

      double bmi = calculateBMI(height, weight);
      System.out.println(bmi);
      in.close();
    }

    public static double calculateBMI(double height, double weight) {
      return weight / (height * height);
  }
}
