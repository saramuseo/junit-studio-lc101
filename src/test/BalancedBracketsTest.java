package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyClosingBracketWithWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]"));
    }

    @Test
    public void backwardBracketPairsReturnFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void pairedBracketsWithWordsInsideReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void pairedBracketsWithWordsOutsideReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch [Program] Code"));
    }

    @Test
    public void backwardBracketsWithWordsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch] Code [ Program"));
    }

    @Test
    public void multiBracketPairsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Wor[]d"));
    }

    @Test
    public void multipleSingleBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[["));
    }

    @Test
    public void oddNumberOfBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[]]][["));
    }

    @Test
    public void emptyStringReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void noBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }


}
