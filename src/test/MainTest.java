package test;

import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void countUniqueWords() {
        assertEquals(7, Main.countUniqueWords("How English palindromes differ from Russian palindromes"));
        assertEquals(7, Main.countUniqueWords("How, English, palindromes ,differ - from ,Russian - palindromes"));
        assertEquals(0, Main.countUniqueWords(null));
        assertEquals(0, Main.countUniqueWords(""));
        assertEquals(1, Main.countUniqueWords("a"));
        assertEquals(2, Main.countUniqueWords("a b"));
        assertEquals(3, Main.countUniqueWords("a well-known person"));
    }

    @Test
    public void isPalindromePositive() {
        assertTrue(Main.isPalindrome("eye"));
        assertTrue(Main.isPalindrome("noon"));
        assertTrue(Main.isPalindrome("довод"));
        assertTrue(Main.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(Main.isPalindrome("12321"));
        assertTrue(Main.isPalindrome("a!b?a"));
    }

    @Test
    public void isPalindromeNegative() {
        assertFalse(Main.isPalindrome("12345"));
        assertFalse(Main.isPalindrome(null));
        assertFalse(Main.isPalindrome(""));
        assertFalse(Main.isPalindrome("hello, how are you?"));
        assertFalse(Main.isPalindrome("race a car"));

    }
}