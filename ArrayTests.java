import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace1() {
    int[] input1 = { 12, 13, 7, 2 };
    int[] expected = { 2, 7, 13, 12 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(expected, input1);
  }

  @Test
  public void testReverseInPlace2() {
    int[] input1 = { 12, 13, 7, 2, 33 };
    int[] expected = { 33, 2, 7, 13, 12 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(expected, input1);
  }

  @Test
  public void testReversed1() {
    int[] input1 = { 12, 13, 7, 2 };
    int[] expected = { 2, 7, 13, 12 };
    assertArrayEquals(expected, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 12, 13, 7, 2, 33 };
    int[] expected = { 33, 2, 7, 13, 12 };
    assertArrayEquals(expected, ArrayExamples.reversed(input1));
  }
}
