package Questoes.quinta;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PalindromeTester tester = new PalindromeTester();
        Scanner input = new Scanner(System.in);
        System.out.println("Input the Str1 and Str2 spaced");
        tester.isPalindrome(input.next(), input.next());
    }
}
