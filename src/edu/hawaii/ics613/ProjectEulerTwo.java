package edu.hawaii.ics613;

import java.util.ArrayList;
import java.util.List;

/**
 * Returns the sum of the even-valued Fibonacci values.
 *
 * Created by Branden Ogata on 2/1/2015.
 *
 */

public class ProjectEulerTwo {
  /**
   * Prints the sum of all even Fibonacci elements less than 4000000.
   *
   * @param args Not used.
   *
   */

  public static void main(String[] args) {
    int sum = 0;
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(1);

    while (numbers.get(numbers.size() - 1) + numbers.get(numbers.size() - 2) < 4000000) {
      if (nextFibonacci(numbers) % 2 == 0) {
        sum += numbers.get(numbers.size() - 1);
      }

    }

    System.out.println("Sum: " + sum);
  }

  /**
   * Returns the next Fibonacci number.
   *
   * @param numbers    The List<Integer> containing the Fibonacci numbers thus far.
   *                   This List will also include the added Fibonacci number upon return.
   *
   * @return The int equal to the next Fibonacci number in the sequence.
   *
   */

  public static int nextFibonacci(List<Integer> numbers) {
    int next = 1;

    // If there are not enough numbers to calculate the Fibonacci sequence, add 1 to the list
    if (numbers.size() < 2) {
      numbers.add(next);

/*
      System.out.format("%d%n", numbers.get(numbers.size() - 1));
 */
    }

    // Else the next number is the sum of the last two elements in the list
    else {
      numbers.add(numbers.get(numbers.size() - 1) + numbers.get(numbers.size() - 2));
      next = numbers.get(numbers.size() - 1);

/*
      System.out.format("%d + %d == %d%n", numbers.get(numbers.size() - 3), numbers.get(numbers.size() - 2),
                                           numbers.get(numbers.size() - 1));
*/
    }

    return next;
  }
}
