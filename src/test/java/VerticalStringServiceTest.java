import be.smals.verticalString.exception.VerticalStringException;
import be.smals.verticalString.service.VerticalStringServiceImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class VerticalStringServiceTest {
    private VerticalStringServiceImpl verticalStringService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup(){
        this.verticalStringService = new VerticalStringServiceImpl();
    }

    @Test
    public void makeVerticalTextReturnsText() throws VerticalStringException{
        List<String> sentences = new ArrayList<>();
        sentences.add("this is a test sentence");
        sentences.add("this is a second test sentence");
        List<List<String>>expectedResult = this.verticalStringService.makeVerticalText(sentences);
        assertTrue(!expectedResult.isEmpty());
    }

    @Test
    public void makeVerticalTextWithEmptyStringReturnsException() throws VerticalStringException{
        expectedException.expect(VerticalStringException.class);
        expectedException.expectMessage("input can't be empty");
        this.verticalStringService.makeVerticalText(null);
    }
}
