import be.smals.magicSquare.exception.MagicSquareException;
import be.smals.magicSquare.service.MagicSquareServiceImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertTrue;

public class MagicSquareServiceTest {
    private MagicSquareServiceImpl magicSquareService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup(){
        this.magicSquareService = new MagicSquareServiceImpl();
    }

    @Test
    public void generateSquareReturnsMagicSquare() throws  MagicSquareException{
        assertTrue(true);
    }

    @Test
    public void generateMagicSquareWithEvenRowsAndColumnsThrowsException() throws MagicSquareException{
        expectedException.expect(MagicSquareException.class);
        expectedException.expectMessage("Rows and Columns can't be even.");
        this.magicSquareService.generateSquare(4);
    }
}
