// This file creates Java packages for palindrome and odd/even checks.
// It imports both packages and calls methods to check the conditions, displaying the results.

import palindrome.PalindromeChecker;
import oddeven.OddEvenChecker;

public class Program5b {
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        OddEvenChecker oddEvenChecker = new OddEvenChecker();

        String testString = "madam";
        int testNumber = 5;

        boolean isPalindrome = palindromeChecker.isPalindrome(testString);
        String oddEvenResult = oddEvenChecker.checkOddEven(testNumber);

        System.out.println("Is \"" + testString + "\" a palindrome? " + isPalindrome);
        System.out.println("The number " + testNumber + " is " + oddEvenResult);
    }
}