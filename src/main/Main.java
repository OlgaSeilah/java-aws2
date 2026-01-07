package main;

/**
 * 1. Проверить, является ли переданный объект палиндромом или нет.
 * 2. Посчитать количество уникальных слов в тексте.
 */

// Assumption 1: we get 1 String that contains text with several words
// Assumption 2: words are separated by space
// Assumption 3: words are not empty
// Assumption 4: words may contain '-' symbol
// Assumption 5: "-" between words is not a word

public class Main {
    public static void main(String[] args) {
        System.out.println(countUniqueWords("How English palindromes differ from Russian palindromes"));
        System.out.println(isPalindrome("eye"));
    }

    public static int countUniqueWords(String text) { // todo we can use long here, but i don't see any sense in that
        if (text == null || text.isBlank()) return 0;

        String[] words = text.trim().split(" ");
        int howManyWordsToDelete = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("-")) {
                howManyWordsToDelete++;
            }
        }
        return words.length - howManyWordsToDelete;
    }

// Assumption 1: text may contain different symbols

    public static boolean isPalindrome(String text) {
        if (text == null || text.isBlank()) return false;

        text = text.toLowerCase();

        int left = 0; // first char
        int right = text.length() - 1; // last char

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
                right--;
            }

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}