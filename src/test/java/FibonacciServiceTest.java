import be.smals.fibonacci.Exception.FibonacciException;
import be.smals.fibonacci.service.FibonacciServiceImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FibonacciServiceTest {

    private FibonacciServiceImpl fibonacciService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        this.fibonacciService = new FibonacciServiceImpl();
    }

    @Test
    public void calFibonacciRowReturnsEndAmountElements() throws FibonacciException {
        int expectedSize = 10;

        List<Integer> fibonacciRow = this.fibonacciService.calcFibonacciRow(10);
        int actualSize = fibonacciRow.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void calcFibonacciTermReturnsActualTerm() throws FibonacciException {
        int expectedTerm = 55;

        int actualTerm = this.fibonacciService.calcFibonacciTerm(10);

        assertEquals(actualTerm, expectedTerm);
    }

    @Test
    public void calcFibonacciRowWithZeroValueThrowsException() throws FibonacciException {
        expectedException.expect(FibonacciException.class);
        expectedException.expectMessage("Please enter a number greater than 0.");


        List<Integer> actualRow = this.fibonacciService.calcFibonacciRow(0);
    }

    @Test
    public void calcFibonacciRowWithNegativeValueThrowsException() throws FibonacciException {
        expectedException.expect(FibonacciException.class);
        expectedException.expectMessage("Please enter a number greater than 0.");


        List<Integer> actualRow = this.fibonacciService.calcFibonacciRow(-10);
    }
}
