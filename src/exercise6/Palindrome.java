package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println ("Enter a number: ");

        int number = input.nextInt ();
        assert number > 0 : "*** Number is not bigger than 0! ***";

        int reversedNumber = 0;
        int number2 = number;
        boolean p = true;

            while (number2 > 0) {
                reversedNumber = (reversedNumber * 10) + (number2 % 10);
                number2 = number2 / 10;
            }

            if (reversedNumber == number)
        {
            System.out.println ("Palindrome: " + p);
        }

        else {
            p = false;
            System.out.println ("Palindrome: " + p);
        }
    }
}
