package tests;

import edu.hawaii.ics613.ProjectEulerTwo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Tests the ProjectEulerTwo class.
 * <
 * Created by Branden Ogata on 2/15/2015.
 * 
 */

public class ProjectEulerTwoTest {

  /**
   * The List<Integer> of Fibonacci numbers.
   */
  private List<Integer> numbers;

  /**
   * Sets up the list to store Fibonacci numbers.
   *
   * @throws Exception if there is an error, which should not occur here.
   *
   */

  @Before
  public void setUp() throws Exception {
    this.numbers = new ArrayList<Integer>();
  }

  /**
   * Tests the nextFibonacci method.
   *
   * @throws Exception if there is an error, which should not occur here.
   *
   */

  @Test
  public void testNextFibonacci() throws Exception {
    assertEquals(1, ProjectEulerTwo.nextFibonacci(this.numbers));
    assertEquals(1, ProjectEulerTwo.nextFibonacci(this.numbers));
    assertEquals(2, ProjectEulerTwo.nextFibonacci(this.numbers));
    assertEquals(3, ProjectEulerTwo.nextFibonacci(this.numbers));
    assertEquals(5, ProjectEulerTwo.nextFibonacci(this.numbers));
    assertEquals(8, ProjectEulerTwo.nextFibonacci(this.numbers));
    assertEquals(13, ProjectEulerTwo.nextFibonacci(this.numbers));
    assertEquals(21, ProjectEulerTwo.nextFibonacci(this.numbers));
    assertEquals(34, ProjectEulerTwo.nextFibonacci(this.numbers));
  }
}