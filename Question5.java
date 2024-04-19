import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of integers: ");
    int count = in.nextInt();
    int[] numbers = new int[count];
    for (int i = 0; i < count; i++) {
      System.out.print("Enter integer " + (i + 1) + ": ");
      numbers[i] = in.nextInt();
      }
    in.close();
    int mode = findMode(numbers);
    System.out.println("Mode: " + mode);
  }

  public static int findMode(int[] numbers) 
  {
    int mode = 0;
    int maxFrequency = 0;
    for (int i = 0; i < numbers.length; i++) 
    {
      int frequency = 0;
      for (int j = 0; j < numbers.length; j++) 
      {
        if (numbers[j] == numbers[i]) 
        {
          frequency++;
        }
      }
      if (frequency > maxFrequency) 
      {
        maxFrequency = frequency;
        mode = numbers[i];
      }
    }
      
    return mode;
  }
}
