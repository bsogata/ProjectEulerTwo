package edu.hawaii.ics613;

/**
 * Returns the sum of the even-valued Fibonacci values.
 *
 * Created by Branden Ogata on 2/1/2015.
 *
 */

public class ProjectEulerTwo {
  public static void main(String[] args) {
    int sum = 0;
    int oneBack = 1;
    int twoBack = 1;

    while (oneBack + twoBack < 4000000)
    {
      System.out.println(oneBack + " + " + twoBack + " = " + (oneBack + twoBack));
      if ((oneBack + twoBack) % 2 == 0)
      {
        sum += (oneBack + twoBack);
      }

      int temp = twoBack;
      twoBack = oneBack;
      oneBack = (oneBack + temp);
    }

    System.out.println("Sum: " + sum);
  }
}
