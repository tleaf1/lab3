import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  private static final double DELTA = 1e-15; //from stack overflow

	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] {5,4,3,2,1}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2 = new int[] {1,2,3,4,5};
    assertArrayEquals(new int[] {5,4,3,2,1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testLowestWithoutAverage() {
    double[] input1 = {1,2,3};
    double exp1 = (3.0+2.0)/2;
    assertEquals(exp1, ArrayExamples.averageWithoutLowest(input1),DELTA);
    double [] input2 = {1,2,3,4,1,2,1,3,4};
    double exp2 = (2.0 + 3.0 + 4.0 + 2.0 + 3.0 + 4.0)/ 6;
    assertEquals(exp2, ArrayExamples.averageWithoutLowest(input2),DELTA);
  }
}
