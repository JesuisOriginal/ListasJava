package Questoes.quinta;

public class PalindromeTester {

    public void isPalindrome(String stringOne, String stringTwo) {
        if (stringOne.equals(reverseString(stringTwo))) {
            System.out.println("Its Palindrome");
        }

    }

    public String reverseString(String string) {
        String temp = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            temp += string.charAt(i);
        }
        return  temp;
    }
}
