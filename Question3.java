import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
    Scanner in = new Scanner(System.in);
    System.out.print("");
    int number = in.nextInt();
    in.close();
    int square = number * number;
    System.out.println(square);
  }
}
