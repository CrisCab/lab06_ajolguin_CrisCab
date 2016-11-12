package edu.ucsb.cs56.pconrad.parsing.tokenizer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TokenTest {

    @Test
    public void testAllDivideTokensAreEqual() {
	assertEquals(new DivideToken(), new DivideToken());
    }


    @Test
    public void testAllLParenTokensAreEqual() {
	assertEquals(new LParenToken(), new LParenToken());
    }

    @Test
    public void testAllLParenTokensArentEqualToDivideTokens() {
	assertFalse(new LParenToken().equals(new DivideToken()));
    }

    /** New tests added to test new token classes */

    @Test
    public void testAllEqualsTokensAreEqual() {
	assertEquals(new EqualsToken(), new EqualsToken());
    }

    @Test
    public void testAllNotEqualsTokensAreEqual() {
	assertEquals(new NotEqualsToken(), new NotEqualsToken());
    }

    @Test
    public void testAllExponentOperatorTokensAreEqual() {
	assertEquals(new ExponentOperatorToken(), new ExponentOperatorToken());
    }

    @Test
    public void testAllGreaterThanOrEqualsTokensAreEqual() {
	assertEquals(new GreaterThanOrEqualsToken(), new GreaterThanOrEqualsToken());
    }

    @Test
    public void testAllGreaterThanTokensAreEqual() {
	assertEquals(new GreaterThanToken(), new GreaterThanToken());
    }
    
    @Test
    public void testAllLessThanTokensAreEqual() {
	assertEquals(new LessThanToken(), new LessThanToken());
    }
    
    @Test
    public void testAllLessThanOrEqualsTokenAreEqual() {
	assertEquals(new LessThanOrEqualsToken(), new LessThanOrEqualsToken());
    }
    

}
