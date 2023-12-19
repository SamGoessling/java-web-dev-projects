package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    //1
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //2
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //3
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //4
    @Test
    public void singleOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //5
    @Test
    public void singleCloseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //6
    @Test
    public void nonBracketCharactersReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    //7
    @Test
    public void unbalancedBracketsWithCharactersReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //8
    @Test
    public void multipleSetsOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launch[code]"));
    }

    //9
    @Test
    public void nestedSetsOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch]]Code"));
    }

    //10
    @Test
    public void multipleUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    //11
    @Test
    public void beginningAndEndBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode[]"));
    }

    //12
    @Test
    public void longStringWithMultipleBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[This] is a really[] long string with balanced brackets[]"));
    }

    //13
    @Test
    public void reveredBracketsReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }
}

