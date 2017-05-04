import org.junit.Test

class CalculatorTest {

  @Test
  public void testSum() {
    def c  = new Calculator()
    assert 5 == c.sum(2, 3)
  }

}