import org.junit.Test

class CalculatorTest {

  @Test
  public void testSum() {
    def c  = new Calculator()
    def tests = [
      [2, 3, 5],
      [3, 3, 6],
      [3, 5, 8]
    ]
    tests.each { test ->
      def input1 = test[0]
      def input2 = test[1]
      def expected = test[2]
      assert expected == c.sum(input1, input2)
    }
  }

}