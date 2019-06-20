package be.smals.anagram.service;

import be.smals.anagram.exception.AnagramException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class AnagramServiceImplTest {
    private AnagramServiceImpl anagramService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup(){
        this.anagramService = new AnagramServiceImpl();
    }

    @Test
    public void isAnagagram() throws AnagramException{
        boolean actualValue = this.anagramService.isAnagram("lepel", "pelle");
        boolean expectedValue = true;

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void isNotAnagagram() throws AnagramException{
        boolean actualValue = this.anagramService.isAnagram("tommy", "pelle");
        boolean expectedValue = false;

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void emptyInputThrowsAnagramException() throws AnagramException{
        expectedException.expect(AnagramException.class);
        expectedException.expectMessage("Please don't enter empty Strings");
        this.anagramService.isAnagram("","");
    }

}