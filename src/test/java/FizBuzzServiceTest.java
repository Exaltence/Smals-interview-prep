import be.smals.fizbuzz.exception.FizBuzzException;
import be.smals.fizbuzz.service.FizBuzzServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizBuzzServiceTest {

    private FizBuzzServiceImpl fizbuzzservice;

    @Before
    public void setUp() {
        fizbuzzservice = new FizBuzzServiceImpl();
    }

    @Test
    public void returnsFizzBuzz() throws FizBuzzException {
        String expectedResult = "Fizbuzz";
        String actualResult = fizbuzzservice.checkForFizzBuzz("15");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void returnsFizz() throws FizBuzzException {
        fizbuzzservice.checkForFizzBuzz("5");
        assertEquals(fizbuzzservice.checkForFizzBuzz("5"), "Fizz");
    }

    @Test
    public void returnsBuzz() throws FizBuzzException {
        fizbuzzservice.checkForFizzBuzz("3");
        assertEquals(fizbuzzservice.checkForFizzBuzz("3"), "Buzz");
    }

}
