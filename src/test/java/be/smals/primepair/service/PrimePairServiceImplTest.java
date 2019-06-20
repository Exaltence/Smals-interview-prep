package be.smals.primepair.service;

import be.smals.primepair.exception.PrimePairException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.*;

public class PrimePairServiceImplTest {
    private PrimePairServiceImpl primePairService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup(){
        this.primePairService = new PrimePairServiceImpl();
    }

    @Test
    public void primePairReturnsEnteredAmountOfPairs() throws PrimePairException {
        List<String> result = this.primePairService.calculatePrimePair(10);

        int expectedAmount = 2;
        int actualAmount = result.size();
        assertEquals(expectedAmount,actualAmount);
    }

    @Test
    public void incorrectInputThrowsException() throws PrimePairException {
        expectedException.expect(PrimePairException.class);
        expectedException.expectMessage("Please enter a positive endlimit");

        this.primePairService.calculatePrimePair(-2);

    }

}