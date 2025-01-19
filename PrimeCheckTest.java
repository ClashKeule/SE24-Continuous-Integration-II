import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    assertEquals("Test 3", true, PrimeCheck.isPrime(3));
    assertEquals("Test 13", true, PrimeCheck.isPrime(13));
    assertEquals("Test 97", true, PrimeCheck.isPrime(97));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
    assertEquals("Test 4", false, PrimeCheck.isPrime(4));
    assertEquals("Test 35", false, PrimeCheck.isPrime(35));
    assertEquals("Test 143", false, PrimeCheck.isPrime(143));
  }
}
